package panel;

import java.awt.*;
import javax.swing.*;

import listener.SpendPanelListener;
import listener.ToolBarListener;
import util.CenterPanel;

public class MainPanel extends JPanel{
	
	public static MainPanel instance = new MainPanel();
	
	public JToolBar tb = new JToolBar();
	public JButton spendBtn = new JButton();
	public JButton recordBtn = new JButton();
	public JButton categoryBtn = new JButton();
	public JButton reportBtn = new JButton();
	public JButton settingBtn = new JButton();
	public JButton backupBtn = new JButton();
	public JButton recoverBtn = new JButton();
	
	public CenterPanel workingPanel;
	
	public MainPanel() {
		spendBtn = new JButton("消费一览");
		recordBtn = new JButton("记一笔");
		categoryBtn = new JButton("消费分类");
		reportBtn = new JButton("月消费报表");
		settingBtn = new JButton("设置");
		backupBtn = new JButton("备份");
		recoverBtn = new JButton("恢复");
		
		tb.add(spendBtn);
		tb.add(recordBtn);
		tb.add(categoryBtn);
		tb.add(reportBtn);
		tb.add(settingBtn);
		tb.add(backupBtn);
		tb.add(recoverBtn);
		
		workingPanel = new CenterPanel(0.8);
		
		setLayout(new BorderLayout());
		add(tb, BorderLayout.NORTH);
		add(workingPanel, BorderLayout.CENTER);
		
		addListener();
	}

	private void addListener() {
		ToolBarListener listener = new ToolBarListener();
		
		spendBtn.addActionListener(listener);
		recordBtn.addActionListener(listener);
		categoryBtn.addActionListener(listener);
		reportBtn.addActionListener(listener);
		settingBtn.addActionListener(listener);
		backupBtn.addActionListener(listener);
		recoverBtn.addActionListener(listener);
	}

}