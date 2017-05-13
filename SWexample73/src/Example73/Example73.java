package Example73;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example73 {

	private JFrame frmTnhGiaiTha;
	private JTextField txtX;
	private JTextField txtKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example73 window = new Example73();
					window.frmTnhGiaiTha.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Example73() {
		initialize();
	}

	private long Tinhgiaithua(int x){
		long kq = 1;
		if ( x < 0 ){
			return 0;
		}
		for ( int i=1;i<=x;i++ ){
			kq = kq*i;
		}
		return kq;
	}
	private void initialize() {
		frmTnhGiaiTha = new JFrame();
		frmTnhGiaiTha.setTitle("Tính Giai Thừa");
		frmTnhGiaiTha.setBounds(100, 100, 290, 202);
		frmTnhGiaiTha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTnhGiaiTha.getContentPane().setLayout(null);
		
		JLabel lblTilte = new JLabel("Tính Giai Thừa Của x");
		lblTilte.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTilte.setBounds(33, 12, 214, 22);
		frmTnhGiaiTha.getContentPane().add(lblTilte);
		
		JLabel lblX = new JLabel("Nhập x :");
		lblX.setBounds(43, 46, 70, 15);
		frmTnhGiaiTha.getContentPane().add(lblX);
		
		JLabel lblKQ = new JLabel("Kết Quả");
		lblKQ.setBounds(43, 85, 70, 15);
		frmTnhGiaiTha.getContentPane().add(lblKQ);
		
		txtX = new JTextField();
		txtX.setBounds(143, 46, 114, 19);
		frmTnhGiaiTha.getContentPane().add(txtX);
		txtX.setColumns(10);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setEnabled(false);
		txtKQ.setBounds(143, 83, 114, 19);
		frmTnhGiaiTha.getContentPane().add(txtKQ);
		txtKQ.setColumns(10);
		
		final JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtX.getText());
				long b;
				if (e.getSource()==btnTinh){
					if ( a < 0 ){
						txtKQ.setText("Error");
					}
					else{
					b = Tinhgiaithua(a);
					txtKQ.setText(b+"");
					}
				}
			}
		});
		btnTinh.setBounds(84, 131, 117, 25);
		frmTnhGiaiTha.getContentPane().add(btnTinh);
	}

}
