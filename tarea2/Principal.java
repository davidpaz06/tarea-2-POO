package tarea2;

public class Principal {
	public static void main(String [] agrs) {
		Empleado empleado1 = new Empleado("David","Paz",19,2020,400);
		empleado1.mostrarInfo();
		
		Empleado empleado2 = new Empleado("Eiver","Marquez",26,2016,1500);
		empleado2.mostrarInfo();
		
		Empleado empleado3 = new Empleado("David","Capitelli",19,2020,800);
		empleado3.mostrarInfo();
		
		Empleado empleado4 = new Empleado("Ramon","Diaz",19,2020,800);
		empleado4.mostrarInfo();
		
		Empleado empleado5 = new Empleado("Migue","Sakkal",18,2021,300);
		empleado5.mostrarInfo();
	}

}
