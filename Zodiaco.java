package practica001;

public class Zodiaco {

	/**
	 * este programa calcula el signo del zodiaco 
	 * del usuario.
	 */
	String Nombre;
	String Apellidos;
	int Edad;
	int Dia_Nacimiento;
	int Mes_Nacimiento;
	int Año_Nacimiento;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void PedirDatos(){
		

		Scanner teclear=new Scanner(System.in);
		System.out.println("Teclear Nombre: ");
		Nombre=teclear.nextLine();
		System.out.println("Teclear Apellido: ");
		Apellidos=teclear.nextLine();
		System.out.println("Teclear Edad: ");
		Edad=teclear.nextInt();
		System.out.println("Teclear Dia de Nacimiento: ");
		Dia_Nacimiento=teclear.nextInt();
		System.out.println("Teclear Mes de Nacimiento: ");
		Mes_Nacimiento=teclear.nextInt();
		System.out.println("Teclear Año de Nacimiento: ");
		Año_Nacimiento=teclear.nextInt();
		
			
	}
	public void CalcularZodiaco() {
		
	}
	public void Imprimir(){
		
	}
	
}
