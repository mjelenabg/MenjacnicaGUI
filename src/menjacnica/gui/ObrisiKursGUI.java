package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Toolkit;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblifra;
	private JLabel lblNaziv;
	private JTextField textField;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraeniNaziv;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JCheckBox chckbxZaistaObriiKurs;
	private JButton btnObrii;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObrisiKursGUI.class.getResource("/icons/074966-ultra-glossy-silver-button-icon-alphanumeric-dollar-sign.png")));
		setResizable(false);
		setTitle("Obri\u0161i kurs");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextField());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_2());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraeniNaziv());
		contentPane.add(getTextField_3());
		contentPane.add(getTextField_4());
		contentPane.add(getTextField_5());
		contentPane.add(getChckbxZaistaObriiKurs());
		contentPane.add(getBtnObrii());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblifra() {
		if (lblifra == null) {
			lblifra = new JLabel("\u0160ifra");
			lblifra.setBounds(10, 11, 46, 14);
		}
		return lblifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(237, 11, 46, 14);
		}
		return lblNaziv;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(237, 34, 164, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 65, 92, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(237, 65, 83, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(10, 90, 164, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setBounds(237, 90, 164, 20);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 121, 92, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraeniNaziv() {
		if (lblSkraeniNaziv == null) {
			lblSkraeniNaziv = new JLabel("Skra\u0107eni naziv");
			lblSkraeniNaziv.setBounds(237, 121, 83, 14);
		}
		return lblSkraeniNaziv;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setEditable(false);
			textField_3.setBounds(10, 146, 164, 20);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setEditable(false);
			textField_4.setBounds(237, 146, 164, 20);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	
	
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setBounds(10, 34, 164, 20);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JCheckBox getChckbxZaistaObriiKurs() {
		if (chckbxZaistaObriiKurs == null) {
			chckbxZaistaObriiKurs = new JCheckBox("Zaista obri\u0161i kurs");
			chckbxZaistaObriiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(chckbxZaistaObriiKurs.isSelected()){
						btnObrii.setEnabled(true);
						textField.setEditable(true);
						textField_1.setEditable(true);
						textField_2.setEditable(true);
						textField_3.setEditable(true);
						textField_4.setEditable(true);
						textField_5.setEditable(true);
						}
					else {
						btnObrii.setEnabled(false);
						textField.setEditable(false);
						textField_1.setEditable(false);
						textField_2.setEditable(false);
						textField_3.setEditable(false);
						textField_4.setEditable(false);
						textField_5.setEditable(false);
						}
					}
			});
			chckbxZaistaObriiKurs.setBounds(10, 190, 164, 23);
		}
		return chckbxZaistaObriiKurs;
	}
	private JButton getBtnObrii() {
		if (btnObrii == null) {
			btnObrii = new JButton("Obri\u0161i");
			btnObrii.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s="Šifra: "+textField_5.getText()+", Naziv: "+textField.getText()+", Prodajni kurs: "+textField_1.getText()+", Kupovni kurs: "+textField_2.getText()+", Srednji kurs: "+textField_3.getText()+", Skraæeni naziv: "+textField_4.getText();
					MenjacnicaGUI.dodajKurs(s);
					dispose();
				}
			});
			btnObrii.setEnabled(false);
			btnObrii.setBounds(10, 238, 164, 23);
		}
		return btnObrii;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(237, 238, 164, 23);
		}
		return btnOdustani;
	}
}

