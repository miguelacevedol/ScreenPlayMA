package com.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.demoblaze.UI.ValidacionUI.LNK_PROFILE;

public class ValidacionQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LNK_PROFILE.resolveFor(actor).isDisplayed();
    }
    public static Question<Boolean> from(){
        return  new ValidacionQuestion();
    }
    //a[@id='cat']
}
