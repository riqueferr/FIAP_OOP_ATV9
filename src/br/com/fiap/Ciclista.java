package br.com.fiap;
/**
 * Classe para criacao do Ciclista
 * @author Paola Assis
 * @version 1.0
 */
public class Ciclista {

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

}
