package baocaojava;

import java.awt.BorderLayout;
import controller.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Delete;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DSCB extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField MA;
	private Delete delete;
	private c_login control;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DSCB frame = new DSCB();
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
	
	public DSCB() {
		setTitle("DANH SACH CHUYEN BAY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 578);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 313, 818, 224);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Xoa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(634, 127, 132, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Them ");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1.setBounds(345, 127, 132, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sua");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_2.setBounds(73, 127, 132, 33);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Tim Kiem");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(208, 36, 81, 33);
		contentPane.add(lblNewLabel);
		
		MA = new JTextField();
		MA.setBounds(278, 36, 235, 33);
		contentPane.add(MA);
		MA.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Danh Sach Chuyen Bay");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(296, 256, 203, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(544, 27, 24, 73);
//		Image img = new ImageIcon (this.getClass().getResource("/tkday.png")).getImage();
//		lblNewLabel_2 . setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel_2);
		
		JButton button = new JButton("");
		button.setForeground(Color.WHITE);
		button.setBackground(Color.WHITE);
		button.setBounds(537, 36, 50, 33);
		Image img = new ImageIcon (this.getClass().getResource("/tkday.png")).getImage();
		button . setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\tkday.png"));
		contentPane.add(button);
	}
	
	public void Delete()
	{
		delete = new Delete();
		control = new c_login();
		delete.setMA(this.MA.getText());
		int value = control.Delete(delete);
		if(value != 0)
		{
			JOptionPane.showMessageDialog(null,"Thực hiện thành công");
//		}
		}
	}
	
}
