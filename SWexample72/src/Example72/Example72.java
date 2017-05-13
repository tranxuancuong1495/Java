package Example72;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example72 {

	private JFrame frmTnhTinin;
	private JTextField txtSoCu;
	private JTextField txtSoMoi;
	private JTextField txtTongSoDien;
	private JTextField txtThanhTien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example72 window = new Example72();
					window.frmTnhTinin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Example72() {
		initialize();
	}

	private float TinhTien(float tongSoDien){
		float itongTienDien = 0f ;
		float SoDien = tongSoDien;
		if ( SoDien <= 50 ){
			itongTienDien = SoDien * 500 ;
		}
		else if ( SoDien > 50 ){
			if ( SoDien <= 100 ){
				itongTienDien = SoDien * 1000;
			}
			else if ( SoDien > 100 ){
				if ( SoDien <= 200 ){
					itongTienDien = SoDien * 2000;
				}
				else if ( SoDien > 200 ){
					if ( SoDien <= 300 ){
						itongTienDien = SoDien * 3000;
					}
					else if ( SoDien > 300 ){
						itongTienDien = SoDien * 4000;
					}
				}
			}
		}
		return itongTienDien;
	}
	private void initialize() {
		frmTnhTinin = new JFrame();
		frmTnhTinin.setTitle("Tính Tiền Điện");
		frmTnhTinin.setBounds(100, 100, 450, 300);
		frmTnhTinin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTnhTinin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tính tiền điện theo chỉ số đồng hồ");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(48, 24, 374, 22);
		frmTnhTinin.getContentPane().add(lblNewLabel);
		
		JLabel lblSoCu = new JLabel("Chỉ Số Cũ :");
		lblSoCu.setBounds(68, 71, 114, 15);
		frmTnhTinin.getContentPane().add(lblSoCu);
		
		JLabel lblSoMoi = new JLabel("Chỉ Số Mới :");
		lblSoMoi.setBounds(68, 108, 124, 15);
		frmTnhTinin.getContentPane().add(lblSoMoi);
		
		JLabel lblSoDien = new JLabel("Tổng số điện");
		lblSoDien.setBounds(68, 146, 124, 15);
		frmTnhTinin.getContentPane().add(lblSoDien);
		
		JLabel lblThanhTien = new JLabel("Thành Tiền");
		lblThanhTien.setBounds(68, 184, 124, 15);
		frmTnhTinin.getContentPane().add(lblThanhTien);
		
		txtSoCu = new JTextField();
		txtSoCu.setBounds(250, 69, 114, 19);
		frmTnhTinin.getContentPane().add(txtSoCu);
		txtSoCu.setColumns(10);
		
		txtSoMoi = new JTextField();
		txtSoMoi.setBounds(250, 106, 114, 19);
		frmTnhTinin.getContentPane().add(txtSoMoi);
		txtSoMoi.setColumns(10);
		
		txtTongSoDien = new JTextField();
		txtTongSoDien.setEnabled(false);
		txtTongSoDien.setEditable(false);
		txtTongSoDien.setBounds(250, 144, 114, 19);
		frmTnhTinin.getContentPane().add(txtTongSoDien);
		txtTongSoDien.setColumns(10);
		
		txtThanhTien = new JTextField();
		txtThanhTien.setEditable(false);
		txtThanhTien.setEnabled(false);
		txtThanhTien.setBounds(250, 182, 114, 19);
		frmTnhTinin.getContentPane().add(txtThanhTien);
		txtThanhTien.setColumns(10);
		
		final JButton btnTinhTien = new JButton("Tính");
		btnTinhTien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtSoCu.getText());
				int b = Integer.parseInt(txtSoMoi.getText());
				int c = b - a;
				float d;
				
				if (e.getSource()==btnTinhTien){
					txtTongSoDien.setText(c+"");
					d = TinhTien(c);
					txtThanhTien.setText(d+"");
				}
	
					
			}
		});
		btnTinhTien.setBounds(168, 223, 117, 37);
		frmTnhTinin.getContentPane().add(btnTinhTien);
		
		JLabel lblVn = new JLabel("VNĐ");
		lblVn.setBounds(382, 184, 70, 15);
		frmTnhTinin.getContentPane().add(lblVn);
	}

}
