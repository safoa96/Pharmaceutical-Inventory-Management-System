import java.util.ArrayList;
public class WarehouseTester{
	public static void main(String[] args) {
		Warehouse wh = new Warehouse("South Park", "001");

		System.out.println(wh);
		System.out.println();

		ArrayList<MedicalSupplies> md = new ArrayList<>();
		Warehouse wh1 = new Warehouse("North Park", md, "002");

		System.out.println(wh1);

		ArrayList<Drug> d = new ArrayList<>();
		Warehouse wh2 = new Warehouse(d, "003", "East Park" );
		System.out.println();
		System.out.println(wh2);

		ArrayList<NonDrug> nd = new ArrayList<>();
		Warehouse wh3 = new Warehouse("West Park", "004", nd);
		System.out.println();
		System.out.println(wh3);

		Warehouse warehouse = new Warehouse("North - South", "005", nd, d);
		System.out.println();
		System.out.println(warehouse);

		System.out.println();
		wh.setAddress("Almond Street");
		System.out.println(wh.getAddress());

		System.out.println();
		wh.setID("006");
		System.out.println(wh.getID());

	}
}