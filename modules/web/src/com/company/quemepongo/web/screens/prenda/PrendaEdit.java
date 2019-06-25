package com.company.quemepongo.web.screens.prenda;

import com.haulmont.cuba.gui.screen.*;
import com.company.quemepongo.entity.Prenda;

@UiController("quemepongo_Prenda.edit")
@UiDescriptor("prenda-edit.xml")
@EditedEntityContainer("prendaDc")
@LoadDataBeforeShow
public class PrendaEdit extends StandardEditor<Prenda> {
}