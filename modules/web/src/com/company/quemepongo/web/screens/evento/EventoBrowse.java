package com.company.quemepongo.web.screens.evento;

import com.company.quemepongo.entity.Evento;
import com.haulmont.cuba.gui.screen.*;

@UiController("quemepongo_Evento.browse")
@UiDescriptor("evento-browse.xml")
@LookupComponent("eventoesTable")
@LoadDataBeforeShow
public class EventoBrowse extends StandardLookup<Evento> {

}