import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        double valor = sc.nextDouble();

        if ((valor < 0) || (valor > 100)) {
            System.out.println("Fora de intervalo");
        }
        else if (valor <= 25) {
            System.out.println("[0, 25]");
        }
        else if (valor <= 50) {
            System.out.println("(25, 50]");
        }
        else if (valor <= 75) {
            System.out.println("(50, 75]");
        }
        else {
            System.out.println("(75, 100]");
        }

        sc.close();
    }
}
