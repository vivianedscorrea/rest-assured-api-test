package testsRestAssured;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PutUserTest {
@Test
public void deveAtualizarUsuarioComSucesso() {

    String jsonBody = "{\n" +
        "  \"name\": \"Viviane Atualizada\",\n" +
        "  \"email\": \"viviane.nova@example.com\"\n" +
        "}";

    given()
        .baseUri("https://jsonplaceholder.typicode.com")
        .header("Content-Type", "application/json")
        .body(jsonBody)
        .when()
        .put("/users/1")
        .then()
        .statusCode(200)
        .body("name", equalTo("Viviane Atualizada"));
}
}
