import java.util.ArrayList;

public class PerlinNoise
{
    private Vecteur2D[][] grilleVecteurs;
    private Case[][] grilleCases;
    private int longueur;
    private int largeur;

    public PerlinNoise(int longeur, int largeur)
    {
        this.longueur = longeur;
        this.largeur = largeur;
        this.grilleVecteurs = new Vecteur2D[longeur][largeur];
    }

    public void initVecteurs()
    {
        for (int l = 0; l < longueur; l++)
        {
            for (int c = 0; c < largeur; c++)
            {
                grilleVecteurs[l][c] = new Vecteur2D();
            }
        }
    }

    private ArrayList<Vecteur2D> trouveVecteursCase(int ligne, int colonne)
    {
        ArrayList<Vecteur2D> listeVecteurs = new ArrayList<Vecteur2D>();
        for (int l = 0; l < 2; l++)
        {
            for (int c = 0; c < 2; c++)
            {
                listeVecteurs.add(grilleVecteurs[ligne + l][colonne + c]);
            }
        }
        return listeVecteurs;
    }
}
