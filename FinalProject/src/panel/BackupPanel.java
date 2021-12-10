package panel;

import javax.swing.*;

public class BackupPanel extends JPanel{
	public static BackupPanel instance = new BackupPanel();
	
	JButton backUpBtn = new JButton("备份");
	
	public BackupPanel() {
		this.add(backUpBtn);
	}
}
