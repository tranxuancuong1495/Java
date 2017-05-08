package Pheptoan;
import java.awt.*;

import java.awt.event.*;


public class PheptoanAWT extends Frame implements ActionListener,WindowListener {

	private Label lbla;
	private Label lblb;
	private Label lblkq;
	private TextField tfa;
	private TextField tfb;
	private TextField tfkq;
	private Button btnnhan;
	private Button btnchia;
	private Button btncong;
	private Button btntru;
	private float kq;

	public PheptoanAWT(){
		setKq(0);
		setLayout(new FlowLayout());
		
		lbla = new Label("a =");
		add(lbla);
		
		tfa = new TextField(10);
		tfa.setEditable(true);
		add(tfa);	
		tfa.addActionListener(this);
		
		lblb = new Label("b =");
		add(lblb);
		
		tfb = new TextField(10);
		tfb.setEditable(true);
		add(tfb);
		tfb.addActionListener(this);
		
		btncong = new Button("+");
		add(btncong);
		btncong.addActionListener(this);
		
		btntru = new Button("-");
		add(btntru);
		btntru.addActionListener(this);
		
		btnnhan = new Button("*");
		add(btnnhan);
		btnnhan.addActionListener(this);
		
		btnchia = new Button("/");
		add(btnchia);
		btnchia.addActionListener(this);
		
		
		addWindowListener(this);
		
		lblkq = new Label("kq = ");
		add(lblkq);
		tfkq = new TextField(10);
		tfkq.setEditable(false);
		add(tfkq);
		
		setTitle("Phep Toan");
		setSize(270, 100);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		float a = 0;
		float b = 0;
		
		a = Float.parseFloat(tfa.getText());
		b = Float.parseFloat(tfb.getText());
		
		if(e.getSource()==btncong){
			setKq(a + b);
			tfkq.setText(getKq()+"");
		}
		else if (e.getSource()==btntru){
			setKq(a - b);
			tfkq.setText(getKq()+"");
		}
		else if (e.getSource()==btnnhan){
			setKq(a * b);
			tfkq.setText(getKq()+"");
		}
		else if (e.getSource()==btnchia){
			if (b == 0){
				tfkq.setText("Loi~");
			}
			else{
				setKq(a - b);
				tfkq.setText(getKq()+"");
			}
		}
	}
	
	public Label getLbla() {
		return lbla;
	}


	public void setLbla(Label lbla) {
		this.lbla = lbla;
	}


	public Label getLblkq() {
		return lblkq;
	}


	public void setLblkq(Label lblkq) {
		this.lblkq = lblkq;
	}


	public Label getLblb() {
		return lblb;
	}


	public void setLblb(Label lblb) {
		this.lblb = lblb;
	}


	public TextField getTfa() {
		return tfa;
	}


	public void setTfa(TextField tfa) {
		this.tfa = tfa;
	}


	public TextField getTfb() {
		return tfb;
	}


	public void setTfb(TextField tfb) {
		this.tfb = tfb;
	}


	public TextField getTfkq() {
		return tfkq;
	}


	public void setTfkq(TextField tfkq) {
		this.tfkq = tfkq;
	}


	public Button getBtnnhan() {
		return btnnhan;
	}


	public void setBtnnhan(Button btnnhan) {
		this.btnnhan = btnnhan;
	}


	public Button getBtnchia() {
		return btnchia;
	}


	public void setBtnchia(Button btnchia) {
		this.btnchia = btnchia;
	}


	public Button getBtncong() {
		return btncong;
	}


	public void setBtncong(Button btncong) {
		this.btncong = btncong;
	}


	public Button getBtntru() {
		return btntru;
	}


	public void setBtntru(Button btntru) {
		this.btntru = btntru;
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public float getKq() {
		return kq;
	}

	public void setKq(float kq) {
		this.kq = kq;
	}
}
