package test;
import javax.swing.*;
import java.io.IOException;

public class JFileChooserTest {
	public static void main(String[] args) throws IOException {
		JFileChooserDemo application = new JFileChooserDemo();
		application.setSize(400, 800);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setVisible(true);
	}
}
