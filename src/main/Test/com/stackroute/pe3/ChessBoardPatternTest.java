import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {
    ChessBoardPattern pattern;
    @Before
    public void setUp() {
        pattern = new ChessBoardPattern();
    }

    @After
    public void tearDown() {
        pattern = null;
    }

    @Test
    public void createChessBoardPattern() {
        String result[][] = pattern.createChessBoardPattern();
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        assertArrayEquals(new String[][] {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}}
               ,result);
    }
}