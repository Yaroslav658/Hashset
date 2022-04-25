package hashset;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class hashset {


    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object.hashCode());
        Object object2 = new Object();
        System.out.println(object2.hashCode());
        Object object3;
        object3 = object2;
        System.out.println(object3.hashCode());
        System.out.println(object.equals(object2));

        user user1 = new user("Volodymyr", "17.03.2022", 1);
        user user2 = new user("Evgeniy", "28.02.2022", 2);
        user user3 = new user("Gennadiy", "11.01.2022", 3);
        user user4 = new user("Gennadiy", "11.01.2022", 3);
        System.out.println("\n");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
        System.out.println(user4.hashCode());
    }
}


 class user {
    String name;
    String registrationDate;
    Boolean subscription;
    Double balance;
    int ip;
    static int LastIP=0;

     public user(String name, String registrationDate, int ip) {
         this.name = name;
         this.registrationDate = registrationDate;
         this.ip = ip;
         LastIP++;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof user)) return false;
         user user = (user) o;
         return ip == user.ip && name.equals(user.name) && registrationDate.equals(user.registrationDate);
     }

     @Override
     public int hashCode() {
         return Objects.hash(name, registrationDate, ip);
     }
 }











