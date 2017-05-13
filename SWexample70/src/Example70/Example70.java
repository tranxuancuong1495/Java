package Example70;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example70 {

	private JFrame frame;
	private JTextField txtSoLuong;
	private JTextField txtDonGia;
	private JTextField txtThanhTien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example70 window = new Example70();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Example70() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 420, 279);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTilte = new JLabel("Tính Giá Trị Hóa Đơn");
		lblTilte.setBounds(94, 27, 237, 35);
		lblTilte.setFont(new Font("Dialog", Font.BOLD, 18));
		frame.getContentPane().add(lblTilte);
		
		JLabel lblSoLuong = new JLabel("Số Lượng");
		lblSoLuong.setBounds(82, 83, 70, 15);
		frame.getContentPane().add(lblSoLuong);
		
		JLabel lblDonGia = new JLabel("Đơn Giá");
		lblDonGia.setBounds(82, 110, 70, 24);
		frame.getContentPane().add(lblDonGia);
		
		JLabel lblThnhTin = new JLabel("Thành Tiên");
		lblThnhTin.setBounds(82, 149, 78, 15);
		frame.getContentPane().add(lblThnhTin);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setBounds(202, 81, 114, 19);
		frame.getContentPane().add(txtSoLuong);
		txtSoLuong.setColumns(10);
		
		txtDonGia = new JTextField();
		txtDonGia.setBounds(202, 113, 114, 19);
		frame.getContentPane().add(txtDonGia);
		txtDonGia.setColumns(10);
		
		txtThanhTien = new JTextField();
		txtThanhTien.setEnabled(false);
		txtThanhTien.setEditable(false);
		txtThanhTien.setBounds(202, 147, 114, 19);
		frame.getContentPane().add(txtThanhTien);
		txtThanhTien.setColumns(10);
		
		JLabel lblVn = new JLabel("VNĐ");
		lblVn.setBounds(334, 149, 70, 15);
		frame.getContentPane().add(lblVn);
		
		JLabel lblVn_1 = new JLabel("VNĐ");
		lblVn_1.setBounds(334, 115, 70, 15);
		frame.getContentPane().add(lblVn_1);
		
		final JButton btnThnhTin = new JButton("Tính Tiền");
		btnThnhTin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtSoLuong.getText());
				int b = Integer.parseInt(txtDonGia.getText());
				int c = a * b;
				if (e.getSource()==btnThnhTin){
					txtThanhTien.setText(c+"");
				}
			}
		});
		btnThnhTin.setBounds(164, 190, 117, 25);
		frame.getContentPane().add(btnThnhTin);
	}

}
