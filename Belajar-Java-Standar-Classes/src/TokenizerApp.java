import java.util.StringTokenizer;

public class TokenizerApp {
    public static void main(String[] args) {
        String name = "A Muh Hasbi Haerurrijal";
        StringTokenizer stringToken = new StringTokenizer(name," ");
        while(stringToken.hasMoreTokens()){
            String result = stringToken.nextToken();
            System.out.println(result);
        }
    }
}
