import java.util.Scanner;
import java.util.Random;

public class AdivinheONumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100
        int tentativas = 0;
        int palpite;
        
        System.out.println("Bem-vindo ao jogo Adivinhe o Número!");
        System.out.println("Estou pensando em um número entre 1 e 100.");
        System.out.println("Tente adivinhar qual é!");
        
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
            }
        } while (palpite != numeroSecreto);
        
        scanner.close();
    }
}
