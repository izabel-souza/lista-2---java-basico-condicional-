import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double preco_vetor[] = {4.00, 4.50, 5.00, 2.00, 1.50};

        System.out.println("Informe o codigo + quantidade do produto: ");
        int codigo = sc.nextInt();
        int quant = sc.nextInt();

        double resultado = (quant * preco_vetor[codigo - 1]);

        System.out.printf("Total: R$%.2f%n", resultado);

        sc.close();
    }
}
