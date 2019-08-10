import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Persona> personas = new ArrayList <Persona>();
		Cliente c0 = new Cliente("Duber","70008882",31,001);
		Cliente c1 = new Cliente("Duber","70008882",31,001);
		Cliente c2 = new Cliente("Duber","70008882",31,001);
		Cliente c3 = new Cliente("Duber","70008882",31,001);
		Administrador admin0 = new Administrador("Claudia","46670545",29,003);
		Administrador admin1 = new Administrador("Claudia","46670545",29,003);
		Administrador admin2 = new Administrador("Claudia","46670545",29,003);
		Administrador admin3 = new Administrador("Claudia","46670545",29,003);
		personas.add(c0);
		personas.add(c1);
		personas.add(c2);
		personas.add(c3);
		personas.add(admin0);
		personas.add(admin1);
		personas.add(admin2);
		personas.add(admin3);
		
		
		//imprime los datos del c0!!!
		c0.imprimir();
		
		
	}

}
