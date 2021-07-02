import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {
    public static enum Gender{
        MALE,FEMALE,NOT_MENTION
    }

    public static void main(String[] args) {
//        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
//        EnumSet<Gender> genders = EnumSet.of(Gender.FEMALE,Gender.MALE);
//
        //atau bisa hanya menggunakan set
        Set<Gender> genders = EnumSet.allOf(Gender.class);
//        Set<Gender> genders = EnumSet.of(Gender.FEMALE,Gender.MALE);
//
//        for(var gender : genders){
//            System.out.println(gender);
//        }

//        for(var gender : Gender.values()){
//            System.out.println(gender);
//        }

        Gender[] gendersAll = Gender.values();
        for(var gender : gendersAll){
            System.out.println(gender);
        }
    }
}
