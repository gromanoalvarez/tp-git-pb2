import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
		
		
		Scanner teclado= new Scanner(System.in);
		do{
			System.out.println("Ingrese su operación /n 1 para restar /n 2 para sumar /n 3 para dividir /n 4 para multiplicar");
					opcion = teclado.nextInt();
		}while(opcion < 1 && opcion > 4);
		
			System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		
		if(opcion.equals(1)){
			resultado = a - b;

		}else if(opcion.equals(2)){
			resultado = a + b;

		}else if(opcion.equals(3)){
			resultado = a / b;

		}else{
			resultado = a * b;

		}
		System.out.println("El resultado es " + resultado.toString());
	}
	
	/*5. ¿Qué sucedió cuando se intento hacer el segundo push?
	 * Git notifica que han realizado cambios en el repositorio remoto 
	 * ¿Qué acciones hay que tomar antes de realizar el push?
	 *  que debo hacer un git pull antes de pushear.
	 *  ¿Qué estrategia propondrían para evitar esta situación?
	 *  trabajar en diferentes ramas
	 */
	
	/*6.En el repositorio local ejecutar el siguiente comando git checkout -b develop
		¿Qué acción realiza el parámetro -b?
	 * hace que se cree una nueva rama como si se llamara a git-branch
	 */
	
	/*9. Luego de realizar el merge nos informa que los cambios necesitan revision porque se han trabajado de diferentes maneras dentro de las mismas lineas y hay que seleccionar con cual opcion nos queremos quedar.
	 * 
	 */
}