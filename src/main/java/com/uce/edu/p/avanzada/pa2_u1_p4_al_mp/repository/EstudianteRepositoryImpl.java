package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;


import java.util.List;

import org.hibernate.annotations.DialectOverride.Where;
import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository // anotacion adicional
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository{

    //existe una interfaz que me permite conectar con la base de datos
    //entity manager (manego de entidades)esta interfaz es el componente principal para 
    //interactura con la base de datos

    @PersistenceContext //debe tener esta anotacion
    private EntityManager entityManager; // interactuo con la base de datos 

    @Override
    public void insertar(Estudiante estudiante) {
        //crud con el entityManager, persist recibe un entity
        this.entityManager.persist(estudiante);
    }
    @Override
    public void actualizar(Estudiante estudiante) {
        this.entityManager.merge(estudiante);
    }
    @Override
    public Estudiante seleccionarPorNumero(String cedula) {
        return this.entityManager.find(Estudiante.class, cedula);
    }
    @Override
    public void eliminar(String cedula) {
        Estudiante estudiante = this.seleccionarPorNumero(cedula);
        this.entityManager.remove(estudiante);
        
    }
    @Override
    public Estudiante seleccionarPorApellido(String apellido) {
        //SQL
        //SELECT * FROM estudiante e WHERE e.estu_apellido =
        //JPQL (alias es el e)
        //SELECT e FROM Estudiante e WHERE e.apellido    
        Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
        myQuery.setParameter("datoApellido", apellido);
        return (Estudiante)myQuery.getSingleResult();
    }
    @Override
    public List<Estudiante> seleccionarListaPorApellido(String apellido) {
       Query mQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido ");
       mQuery.setParameter("datoApellido",apellido);
       return mQuery.getResultList();
    }
    @Override
    public Estudiante seleccionarPorApellidoNombre(String apellido, String nombre) {
        Query mQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.nombre = :datoNombre");
        mQuery.setParameter("datoApellido",apellido);
        mQuery.setParameter("datoNombre",nombre);
        return (Estudiante)mQuery.getSingleResult();
    }
    @Override
    public Estudiante seleccionarPorApellidoTyped(String apellido) {

        TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);

        myQuery.setParameter("datoApellido", apellido);

        return myQuery.getSingleResult();
    }
    @Override
    public List<Estudiante> seleccionarListPorApellidoTyped(String apellido) {
        TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);

        myQuery.setParameter("datoApellido", apellido);

        return myQuery.getResultList();
    }
    @Override
    public Estudiante seleccionarPorApellidoNamed(String apellido) {
        TypedQuery<Estudiante> mQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellido", Estudiante.class);
        mQuery.setParameter("datoApellido", apellido);
        return mQuery.getSingleResult();
    }
    @Override
    public Estudiante seleccionarPorApellidoNamedQuery(String apellido) {

        Query mQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellido",Estudiante.class);
        mQuery.setParameter("datoApellido", apellido);
        return (Estudiante) mQuery.getSingleResult();

    }
    @Override
    public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {
        // siempre hacer el cast 
        //crea native query como typed query
        Query query=this.entityManager.createNativeQuery("SELECT * FROM estudiante WHERE estu_apellido = :datoApellido", Estudiante.class);
        query.setParameter("datoApellido", apellido);
        return (Estudiante)query.getSingleResult();
    }
    @Override
    public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {
        TypedQuery<Estudiante> query = this.entityManager.createNamedQuery("Estudiante.buscarPorApellidoNative", Estudiante.class);
        query.setParameter("datoApellido",apellido);
        return query.getSingleResult();
    }
    @Override
    public Estudiante seleccionarPorNombreNamed(String nombre) {
        TypedQuery<Estudiante> mQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre", Estudiante.class);
        mQuery.setParameter("datoNombre", nombre);
        return mQuery.getSingleResult();
    }
    @Override
    public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {
        TypedQuery<Estudiante> query = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative", Estudiante.class);
        query.setParameter("datoNombre", nombre);
        return query.getSingleResult();
    }
    @Override
    public Estudiante seleccionarPorApellidoCriteriaApiQuery(String apellido) {
        CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
        //vamos a especificar el tipo de retorno que tiene mi query (Estudiante)
        CriteriaQuery<Estudiante> mCriteriaQuery = myBuilder.createQuery(Estudiante.class);
        //empezar a crear el sql 
        //definimos el From (Root en criteria api query)
        Root<Estudiante> miTablaFrom = mCriteriaQuery.from(Estudiante.class);
        //3 paso construir las condiciones del SQL
        //las condiciones se las conoce como predicados 
        //una condicion es un predicado
        //e,apellido =: datoApellido
        Predicate condicionApellido = myBuilder.equal(miTablaFrom.get("apellido"), apellido); // loque vamos a comparar lo que en este caso es el apellido :D
        //4.- Armamos mi sql final 
        mCriteriaQuery.select(miTablaFrom).where(condicionApellido); // le mandamos el predicando o la condicion y listo :D
        //La ejecucion del query los ralizamos con typed query
        TypedQuery<Estudiante> mQuery=this.entityManager.createQuery(mCriteriaQuery);

        return mQuery.getSingleResult();
    }
    @Override
    public Estudiante seleccionarEstudianteDinamico(String nombre, String apellido, Double peso) {
        CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Estudiante> mCriteriaQuery = myBuilder.createQuery(Estudiante.class);
        Root<Estudiante> miTablaFrom = mCriteriaQuery.from(Estudiante.class);
        //3 paso construir las condiciones del SQL
        //las condiciones se las conoce como predicados 
        //una condicion es un predicado
        // > 100 e.nombre = AND e.apellido =
        // <= 100 e.nombre = ? OR e.apellido = ?
        // 
        Predicate pNombre = myBuilder.equal(miTablaFrom.get("nombre"), nombre);
        Predicate pApellido = myBuilder.equal(miTablaFrom.get("apellido"), apellido);
        Predicate pFinal = null;
        if(peso.compareTo(Double.valueOf(100)) <= 0){
            pFinal = myBuilder.or(pNombre, pApellido);
        }else{
            pFinal = myBuilder.and(pNombre, pApellido);
        }
        
        mCriteriaQuery.select(miTablaFrom).where(pFinal);
        TypedQuery<Estudiante> mQuery=this.entityManager.createQuery(mCriteriaQuery);

        return mQuery.getSingleResult();
    }
    @Override
    public int eliminarPorNombre(String nombre) {
        //DELETE FROM estudiante where estu_nombre = ?
        //DELETE FROM Estudiante e WHERE e.nombre = :datoNombre
        Query mQuery = this.entityManager.createQuery("DELETE FROM Estudiante e WHERE e.nombre = :datoNombre");
        mQuery.setParameter("datoNombre", nombre);
        //porque eliminar significa que se actualizo la tabla de datos
        //retorna el numero de registros afectados 
        //si hay 5 estudiante con el mismo nombre se borran los 5 XD
        return mQuery.executeUpdate();

        
    }
    @Override
    public int actualizarPorApellido(String nombre, String apellido) {
        //SQL
        //UPDATE estudiante SET estu_nombre = ? WHERE estu_apellido = ?
        //JPQL
        //UPDATE Estudiante e SET e.nombre = :datoNombre WHERE e.apellido = :datoApellido
        Query mQuery = this.entityManager.createQuery("UPDATE Estudiante e SET e.nombre = :datoNombre WHERE e.apellido = :datoApellido");
        mQuery.setParameter("datoNombre", nombre);
        mQuery.setParameter("datoApellido", apellido);
        return mQuery.executeUpdate();
    }

    

    
    
}
