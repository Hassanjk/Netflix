import java.util.ArrayList;

public class Netflix  {
    User credential= null; //initially set null
    ArrayList<String> materials = new ArrayList<String>(); //(it must be able to contain multiple Asset objects.)

    boolean isLogin = false; //initial value must be false and you don't need to get this value from the user.

    public Netflix(ArrayList<String> materials) {
        this.materials = materials;

    }

    // login method
    void login(User user) {



      if (user.loginStatus == true){
        isLogin = true;



      }
       }

    private void addMovie(Movie m1) {
        materials.add(m1.toString());
    }
    private void addbook(Movie m1) {
        materials.add(m1.toString());
    }
    private void addMaterial(Book b1) {
        materials.add(b1.toString());
    }

}



