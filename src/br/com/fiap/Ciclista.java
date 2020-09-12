package br.com.fiap;

import java.util.Date;

/**
 * Classe para criacao do Ciclista
 * @author Paola Assis
 * @version 1.0
 */
public class Ciclista extends Atividade{

    /**
     * tipo da bicicleta ex: tricículo
     */
    private String tipoBicicleta;

    /**
     * a marca da bicicleta
     */
    private String bicicleta;

    /**
     * quantidade de rodas que a bicicleta contém
     */
    private Integer rodas;


    public Ciclista(String tipoBicicleta, String bicicleta, Integer rodas) {
        this.tipoBicicleta = tipoBicicleta;
        this.bicicleta = bicicleta;
        this.rodas = rodas;
    }

    public Ciclista(Integer idAtividade, Date dtRegistro, String tipoBicicleta, String bicicleta, Integer rodas) {
        super(idAtividade, dtRegistro);
        this.tipoBicicleta = tipoBicicleta;
        this.bicicleta = bicicleta;
        this.rodas = rodas;
    }


    public Ciclista() {
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    public String getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(String bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Integer getRodas() {
        return rodas;
    }

    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }


    /**
     * começará a pedalar
     */
    public void pedalar(){
        //TODO
    }

    /**
     * irá parar de pedalar
     */
    public void freiar(){
        //TODO
    }

    @Override
    public Integer adicionar() {
        return super.adicionar();
    }

    @Override
    public Integer excluir() {
        return super.excluir();
    }

}
