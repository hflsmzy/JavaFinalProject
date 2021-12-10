package frame;

import javax.swing.*;

import panel.*;

public class MainFrame extends JFrame{
	public static MainFrame instance = new MainFrame();
	
	private MainFrame() {
		this.setSize(500, 450);
		this.setTitle("Budget book");
		this.setContentPane(MainPanel.instance);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		instance.setVisible(true);
	}

}