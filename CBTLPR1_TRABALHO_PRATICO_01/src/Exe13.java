/*Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo de percurso
(em s) que serão digitados. */

import java.util.Locale;
import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor da velocidade inicial em m/s: ");
        double velocidadeInicial = terminal.nextDouble();

        System.out.print("Digite o valor da aceleracao em m/s²: ");
        double aceleracao = terminal.nextDouble();

        System.out.print("Digite o valor do tempo do percurso em s: ");
        double tempo = terminal.nextDouble();

        double velocidadeFinal = (velocidadeInicial + (aceleracao * tempo)) * 3.6;

        System.out.println("A velocidade final sera de " + velocidadeFinal + " km/h");
    }
}
/* Nome: Milena Costa de Andrade */