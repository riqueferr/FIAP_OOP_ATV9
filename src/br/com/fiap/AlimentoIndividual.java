package br.com.fiap;

/**
 * Classe para criar consumo individual de alimento
 * @author Henrique de Luca
 * @version 1.0
 */
public class AlimentoIndividual {

    /**
     * código do alimento
     */
    private Integer idAlimento;
    /**
     * descrição da refeição (nome ou período)
     */
    private String descricao;

    /**
     * valor individual das calorias do alimento
     */
    private Integer valorCaloria;

    /**
     * quantidade ingerida
     */
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
