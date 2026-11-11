
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.*; 


public class Game  extends JPanel implements Runnable, KeyListener{

	
	private BufferedImage back; 
	private int key; 
	private char screen;
	private ImageIcon background;
	private ImageIcon lose;
	private ImageIcon win;
	private Font hkModularFont;



	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		key =-1; 
		screen = 'S';//start sreen
		background = new ImageIcon("spacebackground.png");
		lose = new ImageIcon("losescreen.png");
		win = new ImageIcon("winscreen.png");
		Font hkModularFontRaw = null;
		hkModularFont = hkModularFontRaw.deriveFont(Font.PLAIN, 24);
		
	
	}

	
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	



	public void screen(Graphics g2d) {
		switch(screen) {
			case 'S':
				g2d.drawImage(background.getImage(), 0, 0, null);
				g2d.setFont(hkModularFont);
				break;

			case 'G':

				break;

			case 'L':
				g2d.drawImage(lose.getImage(), 0, 0, null);
				break;

			case 'W':
				g2d.drawImage(win.getImage(), 0, 0, null);
				break;
		}
	}
	
	

	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
		
		g2d.setFont( new Font("Broadway", Font.BOLD, 50));
		
		g2d.drawString("key " + key, 340, 100);
		
	
		twoDgraph.drawImage(back, null, 0, 0);

	}

	



	//DO NOT DELETE
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




//DO NOT DELETE
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		
		
		
	
	}


	//DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {
		
		
		
		
	}
	
	
	

	
}
