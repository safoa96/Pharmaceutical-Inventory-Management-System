public class DrugTester{
	public static void main(String[] args) {
		Drug d1 = new Drug();

		System.out.println(d1);

		d1.setGenericName("Ibuprofen");
		d1.setDosageForm("Capsule");
		d1.setStrength("400mg");
		d1.setActualQty(100);
		d1.setMinQty(50);
		d1.setMaxQty(200);

		System.out.println(d1.getGenericName());
		System.out.println(d1.getDosageForm());
		System.out.println(d1.getStrength());

		d1.reorderQty();
		System.out.println();

		d1.setActualQty(205);
		d1.reorderQty();
	}
}