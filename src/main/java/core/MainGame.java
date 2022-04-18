package core;

import com.sun.tools.javac.Main;

/**
 * La classe contenant la méthode de lancement du jeu. Gère la fenêtre et l'état général du jeu.
 * Construit en suivant le principe du singleton.
 */
public class MainGame
{
    /** L'instance du jeu (singleton) */
    private static MainGame instance = null;

    /** Boolean qui garde la gameloop dans une boucle infinie */
    private boolean gameLoopBool;

    /** Crée une instance du jeu. L'instance doit être unique donc le constructeur est privé. */
    private MainGame() { this.gameLoopBool = true; }

    /**
     * Retourne l'instance actuelle du jeu et en crée une s'il n'y a aucune instance
     * @return L'instance actuelle du jeu
     */
    protected static MainGame getInstance()
    {
        if (MainGame.instance == null)
            MainGame.instance = MainGame.resetInstance();

        return MainGame.instance;
    }

    /**
     * Crée une nouvelle instance du jeu
     * @return Une nouvelle instance du jeu
     */
    protected static MainGame resetInstance()
    {
        return MainGame.instance = new MainGame();
    }

    /**
     * Méthode principale d'initialisation du jeu
     */
    private void init()
    {

    }

    /**
     * Méthode principale d'update du jeu
     */
    private void update()
    {

    }

    /**
     * Méthode principale d'affichage du jeu
     */
    private void draw()
    {

    }

    /**
     * Gameloop du jeu
     */
    protected void run()
    {
        this.init();
        while (this.gameLoopBool)
        {
            this.update();
            this.draw();
        }
    }

    /**
     * Fonction main principale de lancement du jeu
     * @param args Les arguments de la ligne de commande
     */
    public static void main(String[] args)
    {
        MainGame mainGame = new MainGame();

        mainGame.run();
    }
}
