import java.util.Objects;

public class Game {
    private String name;
    private double rating;
    private int price;

    public Game(String name, double rating, int price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public double getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Game: " + name  +
                ", Rating:" + rating +
                ", $:" + price ;
    }

    @Override
    public boolean equals(Object u) {
        if (this == u) return true;
        if (u == null || getClass() != u.getClass()) return false;
        Game game = (Game) u;
        return Double.compare(game.rating, rating) == 0 &&
                price == game.price &&
                Objects.equals(name, game.name);
    }
}
