package br.com.fiap;

import java.util.Date;

/**
 * Classe para criar o Skatista
 * @author Guilherme Vilhena
 * @version 1.0
 */
public class Skatista extends Atividade {

    /**
     * informar a quantidade de rolamento que contém no skate
     */
    private Integer rolamento;

    /**
     * informar a marca do shape do skate
     */
    private String shape;

    /**
     * informar quantos rolamento tem o skate
     */
    private Integer rodas;

    public Skatista(Integer rolamento, String shape, Integer rodas) {
        this.rolamento = rolamento;
        this.shape = shape;
        this.rodas = rodas;
    }

    public Skatista(Integer idAtividade, Date dtRegistro, Integer rolamento, String shape, Integer rodas) {
        super(idAtividade, dtRegistro);
        this.rolamento = rolamento;
        this.shape = shape;
        this.rodas = rodas;
    }

    public Skatista() {
    }

    public Integer getRolamento() {
        return rolamento;
    }

    public void setRolamento(Integer rolamento) {
        this.rolamento = rolamento;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Integer getRodas() {
        return rodas;
    }

    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }



    /**
     * irá iniciar a atividade remando
     */
    public void remar(){
        //TODO
    }

    /**
     * irá pular com o skate
     */
    public void ollie(){
        //TODO
    }

    /**
     * irá parar o skate
     */
    public void freiar(){
        //TODO
    }

    @Override
    public Integer adicionar() {
        return super.adicionar();
    }

    @Override
    public Integer excluir() {
        return super.excluir();
    }


}
