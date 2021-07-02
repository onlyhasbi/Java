package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.data.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<String,Integer>();
        pair.setFirst("A. Muh. Hasbi");
        pair.setSecond(182);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
