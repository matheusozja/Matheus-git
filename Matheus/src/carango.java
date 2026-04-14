import java.util.Scanner;
public class carango {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
            double[] carrosAte2010 = new double[100];
            double[] carros2011EmDiante = new double[100];
            int i = 0, j = 0;
            double valor, totalGeral = 0.0;
            int ano;
            char encerrar;
            boolean repetir = true;
            while (repetir) {
                System.out.print("Digite o ano do veículo: ");
                ano = leia.nextInt();
                System.out.print("Digite o valor do veículo: ");
                valor = leia.nextDouble();
                if (ano <= 2010) {
                    // desconto de 12%
                    carrosAte2010[i] = valor - (valor * 0.12);
                    i++;
                } else {
                    // desconto de 7%
                    carros2011EmDiante[j] = valor - (valor * 0.07);
                    j++;
                }
                System.out.print("Continuar cadastrando? (S/N): ");
                encerrar = leia.next().toUpperCase().charAt(0);
                if (encerrar == 'N') {
                    repetir = false;
                }
            }
            // Soma dos carros até 2010
            for (int k = 0; k < i; k++) {
                totalGeral += carrosAte2010[k];
            }
            // Soma dos carros 2011 em diante
            for (int k = 0; k < j; k++) {
                totalGeral += carros2011EmDiante[k];
            }
            System.out.println("Total de carros até 2010: " + i);
            System.out.println("Total geral com descontos aplicados: " + totalGeral);
            leia.close();
        }
    }
}
