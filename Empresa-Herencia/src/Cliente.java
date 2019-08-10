

public class Cliente extends Persona {
	
	private int id_cliente;

	public Cliente(String nombre, String dni, int edad, int id_cliente) {
		super(nombre, dni, edad);
		this.id_cliente = id_cliente;
		
	}
	
	public Cliente() {
		this.id_cliente = 001;
	}
	
	
	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public static void registrarCliente() {
		
	}
	
	public boolean esMayorEdad(){
		return true;
	}
	
	public void imprimir() {
		
		
		System.out.println("====== CLIENTE ======");
		System.out.println("Nombre: "+getNombre());
		System.out.println("DNI: "+getDni());
		System.out.println("Edad: "+getEdad());
		System.out.println("Id de cliente: "+ id_cliente);
	}
	
}
