import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite uma palavra ");
        String palavra = ent.nextLine();

        String inverter = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            inverter += palavra.charAt(i);
        }
        System.out.println("A palavra invertida é: " + inverter);
        ent.close();
    }
}