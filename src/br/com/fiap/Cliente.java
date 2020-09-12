package br.com.fiap;

import java.util.Date;

/**
 * Classe para criação de Clientes do sistema
 * @author Guilherme Vilhena
 * @version 1.0
 */
public class Cliente {

    /**
     * nome do usuário
     */
    private String nome;

    /**
     * idade do usuário
     */
    private Integer idade;

    /**
     * data de nascimento do usuário
     */
    private Date dtNascimento;

    /**
     * data de cadastro no sistema
     */
    private Date dtCadastro;

    public Cliente(String nome, Integer idade, Date dtNascimento, Date dtCadastro) {
        this.nome = nome;
        this.idade = idade;
        this.dtNascimento = dtNascimento;
        this.dtCadastro = dtCadastro;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }


    /**
     * irá assinar o plano de acordo com o que for passado
     */
    public void assinarPlano(){
        //TODO
    }

    /**
     * irá fazer a soma do consumo de calorias e indicar os alimentos
     */
    public void verificarAlimento(){
        //TODO
    }

}
