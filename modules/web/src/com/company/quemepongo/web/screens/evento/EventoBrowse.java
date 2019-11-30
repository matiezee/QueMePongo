package com.company.quemepongo.web.screens.evento;

import com.company.quemepongo.entity.Evento;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.executors.BackgroundTask;
import com.haulmont.cuba.gui.executors.BackgroundTaskHandler;
import com.haulmont.cuba.gui.executors.BackgroundWorker;
import com.haulmont.cuba.gui.executors.TaskLifeCycle;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@UiController("quemepongo_Evento.browse")
@UiDescriptor("evento-browse.xml")
@LookupComponent("eventoesTable")
@LoadDataBeforeShow
public class EventoBrowse extends StandardLookup<Evento> {
    @Inject
    protected BackgroundWorker backgroundWorker;
    @Inject
    private Dialogs dialogs;

    public void init(Map<String, Object> params) {
        // Create task with 10 sec timeout and this screen as owner
        BackgroundTask<Integer, Void> task = new BackgroundTask<Integer, Void>(10, this) {
            @Override
            public Void run(TaskLifeCycle<Integer> taskLifeCycle) throws Exception {
                // Do something in background thread
                for (int i = 0; i < 5; i++) {
                    TimeUnit.SECONDS.sleep(1); // time consuming computations
                    taskLifeCycle.publish(i);  // publish current progress to show it in progress() method
                }
                return null;
            }

            @Override
            public void canceled() {
                // Do something in UI thread if the task is canceled
            }

            @Override
            public void done(Void result) {
                // Do something in UI thread when the task is done
            }

            @Override
            public void progress(List<Integer> changes) {
                // Show current progress in UI thread
            }
        };
        // Get task handler object and run the task
        BackgroundTaskHandler taskHandler = backgroundWorker.handle(task);
        taskHandler.execute();
    }


    public void onSugerenciaButtonClick() {
        dialogs.createOptionDialog()
                .withCaption("Confirm")
                .withMessage("Are you sure?")
                .withActions(
                        new DialogAction(DialogAction.Type.YES, Action.Status.PRIMARY).withHandler(e -> {
                            System.out.println("dlakjsdklasj");
                        }),
                        new DialogAction(DialogAction.Type.NO)
                )
                .show();
    }

    public void onClimaButtonClick() {
        // String command = "curl -X POST https://postman-echo.com/post --data foo1=bar1&foo2=bar2";
        String command = "curl -X GET  https://wttr.in/Detroit?format=j1";

        Process process = null;
        try {
            process = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Reader reader = new InputStreamReader(process.getInputStream());
        JsonElement element = new JsonParser().parse(reader);

        System.out.println(element);
        process.destroy();
    }
}