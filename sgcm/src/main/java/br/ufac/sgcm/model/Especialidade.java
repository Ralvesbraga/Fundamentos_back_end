package br.ufac.sgcm.model;

public class Especialidade {
    private Long id;
    private String nome;

    public Especialidade(){

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.id + "." + this.nome;
    }
}
