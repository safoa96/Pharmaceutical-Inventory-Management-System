public class MedicalSuppliesTester {

	public static void main(String[] args) {
		MedicalSupplies ms = new MedicalSupplies("Norvasc", 50, 100, 150, "09/08/2022");

		System.out.println();
		System.out.println(ms);
		System.out.println();
		System.out.println("Brand name is " + ms.getBrandName());
		System.out.println("Actual qty is " + ms.getActualQty());
		System.out.println("Min qty is " + ms.getMinQty());
		System.out.println("Max qty is " + ms.getMaxQty());
		System.out.println("Expiry Date is " + ms.getExpiryDate());

		MedicalSupplies ms1 = new MedicalSupplies();

		ms1.setBrandName("Zestril");
		ms1.setMinQty(100);
		ms1.setActualQty(120);
		ms1.setMaxQty(130);
		ms1.setExpiryDate("12/12/2022");
		System.out.println();
		System.out.println(ms1);

		MedicalSupplies ms2 = new MedicalSupplies();
		ms2.setMinQty(-1);
		ms2.setMaxQty(-2);
		ms2.setActualQty(-3);

		System.out.println();
		System.out.println("Actual qty is " + ms2.getActualQty());
		System.out.println("Min qty is " + ms2.getMinQty());
		System.out.println("Max qty is " + ms2.getMaxQty());

		System.out.println();
		ms.transfer(-1);
		System.out.println();
		ms.transfer(100);
		System.out.println();
		ms.transfer(150);
		System.out.println(); 
		ms1.reorderQty();

		MedicalSupplies ms3 = new MedicalSupplies();

		System.out.println(); 
		ms3.setMaxQty(100);
		ms3.setActualQty(100);
		ms3.reorderQty();


		MedicalSupplies ms4 = new MedicalSupplies();
		System.out.println(); 
		ms4.setMaxQty(100);
		ms4.setActualQty(120);
		ms4.reorderQty();

		System.out.println();
		ms1.receive(10);
		System.out.println();
		ms1.receive(10);

		MedicalSupplies ms5 = new MedicalSupplies();
		System.out.println();
		System.out.println(ms5.toString());

	}
}