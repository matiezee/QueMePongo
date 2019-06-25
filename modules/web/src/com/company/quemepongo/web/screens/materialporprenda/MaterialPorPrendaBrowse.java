package com.company.quemepongo.web.screens.materialporprenda;

import com.haulmont.cuba.gui.screen.*;
import com.company.quemepongo.entity.MaterialPorPrenda;

@UiController("quemepongo_MaterialPorPrenda.browse")
@UiDescriptor("material-por-prenda-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class MaterialPorPrendaBrowse extends MasterDetailScreen<MaterialPorPrenda> {
}