package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BunTest {
    private static final String TEST_NAME = "хлебушек";
    private static final float TEST_PRICE = 10.5f;
    private static final int ZERO = 0;
    private Bun bun;

    @Before
    public void setUp() {
        bun = new Bun(TEST_NAME, TEST_PRICE);
    }

    @Test
    public void getNameReturnsCorrectValue() {
        String actual = bun.getName();
        assertEquals("Ошибка в имени булочки", TEST_NAME, actual);
    }

    @Test
    public void getPriceReturnsCorrectValue() {
        float actual = bun.getPrice();
        assertEquals("Ошибка в цене булочки", TEST_PRICE, actual, ZERO);
    }


}