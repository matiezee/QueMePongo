package com.company.quemepongo.web.screens.guardarropa;

import com.company.quemepongo.entity.Prenda;
import com.company.quemepongo.entity.Sugerencia;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.quemepongo.entity.Guardarropa;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@UiController("quemepongo_Guardarropa.browse")
@UiDescriptor("guardarropa-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class GuardarropaBrowse extends MasterDetailScreen<Guardarropa> {
    @Inject
    private CollectionPropertyContainer<Prenda> prendasDc;
    @Inject
    private CollectionContainer<Guardarropa> guardarropasDc;
    @Inject
    private CollectionPropertyContainer<Sugerencia> sugerenciasDc;
    @Inject
    private Metadata metadata;

    public void onGenerarSugerenciaButtonClick() {

        Guardarropa g1 = guardarropasDc.getItems().get(0);
        Sugerencia s1 = metadata.create(Sugerencia.class);

        s1.setGuardarropa(g1);

        List<Prenda> torsos = new ArrayList<>();
        List<Prenda> piernas = new ArrayList<>();
        List<Prenda> calzados = new ArrayList<>();
        List<Prenda> accesorios = new ArrayList<>();

        List<Prenda> lista_prendas = new ArrayList<>();

        ListIterator<Prenda> prendas = prendasDc.getMutableItems().listIterator();

        // Reemplazar por un foreach para mejorar la performance
        while (prendas.hasNext()) {

            Prenda p_aux = prendas.next();
            switch (p_aux.getTipoDePrenda().getCategoria().getNombre()) {
                case "Torso":
                    torsos.add(p_aux);
                    break;
                case "Piernas":
                    piernas.add(p_aux);
                    break;
                case "Calzado":
                    calzados.add(p_aux);
                    break;
                case "Accesorio":
                    accesorios.add(p_aux);
                    break;
                default:
                    System.out.println("no match");
            }
        }

        /*

        Logica del producto vectorial con Guava
        Falta ver como mostrarlo primero

        String[] torsoArray = new String[ torsos.size() ];
        String[] piernasArray = new String[ torsos.size() ];
        String[] accesoriosArray = new String[ torsos.size() ];
        String[] calzadoArray = new String[ torsos.size() ];

        torsos.toArray( torsoArray );
        piernas.toArray( piernasArray );
        calzados.toArray( calzadoArray );
        accesorios.toArray( accesoriosArray );

        System.out.println("DESPUES");
        List<String[]> elements = Arrays.asList(
                torsoArray,
                piernasArray,
                accesoriosArray,
                calzadoArray
        );

        // Create a list of immutableLists of strings
        List<ImmutableList<String>> immutableElements = makeListofImmutable(elements);

        // Use Guava's Lists.cartesianProduct, since Guava 19
        List<List<String>> cartesianProduct = Lists.cartesianProduct(immutableElements);
        */


        lista_prendas.add(torsos.get(0));
        lista_prendas.add(piernas.get(0));
        lista_prendas.add(calzados.get(0));
        lista_prendas.add(accesorios.get(0));

        s1.setPrenda(lista_prendas);
        System.out.println("Sugerencia creada exitosamente. Sugerencia id " + s1.getId() + " dentro del guardarropas: " + s1.getGuardarropa() + " Con las prendas: " + s1.getPrenda().toString());

        /*
        No puedo lograr la nueva sugerencia en sugerenciasDc y creo que por eso no se muestra

        sugerenciasDc.setItem(s1);
        sugerenciasDc.replaceItem(s1);
         */

    }

}