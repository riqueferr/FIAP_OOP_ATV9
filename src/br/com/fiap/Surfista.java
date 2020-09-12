package br.com.fiap;

/**
 * Classe para criar o surfista
 * @author Gustavo Petry
 * @version 1.0
 */
public class Surfista extends Atividade {

    /**
     * nome do local que irá praticar
     */
    private String localizarMar;

    /**
     * se está utilizando prancha ou não
     */
    private boolean prancha;

    public Surfista(String localizarMar, boolean prancha) {
        this.localizarMar = localizarMar;
        this.prancha = prancha;
    }

    public Surfista() {
    }

    public String getLocalizarMar() {
        return localizarMar;
    }

    public void setLocalizarMar(String localizarMar) {
        this.localizarMar = localizarMar;
    }

    public boolean isPrancha() {
        return prancha;
    }

    public void setPrancha(boolean prancha) {
        this.prancha = prancha;
    }


    /**
     * escolherá um tipo de prancha para utilizar
     */
    public void escolherPrancha(){
        //TODO
    }
}
