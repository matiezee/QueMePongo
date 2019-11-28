package com.company.quemepongo.web.screens.guardarropa;

import com.company.quemepongo.entity.Guardarropa;
import com.company.quemepongo.entity.Prenda;
import com.company.quemepongo.entity.Sugerencia;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.SuggestionField;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;


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
    private DataManager dataManager;
    @Inject
    private Table<Sugerencia> sugerenciasTable;
    @Inject
    private SuggestionField suggestionField;

    public void onGenerarSugerenciaButtonClick() {

        // Obtengo el guardarropa
        Guardarropa g1 = guardarropasDc.getItems().get(0);

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

        lista_prendas.add(this.obtenerPrendaRandom(torsos));
        lista_prendas.add(this.obtenerPrendaRandom(piernas));
        lista_prendas.add(this.obtenerPrendaRandom(calzados));
        if (this.randomBoolean() == true) {
            lista_prendas.add(this.obtenerPrendaRandom(accesorios));
        }

        // Crear la instancia
        Sugerencia s1 = dataManager.create(Sugerencia.class);

        try {

            // Creo una instancia de Sugerencias
            s1.setGuardarropa(g1);
            s1.setPrenda(lista_prendas);

            // Guardo en la base de datos la Sugerencia
            dataManager.commit(s1);

            //Muestro un mensaje de exito

            suggestionField.setValue("Sugerencia realizada con exito, por favor refrescar la pagina. " +
                    "Sugerencia ID: " + s1.getId());
            suggestionField.setContextHelpText("Atencion");

        } catch (Exception e) {
            // Borramos el objeto by id ya que no se guardo bien o algo paso.
            dataManager.remove(dataManager.getReference(Sugerencia.class, s1.getId()));
            System.out.println("Borrando el objeto mal creado: " + e);
        }

        // Refrescamos la tabla para que figure la nueva sugerencia
        sugerenciasTable.refresh();
    }


    public static Prenda obtenerPrendaRandom(List<Prenda> array) {
        int rnd = new Random().nextInt(array.size());
        return array.get(rnd);
    }

    public boolean randomBoolean() {
        return Math.random() < 0.5;
    }



}