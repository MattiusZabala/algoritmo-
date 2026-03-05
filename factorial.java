import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        while (true) {
            
        
        
        System.out.print("Ingresa un número entero: ");
        int n = leer.nextInt();
        long f = 1; 

        if (n < 0) {
            System.out.println("no se puede calcular el factorial.");
        } else {
            for (int i = 1; i <= n; i++) {
                f *= i; 
            }
            System.out.println("El factorial de " + n + " es: " + f);
        }
        }
    }
}
