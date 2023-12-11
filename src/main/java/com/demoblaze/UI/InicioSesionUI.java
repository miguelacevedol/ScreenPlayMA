package com.demoblaze.UI;

import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionUI {
    public static Target TXT_NOMBRE_USUARIO=Target.the("nombre de usuario").
            locatedBy("//input[@id='loginusername']");
    public static Target TXT_CONTRASENA=Target.the("contrasena").
            locatedBy("//input[@id='loginpassword']");
    public static Target BTN_LOGIN_ENVIO=Target.the("log in")
            .locatedBy("//button[normalize-space()='Log in']");
}
