package br.ufac.sgcm.controller;

import br.ufac.sgcm.dao.EspecialidadeDao;
import br.ufac.sgcm.model.Especialidade;

import java.util.List;

public class EspecialidadeController implements IController<Especialidade> {
    //Todos os méetodos da camada DAO devem estar disponíveis
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
}
