package com.company.quemepongo.web.screens.material;

import com.haulmont.cuba.gui.screen.*;
import com.company.quemepongo.entity.Material;

@UiController("quemepongo_Material.browse")
@UiDescriptor("material-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class MaterialBrowse extends MasterDetailScreen<Material> {
}