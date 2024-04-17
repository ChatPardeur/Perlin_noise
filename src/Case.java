import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Iterator;

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

    private ArrayList<Vecteur2D> trouveVecteursdistance(int x, int y)
    {
        ArrayList<Vecteur2D> listeVecteurs = new ArrayList<Vecteur2D>();


        listeVecteurs.add(new Vecteur2D(x+1, y+1));
        listeVecteurs.add(new Vecteur2D(x- taille, y+1));
        listeVecteurs.add(new Vecteur2D(x+1, y-taille));
        listeVecteurs.add(new Vecteur2D(x-taille, y-taille));

        return listeVecteurs;
    }
}
