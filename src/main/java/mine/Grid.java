package mine;

import java.util.ArrayList;

public class Grid
{
    public final int WIDTH = 64;
    public final int HEIGHT = 64;

    private ArrayList<ArrayList<Mine>> grid;

    private static Grid instance = null;

    private Grid()
    {
        fillGrid();
    }

    public static Grid getInstance()
    {
        if (Grid.instance == null)
            Grid.instance = Grid.resetInstance();

        return Grid.instance;
    }

    public static Grid resetInstance()
    {
        Grid.instance = new Grid();
        Grid.instance.fillGrid();

        return Grid.getInstance();
    }

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
