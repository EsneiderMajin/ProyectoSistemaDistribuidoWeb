/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

/**
 *
 * @author Sneider
 */
import java.util.Date;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;

import models.Manager;


public class ManagerServices {
    
    private String endPoint;
    private Client objClientePeticiones; 
	
    public ManagerServices()
    {
	this.endPoint="http://localhost:5001/managers/";
	this.objClientePeticiones = ClientBuilder.newClient().register(new JacksonFeature());
    }
        
    public boolean autentificar(String username, String password){
        boolean resultado=false;
        if(consultarManager(username)!=null){
            Manager  objManager=consultarManager(username);
            if(objManager.getUsername().equals(username)&&objManager.getPassword().equals(password)){
            resultado = true;
            }else{
            resultado=false;
            }
        }else{
            resultado = false;
        }
       return resultado;
    }    
        
    
    	 
	public Manager consultarManager(String username)
	{
		Manager  objManager=null;	
		
		WebTarget target = this.objClientePeticiones.target(this.endPoint+username);
		
		Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);	
		
		objManager = objPeticion.get(Manager.class);
		
		return objManager;
	}
	
	
	public List<Manager> listarManagers()
	{
		List<Manager> listaManagers=null;			
		
		WebTarget target = this.objClientePeticiones.target(this.endPoint);
		
		Builder objPeticion=target.request(MediaType.APPLICATION_JSON);
		
		listaManagers = objPeticion.get(new GenericType<List<Manager>>() {});	
		
		return listaManagers;
	}
	
	
	public Manager registrarManager(Manager objManagerRegistar)
	{
		Manager  objManager=null;
		
		WebTarget target = this.objClientePeticiones.target(this.endPoint);	    
		
	    Entity<Manager> data = Entity.entity(objManagerRegistar, MediaType.APPLICATION_JSON_TYPE);
	    
	    Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);
	    
	    objManager = objPeticion.post(data, Manager.class);		
	    
		return objManager;
	}
	
	public Manager actualizarManager(Manager objClienteActualizar,Integer id)
	{
		Manager  objCliente=null;		
		
		WebTarget target = this.objClientePeticiones.target(this.endPoint+"/"+id);	  
		
	    Entity<Manager> data = Entity.entity(objClienteActualizar, MediaType.APPLICATION_JSON_TYPE);
	    
	    Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);
	    
	    objCliente = objPeticion.put(data, Manager.class);		
		
		return objCliente;
	}
	
	
	public Boolean eliminarManager(Integer id)
	{
		Boolean bandera=false;
		
		WebTarget target = this.objClientePeticiones.target(this.endPoint+"/"+id);	    
		
		Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);
		
		bandera = objPeticion.delete(Boolean.class);
		
		return bandera;
	}    
        
    
}
