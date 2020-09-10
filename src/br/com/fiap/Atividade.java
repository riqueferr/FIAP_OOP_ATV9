package br.com.fiap;

import java.util.Date;

abstract class Atividade {

    private Integer idAtividade;
    private Date dtRegistro;

    public Integer getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(Integer idAtividade) {
        this.idAtividade = idAtividade;
    }

    public Date getDtRegistro() {
        return dtRegistro;
    }

    public void setDtRegistro(Date dtRegistro) {
        this.dtRegistro = dtRegistro;
    }

    public void adicionar(){
        //TODO
    }

    public void editar(){
        //TODO
    }

    public void excluir(){
        //TODO
    }
}
