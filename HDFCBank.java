package inheritance;

public class HDFCBank extends RBIBank{

	HDFCBank()
	{
		System.out.println("cons of HDFCBank");
	}
	
	 
	
	void CBillscore()
	{
		System.out.println("CBillscore ofHDFCBank");
	}
	public static void main(String[] args) {
			HDFCBank h1=new HDFCBank();
			h1.CBillscore();

	}

}
