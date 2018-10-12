package eventListener;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class EventListenerDemo2 {
	private static JPanel panel;
	private static JFrame frame;
	private JButton btn1;
	private JButton btn2;
	
	private class Btn1Handdle implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frame, "按钮1被点击");
		}
	};
	
	private class Btn2Handdle implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frame, "按钮2被点击");
		}
	}
	
	
	public EventListenerDemo2() {
		panel = new JPanel();
		
		btn1 = new JButton("btn1");
		btn2 = new JButton("btn2");
		
		btn1.addActionListener(new Btn1Handdle());
		btn2.addActionListener(new Btn2Handdle());
		
		panel.add(btn1);
		panel.add(btn2);
	}
	
	public static void main(String[] args) {
		EventListenerDemo2 demo = new EventListenerDemo2();
		
		frame = new JFrame("第三种按钮处理事件");
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
