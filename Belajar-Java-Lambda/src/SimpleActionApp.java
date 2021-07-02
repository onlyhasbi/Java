public class SimpleActionApp {
    public static void main(String[] args) {
//        SimpleAction simpleAction = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Hello Hasbi";
//            }
//        };
//
//        System.out.println(simpleAction.action());
//
//        SimpleAction simpleAction2 = () -> {
//            return "Pake Lambda dong!";
//        };
//
//        System.out.println(simpleAction2.action());

        SimpleAction simpleAction = (String name) -> {
            return "Hello "+name;
        };
        System.out.println(simpleAction.action("Hasbi"));

        SimpleAction simpleAction1 = (name) -> {
            return "Hi "+name;
        };
        System.out.println(simpleAction1.action("Amriati"));

        SimpleAction simpleAction2 = (String name) -> "Holla "+name;
        System.out.println(simpleAction2.action("Mushab"));

        SimpleAction simpleAction3 = (name) -> "Salom "+name;
        System.out.println(simpleAction3.action("Khaulah"));

        SimpleAction simpleAction4 = name -> "Oee..."+name;
        System.out.println(simpleAction4.action("Khalid"));
    }
}
