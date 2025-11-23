import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
      //variables
        int numero , soma ;
        Scanner input = new Scanner(System.in);

        soma = 0;
        numero = input.nextInt();
        while (numero != 0) {
            soma = soma + numero;
            numero = input.nextInt();
        }
        System.out.println(soma);
    }










}
