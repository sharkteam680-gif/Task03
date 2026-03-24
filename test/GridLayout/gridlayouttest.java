package GridLayout;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class gridlayouttest {

    gridlayout gl;

    @BeforeEach
    void setUp() {
        gl = new gridlayout();
    }

    @AfterEach
    void tearDown() {
        if (gl != null && gl.BorderFrame != null) {
            gl.BorderFrame.dispose();
        }
    }

    @Test
    void createjframeborderlayout() {
        // Simple 4 assertions
        assertNotNull(gl.BorderFrame); // Frame exists
        assertEquals("Layout", gl.BorderFrame.getTitle());
        assertEquals(JFrame.EXIT_ON_CLOSE, gl.BorderFrame.getDefaultCloseOperation());
        assertInstanceOf(GridLayout.class, gl.BorderFrame.getContentPane().getLayout());
    }

    @Test
    void createjpanelone() {
        JPanel panel = gl.createjpanelone();
        assertNotNull(panel);
        assertEquals(Color.cyan, panel.getBackground());
        assertInstanceOf(TitledBorder.class, panel.getBorder());
        assertEquals("JPanelOne", ((TitledBorder) panel.getBorder()).getTitle());
    }

    @Test
    void createjpaneltwo() {
        JPanel panel = gl.createjpaneltwo();
        assertNotNull(panel);
        assertEquals(Color.darkGray, panel.getBackground());
        assertInstanceOf(TitledBorder.class, panel.getBorder());
        assertEquals("JPanelTwo", ((TitledBorder) panel.getBorder()).getTitle());
    }

    @Test
    void createjpanelthree() {
        JPanel panel = gl.createjpanelthree();
        assertNotNull(panel);
        assertEquals(Color.gray, panel.getBackground());
        assertInstanceOf(TitledBorder.class, panel.getBorder());
        assertEquals("JPanelThree", ((TitledBorder) panel.getBorder()).getTitle());
    }
}