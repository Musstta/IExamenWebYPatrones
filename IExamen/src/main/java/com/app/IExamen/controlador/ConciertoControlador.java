/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.IExamen.controlador;

import com.app.IExamen.entidad.Concierto;
import com.app.IExamen.servicio.ConciertoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author musst
 */

@Controller
public class ConciertoControlador {
    @Autowired
    private ConciertoServicio servicio;
    
    @GetMapping({"/conciertos","/"})
    public String listarConciertos(Model modelo) {
        modelo.addAttribute("conciertos", servicio.listarTodosLosConciertos());
        return "conciertos"; 
    }
    
    @GetMapping("/conciertos/nuevo")
    public String formCrearConcierto(Model modelo) {
        Concierto concierto = new Concierto();
        modelo.addAttribute("concierto", concierto);
        return "crear_concierto";
    }
    
    @PostMapping("/conciertos")
    public String guardarConcierto(@ModelAttribute("concierto") Concierto concierto) {
        servicio.guardarConcierto(concierto);
        return "redirect:conciertos";
    }
    
    @GetMapping("/conciertos/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id,Model modelo) {
        modelo.addAttribute("concierto", servicio.obtenerConcierto(id));
        return "editar_concierto";
        
    }
    
    @PostMapping("/conciertos/{id}")
    public String actualizarConcierto(@PathVariable Long id,@ModelAttribute("concierto") Concierto concierto,Model modelo) {
        Concierto conciertoExistente = servicio.obtenerConcierto(id);
        conciertoExistente.setId(id);
        conciertoExistente.setArtista(concierto.getArtista());
        conciertoExistente.setCosto(concierto.getCosto());
        conciertoExistente.setFecha(concierto.getFecha());
        conciertoExistente.setLugar(concierto.getLugar());
        conciertoExistente.setCapacidad(concierto.getCapacidad());
        servicio.actualizarConcierto(conciertoExistente);
        return "redirect:/conciertos";
    }
    
    @GetMapping("/conciertos/{id}")
    public String eliminarConcierto(@PathVariable Long id) {
        servicio.eliminarConcierto(id);
        return "redirect:/conciertos";
    }
}