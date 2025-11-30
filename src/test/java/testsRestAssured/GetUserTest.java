package testsRestAssured;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Teste simples para validar se a URL responde com status 200.
 * Serve como primeiro passo para verificar se o endpoint está funcionando.
 */
public class GetUserTest {

@Test
public void deveRetornar200AoacessarPagina() {
    given()
        .baseUri("https://jsonplaceholder.typicode.com")
        .when()
        .get("/users/1")
        .then()
        .statusCode(200)
        .body("id", equalTo(1));

    }
}
