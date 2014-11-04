import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JCheckBoxMenuItem;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;

//Hello Jeffrey!! Eres un mamin.
//Tu eres el mamin JoSHUA

//Jeffrey Branch
public class Welcome extends JFrame {
	public Welcome() {
		getContentPane().setLayout(null);

		JLabel titleLbl = new JLabel("Title");
		titleLbl.setIcon(new ImageIcon(getClass().getResource("chesslogo.png")));
		titleLbl.setBounds(10, 11, 414, 60);
		getContentPane().add(titleLbl);

		JButton startBtn = new JButton("Start!");
		startBtn.setBounds(151, 219, 94, 31);
		getContentPane().add(startBtn);

		JCheckBox chckbxWhite = new JCheckBox("White");
		chckbxWhite.setBounds(10, 178, 97, 23);
		getContentPane().add(chckbxWhite);

		JCheckBox chckbxBlack = new JCheckBox("Black");
		chckbxBlack.setBounds(109, 178, 97, 23);
		getContentPane().add(chckbxBlack);

		JLabel lblChooseOneColor = new JLabel("Choose one color: ");
		lblChooseOneColor.setBackground(Color.WHITE);
		lblChooseOneColor.setForeground(Color.YELLOW);
		lblChooseOneColor.setBounds(10, 148, 105, 23);
		getContentPane().add(lblChooseOneColor);

		JLabel backgroundLbl = new JLabel("New label");
		backgroundLbl.setIcon(new ImageIcon(getClass().getResource("chess cover.png")));
		backgroundLbl.setBounds(0, 0, 434, 261);
		getContentPane().add(backgroundLbl);
	}
}

