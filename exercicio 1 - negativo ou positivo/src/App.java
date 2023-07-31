import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um inteiro: ");
        int x = sc.nextInt();

        if(x < 0) { System.out.println("Negativo"); }
        else { System.out.println("Positivo"); }

        sc.close();
    }
}
