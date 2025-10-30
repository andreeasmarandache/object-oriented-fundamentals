package ContorDeUtilizatori;

public class Platforma {


    static void main(String[] args) {

        System.out.println("Utilizatori la început: " + User.getUserCount()); // 0
        User user1 = new User("ana");
        User user2 = new User("bogdan");
        User user3 = new User("cristi");
        System.out.println("Utilizatori în total: " + User.getUserCount()); // 3

    }
}
