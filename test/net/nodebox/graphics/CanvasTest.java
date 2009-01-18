package net.nodebox.graphics;

import junit.framework.TestCase;

public class CanvasTest extends TestCase {

    public void testCloning() {
        Color backgroundColor = new Color(0.1, 0.2, 0.3);
        Canvas c = new Canvas(200, 300);
        c.setBackground(backgroundColor);
        Canvas c2 = c.clone();
        assertEquals(c, c2);
        assertEquals(200.0, c2.getWidth());
        assertEquals(300.0, c2.getHeight());
        assertEquals(backgroundColor, c.getBackground());
    }

}
