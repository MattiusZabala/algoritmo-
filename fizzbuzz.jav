import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// declaracion de variables
		Scanner sc= new Scanner(System.in);
		int numeros;
		//programa fizzbuzz 
		
        System.out.println("Bienvenido al programa FizzBuzz");
        System.out.println("Digite el numero 0 si desea salir");

        System.out.println("Digite el numero que desee: ");
        numeros = sc.nextInt();
        
     while(numeros != 0){ 
     System.out.println("el numero es: "+ numeros);
    
    if(numeros % 5 == 0 && numeros % 3 == 0){
      System.out.println("FizzBuzz");
     }
    else if (numeros % 5 == 0){
      System.out.println("Buzz");
      
  }
    else if (numeros % 3 == 0){
      System.out.println ("Fizz");
      
  } else {
      System.out.println("numeros");
  }
	System.out.println("Digite otro numero: ");
	numeros = sc.nextInt();
  }
 }
}