package documento;

public class Usuario {
	//Aplicacion patron Prototype
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //inicializacion de la documentacion en blanco 
        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();  
        documentacionEnBlanco.incluye(new OrdenDePedido());  
        documentacionEnBlanco.incluye(new CertificadoCesion());  
        documentacionEnBlanco.incluye(new SolicitudMatriculacion());  
        // creacion de documentacion nueva para dos clientes  
        DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Martin");  
        DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Simon");  
        documentacionCliente1.visualiza();  
        documentacionCliente2.visualiza();  

	}

}
