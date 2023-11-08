package api.test;

import api.ApiBase;
import api.AuthorizationAPI;
import api.UserAPI;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ApiBase {


    AuthorizationAPI authorizationAPI;
    UserAPI userAPI;
    Faker faker = new Faker();

    @Test
    public void successLoginTest() {

        // login with valid credentials
        String userName = "13ccedd6-1c89-42e7-ab19-bbc0743b5584";
        String password = "j4RMm9B*L";
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(userName, password, 200);
        boolean authorization = authorizationAPI.isAuthorized(userName, "j4RMm9B*L", 200);
        Assert.assertTrue(authorization, "User is not authorized, status : " + authorization);
    }

    @Test
    public void invalidPasswordLoginTest() {
        // login with invalid credentials
        String userName = "13ccedd6-1c89-42e7-ab19-bbc0743b5584";
        String password = "jxioxo";
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(userName, password, 200);
        boolean authorizationInvalidPassword = authorizationAPI.isAuthorized(userName, password, 404);
        Assert.assertFalse(authorizationInvalidPassword);
    }

    @Test
    public void invalidUserLoginTest() {
        // login with invalid credentials
        String userName = "xoxoxo";
        String password = "j4RMm9B*L";
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(userName, password, 200);
        boolean authorizationInvalidUser = authorizationAPI.isAuthorized(userName, password, 404);
        Assert.assertFalse(authorizationInvalidUser);
    }

    @Test
    public void emptyCredentialsLoginTest() {
        // login with empty credentials
        String userName = "";
        String password = "";
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(userName, password, 200);
        boolean authorizationEmptyFields = authorizationAPI.isAuthorized(userName, password, 400);
        Assert.assertFalse(authorizationEmptyFields);
    }

    @Test
    public void emptyUserValidPasswordLoginTest() {
        // login with empty username and valid password
        String userName = "";
        String password = "j4RMm9B*L";
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(userName, password, 200);
        boolean authorizationEmptyUsernameValidPassword = authorizationAPI.isAuthorized(userName, password, 400);
        Assert.assertFalse(authorizationEmptyUsernameValidPassword);
    }

    @Test
    public void validUsernameEmptyPasswordLoginTest() {
        // login with valid username and empty password
        String userName = "13ccedd6-1c89-42e7-ab19-bbc0743b5584";
        String password = "";
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(userName, password, 200);
        boolean authorizationValidUsernameEmptyPassword = authorizationAPI.isAuthorized(userName, password, 400);
        Assert.assertFalse(authorizationValidUsernameEmptyPassword);
    }

}
