package br.ufac.sgcm.dao;

import br.ufac.sgcm.model.Unidade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UnidadeDao implements IDao<Unidade>{
    Connection conexao;
    PreparedStatement ps;
    ResultSet rs;

    public UnidadeDao(){
        conexao = new ConexaoDB().getConexao();
    }


    @Override
    public List<Unidade> get() {
        return List.of();
    }
    @Override
    public Unidade get(Long id){
        String sql = "SELECT * FROM unidade WHERE id=?";
        Unidade u = new Unidade();
        u.setId(id);
        try {
            ps = conexao.prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            if(rs.next()) {
                u.setNome(rs.getString("nome"));
                u.setEndereco(rs.getString("endereco"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return u;
    }

    @Override
    public List<Unidade> get(String termoBusca) {
        return List.of();
    }

    @Override
    public int insert(Unidade objeto) {
        return 0;
    }

    @Override
    public int update(Unidade objeto) {
        return 0;
    }

    @Override
    public int delete(Unidade objeto) {
        return 0;
    }


}
