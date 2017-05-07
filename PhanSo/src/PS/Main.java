package PS;


public class Main {

	
	public static void main(String[] args) {
		
		Phanso PS = new Phanso(15,5);
		System.out.print("Phan So : " + PS.getTuSo()+"/"+PS.getMauSo());
		PS.ToiGian();
		System.out.print("Phan So : " + PS.getTuSo()+"/"+PS.getMauSo());

	}

}
