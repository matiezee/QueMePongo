package com.company.quemepongo.web.sugerencia;

import com.company.quemepongo.entity.Sugerencia;
import com.haulmont.cuba.gui.screen.*;

@UiController("quemepongo_Sugerencia.edit")
@UiDescriptor("sugerencia-edit.xml")
@EditedEntityContainer("sugerenciaDc")
@LoadDataBeforeShow
public class SugerenciaEdit extends StandardEditor<Sugerencia> {
}