package Example71;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example71 {

	private JFrame frame;
	private JTextField txtR;
	private JTextField txtDienTich;
	private JTextField txtChuVi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example71 window = new Example71();
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
	public Example71() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblTnhChuVi = new JLabel("Tính Chu Vi Và Diện Tích Hình Tròn");
		lblTnhChuVi.setBounds(56, 40, 370, 15);
		lblTnhChuVi.setFont(new Font("Dialog", Font.BOLD, 17));
		
		JLabel lblBnKnh = new JLabel("Bán Kính");
		lblBnKnh.setBounds(79, 86, 82, 15);
		
		JLabel lblChuVi = new JLabel("Chu Vi");
		lblChuVi.setBounds(79, 119, 70, 15);
		
		JLabel lblDinTch = new JLabel("Diện Tích");
		lblDinTch.setBounds(79, 146, 70, 15);
		
		txtR = new JTextField();
		txtR.setBounds(222, 84, 114, 19);
		txtR.setColumns(10);
		
		txtDienTich = new JTextField();
		txtDienTich.setEnabled(false);
		txtDienTich.setEditable(false);
		txtDienTich.setBounds(222, 144, 114, 19);
		txtDienTich.setColumns(10);
		
		txtChuVi = new JTextField();
		txtChuVi.setEnabled(false);
		txtChuVi.setEditable(false);
		txtChuVi.setBounds(222, 115, 114, 19);
		txtChuVi.setColumns(10);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblTnhChuVi);
		frame.getContentPane().add(lblBnKnh);
		frame.getContentPane().add(lblChuVi);
		frame.getContentPane().add(lblDinTch);
		frame.getContentPane().add(txtR);
		frame.getContentPane().add(txtDienTich);
		frame.getContentPane().add(txtChuVi);
		
		final JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a = Float.parseFloat(txtR.getText());
				float b = (float) (2*a*Math.PI);
				float c = (float) (a*a*Math.PI);
				
				if(e.getSource()==btnTinh){
					txtChuVi.setText(b+"");
					txtDienTich.setText(c+"");
				}
			}
		});
		btnTinh.setBounds(162, 197, 117, 25);
		frame.getContentPane().add(btnTinh);
	}

}
