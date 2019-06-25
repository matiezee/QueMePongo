package com.company.quemepongo.web.screens.guardarropa;

import com.haulmont.cuba.gui.screen.*;
import com.company.quemepongo.entity.Guardarropa;

@UiController("quemepongo_Guardarropa.browse")
@UiDescriptor("guardarropa-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class GuardarropaBrowse extends MasterDetailScreen<Guardarropa> {
}