package jframeDemo;
import javax.swing.JFrame;

public class JFrameDemo {

	public static void main(String[] args) {
		JFrame win1 = new JFrame();
		JFrame win2 = new JFrame("my window");
		win1.setBounds(0, 0, 200, 300);
		win2.setBounds(100, 0, 350, 300);
		win1.setVisible(true);
		win1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win2.setVisible(true);
		win2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
