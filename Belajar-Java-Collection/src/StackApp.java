import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hasbi");
        stack.push("Khalid");
        stack.push("Khaulah");

        for(var item = stack.pop(); item!=null; item=stack.pop()){
            System.out.println(item);
        }

//        for (var item : stack){
//            System.out.println(item);
//        }
    }
}
