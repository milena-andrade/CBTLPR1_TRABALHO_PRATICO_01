/*Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.*/
import java.util.Locale;
import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a diagonal do quadrado: ");
        double diagonalQuadrado = terminal.nextDouble();

        double areaQuadrado = 0.5 * Math.pow(diagonalQuadrado, 2);

        System.out.println("A area do quadrado sera: " + areaQuadrado);
    }
}
/* Nome: Milena Costa de Andrade */