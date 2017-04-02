package proxy.virtualProxy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ImageProxyTestDrive {
	ImageComponent imageComponent;
	JFrame frame = new JFrame("CD Cover Viewer");
	JMenuBar menuBar;
	JMenu menu;
	HashMap<String, String> cds = new HashMap<String, String>();
	public static void main(String[] args) throws Exception {
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}
	public ImageProxyTestDrive() throws Exception {
		cds.put("Jay", "http://img15.3lian.com/2015/h1/59/d/118.jpg");
		cds.put("∆ﬂ¿Ôœ„", "http://img15.3lian.com/2015/h1/59/d/122.jpg");
		URL initialURL = new URL(cds.get("Jay"));
		menuBar = new JMenuBar();
		menu = new JMenu("Favorite CDs");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		Set<String> s = cds.keySet();
		for(String name: s) {
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem);
			menuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					imageComponent.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
					frame.repaint();
				}

			});
			
		}
		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
		
		
	}
	private URL getCDUrl(String name) {
		try {
			return new URL(cds.get(name));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
