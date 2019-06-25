package com.company.quemepongo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "QUEMEPONGO_SUGERENCIA")
@Entity(name = "quemepongo_Sugerencia")
public class Sugerencia extends StandardEntity {
    private static final long serialVersionUID = -5642357242986354516L;

    @JoinTable(name = "QUEMEPONGO_SUGERENCIA_PRENDA_LINK",
            joinColumns = @JoinColumn(name = "SUGERENCIA_ID"),
            inverseJoinColumns = @JoinColumn(name = "PRENDA_ID"))
    @ManyToMany
    protected List<Prenda> prenda;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
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

    public List<Prenda> getPrenda() {
        return prenda;
    }

    public void setPrenda(List<Prenda> prenda) {
        this.prenda = prenda;
    }
}