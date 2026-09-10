public class App {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("001", "Nai", 0);
        conta1.exibirDados();
        conta1.depositar(500);
        conta1.sacar(100);
        conta1.exibirSaldo();
        System.out.println("=====================");

        conta1.exibirDados();
        conta1.sacar(4001);
        conta1.exibirSaldo();
        System.out.println("=====================");


    }
}