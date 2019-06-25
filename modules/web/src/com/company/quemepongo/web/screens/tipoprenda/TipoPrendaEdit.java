package com.company.quemepongo.web.screens.tipoprenda;

import com.haulmont.cuba.gui.screen.*;
import com.company.quemepongo.entity.TipoPrenda;

@UiController("quemepongo_TipoPrenda.edit")
@UiDescriptor("tipo-prenda-edit.xml")
@EditedEntityContainer("tipoPrendaDc")
@LoadDataBeforeShow
public class TipoPrendaEdit extends StandardEditor<TipoPrenda> {
}