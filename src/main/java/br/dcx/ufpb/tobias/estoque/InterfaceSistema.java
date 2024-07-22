package br.dcx.ufpb.tobias.estoque;

import java.io.IOException;

public interface InterfaceSistema {
    public void adicionarProduto(Produto produto) throws IOException;
    public double consultarPreco(String cod) throws IOException;
    public void removerProduto(String cod) throws IOException;
    public Produto procurarProduto(String nome) throws IOException;
    public void alterarPreco(String cod, double preco) throws IOException;
}
