package programmer.zaman.now.application;

import programmer.zaman.now.annotation.Fancy;
import programmer.zaman.now.error.ValidationUtil;

@Fancy(name="Hasbi",tags={"app","java"})
public class AnnotationApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Hasbi");
        request.setPassword("1319124");

        ValidationUtil.validationReflection(request);
    }
}
