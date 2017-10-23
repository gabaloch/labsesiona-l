package shopingcalculator;

public class ShopRepository implements Container{
	public float Mycart[] = {1 , 2 , 1};

	   @Override
	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < Mycart.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	        	 
	        		 float sum=0;
	        		 while(index < Mycart.length)
	        		 sum=sum + Mycart[index++];
	        		 float cost;
	        		 if (sum < 5)
	        		 { 
	        		 cost=(float) (0.75 * sum);
	        		 
	        			 return cost;
	        		 }
	        		 else
	        		 {
	        	 
	            return cost=(float) (0.50 * sum);
	            }
	        		 
	         }
	         return null;
	      }		
	   }

}

