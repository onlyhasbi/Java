package programmer.zaman.now.application;

import programmer.zaman.now.data.Costumer;
import programmer.zaman.now.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Costumer costumer = new Costumer();
        costumer.setName("Hasbi");
        costumer.setLevel(Level.VIP);

        System.out.println(costumer.getName());
        System.out.println(costumer.getLevel().getDescription());

        System.out.println(Level.PREMIUM.name());
        System.out.println(Level.valueOf("STANDARD"));
        System.out.println();
        for(var value : Level.values()){
            System.out.println(value.getDescription());
        }
    }
}
