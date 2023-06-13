package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Table(name = "cuentaBancaria")
@Entity
public class CuentaBancaria {
    
    @GeneratedValue(generator = "seq_cuenta_ban",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_cuenta_ban", sequenceName = "seq_cuenta_ban", allocationSize = 1)
    @Id
    @Column(name = "cta.id")
    private Integer id;
    @Column(name = "cta.numero")
    private String numeroCuenta;
    @Column(name = "cta.tipo")
    private String tipo;
    @Column(name = "cta.fecha.a")
    private LocalDate fechaApertura;
    @Column(name = "cta.saldo")
    private BigDecimal saldo;
    @Column(name = "cta.cedula.pro")
    private String cedulaPropientario;

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public LocalDate getFechaApertura() {
        return fechaApertura;
    }
    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    public String getCedulaPropientario() {
        return cedulaPropientario;
    }
    public void setCedulaPropientario(String cedulaPropientario) {
        this.cedulaPropientario = cedulaPropientario;
    }
    @Override
    public String toString() {
        return "CuentaBancaria [id=" + id + ", numeroCuenta=" + numeroCuenta + ", tipo=" + tipo + ", fechaApertura="
                + fechaApertura + ", saldo=" + saldo + ", cedulaPropientario=" + cedulaPropientario + "]";
    }

    



}
