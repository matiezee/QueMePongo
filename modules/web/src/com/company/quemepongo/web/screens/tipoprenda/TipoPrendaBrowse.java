package com.company.quemepongo.web.screens.tipoprenda;

import com.haulmont.cuba.gui.screen.*;
import com.company.quemepongo.entity.TipoPrenda;

@UiController("quemepongo_TipoPrenda.browse")
@UiDescriptor("tipo-prenda-browse.xml")
@LookupComponent("tipoPrendasTable")
@LoadDataBeforeShow
public class TipoPrendaBrowse extends StandardLookup<TipoPrenda> {
}