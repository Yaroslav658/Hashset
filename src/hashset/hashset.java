package hashset;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class hashset {

//Расписать понимание хешкода, начиная с класса Object.

// if (a==null) return 0;
//        Set<Object> set = new HashSet<>();


    public static void main(String[] args) {
//        Set<Object> set = new HashSet<>();
        Object object = new Object();
        System.out.println(object.hashCode());
        Object object2 = new Object();
        System.out.println(object2.hashCode());
        Object object3;
        object3 = object2;
        System.out.println(object3.hashCode());
        System.out.println(object.equals(object2));






    }
}


 class user {
    String name;
    String registrationDate;
    Boolean subscription;
    Double balance;
    int ip;

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










//        ⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣀⠄⠄⠄⣀⣀⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄
//        ⠄⠄⠄⠄⠄⠄⣀⣶⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣇⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄
//        ⠄⠄⠄⠄⠄⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡦⠄⠄⠄⠄⠄⠄⠄⠄⠄
//        ⠄⠄⠄⠄⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠄⠄⠄⠄⠄⠄⠄⠄
//        ⠄⠄⠄⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄
//        ⠄⠄⠄⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠄⠄⠄⠄⠄⠄
//        ⠄⠄⠄⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠛⠉⠛⠁⠈⠈⠻⣿⣿⠄⠄⠄⠄⠄⠄
//        ⠄⠄⢰⣿⣿⣿⠛⠿⠿⠛⠋⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⣿⡆⠄⠄⠄⠄⠄
//        ⠄⠄⠄⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠸⡇⠄⠄⠄⠄⠄
//        ⠄⠄⠄⠸⣿⡇⠄⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣀⠄⠄⠄⠄⢻⣀⣠⢤⣤⡀
//        ⠄⠄⠄⠄⢹⡇⠄⠄⠄⠄⠄⠄⠄⠄⠐⣤⣴⣾⣿⣿⢶⡄⠄⠄⢀⠴⠇⠄⠸⣷
//        ⠄⢀⣀⣀⣼⡅⢴⣶⣶⣿⣷⣿⣿⠏⠄⠄⠙⠿⠽⠋⠄⠄⠄⠄⠋⢰⣦⠄⢀⡏
//        ⢰⣿⡟⢹⣿⡆⠙⠛⠛⠟⠃⠛⡟⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠃⡼⠄
//        ⠐⣾⡆⣾⣿⡇⠄⠄⠄⠄⠄⢸⣷⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⠜⠁⠄
//        ⠄⠘⣧⢿⡿⣿⡄⠄⠄⠄⠄⣼⣿⣶⣄⠠⣤⠄⠄⠄⠄⠄⠄⠄⡔⠖⠋⠄⠄⠄
//        ⠄⠄⠹⣛⡓⠾⣿⣧⠄⠄⠄⠈⢹⣿⡛⡀⠄⠄⠄⠄⠄⠄⠄⢀⠃⠄⠄⠄⠄⠄
//        ⠄⠄⠄⠄⠉⠉⠉⢹⠄⠄⠄⣠⣾⣿⣷⣤⠤⠤⠤⠄⠄⠄⠄⡸⠄⠄⠄⠄⠄⠄
//        ⠄⠄⠄⠄⠄⠄⠄⠘⣧⣄⠘⠿⣿⣧⣀⣄⣄⡀⠄⠄⠄⢀⠞⠁⠄⠄⠄⠄⠄⠄
//        ⠄⠄⠄⠄⠄⠄⠄⠄⠙⢷⣄⠄⠄⠉⠉⠉⠁⠄⢀⣀⠴⠃⠄⠄⠄⠄⠄⠄⠄⠄
//        ⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠉⠓⠶⠶⠶⠶⠖⠚⠋⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄

