package com.company.quemepongo.web.screens.categoria;

import com.haulmont.cuba.gui.screen.*;
import com.company.quemepongo.entity.Categoria;

@UiController("quemepongo_Categoria.browse")
@UiDescriptor("categoria-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CategoriaBrowse extends MasterDetailScreen<Categoria> {
}