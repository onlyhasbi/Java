import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        System.out.println("Encode Teks :");
        String original = "A. Muh. Hasbi H";
        String encode = Base64.getEncoder().encodeToString(original.getBytes(StandardCharsets.UTF_8));
        System.out.println(encode);

        System.out.println();

        System.out.println("Decode Teks :");
        byte[] decode = Base64.getDecoder().decode(encode);
        String decodeString = new String(decode);
        System.out.println(decodeString);
    }
}
