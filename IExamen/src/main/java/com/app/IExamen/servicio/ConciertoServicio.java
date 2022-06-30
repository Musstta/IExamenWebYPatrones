/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.IExamen.servicio;

import com.app.IExamen.entidad.Concierto;
import java.util.List;

/**
 *
 * @author musst
 */
public interface ConciertoServicio {
    public List<Concierto> listarTodosLosConciertos();
    public Concierto guardarConcierto(Concierto concierto);
    public Concierto obtenerConcierto(Long id);
    public Concierto actualizarConcierto(Concierto concierto);
    public void eliminarConcierto(Long id);
}
