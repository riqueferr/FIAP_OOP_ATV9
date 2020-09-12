package br.com.fiap;

import java.util.Date;

/**
 * Classe para criar o Corredor
 * @author Gustavo Petry
 * @version 1.0
 */
public class Corredor extends Atividade {

    /**
     * distancia em km do percurso
     */
    private double distancia;

    /**
     * marca do tênis que será utilizado
     */
    private String tenis;

    /**
     * quanto o corredor irá calçar
     */
    private Integer tamanhoPe;

    public Corredor() {
    }

    public Corredor(double distancia, String tenis, Integer tamanhoPe) {
        this.distancia = distancia;
        this.tenis = tenis;
        this.tamanhoPe = tamanhoPe;
    }

    public Corredor(Integer idAtividade, Date dtRegistro, double distancia, String tenis, Integer tamanhoPe) {
        super(idAtividade, dtRegistro);
        this.distancia = distancia;
        this.tenis = tenis;
        this.tamanhoPe = tamanhoPe;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getTenis() {
        return tenis;
    }

    public void setTenis(String tenis) {
        this.tenis = tenis;
    }

    public Integer getTamanhoPe() {
        return tamanhoPe;
    }

    public void setTamanhoPe(Integer tamanhoPe) {
        this.tamanhoPe = tamanhoPe;
    }


    /**
     * necessário iniciar o método para colocar o tênis antes de iniciar a corrida
     */
    public void colocarTenis(){
        //TODO
    }


}
