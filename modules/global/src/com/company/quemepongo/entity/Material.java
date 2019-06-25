package com.company.quemepongo.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|nombre")
@Table(name = "QUEMEPONGO_MATERIAL")
@Entity(name = "quemepongo_Material")
public class Material extends StandardEntity {
    private static final long serialVersionUID = -3132785852968675064L;

    @NotNull(message = "Este campo no puede estar vacío")
    @Column(name = "NOMBRE", nullable = false, unique = true)
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}