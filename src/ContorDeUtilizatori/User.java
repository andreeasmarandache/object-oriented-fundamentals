package ContorDeUtilizatori;


public class User {

    private String username;
    private static int userCount = 0;

    public User(String username) {
        this.username = username;
        userCount++;
    }

    public static int getUserCount() {
        return userCount;
    }

    public String getUsername() {
        return username;
    }

}
