/*Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm. */

import java.util.Locale;
import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor da corrente eletrica: ");
        double corrente = terminal.nextDouble();

        System.out.print("Digite o valor da resistencia: ");
        double resistencia = terminal.nextDouble();

        double tensao = corrente * resistencia;

        System.out.println("O valor da tensao sera de " + tensao + " volts");
    }
}
/* Nome: Milena Costa de Andrade */