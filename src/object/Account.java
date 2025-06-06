package object;

public class Account {
    private int username;
    private String email;

    public Account(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public int getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void hienThiThongTin() {
        System.out.println("Username: " + username + ", Email: " + email);
    }
}
