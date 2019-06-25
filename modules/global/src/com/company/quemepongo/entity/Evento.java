package com.company.quemepongo.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamePattern("%s|nombre")
@Table(name = "QUEMEPONGO_EVENTO")
@Entity(name = "quemepongo_Evento")
public class Evento extends StandardEntity {
    private static final long serialVersionUID = -3317983846876447963L;

    @NotNull
    @Column(name = "NOMBRE", nullable = false)
    protected String nombre;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "FECHA", nullable = false)
    protected Date fecha;

    @NotNull
    @Column(name = "CIUDAD", nullable = false)
    protected String ciudad;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "GUARDARROPA_ID")
    protected Guardarropa guardarropa;

    public Guardarropa getGuardarropa() {
        return guardarropa;
    }

    public void setGuardarropa(Guardarropa guardarropa) {
        this.guardarropa = guardarropa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}