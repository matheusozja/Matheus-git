import java.util.Scanner;

public class Conversao {
    public class Temperatura {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            double C, F;
            System.out.print("Digite o valor em graus Celsius: ");
            C = leia.nextDouble();
            F = (9 * C + 160) / 5;
            System.out.println("Valor em Fahrenheit: " + F);
            leia.close();
        }
    }
}
