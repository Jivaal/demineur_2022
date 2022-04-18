package mine;

import java.util.ArrayList;

public class Grid
{
    /** La matrice qui contient les mines */
    private ArrayList<ArrayList<Mine>> grid;

    /** Le nombre de cases sur la longueur de la grille */
    public final int WIDTH = 64;

    /** Le nombre de cases sur la largeur de la grille */
    public final int HEIGHT = 64;

    /** L'unique instance de la grille */
    private static Grid instance = null;

    /** Construit une grille en la remplissant de mines */
    private Grid() { fillGrid(); }

    /**
     * Retourne l'unique instance de grille
     * @return L'instance de la grille
     */
    public static Grid getInstance()
    {
        if (Grid.instance == null)
            Grid.instance = Grid.resetInstance();

        return Grid.instance;
    }

    /**
     * Crée une nouvelle instance de la grille
     * @return Une nouvelle instance de grille
     */
    public static Grid resetInstance()
    {
        Grid.instance = new Grid();

        return Grid.getInstance();
    }

    /**
     * Remplit la matrice avec des mines
     */
    private void fillGrid()
    {
        this.grid = new ArrayList<ArrayList<Mine>>();
        for (int i = 0; i < this.WIDTH; i++)
        {
            this.grid.add(new ArrayList<Mine>());
            for (int j = 0; j < this.HEIGHT; j++)
                grid.get(i).add(new Mine());
        }
    }
}
