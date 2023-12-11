package com.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.demoblaze.UI.SeleccionarProdUI.LBL_CATEGORIES;
import static com.demoblaze.UI.ValidacionUI.LNK_PROFILE;

public class ValidacionHomeQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_CATEGORIES.resolveFor(actor).isDisplayed();
    }
    public static Question<Boolean> from(){
        return  new ValidacionHomeQuestion();
    }

}
