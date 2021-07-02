import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            System.out.println(properties.getProperty("database.host"));
            System.out.println(properties.getProperty("database.port"));
            System.out.println(properties.getProperty("database.username"));
            System.out.println(properties.getProperty("database.password"));

        } catch (FileNotFoundException exeption){
            System.out.println("File tidak ditemukan "+exeption);
        } catch (IOException exception){
            System.out.println("Gagal membuka file "+exception);
        }


        try {
            Properties person = new Properties();
            person.put("name.first","Andi");
            person.put("name.middle","Muhammad");
            person.put("name.last","Hasbi");
            person.store(new FileOutputStream("person.properties"),"Konfigurasi");

        } catch (FileNotFoundException exeption){
            System.out.println("file tidak ditemukan");
        } catch (IOException exception){
            System.out.println("gagal membuka file");
        }
    }
}
