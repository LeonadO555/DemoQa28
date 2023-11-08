package api.test;

import api.AuthorizationAPI;
import api.UserAPI;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUserViaApi {
    AuthorizationAPI authorizationAPI;
    UserAPI userAPI;
    Faker faker = new Faker();

    @Test
    public void successfulLoginUserViaApiTest() {
        String userName = "Leonid";
        String password = "j4RMm9B*L";
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(userName, password, 200);
        boolean authorization = authorizationAPI.isAuthorized(userName, "j4RMm9B*L", 200);
        Assert.assertTrue(authorization, "User is not authorized, status : " + authorization);
    }

    @Test
    public void invalidUsernameLoginUserViaApiTest() {
        String userName = "Leonid*&^^51324335";
        String password = "j4RMm9B*L";
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(userName, password, 200);
        boolean authorizationInvalidUser = authorizationAPI.isAuthorized(userName, password, 404);
        Assert.assertFalse(authorizationInvalidUser);
    }

    @Test
    public void invalidPasswordLoginUserViaApiTest() {
        String userName = "Leonid";
        String password = "123445678";
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(userName, password, 200);
        boolean authorizationInvalidPassword = authorizationAPI.isAuthorized(userName, password, 404);
        Assert.assertFalse(authorizationInvalidPassword);
    }
}
