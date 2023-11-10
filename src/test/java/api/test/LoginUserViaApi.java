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
        String username = "alexgor";
        String password = "Alexgor0!";
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(username, password, 200);
        boolean authorization = authorizationAPI.isAuthorized(username,password, 200);
        Assert.assertTrue(authorization, "User is not authorized, status : " + authorization);
    }

    @Test
    public void invalidUsernameLoginUserViaApiTest() {
        String username = "Aipioi";
        String password = "Alexgor0!";
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(username, password, 200);
        boolean authorizationInvalidUser = authorizationAPI.isAuthorized(username,password, 404);
        Assert.assertFalse(authorizationInvalidUser);
    }

    @Test
    public void invalidPasswordLoginUserViaApiTest() {
        String username = "alexgor";
        String password = "123445678";
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(username, password, 200);
        boolean authorizationInvalidPassword = authorizationAPI.isAuthorized(username,password, 404);
        Assert.assertFalse(authorizationInvalidPassword);
    }

    @Test
    public void emptyDataLoginUserViaApiTest() {
        String username = "";
        String password = "";
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(username, password, 200);
        boolean authorizationEmptyFields = authorizationAPI.isAuthorized(username,password, 400);
        Assert.assertFalse(authorizationEmptyFields);
    }


}