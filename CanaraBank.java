package inheritance;

public class CanaraBank extends  RBIBank{

	CanaraBank(int a)
	{
		System.out.println("cons of canarabank"+a);
	}
	void croploan()
	{
		System.out.println("croploan of canarabank");
	}
	CanaraBank()
	{
		System.out.println("cons of canarabank"); 
	}
	public static void main(String[] args) {
		CanaraBank c1=new CanaraBank(10);
		c1.CBillscore();
		c1.croploan();
		RBIBank r1=new CanaraBank(20);
		r1.CBillscore();
		

	}

}
