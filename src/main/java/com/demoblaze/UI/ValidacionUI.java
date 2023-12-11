package com.demoblaze.UI;

import net.serenitybdd.screenplay.targets.Target;

public class ValidacionUI {
    public static Target LNK_PROFILE=Target.the("perfil").
                locatedBy("//a[@id='nameofuser']");
}
