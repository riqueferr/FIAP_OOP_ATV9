package br.com.fiap;

/**
 * Classe para criação do administrador do sistema
 * @author Luiz Henrique Ferreira
 * @version 1.0
 */
public class Administrador {

    /**
     * O administrador terá uma senha mestra.
     */
    private String senhaAdm;


    public Administrador(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }

    public Administrador(){

    }

    public String getSenhaAdm() {
        return senhaAdm;
    }

    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }


    /**
     * atualiza o completamente o sistema
     */
    public void atualizarSistema(){
        //TODO
    }
}
