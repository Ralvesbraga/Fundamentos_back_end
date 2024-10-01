package br.ufac.sgcm.controller;

import br.ufac.sgcm.dao.EspecialidadeDao;
import br.ufac.sgcm.model.Especialidade;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EspecialidadeController implements IController<Especialidade> {
    //Todos os métodos da camada DAO devem estar disponíveis
    //Métodos das regras de negócio da aplicação
    EspecialidadeDao eDao;

    public EspecialidadeController(){
        eDao = new EspecialidadeDao();
    }

    @Override
    public List<Especialidade> get() {
        return eDao.get();
    }

    @Override
    public Especialidade get(Long id) {
        return eDao.get(id);
    }

    @Override
    public List<Especialidade> get(String termoBusca) {
        return eDao.get(termoBusca);
    }

    @Override
    public int delete(Especialidade objeto) {
        return eDao.delete(objeto);
    }

    @Override
    public int save(Especialidade objeto) {
        if(objeto.getId() ==null) //Se o objeto tem id, atualiza ele, caso contrário, será inserido na base de dados
            return eDao.insert(objeto);
        return eDao.update(objeto);
    }

    //Métodos do Servlet

    public Especialidade processFormRequest(HttpServletRequest req, HttpServletResponse res){
        String paramSubmit = req.getParameter("submit");
        String paramNome = req.getParameter("nome");
        String paramId = req.getParameter("id");
        Especialidade registro = new Especialidade();
        //Se o usuário está editando
        if (paramId != null && !paramId.isEmpty()) {
            Long id = Long.parseLong(paramId);
            registro.setId(Long.parseLong(paramId));
            registro = this.get(id);
        }
        if (paramSubmit!= null) { //Se o usuário está inserindo
            registro.setNome(paramNome);
            this.save(registro); // Chama o save da classe Especialidade
            try {
                res.sendRedirect("especialidade.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return registro;
    }

    public List<Especialidade> processListRequest(HttpServletRequest req, HttpServletResponse res){
        List<Especialidade> registros = new ArrayList<>();
        String paramExcluir = req.getParameter("excluir");
        if (paramExcluir != null && !paramExcluir.isEmpty()) {
            Long id = Long.parseLong(paramExcluir);
            Especialidade registro = this.get(id);
            this.delete(registro);
        }
        registros = this.get();
        return registros;
    }
    
}
