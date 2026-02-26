import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean seguir = true;

        System.out.println("=== Calculadora de Codigo Fibonacci ===");

        while (seguir) {

            System.out.print("\nIngrese la cantidad de números: ");
            int n = sc.nextInt();

            // verificacion
            if (n <= 0) {
                System.out.println("Número inválido. el numero tiene que ser mayor a 0.");
                continue; 
            }
            //arreglo
            int[] fib = new int[n];

            fib[0] = 1;
            if (n > 1) fib[1] = 2;

            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            //impresion
            System.out.println("Secuencia:");
            for (int i = 0; i < n; i++) {
                System.out.print(fib[i] + " ");
            }
            System.out.println();

            // Preguntar si seguir o parar
            System.out.print("\n¿Desea hacer otra frecuencia? (s/n): ");
            char opcion = sc.next().toLowerCase().charAt(0);

            if (opcion != 's') {
                seguir = false;
                System.out.println("operacion finalizada.");
            }
        }

        sc.close();
    }
}
