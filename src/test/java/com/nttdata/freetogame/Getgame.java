package com.nttdata.freetogame;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class Getgame {


    private static String GET_GAME = "https://www.freetogame.com/api/games?platform=pc&category=shooter";

    @Step("ver game {0} en FreeToGame")
    public void verPropiedades(String plataform, String category){
        SerenityRest.given()
                .contentType("application/json")
                .body("{\n" +
                        "  \"plataform\": \""+plataform+"\",\n" +
                        "  \"category\": \""+category+"\",\n" +
                        "}")
                .get(GET_GAME);

    }
}
