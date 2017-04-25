/*
**
file: ABox.java
**
purpose: A component that paints a red box.
*/
import java.awt.*;
import javax.swing.*;

public class ABox extends JComponent {

	public void paintComponent(Graphics g) {
	Graphics2D g2 = (Graphics2D) g.create();
	g2.setColor(Color.RED);
	g2.fillRect(30, 30, 100, 100);
	}
}
