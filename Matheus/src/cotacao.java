import java.util.Scanner;

public class cotacao {


    public class Conversao {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            double cotacao, valorD, conversaoR;
            System.out.print("Qual é a cotação do dólar? ");
            cotacao = leia.nextDouble();
            System.out.print("Quantos dólares você possui? ");
            valorD = leia.nextDouble();
            conversaoR = valorD * cotacao;
            System.out.println("O valor convertido em reais é: " + conversaoR);
            leia.close();
        }
    }
}
