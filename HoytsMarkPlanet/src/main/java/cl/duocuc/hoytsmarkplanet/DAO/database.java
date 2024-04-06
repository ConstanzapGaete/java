
package cl.duocuc.hoytsmarkplanet.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class database {
    private Connection db;
    private Statement consultas;
    private ResultSet resultado;
    public database(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            db=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviesdb", "root", "");
            consultas=db.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("fallo de conexion");
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error conexion base de datos");
        } 
    }
   public ResultSet ejecutaQuery(String sql) throws SQLException {
        Statement statement = db.createStatement();
        return statement.executeQuery(sql);}
   
    public int insertQuery(String sql )throws SQLException {
        Statement statement = db.createStatement();
        return statement.executeUpdate(sql);}
    
    
    public void Eliminar(String  titulo) {
         String consulta ="DELETE FROM `movies` WHERE `TITULO`= '"+ titulo +"'";
       try{
          consultas.executeUpdate(consulta);
       }catch(Exception ex){
           Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo Eliminar");
       }
    }
    
    public void actualizar (String titulo, String director, int ano, int duracion, String genero){
        String consulta = "UPDATE `movies` SET `TITULO` =  '"+titulo+"', `DIRECTOR`='"+director+"', `ANO`='"+ ano+"', `DURACION`='"+duracion+"', `GENERO`='"+ genero +"' WHERE `TITULO`= '"+titulo+"'";
        try{
            consultas.executeLargeUpdate(consulta);
            System.out.println("Modificado");
        }catch(Exception ex){
           Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo Actualizar");
       }
    }
    
}
