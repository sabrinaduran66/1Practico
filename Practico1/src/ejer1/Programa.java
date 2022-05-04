package ejer1;
import java.util.Scanner;

public class Programa {
	Scanner teclado=new Scanner(System.in);
	    String apellido;
	    int cedula,edad;
	    double altura;
	    
	public void iniciar() {
		cargar();
		imprimir();
		
	}//fin iniciar 

	private void imprimir() {
		System.out.println("Apellido:" + apellido );
		System.out.println("Cedula:" + cedula );
		System.out.println("Edad:" + edad );
		System.out.println("Altura:" + altura );
		
	}

	private void cargar() {
    System.out.println("Ingrese apellido:");
    apellido=teclado.nextLine();
    System.out.println("Ingrese cedula:");
    cedula=teclado.nextInt();
    System.out.println("Ingrese edad:");
    edad=teclado.nextInt();
    System.out.println("Ingrese altura:");
    altura=teclado.nextDouble();
    
    
		
		
	}

}
