package br.com.fiap;

public class Ciclismo {

    private String tipoBicicleta;
    private String bicicleta;
    private Integer rodas;

    public Ciclismo(String tipoBicicleta, String bicicleta, Integer rodas) {
        this.tipoBicicleta = tipoBicicleta;
        this.bicicleta = bicicleta;
        this.rodas = rodas;
    }

    public Ciclismo() {
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

    public void pedalar(){
        //TODO
    }

    public void freiar(){
        //TODO
    }

}
