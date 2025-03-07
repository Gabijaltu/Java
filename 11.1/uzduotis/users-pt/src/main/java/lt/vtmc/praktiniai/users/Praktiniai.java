package lt.vtmc.praktiniai.users;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
//        throw new UnsupportedOperationException("Not implemented");
        int counter = 0;

        for (User user : users) {
            if (user.getAge() > 25){
                counter++;
            }
        }
        return counter;
    }

    public static double getAverageAge(List<User> users) {
//        throw new UnsupportedOperationException("Not implemented");
        double average = 0;
        int count = 0;

        for (User user : users) {
            count++;
        }
        return (double) sumAge(users)/count;
    }

    // TODO: Naudokite klase Collections.min(). Paduokite Comparator
    public static Integer getMinAge(List<User> users) {
 //       throw new UnsupportedOperationException("Not implemented");
        return Collections.min(users, Comparator.comparingInt(User::getAge)).getAge();
    }

    public static User findByName(List<User> users, String name) {
 //       throw new UnsupportedOperationException("Not implemented");
        for (User user : users) {
            if (name.equals(user.getName())){
                return user;
            }
        }
        return null;
    }

    // TODO: Naudokite klase Collections.sort(). Paduokite Comparator
    public static List<User> sortByAge(List<User> users) {
 //       throw new UnsupportedOperationException("Not implemented");

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
               if (o1.getAge() > o2.getAge()) {
                   return 1;
               } else if (o1.getAge() < o2.getAge()) {
                   return -1;
               }
               return 0;
            }
        });
        return users;
    }

    // TODO: Naudokite klase Collections.max(). Paduokite Comparator
    public static User findOldest(List<User> users) {
 //       throw new UnsupportedOperationException("Not implemented");
        return Collections.max(users, Comparator.comparing(User::getAge));
    }

    public static int sumAge(List<User> users) {
 //       throw new UnsupportedOperationException("Not implemented");
        int sum = 0;

        for (User user : users) {
            sum = sum + user.getAge();
        }
        return sum;

    }

}
