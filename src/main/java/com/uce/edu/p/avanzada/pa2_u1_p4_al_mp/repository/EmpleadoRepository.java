package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Empleado;

public interface EmpleadoRepository {
    public void insertar(Empleado empleado);
    public Empleado seleccionarPorNumero(Integer id);
    public void eliminar(Integer id);
    public void actualizar(Empleado empleado);
}
