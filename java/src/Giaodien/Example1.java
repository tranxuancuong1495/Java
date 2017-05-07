package Giaodien;
import java.awt.*;
public class Example1 {
	public static void main(String[] args) {
	Frame f = new Frame();
	f.setTitle("Example1");
	f.setSize(300,200);
	f.setLayout(new FlowLayout());
	
	TextField txtTen = new TextField();
	f.add(txtTen);
	Button btnOK = new Button("OK");
	f.add(btnOK);
	f.setVisible(true);
	}

}
