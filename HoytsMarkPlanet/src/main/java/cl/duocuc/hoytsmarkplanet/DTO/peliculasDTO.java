
package cl.duocuc.hoytsmarkplanet.DTO;

import java.time.LocalDate;

public class peliculasDTO {
    int id;
    String titulo;
    String director;
    int ano;
    int duracion;
    String genero;

    public peliculasDTO(int id, String titulo, String director, int ano, int duracion, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.ano = ano;
        this.duracion = duracion;
        this.genero = genero;
    }
    public peliculasDTO() {
        this.id = 0;
        this.titulo = "";
        this.director = "";
        this.ano = 0;
        this.duracion = 0;
        this.genero = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "peliculasDTO{" + "id=" + id + ", titulo=" + titulo + ", director=" + director + ", ano=" + ano + ", duracion=" + duracion + ", genero=" + genero + '}';
    }
    
    
    
}
