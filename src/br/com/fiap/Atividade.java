package br.com.fiap;

import java.util.Date;

/**
 * Classe que abstrai as atividades/exercicios.
 * @author Luiz Henrique Ferreira
 * @version 1.0
 */
abstract class Atividade {

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

    public void setIdAtividade(Integer idAtividade) {
        this.idAtividade = idAtividade;
    }

    public Date getDtRegistro() {
        return dtRegistro;
    }

    public void setDtRegistro(Date dtRegistro) {
        this.dtRegistro = dtRegistro;
    }


    /**
     * irá adicionar uma atividade
     */
    public void adicionar(){
        //TODO
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
