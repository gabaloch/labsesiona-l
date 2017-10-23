package shopingcalculator;

public class ShopHolder {
	public static void main(String[] args) {
	      ShopRepository namesRepository = new ShopRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	    	  
	         float totalPrice = (float)iter.next();
	         
	         System.out.println("your total  : " + totalPrice);
	      } 	
	   }

}
