import java.util.Scanner;

public class SecretNumber {
  public static void main(String[] args) {
    int secretNumber = (int) (Math.random() * 100) + 1;

    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("🎯 Bem-vindo ao jogo do Número Secreto! 🎯");
        System.out.print("Tente adivinhar um número entre 1 e 100: ");
        
        // Declare working variables
        int userInput;
        int attempts = 0;
        
        while (true) {
            userInput = scanner.nextInt();
            attempts++;
            
            if (userInput < secretNumber) {
                System.out.print("🔼 Muito baixo! Tente novamente: ");
            } else if (userInput > secretNumber) {
                System.out.print("🔽 Muito alto! Tente novamente: ");
            } else {
                System.out.println("✅ Parabéns! Você adivinhou o número secreto: " + secretNumber + " em " + attempts + " tentativa(s).");
                break;
            }
        }
    }
  }
}