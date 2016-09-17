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
		//Calcular el signo zodiacal con el mes y dia de nacimiento

		switch(Mes_Nacimiento){

		case 1: //Enero
			
			if(Dia_Nacimiento>=21){
				zoodiaco="Acuario";
			}
			else{
				zoodiaco="Capricornio";
			}
			break;

		case 2: //Febrero
			if(Dia_Nacimiento<=19){
				zoodiaco= "Acuario";
			}
			else{
				zoodiaco= "Pisis";
			}
			break;

		case 3://Marzo
			if(Dia_Nacimiento <=20){
				zoodiaco="Pisis";
			}
			else{
				zoodiaco="Aries";
			}
			break;

		case 4://Abril
			if(Dia_Nacimiento <=20){
				zoodiaco="Aries";
			}
			else{
				zoodiaco="Tauro";
			}
			break;

		case 5://Mayo
			if(Dia_Nacimiento <= 20){
				zoodiaco="Tauro";
			}
			else{
				zoodiaco="Geminis";
			}
			break;

		case 6://Junio
			if(Dia_Nacimiento <=20){
				zoodiaco="Geminis";
			}
			else{
				zoodiaco="Cancer";
			}
			break;

		case 7://Julio
			if(Dia_Nacimiento<=21){
				zoodiaco="Cancer";
			}
			else{
				zoodiaco="Leo";
			}
			break;

		case 8://Agosto
			if(Dia_Nacimiento<=22){
				zoodiaco="Leo";
			}
			else{
				zoodiaco="Virgo";
			}
			break;

		case 9://Septiembre
			if(Dia_Nacimiento<=22){
				zoodiaco="Virgo";
			}
			else{
				zoodiaco="Libra";
			}
			break;

		case 10://Octubre
			if(Dia_Nacimiento<=22){
				zoodiaco="Libra";
			}
			else{
				zoodiaco="Escorpio";
			}
			break;
		case 11://Noviembre
			if(Dia_Nacimiento<=21){
				zoodiaco="Escorpio";
			}
			else{
				zoodiaco="Sagitario";
			}
			break;
		case 12://Diciembre
			if(Dia_Nacimiento<=21){
				zoodiaco="Sagitario";
			}
			else{
				zoodiaco="Capricornio";
			}
			break;

		}	

	}
	public void Imprimir(){
		System.out.println("Su Signo Zodiacal es: "+ zoodiaco);
	}
		
}
