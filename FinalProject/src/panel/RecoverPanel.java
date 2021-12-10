package panel;

import javax.swing.*;

public class RecoverPanel extends JPanel{
	public static RecoverPanel instance = new RecoverPanel();
	
	JButton recoverBtn = new JButton("恢复");
	
	public RecoverPanel() {
		this.add(recoverBtn);
	}
}