package api.test;

import api.AuthorizationAPI;
import api.UserAPI;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class LoginUserViaApi {
    AuthorizationAPI authorizationAPI;
    UserAPI userAPI;
    Faker faker = new Faker();

    @Test
    public void LoginUserViaApiTest() {
        String username = "Leonid";
        String password = "j4RMm9B*L";
        authorizationAPI = new AuthorizationAPI();
        Response response = authorizationAPI.login(username, password, 201);
    }
}
