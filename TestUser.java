import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class TestUser {

    //psvm is the class that you initialize your project, the main
    public static void main(String[] args) {
        User u1 = new User("Alice", "12345678900", "2000-01-01");
        User u2 = new User("Ana Beatriz", "23456789011", "1998-05-12");
        User u3 = new User("Carla", "34567890122", "1995-09-23");
        User u4 = new User("Daniel", "45678901233", "2002-07-30");
        User u5 = new User("Elisa", "56789012344", "1999-12-15");
        User u6 = new User("Felipe", "67890123455", "2001-03-05");
        // System.out.println(u1); 
        // System.out.println(u2); 
        // System.out.println(u3); 
        // System.out.println(u4); 
        // System.out.println(u5); 
        // System.out.println(u6); 

        ArrayList<User> users_list = new ArrayList<>();
        users_list.add(u1);
        users_list.add(u2);
        users_list.add(u3);
        users_list.add(u4);
        users_list.add(u5);
        users_list.add(u6);

        // System.out.println(users_list);

        //stream, filter, collectors use
        List<User> users_starts_with_A_list = 
        users_list.stream()
        .filter(u -> u.getName().toLowerCase().startsWith("a"))
        .collect(Collectors.toList());

        users_starts_with_A_list.forEach(System.out::println);
    }
}
