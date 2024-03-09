public class NonDrugTester{
	public static void main(String[] args) {
		NonDrug nd = new NonDrug();

		System.out.println(nd);

		nd.setType("needles");
		System.out.println(nd.getType());

		System.out.println();
		NonDrug nd1 = new NonDrug("GSK", "syringe", 50, 10, 20, "12/12/22");
		System.out.println(nd1);
	}
}