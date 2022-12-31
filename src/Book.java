public class Book extends Material {
    Person writer;
    int numberOfPages;

    public Book(int id, String name, int[] scores, int release_year, Category category, int price, String[] type, Person writer, int numberOfPages) {
        super(id, name, scores, release_year, new Category[]{category}, price, type);
        this.writer = writer;
        this.numberOfPages = numberOfPages;
    }

    public void setWriter(Person newWriter) {
        this.writer = newWriter;
    }

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
