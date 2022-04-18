package core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;

public class MainGameTest
{
    private MainGame mainGame;

    @BeforeEach
    public void init() { this.mainGame = MainGame.getInstance(); }

    @AfterEach
    public void clear() { this.mainGame = null; }

    @Test
    public void testResetInstanceCreatesAnotherInstanceOfTheGame()
    {
        MainGame oldInstance = this.mainGame;

        assertNotSame(oldInstance, MainGame.resetInstance());
    }
}
