package academy.belhard.entity;

public class User extends Person {

    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getFullInfo() {
        return "Имя: " + this.getFullName() + "\nE-mail: " + this.email;
    }

    public boolean isPasswordCorrect(String pass) {
        return this.password.equals(pass);

    }
}