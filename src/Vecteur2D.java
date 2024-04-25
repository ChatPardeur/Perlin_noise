import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.function.IntConsumer;


public class Vecteur2D
{
    private final int[][] tab_p = {{1,1}, {-1,-1}, {-1,1}, {1, -1}, {0,1}, {0,-1}, {1,0}, {-1,0}};
    private int x;
    private int y;

    public Vecteur2D(int x, int y)
    {
        this.x = x;
        this.y = y;
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
    private int randint(int min, int max)
    {
        Random random = new Random();
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static float scalaire(Vecteur2D v1, Vecteur2D v2)
    {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY();
    }


    public static void main(String[] args) {
        Vecteur2D v1 = new Vecteur2D(3,4);
        Vecteur2D v2 = new Vecteur2D(1,2);
        System.out.println(Vecteur2D.scalaire(v1,v2));
    }


}
