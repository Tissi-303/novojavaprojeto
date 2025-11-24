import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    //metodo de adicionar produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto" + produto.getNomedoproduto() + " adicionado com sucesso!");
    }

    //metodo de busca

    public Produto buscarPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) return produto;
        }
        return null;
    }

    public void listarProdutos(){
        System.out.println("Lista de Produtos: ");
        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId() + " | Nome: " + produto.getNomedoproduto() + " | Estoque em Loja: " + produto.getQuantidadeEstoque() + " | Valor:  " + produto.getPreco() +".");
        }
    }
}
