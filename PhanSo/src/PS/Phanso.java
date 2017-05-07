package PS;


public class Phanso 
{
		private int TuSo;
		private int MauSo;
		
	public int getTuSo() {
		return TuSo;
	}
	
	public void setTuSo(int tuSo) {
		TuSo = tuSo;
	}
	
	public int getMauSo() 
	{
		return MauSo;
	}
	
	public void setMauSo(int mauSo) {
		MauSo = mauSo;
	}	
	
	public Phanso()
	{
		setTuSo(0);
		setMauSo(1);
	}
	
	public Phanso(int ts, int ms)
	{
		setTuSo(ts);
		setMauSo(ms);
	}
	public String toString()
	{
		String tam="";
		tam=String.valueOf(getTuSo())+"/"+String.valueOf(getMauSo());
		return tam;
	}
	public int UCLN(int a,int b)
	{
		do
		{
			if(a>b)
				a-=b;
			else
				b-=a;
		}while(a!=b);
		return a;
	}
	public Phanso ToiGian()
	{
		Phanso p = new Phanso();
		p.setTuSo(getTuSo()/UCLN(p.getTuSo(), p.getMauSo()));
		p.setMauSo(getMauSo()/UCLN(p.getTuSo(), p.getMauSo()));
		return p;
	}

	public Phanso CongPS()
	{
		Phanso p = new Phanso();
		
		return p;
	}
		
}
