import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero:");
        int numeroInicio = scanner.nextInt();
        System.out.println("Escolha um numero maior que o anterior:");
        int numeroFim = scanner.nextInt();
        while (numeroFim < numeroInicio) {
            System.out.println("O numero tem quer ser MAIOR que o ANTERIOR");
            System.out.println("Escolha um numero novamente:");
            numeroFim = scanner.nextInt();
        }
        System.out.println("Par = 0");
        System.out.println("Impar = 1");
        System.out.println("Escolha uma opção:");
        int option = scanner.nextInt();


        if (option == 0 || option == 1) {
            System.out.print("Os numeros:");
            for (int inicio = numeroInicio; inicio <= numeroFim; inicio++) {
                if (inicio % 2 == option) {
                    System.out.print(" " + inicio);
                }
            }
            ;
            if (option == 1) {
                System.out.println(" são IMPARES!!!");
            } else {
                System.out.println(" são PARES!!!");


            }

        } else {
            System.out.println("Essa Opção NÃO EXISTE");
        }

    }
}