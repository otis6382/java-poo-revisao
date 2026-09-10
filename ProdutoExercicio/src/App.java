public class App {
    public static void main(String[] args) throws Exception {
        
        Produto produto01 = new Produto ("Airfryer Phillips Wallita", 1200, 67);
            produto01.exibirProduto();
            produto01.adicionarEstoque(2);
            produto01.exibirEstoque();
            System.out.println("===========");

        Produto produto02 = new Produto ("Churrasqueira Controle Remoto", 666, 5);
            produto02.exibirProduto();
            produto02.removerEstoque(4);
            produto02.exibirEstoque();
            System.out.println("===========");

        Produto produto03 = new Produto ("Cacetinho Chines", 10, 77);
            produto03.exibirProduto();
            produto03.removerEstoque(78);
            produto03.adicionarEstoque(0);
            produto03.exibirEstoque();
            System.out.println("===SAYONARA UWU===");

    }
}
