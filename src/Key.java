import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Key extends JFrame {

	private static final long serialVersionUID = 1L;

	public Key() {
		setSize(420, 20);
		setVisible(true);
		this.setTitle("InstantJavaScreen - Press 'enter' to take a screenshot!");
		this.setResizable(false);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				//	System.out.println("[IJS] Took a screenshot!");
				try {

					Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
					Robot robot = new Robot();
					BufferedImage img = robot.createScreenCapture(new Rectangle(size));
					try {
						ImageIO.write(img, "JPG", new File("[IJS] - Screenshot # " + 1 + ".jpg"));

					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} catch (AWTException e1) {
					System.err.println("NOOO! I think.. I think we lost him. :(");
				}

			}
			}
		});
		}
}
