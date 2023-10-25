package api;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import schemas.LoginViewModel;

public class AuthorizationAPI extends ApiBase {
    LoginViewModel loginViewModel;

    public LoginViewModel userBody(String username) {
        loginViewModel = new LoginViewModel();
        loginViewModel.setUsername(username);
        loginViewModel.setPassword("@LlknFdgsfgdfe2_");
        return loginViewModel;
    }

    public String generateToken(String username) {
        String endpoint = "/Account/v1/GenerateToken";
        LoginViewModel userRequestBody = userBody(username);
        JsonPath response = postRequest(endpoint, 200, userRequestBody).jsonPath();
        Assert.assertEquals(response.getString("status"), "Success",
                "Success should be 'Success'");
        Assert.assertEquals(response.getString("result"), "User authorized successfully.",
                "Result should be 'Success'");
        return "Bearer " + response.getString("token");
    }
}
