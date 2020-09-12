package br.com.fiap;

/**
 * Classe para criar endereços dos usuarios
 * @author Henrique de Luca
 * @version 1.0
 */
public class Endereco {

    /**
     * código do endereço
     */
    private Integer idEndereco;

    /**
     * endereço do usuário
     */
    private String descricao;

    /**
     * cep do endereço passado pelo usuário
     */
    private String cep;

    /**
     * bairro do endereço do usuário
     */
    private String bairro;

    /**
     * estado do endereço do usuário
     */
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


    /**
     * poderá cadastrar um novo endereço
     */
    public void cadastrar(){
        //TODO
    }

    /**
     * poderá excluir um endereço existente
     */
    public void excluir(){
        //TODO
    }
}
