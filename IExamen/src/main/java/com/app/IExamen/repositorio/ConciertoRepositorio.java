/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.IExamen.repositorio;

import com.app.IExamen.entidad.Concierto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author musst
 */

@Repository
public interface ConciertoRepositorio extends JpaRepository<Concierto, Long> {
    
}
