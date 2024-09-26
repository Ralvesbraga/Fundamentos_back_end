package br.ufac.sgcm.dao;

import br.ufac.sgcm.model.Unidade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        String sql = "SELECT * FROM unidade";
        List<Unidade> registros = new ArrayList<>();
        try {
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                Unidade u = new Unidade();
                u.setId(rs.getLong("id"));
                u.setNome(rs.getString("nome"));
                u.setEndereco(rs.getString("endereco"));   
                registros.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registros;
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
        String sql = "SELECT * FROM unidade WHERE nome LIKE id=?";
        List<Unidade> registros = new ArrayList<>();
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, "%"+termoBusca+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Unidade u = new Unidade();
                u.setId(rs.getLong("id"));
                u.setNome(rs.getString("nome"));
                u.setEndereco(rs.getString("endereco"));
                registros.add(u);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registros;
    }

    @Override
    public int insert(Unidade objeto) {
        String sql = "INSERT INTO unidade (nome, endereco) VALUES (?,?)";
        int registrosAfetados = 0;
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, objeto.getNome());
            ps.setString(2, objeto.getEndereco());
            registrosAfetados = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrosAfetados;
    }

    @Override
    public int update(Unidade objeto) {
        String sql = "UPDATE unidade SET nome=?, endereco=? WHERE id=?";
        int registrosAfetados = 0;
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, objeto.getNome());
            ps.setString(2, objeto.getEndereco());
            ps.setLong(3, objeto.getId());
            registrosAfetados = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrosAfetados;
    }

    @Override
    public int delete(Unidade objeto) {
        String sql = "DELETE FROM unidade WHERE id=?";
        int registrosAfetados = 0;
        try {
            ps = conexao.prepareStatement(sql);
            ps.setLong(1,objeto.getId());
            registrosAfetados = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrosAfetados;
    }


}
