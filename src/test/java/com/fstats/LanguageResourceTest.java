package com.fstats;

import com.fstats.language.LanguageEntity;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class LanguageResourceTest {

    @Test
    public void getLanguage() {
        LanguageEntity language = given()
                .when().get("/language?languageName=English")
                .then()
                .statusCode(200)
                .extract().as(LanguageEntity.class);

        Assertions.assertEquals(language.id, "en");

    }

}