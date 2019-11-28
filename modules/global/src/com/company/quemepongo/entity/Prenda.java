package com.company.quemepongo.entity;

import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "QUEMEPONGO_PRENDA")
@Entity(name = "quemepongo_Prenda")
public class Prenda extends StandardEntity {
    private static final long serialVersionUID = 1549259119570788787L;

    @NotNull
    @Column(name = "NOMBRE", nullable = false)
    protected String nombre;

    @NotNull
    @Column(name = "DISPONIBILIDAD", nullable = false)
    protected Boolean disponibilidad = false;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TIPO_DE_PRENDA_ID")
    protected TipoPrenda tipoDePrenda;

    @Lookup(type = LookupType.DROPDOWN)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MATERIAL_ID")
    protected Material material;

    @NotNull
    @Column(name = "COLORPRIMARIO", nullable = false)
    protected String colorPrimario;

    @Column(name = "COLOR2")
    protected String colorSecundario;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "GUARDARROPA_ID")
    protected Guardarropa guardarropa;

    @JoinTable(name = "QUEMEPONGO_SUGERENCIA_PRENDA_LINK",
            joinColumns = @JoinColumn(name = "PRENDA_ID"),
            inverseJoinColumns = @JoinColumn(name = "SUGERENCIA_ID"))
    @ManyToMany
    protected List<Sugerencia> sugerencias;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IMAGEN")
    protected com.haulmont.cuba.core.entity.FileDescriptor imagen;

    public void setImagen(FileDescriptor imagen) {
        this.imagen = imagen;
    }

    public FileDescriptor getImagen() {
        return imagen;
    }

    public List<Sugerencia> getSugerencias() {
        return sugerencias;
    }

    public void setSugerencias(List<Sugerencia> sugerencias) {
        this.sugerencias = sugerencias;
    }

    public Guardarropa getGuardarropa() {
        return guardarropa;
    }

    public void setGuardarropa(Guardarropa guardarropa) {
        this.guardarropa = guardarropa;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public TipoPrenda getTipoDePrenda() {
        return tipoDePrenda;
    }

    public void setTipoDePrenda(TipoPrenda tipoDePrenda) {
        this.tipoDePrenda = tipoDePrenda;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}