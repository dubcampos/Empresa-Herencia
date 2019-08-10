
public class Administrador extends Persona {
	int id_administrador;
	
	public Administrador(String nombre, String dni, int edad, int id_administrador) {
		super(nombre, dni, edad);
		this.id_administrador = id_administrador;
	}
	
	public Administrador() {
		this.id_administrador = 001;
	}

	public int getId_administrador() {
		return id_administrador;
	}

	public void setId_administrador(int id_administrador) {
		this.id_administrador = id_administrador;
	}
	
	public static void registrarAdmin() {
		
	}
	
	public boolean esMayorEdad() {
		return true;
	}
	
	
}