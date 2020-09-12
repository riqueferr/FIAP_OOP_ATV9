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

    private static Integer sequencia = 0;


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


//    public Integer adicionar() {
//        if (this.getIdAtividade() == null) {
//            this.setIdAtividade(this.getIdAtividade() + 1);
//        } else {
//            this.setIdAtividade(this.getIdAtividade() + 1);
//        }
//        return getIdAtividade();
//    }
//

    public Integer adicionar(){
        this.idAtividade = sequencia++;
        return this.getIdAtividade();
    }

    /**
     * irá editar uma atividade existente
     */
    public void editar(){
        //TODO
    }

    /**
     * irá excluir uma atividade
     * @return
     */
    public Integer excluir(){
        this.idAtividade = sequencia--;
        return this.getIdAtividade();
    }



}
