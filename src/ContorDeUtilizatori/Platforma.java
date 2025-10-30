package ContorDeUtilizatori;

public class Platforma {


    static void main(String[] args) {

        System.out.println("Utilizatori la început: " + User.getUserCount()); // 0
        User user1 = new User("ana");
        User user2 = new User("bogdan");
        User user3 = new User("cristi");
        System.out.println("Utilizatori în total: " + User.getUserCount()); // 3

        System.out.println("Primul utilizator: " + user1.getUsername());
        System.out.println("Al doilea utilizator: " + user2.getUsername());
        System.out.println("Al treilea utilizator: " + user3.getUsername());

    }
}
