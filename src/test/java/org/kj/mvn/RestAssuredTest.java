package org.kj.mvn;

import io.restassured.RestAssured;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredTest {

//    RestAssured.baseURI = "https://api.github.com";



    @Test
    public void githubRepo() {
        when().get("/users/eugenp").then().time(lessThan(5000L));
    }
}
