package br.com.fiap;

import java.util.Date;

/**
 * Classe que abstrai as atividades/exercicios.
 * @author Luiz Henrique Ferreira
 * @version 1.0
 */
abstract class Atividade {

    public Atividade(Integer idAtividade, Date dtRegistro) {
        this.idAtividade = idAtividade;
        this.dtRegistro = dtRegistro;
    }

    public Atividade() {
    }

    /**
     * Código de registro da atividade.
     */
    private Integer idAtividade;

    /**
     * Data de registro da atividade.
     */
    private Date dtRegistro;


    public Integer getIdAtividade() {
        return idAtividade;
    }

    public int setIdAtividade(Integer idAtividade) {
        this.idAtividade = idAtividade;
        return 0;
    }

    public Date getDtRegistro() {
        return dtRegistro;
    }

    public void setDtRegistro(Date dtRegistro) {
        this.dtRegistro = dtRegistro;
    }



    public void adicionar() {
    }


    /**
     * irá editar uma atividade existente
     */
    public void editar(){
        //TODO
    }

    /**
     * irá excluir uma atividade
     */
    public void excluir(){
        //TODO
    }



}
