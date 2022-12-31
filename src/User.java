public class User extends Person{
    boolean loginStatus;
    String userName;
    String passWord;

    public User(String firstName,String lastName ,String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
        this.firstName = firstName;
        this.lastName = lastName;
        this.loginStatus = true;

    }
}
