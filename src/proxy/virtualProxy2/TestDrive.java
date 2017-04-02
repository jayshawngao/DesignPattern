package proxy.virtualProxy2;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TestDrive {
	JFrame frame;
	JMenuBar menuBar;
	JMenu menu;
	ImageComponent imageComponent;
	public static void main(String[] args) {
		new TestDrive();
	}
	public TestDrive() {
		frame = new JFrame("CD cover viewer");
		menuBar = new JMenuBar();
		menu = new JMenu("Favorite CDs");
		frame.setJMenuBar(menuBar);

		HashMap<String, String> cds = new HashMap<String, String>();
		cds.put("Jay", "http://img15.3lian.com/2015/h1/59/d/118.jpg");
		cds.put("∆ﬂ¿Ôœ„", "http://img15.3lian.com/2015/h1/59/d/122.jpg");
		Set<String> names = cds.keySet();
		for(String s: names){
			JMenuItem menuItem = new JMenuItem(s);
			menu.add(menuItem);
			menuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					imageComponent.setIcon(new ImageIconProxy(cds.get(s)));
					frame.repaint();
				}
			});
		}
		JButton button = new JButton("Home");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				imageComponent.setIcon(new ImageIconProxy("http://imgsrc.baidu.com/baike/pic/item/78310a55b319ebc410d913d68726cffc1f1716df.jpg"));
				frame.repaint();
			}
		});
		menuBar.add(button);
		menuBar.add(menu);
		imageComponent = new ImageComponent(new ImageIconProxy("http://imgsrc.baidu.com/baike/pic/item/78310a55b319ebc410d913d68726cffc1f1716df.jpg"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(imageComponent);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
}
