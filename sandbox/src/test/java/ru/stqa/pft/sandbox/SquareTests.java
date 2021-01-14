package ru.stqa.pft.sandbox;

import org.junit.Test;
import org.testng.Assert;
import ru.stqa.rft.sandbox.Square;

public class SquareTests {

 @Test
    public void testArea() {
        Square s = new Square(5);
        s.area();
     Assert.assertEquals(s.area(),25.0);
    }
}
