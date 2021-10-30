package com.example.tugas4;

public class Movie {
    private String nama_movie,asal_negara,genre;
    private int foto;
    public Movie(String nama_movie, String asal_negara, String genre, int foto){
        this.nama_movie = nama_movie;
        this.asal_negara = asal_negara;
        this.genre = genre;
        this.foto = foto;
    }

    public String getNama_movie(){
        return nama_movie;
    }
    public void setNama_movie(String nama_movie){
        this.nama_movie = nama_movie;
    }
    public String getAsal_negara(){ return asal_negara; }
    public void setAsal_negara(String asal_negara){
        this.asal_negara = asal_negara;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

    public int getFoto() { return foto; }
    public void setFoto(int foto) { this.foto = foto; }
}
