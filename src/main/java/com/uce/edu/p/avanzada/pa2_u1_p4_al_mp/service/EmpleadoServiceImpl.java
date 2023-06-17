package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.EmpleadoRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public void agregar(Empleado empleado) {
        this.empleadoRepository.insertar(empleado);
    }

    @Override
    public Empleado buscarPorNumero(Integer id) {
        return this.empleadoRepository.seleccionarPorNumero(id);
    }

    @Override
    public void eliminar(Integer id) {
        this.empleadoRepository.eliminar(id);
    }

    @Override
    public void actualizar(Empleado empleado) {
        this.empleadoRepository.actualizar(empleado);
    }
    
}
