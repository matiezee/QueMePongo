package com.company.quemepongo.web.screens.evento;

import com.haulmont.cuba.gui.screen.*;
import com.company.quemepongo.entity.Evento;

@UiController("quemepongo_Evento.browse")
@UiDescriptor("evento-browse.xml")
@LookupComponent("eventoesTable")
@LoadDataBeforeShow
public class EventoBrowse extends StandardLookup<Evento> {
}