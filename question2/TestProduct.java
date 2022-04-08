

public class TestProduct {

	public static void main(String[] args) {
	
		//list for the information
		String[] name = {"Dyson", "Pana", "Hitach", "Vivi"};
		double[] price= {200,100,50,2000};
		int[] qty = {10,5,9,20};
		String[] color = {"red","blue","green","yellow"};
		int[] speed = {1,2,2,3};
		double[] rad = {5,10,15,20};
		
		//create shop array
		Shop[] s = new Shop[4];
		
		//create object shop in shop array
		for(int i = 0; i<s.length; i++) {
			s[i]=new Shop();
			s[i].setName(name[i]);
			s[i].setPrice(price[i]);
			s[i].setQty(qty[i]);
			s[i].getProduct().setColor(color[i]);
			s[i].getProduct().setRadius(rad[i]);
			s[i].getProduct().setSpeed(speed[i]);
			
		}
		//display
		for(int i = 0; i<s.length; i++) {
			System.out.println(s[i].toString());
			System.out.println("-------------------------------------------------------");
		}
		
	}

}
