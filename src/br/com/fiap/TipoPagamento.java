package br.com.fiap;

/**
 * Classe para informar o tipo de pagamento
 * @author Paola Assis
 * @version 1.0
 */
public class TipoPagamento {

    /**
     * código do tipo de pagamento
     */
    private Integer idTipo;

    /**
     * descrição do tipo de pagamento escolhido
     */
    private String dsTipoPagamento;

    public TipoPagamento(Integer idTipo, String dsTipoPagamento) {
        this.idTipo = idTipo;
        this.dsTipoPagamento = dsTipoPagamento;
    }

    public TipoPagamento() {
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getDsTipoPagamento() {
        return dsTipoPagamento;
    }

    public void setDsTipoPagamento(String dsTipoPagamento) {
        this.dsTipoPagamento = dsTipoPagamento;
    }


}
