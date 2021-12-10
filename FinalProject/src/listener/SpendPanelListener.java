package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import panel.SpendPanel;

public class SpendPanelListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		SpendPanel.instance.avgSpendPerDay1.setText("xxx");
	}
	
}
