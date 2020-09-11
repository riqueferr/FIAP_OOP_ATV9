package br.com.fiap;


public class AlimentoIndividual {

    private Integer idAlimento;
    private String descricao;
    private Integer valorCaloria;
    private Integer quantidade;

    public AlimentoIndividual(Integer idAlimento, String descricao, Integer valorCaloria, Integer quantidade) {
        this.idAlimento = idAlimento;
        this.descricao = descricao;
        this.valorCaloria = valorCaloria;
        this.quantidade = quantidade;
    }

    public AlimentoIndividual() {
    }

    public Integer getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(Integer idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getValorCaloria() {
        return valorCaloria;
    }

    public void setValorCaloria(Integer valorCaloria) {
        this.valorCaloria = valorCaloria;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
