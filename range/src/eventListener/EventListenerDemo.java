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
				JOptionPane.showMessageDialog(frame, "��ť1�����");
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "��ť2�����");
			}
		});
		
		panel.add(btn1);
		panel.add(btn2);
	}
	
	public static void main(String[] args) {
		EventListenerDemo demo = new EventListenerDemo();
		
		frame = new JFrame("�����¼��ĵڶ��ַ���");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
