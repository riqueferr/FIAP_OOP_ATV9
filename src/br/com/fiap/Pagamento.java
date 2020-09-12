package br.com.fiap;

/**
 * Classe para criar/realizar o pagamento
 * @author Paola Assis
 * @version 1.0
 */
public class Pagamento {

    /**
     * código do pagamento
     */
    private Integer idPagamento;

    /**
     * se foi ou não pago
     */
    private boolean pago;

    public Pagamento(Integer idPagamento, boolean pago) {
        this.idPagamento = idPagamento;
        this.pago = pago;
    }

    public Pagamento() {
    }

    public Integer getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Integer idPagamento) {
        this.idPagamento = idPagamento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }


    /**
     * irá registrar o pagamento no sistema
     */
    public void registrar(){
        //TODO
    }


}
