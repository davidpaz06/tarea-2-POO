
	package tarea2;

	public class Empleado extends persona {
		
		private int anioIngreso;
		private int salario;
		
		public Empleado(String nombre, String apellido, int edad, int anioIngreso, int salario) {
			super(nombre,apellido,edad);
			this.anioIngreso = anioIngreso;
			this.salario = salario;
		}
		
		public void mostrarInfo() {
			
			System.out.println("Nombre: "+getNombre()+
					"\nApellido: "+getApellido()+
					"\nEdad: "+getEdad()+
					"\nEquipo Actual: "+anioIngreso+
					"\nTitulos ganados: $"+salario+
					"\n");
					
		}

	}



