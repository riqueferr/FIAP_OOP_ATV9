package br.com.fiap;

public class Endereco {

    private Integer idEndereco;
    private String descricao;
    private String cep;
    private String bairro;
    private String estado;

    public Endereco(Integer idEndereco, String descricao, String cep, String bairro, String estado) {
        this.idEndereco = idEndereco;
        this.descricao = descricao;
        this.cep = cep;
        this.bairro = bairro;
        this.estado = estado;
    }

    public Endereco() {
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void cadastrar(){
        //TODO
    }

    public void excluir(){
        //TODO
    }
}
