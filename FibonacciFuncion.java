import java.util.Scanner;

public class FibonacciFuncion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora de Codigo Fibonacci ===");

        while (true) {

            System.out.print("\nIngrese la cantidad de números: ");
            int n = sc.nextInt();

            // verificacion
            if (n <= 0) {
                System.out.println("Número inválido. el numero tiene que ser mayor a 0.");
                continue;
            }

            // llamar la funcion
            int[] fib = calcularFibonacci(n);

            // impresion
            System.out.println("Secuencia:");
            for (int i = 0; i < fib.length; i++) {
                System.out.print(fib[i] + " ");
            }
          
        }

    }

    public static int[] calcularFibonacci(int n) {

        int[] fib = new int[n];

        fib[0] = 1;
        if (n > 1) {
            fib[1] = 2;
        }

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }
}
