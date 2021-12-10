import java.awt.*;

import javax.swing.*;

public class Budget extends JFrame{

	public Budget() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.LIGHT_GRAY);
		setupPanels(); //Initialization
		setSize(600,350);
		setTitle("Budget");
		setVisible(true);
	}
	
	private void setupPanels() {
		JToolBar tb = new JToolBar();
		
		JButton buttonSpend = new JButton("消费一览");
		buttonSpend.addActionListener((e) -> {
			
		});
		
		JButton buttonRecord = new JButton("记一笔");
		buttonRecord.addActionListener((e) -> {
			
		});
		
		JButton buttonCategory = new JButton("消费分类");
		buttonCategory.addActionListener((e) -> {
			
		});
		
		JButton buttonReport = new JButton("月消费报表");
		buttonReport.addActionListener((e) -> {
			
		});
		
		JButton buttonSetting = new JButton("设置");
		buttonSetting.addActionListener((e) -> {
			
		});
		
		JButton buttonBackup = new JButton("备份");
		buttonBackup.addActionListener((e) -> {
			
		});
		
		JButton buttonRecover = new JButton("恢复");
		buttonRecover.addActionListener((e) -> {
			
		});
		
		
		tb.add(buttonSpend);
		tb.add(buttonRecord);
		tb.add(buttonCategory);
		tb.add(buttonReport);
		tb.add(buttonSetting);
		tb.add(buttonBackup);
		tb.add(buttonRecover);
		
		this.setLayout(new BorderLayout());
		add(tb, BorderLayout.NORTH);
		
	}

	public static void main(String[] args) {
		Budget b = new Budget();
	}

}
