package com.company.quemepongo.web.sugerencia;

import com.company.quemepongo.entity.Sugerencia;
import com.haulmont.cuba.gui.screen.*;

@UiController("quemepongo_Sugerencia.browse")
@UiDescriptor("sugerencia-browse.xml")
@LookupComponent("sugerenciasTable")
@LoadDataBeforeShow
public class SugerenciaBrowse extends StandardLookup<Sugerencia> {
}