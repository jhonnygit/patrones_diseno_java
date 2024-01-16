package comercial;

public class TestComercial {
	//patron singleton
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // inicialización del comercial en el sistema  
		 Comercial elComercial = Comercial.Instance();  
		 elComercial.setNombre("Comercial Auto");  
		 elComercial.setDireccion("Madrid");  
		 elComercial.setEmail("comercial@comerciales.com");  
		 // muestra el comercial del sistema  
		 visualiza();  

	}
	
	public static void visualiza() {
		Comercial elComercial = Comercial.Instance();  
		elComercial.visualiza();  
	}

}
