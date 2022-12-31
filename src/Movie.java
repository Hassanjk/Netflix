import java.util.ArrayList; // import the ArrayList class


public class Movie extends Material{
    ArrayList<String> actors = new ArrayList<String>(); // Create an ArrayList object
    Person director;

    public Movie(int id, String name, int[] scores, int release_year, Category category, int price, String[] type, ArrayList<String> actors, Person director) {
        super(id, name, scores, release_year, new Category[]{category}, price, type);
        this.actors = actors;
        this.director = director;
    }
    // deleting actor in movie

    boolean deleteActor(int PersonId){
        if(actors.isEmpty()){
            System.out.println("nothing to remove");
        }else {

        }

return true;
    };


    // adding actor to movie
    void addActor(Person actor){

    };

    @Override
    double getMaxScore() {
        return 0;
    }

    @Override
    double getMinScore() {
        return 0;
    }

    @Override
    double getAvgScore() {
        return 0;
    }

    @Override
    void showDetail() {

    }
}
