package Classes;



import java.io.*;
import java.lang.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author DEll
 */
public class Archivo {
     File archivo;
      // ArrayList<ConchinitoDigital> arrConDig=new ArrayList<ConchinitoDigital>();
     
    public Archivo(){
       
     archivo= new File("archivo.txt");
    }
    
    public void nuevoArchivo(){
    
    }
 
     public void escritura(Peliculas con){
           //escritura
           try{
               PrintWriter escribo=new PrintWriter(new BufferedWriter(new FileWriter(archivo,true)));
               escribo.println(con);
               escribo.close();
           }catch(IOException ex){
               JOptionPane.showMessageDialog(null,"Crea un usuario en (Nueva Alcancia)");
           }
     }  
   
      public String lectura(){//lectura
            
           try{
               BufferedReader leer = new BufferedReader(new FileReader(archivo));
               String cadena=leer.readLine();
               leer.close();
               return cadena;
           }catch(IOException e){
              JOptionPane.showMessageDialog(null,"Crea un usuario en (Nueva Alcancia)");
              return "";
           }
          }
         
      
      
        public String lectura(int indice){//lectura
            
           try{
               BufferedReader leer = new BufferedReader(new FileReader(archivo));
               String cadena="";
               
               for(int i=0;i<=indice;i++){
               cadena=leer.readLine();
               }
               
               leer.close();
               return cadena;
           }catch(IOException e){
              JOptionPane.showMessageDialog(null,"Crea un usuario ");
              return "";
           }
          }
      

           
}
