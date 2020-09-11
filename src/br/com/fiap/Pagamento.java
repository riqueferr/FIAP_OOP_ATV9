package br.com.fiap;

public class Pagamento {

    private Integer idPagamento;
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

    public void registrar(){
        //TODO
    }


}
