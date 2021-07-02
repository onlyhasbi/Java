package data;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Person {
    private int id;
    private String nama;
    private String pekerjaan;
    static int count;

    public Person(String nama, String pekerjaan) {
        this.id = count;
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        count++;
    }
}
