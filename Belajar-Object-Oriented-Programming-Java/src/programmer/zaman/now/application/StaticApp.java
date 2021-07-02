package programmer.zaman.now.application;

import programmer.zaman.now.data.Application;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

import static programmer.zaman.now.data.Constant.APPLICATION;
import static programmer.zaman.now.data.Constant.VERSION;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);
        System.out.println(MathUtil.sum(23,34,234,42,35));

        Country.City jakarta = new Country.City();
        jakarta.setName("Jakarta");

        System.out.println(jakarta.getName());
        System.out.println(Application.PROCESSORS);
    }
}
