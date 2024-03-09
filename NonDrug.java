public class NonDrug extends MedicalSupplies implements Comparable<NonDrug>{
	private String type;

	public NonDrug(){
		super();
		this.type = null;
	}

	public NonDrug(String brandName, String type, int minQty, int actualQty, int maxQty, String expiryDate){
		super(brandName, minQty, actualQty, maxQty, expiryDate);
		this.type = type;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
	public String toString(){
		return (brandName + " " + type + " " + expiryDate + " |actual qty - " + actualQty + " |min qty - " + minQty + " |max qty - " + maxQty);
	}

	public int compareTo(NonDrug n){
		return this.getBrandName().compareTo(n.getBrandName());
	}

}