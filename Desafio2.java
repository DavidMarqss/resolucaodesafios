import java.util.Scanner;

public class Desafio2{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = ent.nextInt();
        int anterior = 0;
        int atual = 1;
        boolean pertence = false;
        while (atual <= numero) {
            if (atual == numero) {
                pertence = true;
                break;
            }
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        ent.close();
    }
}