import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois inteiros separados por virgual: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if((x % y == 0) || (y % x == 0)) System.out.println("Sao Multiplos");
        else System.out.println("Nao sao multiplos");

        sc.close();
    }
}
