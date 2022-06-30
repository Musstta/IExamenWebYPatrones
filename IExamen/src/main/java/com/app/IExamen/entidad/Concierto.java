/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.IExamen.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author musst
 */
@Entity
@Table(name = "conciertos")
public class Concierto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
            
    @Column(name = "artista",nullable = false)
    private String artista;
    
    @Column(name = "costo",nullable = false)
    private int costo;
    
    @Column(name = "fecha",nullable = false,unique = true)
    private String fecha;
    
    @Column(name = "lugar",nullable = false)
    private String lugar;
    
    @Column(name = "capacidad",nullable = false)
    private int capacidad;
    
    public Concierto() {
        
    }

    public Concierto(Long id, String artista, int costo, String fecha, String lugar, int capacidad) {
        this.id = id;
        this.artista = artista;
        this.costo = costo;
        this.fecha = fecha;
        this.lugar = lugar;
        this.capacidad = capacidad;
    }
    
    public Concierto(String artista, int costo, String fecha, String lugar, int capacidad) {
        this.artista = artista;
        this.costo = costo;
        this.fecha = fecha;
        this.lugar = lugar;
        this.capacidad = capacidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Concierto{" + "id=" + id + ", artista=" + artista + ", costo=" + costo + ", fecha=" + fecha + ", lugar=" + lugar + ", capacidad=" + capacidad + '}';
    }

    
    
    
}
