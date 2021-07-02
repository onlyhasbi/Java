package programmer.zaman.now.error;

import programmer.zaman.now.annotation.NotBlank;
import programmer.zaman.now.data.LoginRequest;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationExeption,NullPointerException {
        if(loginRequest.username()==null){
            throw new NullPointerException("Username is null");
        } else if(loginRequest.username().isBlank()){
            throw new ValidationExeption("Username is blank");
        } else if(loginRequest.password()==null){
            throw new NullPointerException("Password is null");
        } else if(loginRequest.password().isBlank()){
            throw new ValidationExeption("Password is blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if(loginRequest.username()==null){
            throw new NullPointerException("Username is null");
        } else if(loginRequest.username().isBlank()){
            throw new BlankExeption("Username is blank");
        } else if(loginRequest.password()==null){
            throw new NullPointerException("Password is null");
        } else if(loginRequest.password().isBlank()){
            throw new BlankExeption("Password is blank");
        }
    }

    public static void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field : fields){
            field.setAccessible(true);
            if(field.getAnnotation(NotBlank.class)!=null){
                // validated
                try {
                    String value = (String)field.get(object);
                    if(value==null || value.isBlank()){
                        throw new BlankExeption("field "+field.getName()+" is blank");
                    }

                } catch (IllegalAccessException exception){
                    System.out.println("Tidak bisa mengakses field "+field.getName());
                    exception.printStackTrace();
                }
            }
        }

    }
}
