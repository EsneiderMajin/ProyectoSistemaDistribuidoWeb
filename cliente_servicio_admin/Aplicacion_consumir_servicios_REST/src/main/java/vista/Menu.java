package vista;

import java.util.Date;
import java.util.List;
import models.Cliente;
import servicios.ClienteServices;

public class Menu {

	public static void main(String[] args) {
		
		ClienteServices objClienteServices= new ClienteServices();


		
                /*
		System.out.println("consultando un cliente con id 1");
		Cliente objClienteConsultado= objClienteServices.consultarCliente(1);
		imprimirCliente(objClienteConsultado);
		
		
                System.out.println("\n listando clientes");
		List<Cliente> listaDeClientes= objClienteServices.listarClientes();
		
		for (Cliente cliente : listaDeClientes) {
			imprimirCliente(cliente);
		}
                
		
		System.out.println("\n registrando un cliente");	
                Cliente objCliente= new Cliente();
                objCliente.setId(5);
                objCliente.setNombre("andrea");
                objCliente.setApellido("perez");
                objCliente.setEmail("andrea@unicauca.edu.co");
                objCliente.setCreateAt(new Date());
                Cliente objClienteRegistrado= objClienteServices.registrarCliente(objCliente);

                System.out.println("\n listando clientes que contiene el cliente registrado");
		List<Cliente> listaDeClientes= objClienteServices.listarClientes();
		
		for (Cliente cliente : listaDeClientes) {
			imprimirCliente(cliente);
		}
                
	    System.out.println("\n actualizando un cliente con id 1");
	    Cliente objClienteActualizado= new Cliente();
	    objClienteActualizado.setId(7);
	    objClienteActualizado.setNombre("victor");
	    objClienteActualizado.setApellido("santamaria");
	    objClienteActualizado.setEmail("victor@unicauca.edu.co");
	    objClienteActualizado.setCreateAt(new Date());
	    
	    Cliente objClienteAtualizado2=objClienteServices.actualizarCliente(objClienteActualizado, 1);
	    imprimirCliente(objClienteAtualizado2);
	    
            */
	    //System.out.println("\n eliminando un cliente");
	    //Boolean bandera= objClienteServices.eliminarCliente(2);
	    
	    //System.out.println("\n listando clientes que contiene el cliente eliminado");
            List<Cliente> listaDeClientes= objClienteServices.listarClientes();

            for (Cliente cliente : listaDeClientes) {
                    imprimirCliente(cliente);
            }
               
	
	}
	
	private static void imprimirCliente(Cliente objCliente)
	{
		System.out.println(objCliente.getname());
		System.out.println(objCliente.getlastname());
		System.out.println(objCliente.getPhone());
		System.out.println(objCliente.getEmail());
		System.out.println(objCliente.getPassword());
	}

}
