package br.dcx.ufpb.tobias.estoque;
import java.io.IOException;
import java.util.ArrayList;

public class Estoque implements InterfaceSistema{
    private ArrayList<Produto> produtos;

    public Estoque() {
        this.produtos = produtos;
    }

    @Override
    public void adicionarProduto(Produto produto) throws IOException{
        this.produtos.add(produto);
    }

    @Override
    public double consultarPreco(String cod) throws IOException {
        for (int i = 0; i < this.produtos.size(); i++) {
            if (this.produtos.get(i).getCodigo().equalsIgnoreCase(cod)) {
                return this.produtos.get(i).getPreco();
            }

        }
        return 0;
    }

    @Override
    public void removerProduto(String cod) throws IOException {
        for (int i = 0; i < this.produtos.size(); i++) {
            if (this.produtos.get(i).getCodigo().equalsIgnoreCase(cod)) {
                this.produtos.remove(i);
            }
        }
    }

    @Override
    public Produto procurarProduto(String nome) throws IOException{
        for (int i = 0; i < this.produtos.size(); i++) {
            if (this.produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                return this.produtos.get(i);
            }
        }
        return null;
    }

    @Override
    public void alterarPreco(String cod, double preco) throws IOException {
        for (int i = 0; i < this.produtos.size(); i++) {
            if (this.produtos.get(i).getCodigo().equalsIgnoreCase(cod)) {
                this.produtos.get(i).setPreco(preco);
            }
        }
    }
}
