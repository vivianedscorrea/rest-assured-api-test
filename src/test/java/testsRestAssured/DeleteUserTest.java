package testsRestAssured;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DeleteUserTest {

@Test
public void deveDeletarUsuarioComSucesso() {

    given()
        .baseUri("https://jsonplaceholder.typicode.com")
        .when()
        .delete("/users/1")
        .then()
        .statusCode(200);

}

}
