package api;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import schemas.LoginViewModel;

public class AuthorizationAPI extends ApiBase {
    LoginViewModel loginViewModel;

/*    public LoginViewModel userBody(String username) {
        loginViewModel = new LoginViewModel();
        loginViewModel.setUsername(username);
        loginViewModel.setPassword("Alexgor0!");
        return loginViewModel;
    }*/
public LoginViewModel userBody(String username, String password) {
        loginViewModel = new LoginViewModel();
        loginViewModel.setUsername(username);
        if (password != null) {
            loginViewModel.setPassword(password);
        } else {
            loginViewModel.setPassword("Alexgor0!");
        }
        return loginViewModel;
    }
   /* public String generateToken(String username,String password) {
        String endpoint = "/Account/v1/GenerateToken";
        LoginViewModel userRequestBody = userBody(username, password);
        JsonPath response = postRequest(endpoint, 200, userRequestBody).jsonPath();
        Assert.assertEquals(response.getString("status"), "Success", "Status should be 'Success'");
        Assert.assertEquals(response.getString("result"), "User authorized successfully.", "Result should be 'Success'");
        return "Bearer " + response.getString("token");
    }*/
     public String generateToken(String username) {
        String endpoint = "/Account/v1/GenerateToken";
        LoginViewModel userRequestBody = userBody(username, null);
        JsonPath response = postRequest(endpoint, 200, userRequestBody).jsonPath();
        Assert.assertEquals(response.getString("status"), "Success", "Status should be 'Success'");
        Assert.assertEquals(response.getString("result"), "User authorized successfully.", "Result should be 'Success'");
        return "Bearer " + response.getString("token");
    }
    public Response login(String username, String password, int code) {
        String endpoint = "/Account/v1/Login";
        LoginViewModel userRequestBody = userBody(username, password);
        return postRequest(endpoint, 200, userRequestBody);
    }
// public Response registerUser(String username) {
//        String endpoint = "/Account/v1/User";
//        LoginViewModel userRequestBody = userBody(username, null);
//        return postRequest(endpoint, 201, userRequestBody);
//    }
    public Response registerUser(String username) {
        String endpoint = "/Account/v1/User";
        LoginViewModel userRequestBody = userBody(username, null);
        return postRequest(endpoint, 201, userRequestBody);
    }

   /* public boolean isAuthorized(String username, String s, int code) {
        String endpoint = "/Account/v1/Authorized";
        LoginViewModel userRequestBody = userBody(username);
        return postRequest(endpoint, 200, userRequestBody).asString().equals("true");
    }*/
   public boolean isAuthorized(String username, String password ,int code) {
       String endpoint = "/Account/v1/Authorized";
       LoginViewModel userRequestBody = userBody(username,password);
       return postRequest(endpoint, code, userRequestBody).asString().equalsIgnoreCase("true");
   }
   /* public boolean isAuthorizedPass( String password, String username int code) {
        String endpoint = "/Account/v1/Authorized";
        LoginViewModel userRequestBody = userBody(password);
        return postRequest(endpoint, code, userRequestBody).asString().equalsIgnoreCase("true");
    }*/

    public Response isDeleted(String username) {
        String endpoint = "/Account/v1/Authorized";
        LoginViewModel userRequestBody = userBody(username, null);
        return postRequest(endpoint, 404, userRequestBody);
    }
    //  public Response isDeleted(String username) {
    //        String endpoint = "/Account/v1/Authorized";
    //        LoginViewModel userRequestBody = userBody(username, null);
    //        return postRequest(endpoint, 404, userRequestBody);
    //    }
}
