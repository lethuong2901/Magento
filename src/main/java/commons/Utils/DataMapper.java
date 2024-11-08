package commons.Utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import commons.GlobalConstant;

import java.io.File;

public class DataMapper {
    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    @JsonProperty("login")
    private Login login;

    public static class Login{
        @JsonProperty("username")
        private String username;

        @JsonProperty("password")
        private String password;
    }

    public static DataMapper getUseData(){
        try{
            ObjectMapper mapper= new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,false);
            return mapper.readValue(new File(GlobalConstant.PROJECT_PATH+"/src/test/Resources/DataRegister.json"), DataMapper.class);
        } catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getLoginUsername() {
        return login.username;
    }

    public String getLoginPassword() {
        return login.password;
    }
}


