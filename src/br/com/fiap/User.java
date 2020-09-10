package br.com.fiap;

public class User {

    private String user;
    private String password;
    private boolean logado;

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


    //método para entrar no sistema
    public void logar() {
        if(this.getUser() == "Henrique" && this.getPassword() == "123456") {
            this.logado = true;
            System.out.println("Você está logado!");
        }else {
            System.out.println("Você informou algo errado!");
        }

    }

    //método para sair do sistema
    public void deslogar() {
        if (this.logado) {
            this.logado = false;
            System.out.println("Você deslogou!");
        } else {
            System.out.println("Por favor, logue antes de tentar sair!");
        }
    }
}
