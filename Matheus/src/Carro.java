import java.util.Scanner;

public class Carro {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            double custoFabrica, impostos, distribuidor, subtotal, custoFinal;
            System.out.print("Digite o custo de fábrica do carro: ");
            custoFabrica = leia.nextDouble();
            impostos = custoFabrica * 0.45;
            subtotal = custoFabrica + impostos;
            distribuidor = subtotal * 0.28;
            custoFinal = subtotal + distribuidor;
            System.out.println("Custo ao consumidor: " + custoFinal);
            leia.close();
        }
    }
}
