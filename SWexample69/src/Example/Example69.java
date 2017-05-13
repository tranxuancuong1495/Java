package Example;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example69 {

	private JFrame frame;
	private JTextField txtB;
	private JTextField txtA;
	private JLabel lblKQ;
	private JTextField txtKq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example69 window = new Example69();
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
	public Example69() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTnhTngHai = new JLabel("Tính Tổng Hai Số Nguyên");
		lblTnhTngHai.setBounds(86, 26, 285, 29);
		lblTnhTngHai.setFont(new Font("Dialog", Font.BOLD, 18));
		frame.getContentPane().add(lblTnhTngHai);
		
		JLabel lblA = new JLabel("Số Nguyên Thứ Nhất");
		lblA.setBounds(63, 77, 153, 15);
		frame.getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("Số Nguyên Thứ Hai");
		lblB.setBounds(63, 111, 153, 15);
		frame.getContentPane().add(lblB);
		
		txtA = new JTextField();
		txtA.setBounds(252, 75, 114, 19);
		frame.getContentPane().add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(252, 109, 114, 19);
		frame.getContentPane().add(txtB);
		txtB.setColumns(10);
		
		lblKQ = new JLabel("Kết Quả");
		lblKQ.setBounds(65, 150, 70, 15);
		frame.getContentPane().add(lblKQ);
		
		txtKq = new JTextField();
		txtKq.setEnabled(false);
		txtKq.setEditable(false);
		txtKq.setBounds(252, 148, 114, 19);
		frame.getContentPane().add(txtKq);
		txtKq.setColumns(10);
		
		final JButton btnTinhTong = new JButton("Tính Tổng");
		btnTinhTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtA.getText());
				int b = Integer.parseInt(txtB.getText());
				int c = a + b;
				if(e.getSource()==btnTinhTong)
				{
					txtKq.setText(c+"");
				}
			}
		});
		btnTinhTong.setBounds(188, 198, 117, 25);
		frame.getContentPane().add(btnTinhTong);
	}
}
