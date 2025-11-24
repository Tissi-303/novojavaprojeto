public class Produto {
    //atributos

    private String nomedoproduto;
    private float preco;
    private String categoria;
    private int id;
    private int quantidadeEstoque;

    //construtores

    public Produto() {}

    public Produto(String nomedoproduto, float preco, String categoria, int id, int quantidadeEstoque) {
        this.nomedoproduto = nomedoproduto;
        this.preco = preco;
        this.categoria = categoria;
        this.id = id;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //getters and setters

    public String getNomedoproduto() {
        return nomedoproduto;
    }

    public void setNomedoproduto(String nomedoproduto) {
        this.nomedoproduto = nomedoproduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
