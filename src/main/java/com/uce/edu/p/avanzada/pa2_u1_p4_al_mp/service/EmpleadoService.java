package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Empleado;

public interface EmpleadoService {
    public void agregar(Empleado empleado);
    public Empleado buscarPorNumero(Integer id);
    public void eliminar(Integer id);
    public void actualizar(Empleado empleado);
}
