import java.sql.DriverManager;
import java.util.ArrayList;

public class Case
{
    private int taille;
    private ArrayList<Vecteur2D> listeVecteurs;
    private int[][] tabValeurs;

    public Case(int n, ArrayList<Vecteur2D> listeVecteurs)
    {
        this.tabValeurs = new int[n][n];
        this.listeVecteurs = listeVecteurs;
    }

    private int produitScalaire(Vecteur2D v1, Vecteur2D v2)
    {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY();
    }

}
