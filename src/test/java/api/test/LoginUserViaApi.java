package api.test;

import api.AuthorizationAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUserViaApi {

    AuthorizationAPI authorizationAPI;


    @Test
    public void loginUserWithValidDataTest() {
        String expectedUsername = "John";
        String expectedPassword = "123NBK&tr";

        //login user
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(expectedUsername, 200, expectedPassword);

        //check with valid username and valid password
        boolean authorization = authorizationAPI.isAuthorized(expectedUsername, expectedPassword, 200);
        Assert.assertTrue(authorization, "User is not authorized, status: " + authorization);
    }


    @Test
    public void loginUserWithInvalidPasswordTest() {
        String expectedUsername = "John";
        String expectedPassword = "123";

        //login user
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(expectedUsername, 200, expectedPassword);

        //check with valid username and invalid password
        boolean authorization2 = authorizationAPI.isAuthorized(expectedUsername, expectedPassword, 404);
        Assert.assertFalse(authorization2);
    }


    @Test
    public void loginUserWithInvalidUsernameTest() {
        String expectedUsername = "Sam";
        String expectedPassword = "123NBK&tr";

        //login user
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(expectedUsername, 200, expectedPassword);

        //check with invalid username and valid password
        boolean authorization3 = authorizationAPI.isAuthorized(expectedUsername, expectedPassword, 404);
        Assert.assertFalse(authorization3);
    }


    @Test
    public void loginUserWithEmptyUsernameAndEmptyPasswordTest() {
        String expectedUsername = "";
        String expectedPassword = "";
        //login user
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(expectedUsername, 200, expectedPassword);

        //check with empty username and empty password
        boolean authorization4 = authorizationAPI.isAuthorized(expectedUsername, expectedPassword, 400);
        Assert.assertFalse(authorization4);
    }

    @Test
    public void loginUserWithEmptyUsernameAndValidPasswordTest() {
        String expectedUsername = "";
        String expectedPassword = "123NBK&tr";
        //login user
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(expectedUsername, 200, expectedPassword);

        //check with empty username and valid password
        boolean authorization5 = authorizationAPI.isAuthorized(expectedUsername, expectedPassword, 400);
        Assert.assertFalse(authorization5);
    }


    @Test
    public void loginUserWithValidUsernameAndEmptyPasswordTest() {
        String expectedUsername = "John";
        String expectedPassword = "";
        //login user
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(expectedUsername, 200, expectedPassword);

        //check with valid username and empty password
        boolean authorization6 = authorizationAPI.isAuthorized(expectedUsername, "", 400);
        Assert.assertFalse(authorization6);
    }
}

