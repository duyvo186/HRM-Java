package baocaojava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.JobAttributes;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

import controller.c_login;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import model.Delete;
import model.m_login;

@SuppressWarnings("serial")
public class login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField pw;
	private m_login login;
	private c_login control;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
//	 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//	        ttsv sv = new ttsv();
//	        sv.setUser(user.getText());
//	        sv.setPass(pass.getText());
//	        //
//	        login lg = new login();
//	        lg.check_login(sv);
//	        //
//	        switch(sv.getTbdn()){
//	            case "Đăng Nhập Thành Công" :
//	                this.setVisible(false);
//	                break;
//	            case "Đăng Nhập Thất Bại" :
//	                dn.setText(sv.getTbdn());
//	                break;
//	        }
//	    }//GEN-LAST:event_jButton1ActionPerformed
//
//	    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
//	        // TODO add your handling code here:
//	    }//GEN-LAST:event_userActionPerformed
//
//	    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//	        this.setVisible(false);
//	        dangky dk = new dangky();
//	        dk.setVisible(true);
//	    }//GEN-LAST:event_jButton2ActionPerformed
//
//	    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
//
//	    }//GEN-LAST:event_jButton1MouseEntered
//
//	    /**
//	     * @param args the command line arguments
//	     */
//	    public static void main(String args[]) {
//	        /* Set the Nimbus look and feel */
//	        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//	        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//	         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//	         */
//	        try {
//	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//	                if ("Nimbus".equals(info.getName())) {
//	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//	                    break;
//
//	                }
//	            }
//	        } catch (ClassNotFoundException ex) {
//	            java.util.logging.Logger.getLogger(login_view.class
//	                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//	        } catch (InstantiationException ex) {
//	            java.util.logging.Logger.getLogger(login_view.class
//	                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//	        } catch (IllegalAccessException ex) {
//	            java.util.logging.Logger.getLogger(login_view.class
//	                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//	            java.util.logging.Logger.getLogger(login_view.class
//	                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//	        }
//	        //</editor-fold>
//
//	        /* Create and display the form */
//	        java.awt.EventQueue.invokeLater(new Runnable() {
//	            public void run() {
//	                try {
//	                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//	                } catch (ClassNotFoundException ex) {
//	                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
//	                } catch (InstantiationException ex) {
//	                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
//	                } catch (IllegalAccessException ex) {
//	                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
//	                } catch (UnsupportedLookAndFeelException ex) {
//	                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
//	                }
//	                new login_view().setVisible(true);
//	            }
//	        });
//	    }
	public login() {
		
		
		
		setTitle("Form \u0110\u0103ng Nh\u1EADp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 321);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new LineBorder(new Color(255, 255, 204), 3));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		
		username = new JTextField();
		username.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(username.getText().equals("Nhập Tài Khoản"))
				{
					username.setText("");
				}
				else {
					username.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(username.getText().equals(""))
				{
					username.setText("Nhập Tài Khoản");
				}
			}
		});
		username.setBounds(145, 92, 278, 32);
		username.setDropMode(DropMode.INSERT);
		username.setHorizontalAlignment(SwingConstants.LEFT);
		username.setForeground(Color.LIGHT_GRAY);
		username.setText("Nh\u1EADp T\u00E0i Kho\u1EA3n");
		username.setBackground(Color.WHITE);
		contentPane.add(username);
		username.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(20, 77, 85, 47);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(20, 134, 85, 40);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN PAGE");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(226, 10, 142, 47);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblNewLabel_2);
		
		pw = new JPasswordField();
		
		pw.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pw.getText().equals("Nhập Mật Khẩu"))
				{
					pw.setEchoChar('●');
					pw.setText("");
//					pw.setp	
				}
				else {
					pw.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pw.getText().equals(""))
				{
					pw.setText("Nhập Mật Khẩu");
					pw.setEchoChar((char)0);
				}
			}
		});
		pw.setEchoChar((char)0);
		pw.setBounds(145, 146, 278, 28);
		pw.setText("Nh\u1EADp M\u1EADt Kh\u1EA9u");
		pw.setForeground(Color.LIGHT_GRAY);
		contentPane.add(pw);
		pw.setColumns(10);
		
		
		JButton btnNewButton = new JButton("\u0110\u0103ng K\u00FD");
		btnNewButton.setBounds(145, 209, 93, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(btnNewButton);
		
		JButton DN = new JButton("\u0110\u0103ng Nh\u1EADp");
		DN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginaccount();
				
			}
		});
		DN.setBounds(320, 209, 100, 21);
