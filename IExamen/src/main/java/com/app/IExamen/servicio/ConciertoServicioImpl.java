/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.IExamen.servicio;

import com.app.IExamen.entidad.Concierto;
import com.app.IExamen.repositorio.ConciertoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author musst
 */
@Service
public class ConciertoServicioImpl implements ConciertoServicio {

    @Autowired
    private ConciertoRepositorio repositorio;
    
    @Override
    public List<Concierto> listarTodosLosConciertos() {
        return repositorio.findAll();
    }

    @Override
    public Concierto guardarConcierto(Concierto concierto) {
        return repositorio.save(concierto);
    }

    @Override
    public Concierto obtenerConcierto(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Concierto actualizarConcierto(Concierto concierto) {
        return repositorio.save(concierto);
    }

    @Override
    public void eliminarConcierto(Long id) {
        repositorio.deleteById(id);
    }

}
