package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationExeption;
import programmer.zaman.now.error.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Hasbi","");

//        try {
//            ValidationUtil.validate(loginRequest);
//            System.out.println("Data yang dimasukkan benar");
//        } catch (ValidationExeption e) {
//            System.out.println("Terjadi error dengan pesan : "+e.getMessage());
//        } catch (NullPointerException e) {
//            System.out.println("Terjadi null error dengan pesan : " + e.getMessage());
//        }

//        try {
//            ValidationUtil.validate(loginRequest);
//            System.out.println("Data yang dimasukkan benar");
//        } catch (ValidationExeption | NullPointerException e) {
//            System.out.println("Error : "+e.getMessage());
//        } finally {
//            System.out.println("Bagian selalu dieksekusi, ada error atau tidak ada error");
//        }

        ValidationUtil.validateRuntime(loginRequest);
        System.out.println("Sukses");
    }
}
