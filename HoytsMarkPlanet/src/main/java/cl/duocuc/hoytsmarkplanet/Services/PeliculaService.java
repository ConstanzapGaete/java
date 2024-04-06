/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocuc.hoytsmarkplanet.Services;

import cl.duocuc.hoytsmarkplanet.DAO.database;
import cl.duocuc.hoytsmarkplanet.DTO.peliculasDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gcons
 */
public class PeliculaService implements Ipeliculas{
    database db;
    private Statement consultas;
    PreparedStatement alfa;
    ResultSet resultado;
    
    public PeliculaService(){
        db = new database();
    }

    @Override
    public void Guardar(peliculasDTO p) {
        try {
            String query = "INSERT INTO `movies` (`TITULO`, `DIRECTOR`,`ANO`,`DURACION`,`GENERO`) values ('"+ p.getTitulo()+"', '"+ p.getDirector()+"', '"+ p.getAno()+"', '"+ p.getDuracion()+"', '"+ p.getGenero()+"')";
            System.out.println(query);
            db.insertQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(PeliculaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<peliculasDTO> Listar() {
        List<peliculasDTO> lista = new ArrayList<>();
        try {
            ResultSet rs = db.ejecutaQuery("select * from `movies`");
            while(rs.next()){
                lista.add(new peliculasDTO(rs.getInt("ID_MOVIE"),rs.getString("TITULO"), rs.getString("DIRECTOR"),rs.getInt("ANO"),rs.getInt("DURACION"),rs.getString("GENERO")));
            }
        } catch (SQLException ex) {
            System.out.println("Error en query");
        }
        return lista;
    }

    @Override
    public List<peliculasDTO> filtroT(String titulo) {
        List<peliculasDTO> lista = new ArrayList<>();
        try{
            String query = "SELECT * FROM `movies` WHERE `titulo` = '" + titulo + "'";
            ResultSet rs = db.ejecutaQuery(query);
            while(rs.next()){
                lista.add(new peliculasDTO(rs.getInt("ID_MOVIE"),rs.getString("TITULO"), rs.getString("DIRECTOR"),rs.getInt("ANO"),rs.getInt("DURACION"),rs.getString("GENERO")) );    
            }   
        }catch (SQLException ex) {
            System.out.println("Pelicula no existe " + ex.getMessage());
        } 
        return lista ;
    }

    @Override
    public List<peliculasDTO> filtroAnio(int alfa, int beta) {
        List<peliculasDTO> lista = new ArrayList<>();
        try{
            String query = "SELECT * FROM `movies` WHERE `ano` BETWEEN '" + alfa + "' AND '" + beta + "'";
            ResultSet rs = db.ejecutaQuery(query);
            while(rs.next()){
                lista.add(new peliculasDTO(rs.getInt("ID_MOVIE"),rs.getString("TITULO"), rs.getString("DIRECTOR"),rs.getInt("ANO"),rs.getInt("DURACION"),rs.getString("GENERO")) );    
            }   
        }catch (SQLException ex) {
            System.out.println("no hay peliculas en ese rango " + ex.getMessage());
        } 
        return lista ;
    }

    @Override
    public List<peliculasDTO> filtroInt(int id) {
        List<peliculasDTO> lista = new ArrayList<>();
        try{
            String query = "SELECT * FROM `movies` WHERE `ID_MOVIE` = '" + id + "'";
            ResultSet rs = db.ejecutaQuery(query);
            while(rs.next()){
                lista.add(new peliculasDTO(rs.getInt("ID_MOVIE"),rs.getString("TITULO"), rs.getString("DIRECTOR"),rs.getInt("ANO"),rs.getInt("DURACION"),rs.getString("GENERO")) );    
            }   
        }catch (SQLException ex) {
            System.out.println("ID duplicado  " + ex.getMessage());
        } 
        return lista ;
    }

  

   
  
    
    
    }



