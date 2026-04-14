import java.util.Scanner;
public class taboada {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            int N, T;
            char O;
            System.out.print("Digite o número da tabuada: ");
            N = leia.nextInt();
            System.out.print("Digite A para adição, S para subtração, D para divisão e M para multiplicação: ");
            O = leia.next().toUpperCase().charAt(0);
            System.out.print("Digite o número final da tabuada: ");
            T = leia.nextInt();
            for (int i = 1; i <= T; i++) {
                if (O == 'A') {
                    System.out.println(N + " + " + i + " = " + (N + i));
                } else if (O == 'S') {
                    System.out.println(N + " - " + i + " = " + (N - i));
                } else if (O == 'D') {
                    if (i != 0) {
                        System.out.println(N + " / " + i + " = " + (N / (double)i));
                    } else {
                        System.out.println("Divisão por zero não permitida.");
                    }
                } else if (O == 'M') {
                    System.out.println(N + " * " + i + " = " + (N * i));
                } else {
                    System.out.println("Operação inválida.");
                    break;
                }
            }
            leia.close();
        }
    }
}
