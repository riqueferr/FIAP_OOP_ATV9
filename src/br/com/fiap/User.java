package br.com.fiap;

/**
 * Classe para criação do usuário no sistema
 * @author Luiz Henrique Ferreira
 * @version 1.0
 */
public class User {

    /**
     * Usuário de login
     */
    private String user;

    /**
     * Senha do usuário
     */
    private String password;

    /**
     * Validador se está ou não dentro do sistema
     */
    private boolean logado;

    /**
     *
     * @param user nome do usuário para entrar no sistema
     * @param password senha do usuário para entrar no sistema
     */
    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public User() {
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    /**
     *
     * @return se foi ou não possível realizar o login no sistema
     */
    public String logar() {
        if(this.getUser() == "Henrique" && this.getPassword() == "123456") {
            this.logado = true;
            return "Você está logado!";
        }else {
            return "Você informou algo errado!";
        }

    }

    /**
     *
     * @return  se foi ou não possível realizar o login no sistema
     */
    public String deslogar() {
        if (this.logado) {
            this.logado = false;
            return "Você deslogou";
        } else {
            return "Por favor, logue antes de tentar sair!";
        }
    }
}
