package br.ufac.sgcm;

import br.ufac.sgcm.dao.ConexaoDB;
import br.ufac.sgcm.dao.EspecialidadeDao;
import br.ufac.sgcm.model.Especialidade;
import br.ufac.sgcm.model.Profissional;
import br.ufac.sgcm.model.Unidade;

import java.sql.Connection;
import java.util.List;

public class Teste {
    
    public static void main(String[] args) {
        //Criar um objeto profissional

        Profissional p1 = new Profissional();
        p1.setNome("Rafael");
        p1.setRegistro("123");
        p1.setTelefone("68999999999");
        p1.setEmail("rafael@sou.ufac.br");
        Unidade u1 = new Unidade();
        u1.setNome("Laboratório");
        u1.setEndereco("Av. Getúlio Vargas n°:100");
        p1.setUnidade(u1);
        Especialidade e1 = new Especialidade();
        e1.setNome("Otorrinolarigologia");
        e1.setId(10L);
        p1.setEspecialidade(e1);
        System.out.println("Nome:" + p1.getNome());
        System.out.println("Especialidade:" + p1.getEspecialidade().getNome());
        System.out.println("Unidade:" + p1.getUnidade().getNome());

       // ConexaoDB conexao = new ConexaoDB();
       // Connection instancia = conexao.getConexao();
       // if(instancia !=null)
       //     System.out.println("Conectou");
       // else
       //     System.out.println("Não Conectou");

        EspecialidadeDao edao = new EspecialidadeDao();

       // Inserindo uma especialidade
       // if (edao.insert(e1) == 1)
       //     System.out.printf("Especialidade inserida com sucesso");
       // else
       //     System.out.println("Não inserido");

        //Deletando especialidade
        //if(edao.delete(e1) == 1)
        //    System.out.printf("Especialidade excluída com sucesso!");
        //else
        //    System.out.println("Não exclui");

        //Atualizar uma especialidade
        //e1.setId(11L);
        //e1.setNome("teste");
        //if(edao.update(e1) == 1)
        //    System.out.println("Especialidade atualizada com sucesso!");
        //else
        //    System.out.printf("Não atualizada");

        //Lista das especialidades
        List<Especialidade> list = edao.get("tria");
        list.forEach(System.out::println);


    }
}
