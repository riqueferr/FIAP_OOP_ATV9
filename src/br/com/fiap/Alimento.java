package br.com.fiap;

import java.util.Date;

/**
 * Classe que irá criar a refeição completo do dia
 * @author Guilherme Vilhena
 * @version 1.0
 */
public class Alimento {

    /**
     * código do alimento
     */
    private Integer idAlimento;

    /**
     * data de registro da refeição
     */
    private Date dtRegistro;

    /**
     * quantidade total de calorias do alimento
     */
    private double calorias;


    public Alimento(Integer idAlimento, Date dtRegistro, double calorias) {
        this.idAlimento = idAlimento;
        this.dtRegistro = dtRegistro;
        this.calorias = calorias;
    }

    public Alimento() {
    }

    public Integer getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(Integer idAlimento) {
        this.idAlimento = idAlimento;
    }

    public Date getDtRegistro() {
        return dtRegistro;
    }

    public void setDtRegistro(Date dtRegistro) {
        this.dtRegistro = dtRegistro;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    /**
     * adiciona um novo alimento
     */
    public void adicionar(){
        //TODO
    }

    /**
     * edita o alimento existente
     */
    public void editar(){
        //TODO
    }

    /**
     * exclui o alimento, caso esteja incorreto
     */
    public void excluir(){
        //TODO
    }
}
