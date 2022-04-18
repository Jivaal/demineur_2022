package mine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class MineTest
{
    private Mine mine;

    @BeforeEach
    public void init() { this.mine = new Mine(); }

    @AfterEach
    public void clear() { this.mine = null; }
}
