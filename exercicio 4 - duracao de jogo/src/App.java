import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o horario de inicio e termino do jogo: ");
        int inicio = sc.nextInt();
        int termino = sc.nextInt();

        int duracao;
        
        if(inicio > termino) {
            duracao = ((24 - inicio) + termino);
        }
        else {
           duracao = (termino - inicio); 
        }

        System.out.println("Duracao de " + duracao +  " horas");

        sc.close();
    }
}
