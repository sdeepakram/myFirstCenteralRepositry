package inheritance;

public  class AxisBank extends  RBIBank{
     AxisBank()
     {
    	 System.out.println("cons of AxisBank");
     }
    public static void main(String[] args) {
		AxisBank ax1=new AxisBank();
		ax1.CBillscore();
		ax1.personalloan();
	}
	void personalloan()
	{
		System.out.println("personalloan of AxisBank");
	}
	
	
	
	
}
