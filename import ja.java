import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Additional getters and setters as needed

    public String getUsername() {
        return username;
    }
}

class SignUpSystem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Sign-Up System!");

        // Get user input for username and password
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Create a new user
        User newUser = new User(username, password);

        // Display successful sign-up message
        System.out.println("Sign-up successful! Welcome, " + newUser.getUsername() + "!");
    }
}

