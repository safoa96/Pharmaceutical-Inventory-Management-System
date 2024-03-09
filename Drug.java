public class Drug extends MedicalSupplies implements Comparable<Drug>{
	private String genericName;
	private String dosageForm;
	private String strength;

	public Drug(){
		super();
		this.genericName = null;
		this.dosageForm = null;
		this.strength = null;
	}

	public Drug(String brandName, String genericName, String dosageForm, String strength, int minQty, int actualQty, int maxQty, String expiryDate){
		super(brandName, minQty, actualQty, maxQty, expiryDate);
		this.genericName = genericName;
		this.dosageForm = dosageForm;
		this.strength = strength;
	}

	public String getGenericName(){
		return genericName;
	}

	public String getDosageForm(){
		return dosageForm;
	}

	public String getStrength(){
		return strength;
	}

	public void setGenericName(String genericName){
		this.genericName = genericName;
	}

	public void setDosageForm(String dosageForm){
		this.dosageForm = dosageForm;
	}

	public void setStrength(String strength){
		this.strength = strength;
	}

	@Override
	public String toString(){
		return (brandName + " " + genericName + " " + dosageForm + " " + strength + " " + expiryDate + " |actual qty - " + actualQty + " |min qty - " + minQty + " |max qty - " + maxQty);
	}

	@Override
	public void reorderQty(){
		//buffer to serve as emergency stock since drugs are essential
		int buffer = (int)(0.1 * minQty);
		int qty = (maxQty + buffer) - actualQty;
			if (qty <= 0){
				System.out.println("No need to place order");
			} else { System.out.println("Place a maximum order of " + qty);
			}
		}

	public int compareTo(Drug d){
		return this.getBrandName().compareTo(d.getBrandName());
	}

	
}