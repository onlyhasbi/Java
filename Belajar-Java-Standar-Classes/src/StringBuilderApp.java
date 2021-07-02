public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Andi");
        sb.append(" ");
        sb.append("Muhammad");
        sb.append(" ");
        sb.append("Hasbi");
        String fullName = sb.toString();
        System.out.println(fullName);
    }
}
