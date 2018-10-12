package button;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ButtonFrame extends JFrame implements ActionListener{
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	private JButton yellowButton;
	private JButton blueButton;
	private JButton redButton;
	
	public ButtonFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		yellowButton = new JButton("Yellow");
		blueButton = new JButton("Blue");
		redButton = new JButton("Red");
		
		buttonPanel = new JPanel();
		
		buttonPanel.add(redButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(yellowButton);
		
		add(buttonPanel);
		
		yellowButton.addActionListener(this);
		blueButton.addActionListener(this);
		redButton.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if(source == yellowButton) buttonPanel.setBackground(Color.YELLOW);
		else if(source == blueButton) buttonPanel.setBackground(Color.BLUE);
		else if(source == redButton) buttonPanel.setBackground(Color.RED);
	}

//	private class ColorAction implements ActionListener {
//
//		private Color backgroundColor;
//		
//		public ColorAction(Color c) {
//			backgroundColor = c;
//		}
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			buttonPanel.setBackground(backgroundColor);
//		}
//
//	}
}
