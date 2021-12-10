package panel;

import java.awt.*;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SpendPanel extends JPanel{
	public static SpendPanel instance = new SpendPanel();

	public JLabel monthSpend1 = new JLabel("本月消费");
	public JLabel todaySpend1 = new JLabel("今日消费");
	public JLabel avgSpendPerDay1 = new JLabel("日均消费");
	public JLabel MonthLeft1 = new JLabel("本月剩余");
	public JLabel dayAvgAvailable1 = new JLabel("日均可用");
	public JLabel monthLeftDay1 = new JLabel("距离月末");
	
	public JLabel monthSpend2 = new JLabel("$300");
	public JLabel todaySpend2 = new JLabel("$25");
	public JLabel avgSpendPerDay2 = new JLabel("$120");
	public JLabel monthAvailable2 = new JLabel("$2084");
	public JLabel dayAvgAvailable2 = new JLabel("$389");
	public JLabel monthLeftDay2 = new JLabel("15 days");
	
	
	private SpendPanel() {
		this.setLayout(new BorderLayout());
		this.add(center(), BorderLayout.CENTER);
		this.add(South(), BorderLayout.SOUTH);
		
	}
	
	private JPanel center() {
		return new JPanel();
	}
	
	private JPanel South() {
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(2, 4));
		
		southPanel.add(avgSpendPerDay1);
		southPanel.add(MonthLeft1);
		southPanel.add(dayAvgAvailable1);
		southPanel.add(monthLeftDay1);
		southPanel.add(avgSpendPerDay2);
		southPanel.add(monthAvailable2);
		southPanel.add(dayAvgAvailable2);
		southPanel.add(monthLeftDay2);
		return southPanel;
	}

}
