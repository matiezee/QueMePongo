package com.company.quemepongo.web.screens.evento;

import com.company.quemepongo.entity.Evento;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("quemepongo_Evento.edit")
@UiDescriptor("evento-edit.xml")
@EditedEntityContainer("eventoDc")
@LoadDataBeforeShow
public class EventoEdit extends StandardEditor<Evento> {

    @Inject
    private Notifications notifications;


    @Subscribe("windowCommitAndCloseButton")
    protected void onSayHelloBtnClick(Button.ClickEvent event) {
        notifications.create(Notifications.NotificationType.TRAY).withCaption("Evento creado!").show();
    }
}