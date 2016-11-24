/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author MaryBeds
 */
public class Socio extends Pessoa {
    
    private String cpf;
    private String telefone;
    private String celular;
    private String rua;
    private int numero;
    private int setor;
    private int cidade;
    private int uf;
    private String complemento;
    private int formaPagamento;
    private String nomeCartao;
    private String numeroCartao;
    private String dataValidade;
    private int cvv;

    
    public String getCpf() throws Exception{
        if(nomeCartao.length() == 0) throw new Exception("É necessário preencher o campo CPF.");
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() throws Exception {
        if(numero <= 0) throw new Exception("Número não pode ser <= 0");
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSetor() throws Exception {
        if(setor == 0) throw new Exception("É necessário preencher o campo Setor.");
        return setor;
    }

    public void setSetor(int setor) {
        this.setor = setor;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    public int getUf() {
        return uf;
    }

    public void setUf(int uf) {
        this.uf = uf;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) throws Exception {
        if(formaPagamento < 0 || formaPagamento > 1) throw new Exception("É necessário escolher a forma de pagamento.");
        this.formaPagamento = formaPagamento;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) throws Exception {
        if(nomeCartao.length() == 0) throw new Exception("É necessário preencher o campo Nome no Cartão.");
        this.nomeCartao = nomeCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) throws Exception {
        if(numeroCartao.length() == 0) throw new Exception("É necessário preencher o campo Número do Cartão.");
        this.numeroCartao = numeroCartao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) throws Exception {
        if(dataValidade.length() == 0) throw new Exception("É necessário preencher o campo Data de Validade.");
        this.dataValidade = dataValidade;
    }

    public int getCvv() throws Exception {
        return cvv;
    }

    public void setCvv(int cvv) throws Exception {
        if(cvv == 0) throw new Exception("É necessário preencher o campo CVV.");
        this.cvv = cvv;
    }
    
    
    
}
