import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um inteiro: ");
        int valor = sc.nextInt();

        if(valor % 2 == 0) { System.out.println("Par"); }
        else { System.out.println("Impar"); }

        sc.close();
    }
}
