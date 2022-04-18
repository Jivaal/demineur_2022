package mine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class GridTest
{
    private Grid grid;

    @BeforeEach
    public void init() { this.grid = Grid.getInstance(); }

    @AfterEach
    public void clear()
    {
        this.grid = Grid.resetInstance();
        this.grid = null;
    }
}
