package view;

import javax.swing.*;
import java.awt.*;

public class LogInForm extends JFrame {
	private JLabel lbimageLeft;
	private JLabel lbFamilyPoint;
	private JLabel lbEveryProduct;
	private JLabel lbNiceService;

	private JLabel lbLogin;
	private JLabel lbImageRight;
	private JLabel lbUID;
	private JTextField tfUID;
	private JLabel lbPassword;
	private JPasswordField tfPass;
	private JButton btLogin;
	private JButton btClear;

	public static void main(String[] args) {
		new LogInForm();
	}

	public LogInForm() {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException ex) {
				} catch (InstantiationException ex) {
				} catch (IllegalAccessException ex) {
				} catch (UnsupportedLookAndFeelException ex) {
				}

				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLayout(new BorderLayout());
				frame.add(new FormPane());
				frame.pack();
				frame.setSize(600, 400);
				frame.setLocationRelativeTo(null);
//                frame.setUndecorated(true);
				frame.setVisible(true);
			}

		});
	}

	public class FormPane extends JPanel {

		public FormPane() {
			setLayout(null);
			add(new Left());
			add(new Right());
		}

	}

	public class Left extends JPanel {

		public Left() {
			setLayout(null);
			setBounds(0, 0, 200, 361);
			setBackground(new Color(0, 175, 240));

			lbimageLeft = new JLabel();
			lbimageLeft.setBounds(59, 80, 70, 70);
			ImageIcon image = new ImageIcon("image/sale.jpg");
			Image img = image.getImage();
			Image imgSQL = img.getScaledInstance(lbimageLeft.getWidth(), lbimageLeft.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon SQLIcon = new ImageIcon(imgSQL);
			lbimageLeft.setIcon(SQLIcon);
			add(lbimageLeft);

			lbFamilyPoint = new JLabel("Family Point", SwingConstants.CENTER);
			lbFamilyPoint.setBounds(10, 144, 180, 44);
			lbFamilyPoint.setForeground(Color.WHITE);
			lbFamilyPoint.setBackground(Color.WHITE);
			lbFamilyPoint.setHorizontalAlignment(SwingConstants.CENTER);
			lbFamilyPoint.setFont(new Font("Tahoma", Font.BOLD, 24));
			add(lbFamilyPoint);

			lbEveryProduct = new JLabel("Every Product", SwingConstants.CENTER);
			lbEveryProduct.setBounds(10, 177, 180, 44);
			lbEveryProduct.setForeground(Color.WHITE);
			lbEveryProduct.setBackground(Color.WHITE);
			lbEveryProduct.setHorizontalAlignment(SwingConstants.CENTER);
			lbEveryProduct.setFont(new Font("Tahoma", Font.BOLD, 24));
			add(lbEveryProduct);

			lbNiceService = new JLabel("Nice Service", SwingConstants.CENTER);
			lbNiceService.setBounds(10, 210, 180, 44);
			lbNiceService.setForeground(Color.WHITE);
			lbNiceService.setBackground(Color.WHITE);
			lbNiceService.setHorizontalAlignment(SwingConstants.CENTER);
			lbNiceService.setFont(new Font("Tahoma", Font.BOLD, 24));
			add(lbNiceService);

		}

	}

	protected class Right extends JPanel {

		public Right() {
			setLayout(null);
			setBounds(201, 0, 383, 361);
			setBackground(Color.WHITE);

			lbLogin = new JLabel("LOGIN");
			lbLogin.setBounds(146, 11, 110, 50);
			lbLogin.setForeground(new Color(0, 175, 240));
			lbLogin.setBackground(Color.WHITE);
			lbLogin.setHorizontalAlignment(SwingConstants.CENTER);
			lbLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
			add(lbLogin);

			lbImageRight = new JLabel();
			lbImageRight.setBounds(166, 58, 70, 70);
			ImageIcon image = new ImageIcon("image/sale.jpg");
			Image img = image.getImage();
			Image imgSQL = img.getScaledInstance(lbimageLeft.getWidth(), lbimageLeft.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon SQLIcon = new ImageIcon(imgSQL);
			lbImageRight.setIcon(SQLIcon);
			add(lbImageRight);

			lbUID = new JLabel("UID");
			lbUID.setBounds(62, 139, 90, 25);
			lbUID.setForeground(new Color(0, 175, 240));
			lbUID.setBackground(Color.WHITE);
			lbUID.setHorizontalAlignment(SwingConstants.LEFT);
			lbUID.setFont(new Font("Tahoma", Font.BOLD, 15));
			add(lbUID);

			tfUID = new JTextField();
			tfUID.setBounds(166, 143, 150, 20);
			tfUID.setFont(new Font("Tahoma", Font.PLAIN, 14));
			tfUID.setColumns(16);
			add(tfUID);

			lbPassword = new JLabel("PASSWORD");
			lbPassword.setBounds(62, 175, 90, 25);
			lbPassword.setForeground(new Color(0, 175, 240));
			lbPassword.setBackground(Color.WHITE);
			lbPassword.setHorizontalAlignment(SwingConstants.LEFT);
			lbPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
			add(lbPassword);

			tfPass = new JPasswordField();
			tfPass.setBounds(166, 179, 150, 20);
			add(tfPass);

			btLogin = new JButton("Login");
			btLogin.setForeground(Color.WHITE);
			btLogin.setBackground(new Color(0, 175, 240));
			btLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
			btLogin.setBounds(82, 239, 89, 23);
			add(btLogin);

			btClear = new JButton("Clear");
			btClear.setForeground(Color.WHITE);
			btClear.setBackground(new Color(0, 175, 240));
			btClear.setFont(new Font("Tahoma", Font.BOLD, 15));
			btClear.setBounds(207, 239, 89, 23);
			add(btClear);

		}
	}

}
