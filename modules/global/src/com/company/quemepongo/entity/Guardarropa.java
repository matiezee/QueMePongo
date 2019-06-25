package com.company.quemepongo.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s|nombre")
@Table(name = "QUEMEPONGO_GUARDARROPA")
@Entity(name = "quemepongo_Guardarropa")
public class Guardarropa extends StandardEntity {
    private static final long serialVersionUID = -7333415738747104742L;

    @NotNull
    @Column(name = "NOMBRE", nullable = false)
    protected String nombre;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "guardarropa")
    protected List<Prenda> prendas;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "guardarropa")
    protected List<Sugerencia> sugerencias;

    public List<Sugerencia> getSugerencias() {
        return sugerencias;
    }

    public void setSugerencias(List<Sugerencia> sugerencias) {
        this.sugerencias = sugerencias;
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(List<Prenda> prendas) {
        this.prendas = prendas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}