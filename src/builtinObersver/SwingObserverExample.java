package builtinObersver;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame frame;
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	public void go(){
		frame = new JFrame();
		JButton button = new JButton("Shoud i do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setVisible(true);
		frame.setSize(500, 500);
		//frame.pack();
	}
	
	class AngelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Don't do this !");
		}
	}
	
	class DevilListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("come on !");
		}
		
	}
}
