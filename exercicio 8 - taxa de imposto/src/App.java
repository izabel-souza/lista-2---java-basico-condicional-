import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salario:");
        double salario = sc.nextDouble();
        
        double imposto;
        if(salario <= 2000) {
            imposto = 0;
        }
        else if(salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
        }
        else if(salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
        }
        else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

        System.out.printf("R$%.2f%n", imposto);

        sc.close();
    }
}
