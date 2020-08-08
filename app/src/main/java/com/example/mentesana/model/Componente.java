package com.example.mentesana.model;

public class Componente {

    private String nombre;
    private String definicion;
    private String metafora;
    private String video;
    private String ejercicio;
    private String videoEjercicio;

    public Componente() {

    }

    public Componente(String nombre, String definicion, String metafora, String video, String ejercicio, String videoEjercicio) {
        this.nombre = nombre;
        this.definicion = definicion;
        this.metafora = metafora;
        this.video = video;
        this.ejercicio = ejercicio;
        this.videoEjercicio = videoEjercicio;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public String getMetafora() {
        return metafora;
    }

    public void setMetafora(String metafora) {
        this.metafora = metafora;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

    public String getVideoEjercicio() {
        return videoEjercicio;
    }

    public void setVideoEjercicio(String videoEjercicio) {
        this.videoEjercicio = videoEjercicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
