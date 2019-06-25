package com.company.quemepongo.web.screens.evento;

import com.haulmont.cuba.gui.screen.*;
import com.company.quemepongo.entity.Evento;

@UiController("quemepongo_Evento.edit")
@UiDescriptor("evento-edit.xml")
@EditedEntityContainer("eventoDc")
@LoadDataBeforeShow
public class EventoEdit extends StandardEditor<Evento> {
}