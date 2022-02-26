package baocaojava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import controller.c_login;
import model.m_login;

import javax.swing.JTextField;
import Connectsql.connectionft;

public class trangchu extends JFrame {

	private JPanel bgindex;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JLabel lblclock;

	
	private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public trangchu(m_login day) {
        initComponents();
        //
        this.setTitle("Quản Lý Điểm Sinh Viên");
        //
        try {
            con = connectionft.getConnection();
        } catch (Exception e) {
        }
        //
        this.setLocationRelativeTo(null);
      
    }

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trangchu frame = new trangchu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void clock()
	{
		Thread clock= new Thread() 
		{
			public void run()
			{
				try {
					Calendar cal= new GregorianCalendar (); 
					int day=cal.get(Calendar.DAY_OF_MONTH);
					int month=cal.get(Calendar.MONTH);
					int year=cal.get(Calendar.YEAR);
					
					int second=cal.get(Calendar.SECOND);
					int minute=cal.get(Calendar.MINUTE);
					int hour=cal.get(Calendar.HOUR);
					
					lblclock.setText("Time   " +hour+":"+minute+":"+second+"   Date"+year+"/"+month+"/"+day);
					sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		clock.start();	
	}
	/**
	 * Create the frame.
	 */
	public trangchu() {
		setTitle("DTravel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1281, 511);
		bgindex = new JPanel();
		bgindex.setBackground(new Color(204, 153, 51));
		bgindex.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(bgindex);
		bgindex.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		
		Image img = new ImageIcon (this.getClass().getResource("/1.png")).getImage();
		lblNewLabel . setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, -163, 699, 802);
		bgindex.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("DS Chuy\u00EAn Bay");
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setBounds(725, 64, 190, 33);
		bgindex.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DS \u0110\u1EB7t Ph\u00F2ng");
		btnNewButton_1.setBackground(new Color(255, 255, 204));
		btnNewButton_1.setBounds(725, 141, 190, 33);
		bgindex.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Kh\u00E1ch H\u00E0ng DAir");
		btnNewButton_2.setBackground(new Color(255, 255, 204));
		btnNewButton_2.setBounds(725, 214, 190, 33);
		bgindex.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Kh\u00E1ch \u0110\u1EB7t Tour");
		btnNewButton_3.setBackground(new Color(255, 255, 204));
		btnNewButton_3.setBounds(1024, 64, 190, 33);
		bgindex.add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("NEW BOOKING");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setBounds(725, 308, 119, 13);
		bgindex.add(lblNewLabel_5);
		
		table = new JTable();
		table.setBounds(69, 414, 1, 1);
		bgindex.add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table_1.setBackground(new Color(204, 204, 204));
		table_1.setBounds(697, 342, 570, 199);
		bgindex.add(table_1);
		
		table_2 = new JTable();
		table_2.setBounds(69, 453, 520, -67);
		bgindex.add(table_2);
		
		JList list = new JList();
		list.setBounds(437, 445, -367, -67);
		bgindex.add(list);
		
		JButton btnNewButton_4 = new JButton("T\u00ECm Ki\u1EBFm Kh\u00E1ch H\u00E0ng");
		btnNewButton_4.setBackground(new Color(255, 255, 204));
		btnNewButton_4.setBounds(1024, 141, 190, 33);
		bgindex.add(btnNewButton_4);
		
		JLabel lblNewLabel_6 = new JLabel("DTravel Manage");
		lblNewLabel_6.setBackground(Color.GRAY);
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(882, 10, 228, 27);
		bgindex.add(lblNewLabel_6);
		
		JLabel lblclock = new JLabel("TIME");
		lblclock.setBackground(Color.RED);
		lblclock.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblclock.setBounds(1025, 202, 190, 85);
		bgindex.add(lblclock);
		
		JButton btnNewButton_5 = new JButton("LOGOUT");
		btnNewButton_5.setBackground(new Color(255, 255, 204));
		btnNewButton_5.setBounds(1120, 10, 104, 21);
		bgindex.add(btnNewButton_5);
		
		}
	
}
