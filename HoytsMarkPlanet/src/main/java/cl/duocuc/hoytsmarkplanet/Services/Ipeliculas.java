
package cl.duocuc.hoytsmarkplanet.Services;

import cl.duocuc.hoytsmarkplanet.DAO.database;
import cl.duocuc.hoytsmarkplanet.DTO.peliculasDTO;
import java.util.List;
import java.time.LocalDate;

public interface Ipeliculas {
    
    public void Guardar(peliculasDTO p);
    public  List<peliculasDTO> Listar();
    public  List<peliculasDTO> filtroT(String titulo);
    public  List<peliculasDTO> filtroAnio(int alfa,int beta);
     public  List<peliculasDTO> filtroInt(int id);
   
    
    
   
    
}
