package br.com.fiap;

/**
 * Classe para informar o plano que irá assinar
 * @author Henrique de Luca
 * @version 1.0
 */
public class PlanoPagamento {

    /**
     * informar o tipo de modalidade que irá assinar
     */
    private String modalidade;

    /**
     * valor do plano informado
     */
    private double valor;

    /**
     * quantidade de parcelas para pagar
     */
    private Integer parcelas;


    public PlanoPagamento() {
    }

    public PlanoPagamento(String modalidade, double valor, Integer parcelas) {
        this.modalidade = modalidade;
        this.valor = valor;
        this.parcelas = parcelas;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    /**
     * irá cadastrar a solicitação
     */
    public void cadastrar(){
        //TODO
    }

    /**
     * irá gerar o boleto de pagamento com as informações para o cliente
     */
    public void gerarBoleto(){
        //TODO
    }
}
