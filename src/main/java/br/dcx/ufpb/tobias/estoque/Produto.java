package br.dcx.ufpb.tobias.estoque;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String codigo;
    private String descricao;
    private double preco;
    private String nome;

    public Produto(String codigo, String descricao, double preco, String nome) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.nome = nome;
    }

    public Produto(){
        this(null,null,0,"");
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Produto o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && Objects.equals(codigo, produto.codigo) && Objects.equals(descricao, produto.descricao) && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descricao, preco, nome);
    }
}
