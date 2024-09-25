package br.ufac.sgcm.dao;

import br.ufac.sgcm.model.Profissional;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfissionalDao  implements IDao<Profissional>{

    Connection conexao;
    PreparedStatement ps;
    ResultSet rs;
    private EspecialidadeDao eDao;
    private UnidadeDao uDao;

    public ProfissionalDao(){
        conexao = new ConexaoDB().getConexao();
        eDao = new EspecialidadeDao();
        uDao = new UnidadeDao();
    }


    @Override
    public List<Profissional> get() {
        List<Profissional> registros = new ArrayList<>();
        String sql = "SELECT * FROM profissional";
        try {
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Profissional p = new Profissional();
                p.setId(rs.getLong("id"));
                p.setEmail(rs.getString("email"));
                p.setNome(rs.getString("nome"));
                p.setRegistro(rs.getString("registro_conselho"));
                p.setTelefone(rs.getString("telefone"));
                //rs.getLong retorna o id que é buscado em especialidadeDAO -esp- o nome da especialidade
                // e setado em p.setEspecialidade
                p.setEspecialidade(eDao.get(rs.getLong("especialidade_id")));
                p.setUnidade(uDao.get(rs.getLong("unidade_id")));
                registros.add(p);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return registros;
    }

    @Override
    public List<Profissional> get(String termoBusca) {
        return List.of();
    }

    @Override
    public Profissional get(Long id) {
        return null;
    }

    @Override
    public int insert(Profissional objeto) {
        return 0;
    }

    @Override
    public int update(Profissional objeto) {
        return 0;
    }

    @Override
    public int delete(Profissional objeto) {
        return 0;
    }
}
