package br.com.litebanco.persistence.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;
@NamedNativeQueries({
    @NamedNativeQuery(name = "CONSULTA_CHAVE_PIX", query="SELECT cpf, nome, instituicao, chave FROM bacen.PIX WHERE cpf = :cpf", resultClass = Pix.class),
    @NamedNativeQuery(name = "INSERI_PIX", query = "INSERT INTO bacen.PIX (cpf, nome, instituicao, chave) VALUES (:cpf, :nome, :instituicao, :chave)")
})


@Entity
@Table(name = "PIX", schema = "bacen")
public class Pix {

    @Id
    private String cpf;
    private String nome;
    private String instituicao;
    private String chave;

    public Pix(){}

    public Pix(String cpf, String nome, String instituicao, String chave) {
        this.cpf = cpf;
        this.nome = nome;
        this.instituicao = instituicao;
        this.chave = chave;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getInstituicao() {
        return instituicao;
    }
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    public String getChave() {
        return chave;
    }
    public void setChave(String chave) {
        this.chave = chave;
    }

    @Override
    public String toString() {
        return "Pix [cpf=" + cpf + ", nome=" + nome + ", instituicao=" + instituicao + ", chave=" + chave
                + ", getCpf()=" + getCpf() + ", getNome()=" + getNome() + ", getInstituicao()=" + getInstituicao()
                + ", getChave()=" + getChave() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

        
    
}
