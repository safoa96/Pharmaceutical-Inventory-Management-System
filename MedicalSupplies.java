public class MedicalSupplies{
	protected String brandName;
	protected int minQty;
	protected int actualQty;
	protected String expiryDate;
	protected int maxQty;
	protected int overStock;

	public MedicalSupplies(){

	}

	public MedicalSupplies(String brandName, int minQty, int actualQty, int maxQty, String expiryDate){
		this.brandName = brandName;
		this.minQty = minQty;
		this.actualQty = actualQty;
		this.maxQty = maxQty;
		this.expiryDate = expiryDate;
	}

	public String getBrandName(){
		return brandName;
	}

	public int getMinQty(){
		return minQty;
	}
	
	public int getActualQty(){
		return actualQty;
	}

	public int getMaxQty(){
		return maxQty;
	}

	public String getExpiryDate(){
		return expiryDate;
	}

	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	public void setMinQty(int minQty){
		if(minQty < 0){
			this.minQty = 0;
		} else {
			this.minQty = minQty;
		}
	}

	public void setActualQty(int actualQty){
		if(actualQty < 0){
			this.actualQty = 0;
		} else {
			this.actualQty = actualQty;
		}
	}

	public void setMaxQty(int maxQty){
		if(maxQty < 0){
			this.maxQty = 0;
		} else {
			this.maxQty = maxQty;
		}
	}

	public void setExpiryDate(String expiryDate){
		this.expiryDate = expiryDate;
	}

	public String toString(){
		return (brandName + " " + expiryDate + " has an actual qty of " + actualQty + " and min qty of " + minQty);
	}

	public void transfer(int transferQty){
		if (transferQty < 0 || transferQty > actualQty){
			System.out.println("You cannot transfer this qty");
		} else {

			actualQty = actualQty - transferQty;
			System.out.println("Successfully transferred!");
		}
	
	}

	public void receive(int receiveQty){
		actualQty = actualQty + receiveQty;

		if (actualQty > maxQty){
			int temp = actualQty - maxQty;
			overStock = overStock + temp;
			actualQty = maxQty;
			System.out.println("You attempted overstocking by " + overStock);
			System.out.println("Return " + overStock + " back to supplier");
		}else if(actualQty < minQty){
			System.out.println("Actual Quantity is still less than Min Qty. Place order");
		}else {
			System.out.println("Received Successfully");
		}
		//return actualQty;
	}

	public void reorderQty(){

		int qty = maxQty - actualQty;

		if (qty <= 0){
			System.out.println("No need to place order");
		} else { System.out.println("Place a maximum order of " + qty);

	}


	}


}