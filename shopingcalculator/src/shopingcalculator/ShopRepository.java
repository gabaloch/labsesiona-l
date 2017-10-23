package shopingcalculator;
//this is our repositry where all of our shoping materials are kept
public class ShopRepository implements Container{
	//this is th shoping cart where a person add their product i
	//in folwing cart "Mycart" thet r 3 product added by their price value
	public float Mycart[] = {1 , 2 , 1};

	   @Override
	   public Iterator getIterator() {
	      return new NameIterator();
	   }
            //inner class 
	   private class NameIterator implements Iterator {

	      int products;

	      @Override
	      public boolean hasNext() {
	      
	         if(products < Mycart.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
		      //checking our cart that any product is exist in "Mycart r not"
	         if(this.hasNext()){
	        	 
	        		 float sum=0;
			 //don,t let any extra product to be calculated
	        		 while(products < Mycart.length)
					 //take summ of product
	        		 sum=sum + Mycart[products++];
	        		 float cost;
			 //check th condition according to buisness logic
	        		 if (sum < 5)
	        		 { 
					
	        		 cost=(float) (0.75 * sum);
	        		 
	        			 return cost;
	        		 }
	        		 else
	        		 {
	        	  //check th condition according to buisness logic
	            return cost=(float) (0.50 * sum);
	            }
	        		 
	         }
	         return null;
	      }		
	   }

}

