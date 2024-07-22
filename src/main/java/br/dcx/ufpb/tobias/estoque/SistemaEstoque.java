package br.dcx.ufpb.tobias.estoque;

import javax.swing.JOptionPane;
import java.io.IOException;

public class SistemaEstoque {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "SISTEMA DE ESTOQUE");
        Estoque estoque = new Estoque();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - ADICIONAR PRODUTO\n2 - CONSULTAR PREÇO\n3 - REMOVER PRODUTO\n4 - PROCURAR PRODUTO\n5 - ALTERAR PREÇO\n6 - SAIR"));
        boolean sair = false;
        while (!sair) {
            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "ADICIONAR PRODUTO");
                    String name = JOptionPane.showInputDialog("INSIRA O NOME DO PRODUTO: ");
                    String cod = JOptionPane.showInputDialog("INSIRA O CÓDIGO DO PRODUTO: ");
                    double preco = Double.parseDouble(JOptionPane.showInputDialog("INSIRA O PREÇO DO PRODUTO: "));
                    String desc = JOptionPane.showInputDialog("INSIRA A DESCRIÇÃO DO PRODUTO: ");
                    Produto prod = new Produto(cod, desc, preco, name);
                    try {
                        estoque.adicionarProduto(prod);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO COM SUCESSO");
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "CONSULTAR PREÇO DO PRODUTO");
                    String cod2 = JOptionPane.showInputDialog("INSIRA O CÓDIGO DO PRODUTO: ");
                    try {
                        JOptionPane.showMessageDialog(null, "PREÇO DO PRODUTO: R$ " + estoque.consultarPreco(cod2));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "REMOVER PRODUTO");
                    String cod3 = JOptionPane.showInputDialog("INSIRA O CÓDIGO DO PRODUTO: ");
                    try {
                        estoque.removerProduto(cod3);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "PROCURAR PRODUTO");
                    String nome = JOptionPane.showInputDialog("INSIRA O NOME DO PRODUTO: ");
                    try {
                        JOptionPane.showMessageDialog(null, estoque.procurarProduto(nome).toString());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "ALTERAR PREÇO DO PRODUTO");
                    String cod4 = JOptionPane.showInputDialog("INSIRA O CÓDIGO DO PRODUTO: ");
                    double preco1 = Double.parseDouble(JOptionPane.showInputDialog("INSIRA O NOVO PREÇO DO PRODUTO"));
                    try {
                        estoque.alterarPreco(cod4, preco1);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 6:
                    sair = true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVALIDA");
            }
        }
    }
}
