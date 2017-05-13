package Example74;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example74 {

	private JFrame frmTchHV;
	private JTextField txtHoTen;
	private JTextField txtHo;
	private JTextField txtTen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example74 window = new Example74();
					window.frmTchHV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Example74() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTchHV = new JFrame();
		frmTchHV.setTitle("Tách Họ và Tên");
		frmTchHV.setBounds(100, 100, 391, 220);
		frmTchHV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTchHV.getContentPane().setLayout(null);
		
		JLabel lblTchHV = new JLabel("Tách Họ và Tên");
		lblTchHV.setFont(new Font("Dialog", Font.BOLD, 19));
		lblTchHV.setBounds(92, 22, 239, 29);
		frmTchHV.getContentPane().add(lblTchHV);
		
		JLabel lblNhpHV = new JLabel("Nhập Họ và Tên");
		lblNhpHV.setBounds(27, 63, 139, 15);
		frmTchHV.getContentPane().add(lblNhpHV);
		
		JLabel lblH = new JLabel("Họ");
		lblH.setBounds(27, 90, 70, 15);
		frmTchHV.getContentPane().add(lblH);
		
		JLabel lblT = new JLabel("Tên");
		lblT.setBounds(27, 117, 70, 15);
		frmTchHV.getContentPane().add(lblT);
		
		final JButton btnT = new JButton("Tách");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String HoTen = txtHoTen.getText().trim();
				int i = HoTen.lastIndexOf(" ");
				String Ho = "";
				String Ten = "";
				if(i>0){
					Ho = HoTen.substring(0,i).trim();
					Ten = HoTen.substring(i).trim();					
				}
				else{
					Ho = HoTen;
					Ten = HoTen;
				}
				if(e.getSource()==btnT){
				txtHo.setText(Ho);
				txtTen.setText(Ten);
				}
			}
		});
		btnT.setBounds(139, 155, 117, 25);
		frmTchHV.getContentPane().add(btnT);
		
		txtHoTen = new JTextField();
		txtHoTen.setBounds(164, 63, 201, 19);
		frmTchHV.getContentPane().add(txtHoTen);
		txtHoTen.setColumns(10);
		
		txtHo = new JTextField();
		txtHo.setEnabled(false);
		txtHo.setBounds(164, 90, 201, 19);
		frmTchHV.getContentPane().add(txtHo);
		txtHo.setColumns(10);
		
		txtTen = new JTextField();
		txtTen.setEnabled(false);
		txtTen.setBounds(164, 115, 201, 19);
		frmTchHV.getContentPane().add(txtTen);
		txtTen.setColumns(10);
	}

}
