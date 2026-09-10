public class Produto { 
    private String nome;
    private double preco;
    private int quantidade;
    


public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;

}

public void adicionarEstoque(int valor) {
    if (valor > 0) {
        this.quantidade += valor;
    } else {
        System.out.println("Valor inválido para adicionar ao estoque.");
    }
}

public void removerEstoque(int valor) {
    if (valor > 0 && valor <= this.quantidade) {
        this.quantidade -= valor;
    } else {
        System.out.println("Valor inválido para remover do estoque.");
    }
}

public void exibirEstoque () {
    System.out.println("Estoque atual: " + quantidade);
}

public void exibirProduto () {
    System.out.println("Produto: " + nome);
    System.out.println("Preço: " + preco);
    System.out.println("Quantidade: " + quantidade);
}
}