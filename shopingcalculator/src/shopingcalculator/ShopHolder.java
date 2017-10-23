package shopingcalculator;

public class ShopHolder {
	public static void main(String[] args) {
		//from here accessing or repositry
	      ShopRepository namesRepository = new ShopRepository();
		
               //from "itrator" interface we are geting th functionilty  overridin method 
		//also cheking the condition which kept 
	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
		      
	    	  //in this point we r geting the total price  ahich we acording to our formula 
	         float totalPrice = (float)iter.next();
	         //and here we r printing our price
	         System.out.println("your total  : " + totalPrice);
	      } 	
	   }

}
