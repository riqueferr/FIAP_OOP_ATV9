package br.com.fiap;

import java.util.Date;

public class Alimento {

    private Integer idAlimento;
    private Date dtRegistro;
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
