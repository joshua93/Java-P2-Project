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

//Hello Jeffrey!! Eres un mamin.
//Tu eres el mamin JoSHUA

//Jeffrey Branch
public class P2GUIS extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P2GUIS frame = new P2GUIS();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public P2GUIS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//Torres*****************************************************************************************

		JLabel torreBlanco1 = new JLabel("");
		torreBlanco1.setBounds(241, 467, 50, 50);
		torreBlanco1.setIcon(new ImageIcon(getClass().getResource("TorreBlanco.png")));
		contentPane.add(torreBlanco1);

		JLabel torreBlanco2 = new JLabel("");
		torreBlanco2.setBounds(610, 467, 50, 50);
		torreBlanco2.setIcon(new ImageIcon(getClass().getResource("TorreBlanco.png")));
		contentPane.add(torreBlanco2);

		JLabel torreNegro1 = new JLabel("");
		torreNegro1.setBounds(610, 100, 50, 50);
		torreNegro1.setIcon(new ImageIcon(getClass().getResource("TorreNegro.png")));
		contentPane.add(torreNegro1);

		JLabel torreNegro2 = new JLabel("");
		torreNegro2.setBounds(241, 100, 50, 50);
		torreNegro2.setIcon(new ImageIcon(getClass().getResource("TorreNegro.png")));
		contentPane.add(torreNegro2);

		//Caballos***************************************************************************************
		JLabel caballoBlanco1 = new JLabel("");
		caballoBlanco1.setBounds(297, 467, 50, 50);
		caballoBlanco1.setIcon(new ImageIcon(getClass().getResource("CaballoBlanco.png")));
		contentPane.add(caballoBlanco1);

		JLabel caballoBlanco2 = new JLabel("");
		caballoBlanco2.setBounds(557, 467, 50, 50);
		caballoBlanco2.setIcon(new ImageIcon(getClass().getResource("CaballoBlanco.png")));
		contentPane.add(caballoBlanco2);

		JLabel caballoNegro1 = new JLabel("");
		caballoNegro1.setBounds(297, 100, 50, 50);
		caballoNegro1.setIcon(new ImageIcon(getClass().getResource("CaballoNegro.png")));
		contentPane.add(caballoNegro1);

		JLabel caballoNegro2 = new JLabel("");
		caballoNegro2.setBounds(557, 100, 50, 50);
		caballoNegro2.setIcon(new ImageIcon(getClass().getResource("CaballoNegro.png")));
		contentPane.add(caballoNegro2);

		//Alfiles*****************************************************************************************
		JLabel alfilBlanco1 = new JLabel("");
		alfilBlanco1.setBounds(348, 467, 50, 50);
		alfilBlanco1.setIcon(new ImageIcon(getClass().getResource("AlfilBlanco.png")));
		contentPane.add(alfilBlanco1);

		JLabel alfilBlanco2 = new JLabel("");
		alfilBlanco2.setBounds(504, 467, 50, 50);
		alfilBlanco2.setIcon(new ImageIcon(getClass().getResource("AlfilBlanco.png")));
		contentPane.add(alfilBlanco2);

		JLabel alfilNegro1 = new JLabel("");
		alfilNegro1.setBounds(348, 100, 50, 50);
		alfilNegro1.setIcon(new ImageIcon(getClass().getResource("AlfilNegro.png")));
		contentPane.add(alfilNegro1);

		JLabel alfilNegro2 = new JLabel("");
		alfilNegro2.setBounds(504, 100, 50, 50);
		alfilNegro2.setIcon(new ImageIcon(getClass().getResource("AlfilNegro.png")));
		contentPane.add(alfilNegro2);

		//Reinas*******************************************************************************************
		JLabel reinaBlanco = new JLabel("");
		reinaBlanco.setBounds(400, 467, 50, 50);
		reinaBlanco.setIcon(new ImageIcon(getClass().getResource("ReinaBlanco.png")));
		contentPane.add(reinaBlanco);

		JLabel reinaNegro = new JLabel("");
		reinaNegro.setBounds(400, 100, 50, 50);
		reinaNegro.setIcon(new ImageIcon(getClass().getResource("ReinaNegro.png")));
		contentPane.add(reinaNegro);


		//Reyes*******************************************************************************************
		JLabel reyBlanco = new JLabel("");
		reyBlanco.setBounds(452, 467, 50, 50);
		reyBlanco.setIcon(new ImageIcon(getClass().getResource("ReyBlanco.png")));
		contentPane.add(reyBlanco);

		JLabel reyNegro = new JLabel("");
		reyNegro.setBounds(452, 100, 50, 50);
		reyNegro.setIcon(new ImageIcon(getClass().getResource("ReyNegro.png")));
		contentPane.add(reyNegro);


		//Peones Blancos**********************************************************************************
		JLabel peonBlanco1 = new JLabel("");
		peonBlanco1.setBounds(241, 412, 50, 50);
		peonBlanco1.setIcon(new ImageIcon(getClass().getResource("peonBlanco.png")));
		contentPane.add(peonBlanco1);

		JLabel peonBlanco8 = new JLabel("");
		peonBlanco8.setBounds(610, 412, 50, 50);
		peonBlanco8.setIcon(new ImageIcon(getClass().getResource("peonBlanco.png")));
		contentPane.add(peonBlanco8);

		JLabel peonBlanco2 = new JLabel("");
		peonBlanco2.setBounds(297, 412, 50, 50);
		peonBlanco2.setIcon(new ImageIcon(getClass().getResource("peonBlanco.png")));
		contentPane.add(peonBlanco2);

		JLabel peonBlanco7 = new JLabel("");
		peonBlanco7.setBounds(557, 412, 50, 50);
		peonBlanco7.setIcon(new ImageIcon(getClass().getResource("peonBlanco.png")));
		contentPane.add(peonBlanco7);

		JLabel peonBlanco3 = new JLabel("");
		peonBlanco3.setBounds(348, 412, 50, 50);
		peonBlanco3.setIcon(new ImageIcon(getClass().getResource("peonBlanco.png")));
		contentPane.add(peonBlanco3);

		JLabel peonBlanco6 = new JLabel("");
		peonBlanco6.setBounds(504, 412, 50, 50);
		peonBlanco6.setIcon(new ImageIcon(getClass().getResource("peonBlanco.png")));
		contentPane.add(peonBlanco6);

		JLabel peonBlanco4 = new JLabel("");
		peonBlanco4.setBounds(400, 412, 50, 50);
		peonBlanco4.setIcon(new ImageIcon(getClass().getResource("peonBlanco.png")));
		contentPane.add(peonBlanco4);

		JLabel peonBlanco5 = new JLabel("");
		peonBlanco5.setBounds(452, 412, 50, 50);
		peonBlanco5.setIcon(new ImageIcon(getClass().getResource("peonBlanco.png")));
		contentPane.add(peonBlanco5);



		//Peones Negros**********************************************************************************
		JLabel peonNegro1 = new JLabel("");
		peonNegro1.setBounds(241, 154, 50, 50);
		peonNegro1.setIcon(new ImageIcon(getClass().getResource("peonNegro.png")));
		contentPane.add(peonNegro1);

		JLabel peonNegro8 = new JLabel("");
		peonNegro8.setBounds(610, 154, 50, 50);
		peonNegro8.setIcon(new ImageIcon(getClass().getResource("peonNegro.png")));
		contentPane.add(peonNegro8);

		JLabel peonNegro2 = new JLabel("");
		peonNegro2.setBounds(297, 154, 50, 50);
		peonNegro2.setIcon(new ImageIcon(getClass().getResource("peonNegro.png")));
		contentPane.add(peonNegro2);

		JLabel peonNegro7 = new JLabel("");
		peonNegro7.setBounds(557, 154, 50, 50);
		peonNegro7.setIcon(new ImageIcon(getClass().getResource("peonNegro.png")));
		contentPane.add(peonNegro7);

		JLabel peonNegro3 = new JLabel("");
		peonNegro3.setBounds(348, 154, 50, 50);
		peonNegro3.setIcon(new ImageIcon(getClass().getResource("peonNegro.png")));
		contentPane.add(peonNegro3);

		JLabel peonNegro6 = new JLabel("");
		peonNegro6.setBounds(504, 154, 50, 50);
		peonNegro6.setIcon(new ImageIcon(getClass().getResource("peonNegro.png")));
		contentPane.add(peonNegro6);

		JLabel peonNegro4 = new JLabel("");
		peonNegro4.setBounds(400, 154, 50, 50);
		peonNegro4.setIcon(new ImageIcon(getClass().getResource("peonNegro.png")));
		contentPane.add(peonNegro4);

		JLabel peonNegro5 = new JLabel("");
		peonNegro5.setBounds(452, 154, 50, 50);
		peonNegro5.setIcon(new ImageIcon(getClass().getResource("peonNegro.png")));
		contentPane.add(peonNegro5);





		JLabel tablero = new JLabel("");
		tablero.setBounds(196, 55, 529, 510);
		tablero.setIcon(new ImageIcon(getClass().getResource("tablero.png")));
		contentPane.add(tablero);






	}
}
