package api;

import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import schemas.LoginViewModel;

public class AuthorizationAPI extends ApiBase {
    LoginViewModel loginViewModel;
    Faker faker = new Faker();
    String username = faker.internet().uuid();

    public LoginViewModel userBody(String username) {
        loginViewModel = new LoginViewModel();
        loginViewModel.setUserName(username);
        loginViewModel.setPassword("j4RMm9B*L");
        return loginViewModel;
    }


    public String generateToken(String username) {
        String endpoint = "/Account/v1/GenerateToken";
        LoginViewModel userRequestBody = userBody(username);
        JsonPath response = postRequest(endpoint, 200, userRequestBody).jsonPath();
        Assert.assertEquals(response.getString("status"), "Success", "Status should be 'Success'");
        Assert.assertEquals(response.getString("result"), "User authorized successfully.", "Result should be 'Success'");
        return "Bearer " + response.getString("token");
    }

    public Response login(String username) {
        String endpoint = "/Account/v1/Login";
        LoginViewModel userRequestBody = userBody(username);
        return postRequest(endpoint, 200, userRequestBody);
    }

    public Response registerUser(String username) {
        String endpoint = "/Account/v1/User";
        LoginViewModel userRequestBody = userBody(username);
        return postRequest(endpoint, 201, userRequestBody);
    }

    public boolean isAuthorized(String username) {
        String endpoint = "/Account/v1/Authorized";
        LoginViewModel userRequestBody = userBody(username);
        return postRequest(endpoint, 200, userRequestBody).asString().equalsIgnoreCase("true");
    }

    public Response isDeleted(String username) {
        String endpoint = "/Account/v1/Authorized";
        LoginViewModel userRequestBody = userBody(username);
        return postRequest(endpoint, 404, userRequestBody);
    }
}
