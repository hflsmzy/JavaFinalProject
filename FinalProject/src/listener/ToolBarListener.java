package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import panel.*;

public class ToolBarListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		MainPanel p = MainPanel.instance;
        JButton b = (JButton) e.getSource();
        if (b == p.reportBtn)
            p.workingPanel.show(ReportPanel.instance);
        if (b == p.categoryBtn)
            p.workingPanel.show(CategoryPanel.instance);
        if (b == p.spendBtn)
            p.workingPanel.show(SpendPanel.instance);
        if (b == p.recordBtn)
            p.workingPanel.show(RecordPanel.instance);
        if (b == p.settingBtn)
            p.workingPanel.show(SettingPanel.instance);
        if (b == p.backupBtn)
            p.workingPanel.show(BackupPanel.instance);
        if (b == p.recoverBtn)
            p.workingPanel.show(RecoverPanel.instance);
	}

}
