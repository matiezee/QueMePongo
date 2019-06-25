package com.company.quemepongo.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|nombre")
@Table(name = "QUEMEPONGO_TIPO_PRENDA")
@Entity(name = "quemepongo_TipoPrenda")
public class TipoPrenda extends StandardEntity {
    private static final long serialVersionUID = 5803619212501123749L;

    @NotNull
    @Column(name = "NOMBRE", nullable = false, unique = true)
    protected String nombre;

    @NotNull
    @Column(name = "TEMPERATURA", nullable = false)
    protected Integer temperatura;

    @NotNull
    @Column(name = "LLUVIA", nullable = false)
    protected Boolean lluvia = false;

    @NotNull
    @Column(name = "VIENTO", nullable = false)
    protected Boolean viento = false;

    @NotNull
    @Column(name = "SOL", nullable = false)
    protected Boolean sol = false;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CATEGORIA_ID")
    protected Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Boolean getSol() {
        return sol;
    }

    public void setSol(Boolean sol) {
        this.sol = sol;
    }

    public Boolean getViento() {
        return viento;
    }

    public void setViento(Boolean viento) {
        this.viento = viento;
    }

    public Boolean getLluvia() {
        return lluvia;
    }

    public void setLluvia(Boolean lluvia) {
        this.lluvia = lluvia;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}