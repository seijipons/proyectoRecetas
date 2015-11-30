/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorecetas;

import java.sql.*;


/**
 *
 * @author LabCompu1
 */
public class ConectaBD {
    Connection conexion=null;
    ResultSet cantidadNombres;
    String lista_nombres;
    public ConectaBD(int a){
        
        if (a==1){
        System.out.println("Creando conexion 1.");
        cargarControlador();
        realizarConexion();
        }else{
            System.out.println("Creando conexion 2.");
        cargarControlador();
        realizarConexion2();
    
        
        }
        
    }
    
    public void cargarControlador(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver cargado");
            
        }catch(ClassNotFoundException ex){
            System.out.println("No se encuentra el controlador");
            
        }
    }
    public void realizarConexion(){
        try{
            String servidor="jdbc:mysql://localhost:3306/bd1recetas?zeroDateTimeBehavior=convertToNull";
            String usuarioDB="root";
            String passwordDB="";
            conexion=DriverManager.getConnection(servidor,usuarioDB,passwordDB);
            System.out.println("Conexion Exitosa");
            
        }catch(SQLException ex){
            System.out.println("No se realizó la conexión");
        }
    }
    
    public void realizarConexion2(){
        try{
            String servidor="jdbc:mysql://localhost:3306/bd2ingredientes";
            String usuarioDB="root";
            String passwordDB="";
            conexion=DriverManager.getConnection(servidor,usuarioDB,passwordDB);
            System.out.println("Conexion Exitosa");
            
        }catch(SQLException ex){
            System.out.println("No se realizó la conexión");
        }
    }
}
