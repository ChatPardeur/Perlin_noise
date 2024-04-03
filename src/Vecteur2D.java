import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.function.IntConsumer;


public class Vecteur2D
{
    private final int[][] tab_p = {{1,1}, {-1,-1}, {-1,1}, {1, -1}, {0,1}, {0,-1}, {1,0}, {-1,0}};
    private int x;
    private int y;

    private int randint(int min, int max)
    {
        Random random = new Random();
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public Vecteur2D() {
        Random random = new Random();
        this.x = randint(-1,1);
        this.y = randint(-1,1);
    }

    public String toString()
    {
        return STR."\{x} \{y}";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 18; i++) {
            Vecteur2D v = new Vecteur2D();
            System.out.println(v);
        }
    }
}
