package br.com.fiap;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        //Construtor "All Args"
        User u = new User("Henrique", "123456");
        //informando usuario
        //u.setUser("Henrique");
        //visualizando usuario informado
        System.out.println("Seu nome de usuário é: " + u.getUser());
        //informando senha
        //u.setPassword("123456");
        //visualizando senha informada
        System.out.println("Senha inserida foi: " + u.getPassword());
        //"logando"
        System.out.println(u.logar());
        //"deslogando"
        System.out.println(u.deslogar());
        //tentativa de "deslogar" sem estar "logado
        System.out.println(u.deslogar());
        //informando login correto e senha incorreta
        u.setUser("Henrique");
        u.setPassword("senhaErrada");
        //Exemplo de tentativa de login com senha errada
        System.out.println(u.logar());

        System.out.println("");
        System.out.println("");

        //Construtor "No Args"
        Imc i = new Imc();
        //"settando" a informação de altura
        i.setAltura(1.72);
        //"settando" a informação de peso
        i.setPeso(73);

        System.out.println("Seu peso é: " + i.getPeso() + " e sua altura é de: " + i.getAltura());

        //Calculando IMC e informando a categoria!
        i.calcular();



        Skatista s = new Skatista();
        Corredor c = new Corredor();

    }
}
