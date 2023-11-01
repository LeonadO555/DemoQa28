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

    String expectedUsername = "John";
    String expectedPassword = "123NBK&tr";


    @Test
    public void loginUserWithValidDataTest() {

        //login user
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(expectedUsername, 200, expectedPassword);

        //check with valid username and valid password
        boolean authorization = authorizationAPI.isAuthorized(expectedUsername, expectedPassword, 200);
        Assert.assertTrue(authorization, "User is not authorized, status: " + authorization);
    }


    @Test
    public void loginUserWithInvalidPasswordTest() {

        //login user
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(expectedUsername, 200, expectedPassword);

        //check with valid username and invalid password
        boolean authorization2 = authorizationAPI.isAuthorized(expectedUsername, "123NBK&", 404);
        Assert.assertFalse(authorization2);
    }


    @Test
    public void loginUserWithInvalidUsernameTest() {

        //login user
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(expectedUsername, 200, expectedPassword);

        //check with invalid username and valid password
        boolean authorization3 = authorizationAPI.isAuthorized("Sam", expectedPassword, 404);
        Assert.assertFalse(authorization3);
    }


    @Test
    public void loginUserWithEmptyUsernameAndEmptyPasswordTest() {

        //login user
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(expectedUsername, 200, expectedPassword);

        //check with empty username and empty password
        boolean authorization4 = authorizationAPI.isAuthorized("", "", 400);
        Assert.assertFalse(authorization4);
    }

    @Test
    public void loginUserWithEmptyUsernameAndValidPasswordTest() {

        //login user
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(expectedUsername, 200, expectedPassword);

        //check with empty username and valid password
        boolean authorization5 = authorizationAPI.isAuthorized("", expectedPassword, 400);
        Assert.assertFalse(authorization5);
    }


    @Test
    public void loginUserWithValidUsernameAndEmptyPasswordTest() {
        //login user
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(expectedUsername, 200, expectedPassword);

        //check with valid username and empty password
        boolean authorization6 = authorizationAPI.isAuthorized(expectedUsername, "", 400);
        Assert.assertFalse(authorization6);
    }
}

/*
@Test
    public void loginUserViaApiTests() {

        //login user
        authorizationAPI = new AuthorizationAPI();
        authorizationAPI.login(expectedUsername, 200, expectedPassword);

        //check with valid username and valid password
        boolean authorization = authorizationAPI.isAuthorized(expectedUsername, expectedPassword, 200);
        Assert.assertTrue(authorization, "User is not authorized, status: " + authorization);


        //check with valid username and invalid password
        boolean authorization2 = authorizationAPI.isAuthorized(expectedUsername, "123NBK&", 404);
         Assert.assertFalse(authorization2);

        //check with invalid username and valid password
        boolean authorization3 = authorizationAPI.isAuthorized("Sam", expectedPassword, 404);
        Assert.assertFalse(authorization3);

        //check with empty username and empty password
        boolean authorization4 = authorizationAPI.isAuthorized("", "", 400);
        Assert.assertFalse(authorization4);


        //check with empty username and valid password
        boolean authorization5 = authorizationAPI.isAuthorized("", expectedPassword, 400);
        Assert.assertFalse(authorization5);

        //check with valid username and empty password
        boolean authorization6 = authorizationAPI.isAuthorized(expectedUsername, "", 400);
        Assert.assertFalse(authorization6);
    }
 */
