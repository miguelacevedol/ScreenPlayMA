package com.demoblaze.UI;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarProdUI {
    public static Target LBL_NOMBRE_PRODUCTO=Target.the("producto")
            .locatedBy("//h4[@class='card-title']");
    public static Target LBL_CATEGORIES=Target.the("CATEGORIES")
            .locatedBy("//a[@id='cat']");
}
