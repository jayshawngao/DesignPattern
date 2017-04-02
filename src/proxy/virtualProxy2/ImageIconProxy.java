package proxy.virtualProxy2;

import java.awt.Component;
import java.awt.Graphics;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageIconProxy implements Icon {
	String url;
	ImageIcon imageIcon;
	Thread retreive;
	
	public ImageIconProxy(String url){
		this.url = url;
	}
	

	
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y){
		if(imageIcon!=null){
			imageIcon.paintIcon(c, g, x, y);
		}else{
			g.drawString("Loading CD cover, please wait...", x+300, y+200);
			retreive = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						imageIcon = new ImageIcon(new URL(url));
						c.repaint();
					} catch (MalformedURLException e) {
						e.printStackTrace();
					}
				}
			});
			retreive.run();
		}
	}

	@Override
	public int getIconWidth() {
		if(imageIcon==null) return 800;
		else return imageIcon.getIconWidth();
	}

	@Override
	public int getIconHeight() {
		if(imageIcon==null) return 600;
		else return imageIcon.getIconHeight();
	}

}
