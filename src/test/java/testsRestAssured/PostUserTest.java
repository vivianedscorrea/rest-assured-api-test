package testsRestAssured;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class PostUserTest {

@Test
public void deveCriarUsuarioComSucesso() {

    String jsonBody = "{\n" +
        "  \"name\": \"Viviane QA\",\n" +
        "  \"email\": \"viviane@example.com\"\n" +
        "}";

    given()
        .baseUri("https://jsonplaceholder.typicode.com")
        .contentType("application/json")
        .body(jsonBody)
        .when()
        .post("/users")
        .then()
        .statusCode(201)
        .body("name", equalTo("Viviane QA"))
        .body("email", equalTo("viviane@example.com"));
    }
}
