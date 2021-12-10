package panel;

import java.awt.*;

import javax.swing.*;

public class RecordPanel extends JPanel{
	
	public static RecordPanel instance = new RecordPanel();
	
	JLabel spend = new JLabel("花费");
	JLabel category = new JLabel("分类");
	JLabel comment = new JLabel("备注");
	JLabel date = new JLabel("日期");
	
	public JTextField spendText = new JTextField("0");
	public JComboBox<String> categoryCb = new JComboBox<>();
	public JTextField commentText = new JTextField();
//	public DatePicker datepick = new JXDatePicker(new Date());
	
	
	public JTextField tfSpend = new JTextField("0");
	
	JButton submitBtn = new JButton("记一笔");
	
	public RecordPanel() {
		
		
		JPanel northPanel = new JPanel(new GridLayout(4, 2, 40, 40));
		northPanel.add(spend);
		northPanel.add(spendText);
		northPanel.add(category);
		northPanel.add(categoryCb);
		
		northPanel.add(comment);
		northPanel.add(commentText);
		northPanel.add(date);
//		northPanel.add(datepick);
		
		JPanel submitPanel = new JPanel();
		submitPanel.add(submitBtn);
		
		this.setLayout(new BorderLayout());
		this.add(northPanel, BorderLayout.NORTH);
		this.add(submitPanel, BorderLayout.CENTER);
	}


}
