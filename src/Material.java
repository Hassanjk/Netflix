public abstract class Material {
    int id;
    String name;
    int[] Scores;
    int release_year;
    Category[] category;
    int price;
    String[] type = new String[]{"movie","book"};

    public Material(int id, String name, int[] scores, int release_year, Category[] category, int price, String[] type) {
        this.id = id;
        this.name = name;
        Scores = scores;
        this.release_year = release_year;
        this.category = category;
        this.price = price;
        this.type = type;
    }
    void addScore(int score){};
    abstract double getMaxScore();// getting
    abstract double getMinScore();
    abstract double getAvgScore();
    abstract void showDetail();

}
