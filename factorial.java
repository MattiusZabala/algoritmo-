import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        while (true) {

            System.out.print("Ingresa un número entero: ");
            int n = leer.nextInt();

            if (n < 0) {
                System.out.println("no se puede calcular el factorial.");
            } else {
                long resultado = calculo_factorial(n);
                System.out.println("El factorial de " + n + " es: " + resultado);
            }
        }
    }

    static long calculo_factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;

    }
}


