package eventListener;
import java.awt.event.*;
import javax.swing.*;
public class EventListenerDemo {
	private static JFrame frame;
	private static JPanel panel;
	private JButton btn1;
	private JButton btn2;
	public EventListenerDemo(){
		panel = new JPanel();
		
		btn1 = new JButton("btn1");
		btn2 = new JButton("btn2");
		
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "按钮1被点击");
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "按钮2被点击");
			}
		});
		
		panel.add(btn1);
		panel.add(btn2);
	}
	
	public static void main(String[] args) {
		EventListenerDemo demo = new EventListenerDemo();
		
		frame = new JFrame("处理事件的第二种方法");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
