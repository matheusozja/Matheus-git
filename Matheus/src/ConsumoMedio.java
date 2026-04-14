import java.util.Scanner;

public class ConsumoMedio {
    public static void main(String[] args) {
        float consumo, distancia, combustivelG;;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a distância percorrida:");
        distancia = leia.nextFloat();
        Scanner leia2 = new Scanner(System.in);
        System.out.println("Digite o consumo total de combustivel:");
        consumo = leia.nextFloat();

        combustivelG = distancia/consumo;

        System.out.println("O Consumo do veículo é de: "+ combustivelG);


    }
}
