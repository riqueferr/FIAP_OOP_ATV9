package br.com.fiap;

/**
 * Classe para criar Triatletas
 * @author Henrique de Luca
 * @version 1.0
 */
public class Triatletas {

    /**
     * descrição do tipo de percurso
     */
    private String tipoPercurso;

    /**
     * distancia em Km do percurso
     */
    private Integer distanciaKm;

    /**
     * dificuldade do percurso
     */
    private Integer dificuldade;

    public Triatletas(String tipoPercurso, Integer distanciaKm, Integer dificuldade) {
        this.tipoPercurso = tipoPercurso;
        this.distanciaKm = distanciaKm;
        this.dificuldade = dificuldade;
    }

    public Triatletas() {
    }

    public String getTipoPercurso() {
        return tipoPercurso;
    }

    public void setTipoPercurso(String tipoPercurso) {
        this.tipoPercurso = tipoPercurso;
    }

    public Integer getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(Integer distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public Integer getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Integer dificuldade) {
        this.dificuldade = dificuldade;
    }

    /**
     * se o atleta irá nadar
     */
    public void nadar(){
        //TODO
    }

    /**
     * se o atleta irá atleta
     */
    public void correr(){
        //TODO
    }

    /**
     * se o atleta irá pedalar
     */
    public void pedalar(){
        //TODO
    }
}
