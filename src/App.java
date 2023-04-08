import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso do peixe em kg: ");
        double p = sc.nextDouble();
        double e = Math.max(p - 50, 0);
        double m = 4 * e;

        System.out.println("O peso dos peixes foi de " + p + " kg");
        System.out.println("O peso excedente foi de " + e + " kg");
        System.out.printf("O valor da multa a ser pago é de R$%.2f", m);

        sc.close();

    }

}
