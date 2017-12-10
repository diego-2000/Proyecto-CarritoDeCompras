package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEll
 */
public class Cliente {
    private String nombre;
    private String appPaterno;
 
    
    public Cliente(String nombre,String appePat){
    this.nombre=nombre;
    this.appPaterno=appePat;

    }
    public Cliente(){
    this.nombre="nombre";
    this.appPaterno="appePat";
 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
    return ""+nombre+","+appPaterno;
    }
}