//		private void (java.awt.event.ActionEvent evt) {
//		ttsv sv = new ttsv();
//        sv.setUser(user.getText());
//        sv.setPass(pass.getText());
//        //
//        login lg = new login();
//        lg.check_login(sv);
//        //
//        switch(sv.getTbdn()){
//            case "Đăng Nhập Thành Công" :
//                this.setVisible(false);
//                break;
//            case "Đăng Nhập Thất Bại" :
//                dn.setText(sv.getTbdn());
//                break;
//        }
		
		
		DN.setForeground(new Color(0, 0, 0));
		DN.setBackground(new Color(255, 255, 255));
		DN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(DN);
		
		JLabel lblNewLabel_3 = new JLabel("DLTRAVEL");
		lblNewLabel_3.setBounds(9, 12, 148, 58);
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Viner Hand ITC", Font.BOLD, 12));

		Image img = new ImageIcon (this.getClass().getResource("/airplane.png")).getImage();
		lblNewLabel_3 . setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\airplane (2).png"));
		contentPane.add(lblNewLabel_3);
		
		JLabel BTNX = new JLabel("X");
		BTNX.setBounds(525, 0, 16, 27);
		BTNX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Thoát Không","Confirmation" , JOptionPane.YES_NO_OPTION) == 0)
	
				{
					login.this.dispose();
				}
		
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				BTNX.setForeground(Color.red);
			}
			public void mouseExited(MouseEvent e) {
				BTNX.setForeground(Color.black);
			}
		});
		BTNX.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(BTNX);
		 
		
	}
	
	public void loginaccount()
	{

		login = new m_login();
		control = new c_login();
		login.setusername(this.username.getText());
		login.setpw(this.pw.getText());
		int value = control.loginaccount(login);
	}
//	**
//	 * Create the frame.
//	 */
	
	
//	 private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//		 
//
//		 JLabel dn = new javax.swing.JLabel();
//		 dn.setForeground(new java.awt.Color(255, 0, 0));
//	        dn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//	        dn.setToolTipText("");
//		 m_login sv = new m_login();
//		 
//	        sv.setusername(username.getText());
//	        sv.setpw(pw.getText());
//	        //
//	        c_login lg = new c_login();
//	        lg.check_login(sv);
//	        //
//	        switch(sv.getThongbao()){
//	            case "Đăng Nhập Thành Công" :
//	                this.setVisible(false);
//	                break;
//	            case "Đăng Nhập Thất Bại" :
//	            	dn.setText(sv.getThongbao());
//	                break;
//	        }
	       
	    //GEN-LAST:event_jButton1ActionPerformed

//	    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
//	        // TODO add your handling code here:
//	    }//GEN-LAST:event_userActionPerformed
//
//	    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//	        this.setVisible(false);
//	        dangky dk = new dangky();
//	        dk.setVisible(true);
//	    }//GEN-LAST:event_jButton2ActionPerformed
//
//	    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
//
//	    }//GEN-LAST:event_jButton1MouseEntered
//
//	    /**
//	     * @param args the command line arguments
//	     */
//	    public static void main(String args[]) {
//	        /* Set the Nimbus look and feel */
//	        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//	        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//	         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//	         */
//	        try {
//	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//	                if ("Nimbus".equals(info.getName())) {
//	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//	                    break;
//
//	                }
//	            }
//	        } catch (ClassNotFoundException ex) {
//	            java.util.logging.Logger.getLogger(login_view.class
//	                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//	        } catch (InstantiationException ex) {
//	            java.util.logging.Logger.getLogger(login_view.class
//	                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//	        } catch (IllegalAccessException ex) {
//	            java.util.logging.Logger.getLogger(login_view.class
//	                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//	            java.util.logging.Logger.getLogger(login_view.class
//	                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//	        }
//	        //</editor-fold>
//
//	        /* Create and display the form */
//	        java.awt.EventQueue.invokeLater(new Runnable() {
//	            public void run() {
//	                try {
//	                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//	                } catch (ClassNotFoundException ex) {
//	                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
//	                } catch (InstantiationException ex) {
//	                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
//	                } catch (IllegalAccessException ex) {
//	                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
//	                } catch (UnsupportedLookAndFeelException ex) {
//	                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
//	                }
//	                new login_view().setVisible(true);
//	            }
//	        });
//	    }
//}
}
