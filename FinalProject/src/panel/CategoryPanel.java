package panel;

import java.awt.*;

import javax.swing.*;

public class CategoryPanel extends JPanel{
	public static CategoryPanel instance = new CategoryPanel();
	
	public JButton addBtn = new JButton("Add");
	public JButton editBtn = new JButton("Edit");
	public JButton deleteBtn = new JButton("Delete");
	String columNames[] = new String[] {"分类名称", "消费次数"};
	
	public JTable table = new JTable();
	
	public CategoryPanel() {
		JScrollPane scrollPanel = new JScrollPane(table);
		JPanel southPanel = new JPanel();
		southPanel.add(addBtn);
		southPanel.add(editBtn);
		southPanel.add(deleteBtn);
		
		this.setLayout(new BorderLayout());
		this.add(scrollPanel, BorderLayout.CENTER);
		this.add(southPanel, BorderLayout.SOUTH);
	}
	
}
