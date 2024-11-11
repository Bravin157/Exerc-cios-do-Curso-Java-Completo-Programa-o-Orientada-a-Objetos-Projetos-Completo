import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    double z1 = Double.parseDouble(sc.next());

    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    double z2 = Double.parseDouble(sc.next());

    double resultado = (y1 * z1) + (y2 * z2);

    System.out.printf("VALOR A PAGAR: R$%.2f%n", resultado);
    }
}