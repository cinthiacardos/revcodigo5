// El siguiente codigo tiene la funcionalidad de pedir un numero al usuario y dependiendo de si este es o no es el numero afortunado dispuesto en el codigo realizara un blucle diciendo " el numero "c" es el afortunado"
// de lo contrario solo muestra "el numero c no es el afortunado" y no realiza nada.
// tomando en cuenta que el usuario podia escribir cualquier numero el numero dado sera dividido entre 10
// y despues procedera a realizar la condicion.


import java.util.Scanner; //importamos la clase Scanner para que se pueda utilizar sin problemas, ya que nos permite la entrada de datos primitivos


public class Codigo5 {
	
	    public static void main(String[] args) {

	    	
	    Scanner s = new Scanner(System.in); // Se agrego el argumento "System.in" al constructor.
	    System.out.println("Introduzca un número: "); // Se agrego la comilla faltante y se elimino la comilla sola.
	   
	    String ni = s.nextLine();
	    
	   
	    int c = Integer.parseInt(ni); //se agrego el integer.parseInt para poder convertir el ni a un entero.
	     
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) { // se cambio (ni) por la int c ya que es (ni) pero convertido a un entero
		  int digito = (int)(c % 10); // Se cambio ni por la int c
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  c /= 10; // se cambio ni por la int c
	    }

	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado."); // Se corrigio la escritura del println
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    }
	    }
}
	  
	    