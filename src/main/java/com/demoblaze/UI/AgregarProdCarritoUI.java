package com.demoblaze.UI;

import net.serenitybdd.screenplay.targets.Target;

public class AgregarProdCarritoUI {
    public static Target BTN_AGREGAR_PRODUCTO=Target.the("agregar producto")
            .locatedBy("//a[normalize-space()='Add to cart']");
    public static Target BTN_VER_CARRITO=Target.the("ver carrito")
            .locatedBy("//a[normalize-space()='Cart']");
}
