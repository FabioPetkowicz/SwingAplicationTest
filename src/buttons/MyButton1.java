package buttons;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyButton1 {
	JFrame jFrame = new JFrame();
	JPanel jPanel = new JPanel();
	JButton jbutton1 = new JButton("Button 1");
	
	public MyButton1() {
		init();
	}
	
	void init() {
		jbutton1.setSize(100, 50);
		
		jPanel.add(jbutton1);
		jFrame.add(jPanel);
		jFrame.setSize(400, 400);
		jFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyButton1 myButton1 = new MyButton1();
	}

}
