import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TitleBar extends JPanel{
	JButton settingButton = new JButton("⚙️ Setting");
	
	TitleBar(){
		this.setPreferredSize(new Dimension(500,80));
		JLabel titleText= new JLabel("FLOWTIME APP");
		titleText.setPreferredSize(new Dimension(300,75));
		titleText.setFont(new Font("Manjari",Font.BOLD, 30));
		titleText.setForeground(Color.white);
		titleText.setHorizontalAlignment(JLabel.CENTER);

		this.add(titleText);
		this.add(settingButton);
		
		settingButton.setBounds(100, 160, 200, 60);
		settingButton.setBackground(new Color(139,156,225));
		settingButton.setForeground(Color.white);
		settingButton.setFocusable(false);
	}
	
	JButton getSettingButton(){
		return settingButton;
	}
}
