package br.com.fiap;

public class Surfista extends Atividade {

    private String localizarMar;
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

    public void escolherPrancha(){
        //TODO
    }
}
