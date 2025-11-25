import java.util.Scanner;

public class Ex2 {
     static void main() {

        Scanner input = new Scanner(System.in);

        int numero;
        int maiorPar = -1;
        int quantidadeImpar = 0;
        int somaImpar = 0;
        float mediaImpar;

        System.out.println("Insere números (negativo para terminar):");
        numero = input.nextInt();

        while (numero >= 0) {

            if (numero % 2 == 0) {
                if (numero > maiorPar) {
                    maiorPar = numero;
                }
            } else {
                quantidadeImpar++;
                somaImpar += numero;
            }

            numero = input.nextInt();
        }

        if (maiorPar >= 0) {
            System.out.println("O maior par é: " + maiorPar);
        } else {
            System.out.println("Não existe número par.");
        }

        if (quantidadeImpar > 0) {
            mediaImpar = (float) somaImpar / quantidadeImpar;
            System.out.println("A média dos ímpares é: " + mediaImpar);
        } else {
            System.out.println("Não há números ímpares.");
        }

        input.close();
    }
}
