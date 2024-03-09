import java.util.ArrayList;

public class Warehouse{
	private String address;
	private String id;
	private ArrayList<Drug> drugs = new ArrayList<>();
	private ArrayList<NonDrug> nondrugs = new ArrayList<>();
	private ArrayList<MedicalSupplies> supplies = new ArrayList<>();

	public Warehouse(){
		this.address = null;
		this.id = null;
		this.drugs = null;
		this.nondrugs = null;
		this.supplies = null;
	}

	public Warehouse(String address, String id){
		this.address = address;
		this.id = id;
	}

	public Warehouse(String address, ArrayList<MedicalSupplies> supplies, String id){
		this.address = address;
		this.id = id;
		this.supplies = supplies; 
	}

	public Warehouse(ArrayList<Drug> drugs, String id, String address){
		this.address = address;
		this.id = id;
		this.drugs = drugs; 
	}	
	
	public Warehouse(String address, String id, ArrayList<NonDrug> nondrugs){
		this.address = address;
		this.id = id;
		this.nondrugs = nondrugs;
	}

	public Warehouse(String address, String id, ArrayList<NonDrug> nondrugs, ArrayList<Drug> drugs){
		this.address = address;
		this.id = id;
		this.nondrugs = nondrugs;
		this.drugs = drugs;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public void setID(String id){
		this.id = id;
	}

	public String getAddress(){
		return address;
	}

	public String getID(){
		return id;
	}

	public String toString(){
		return (address + " " + id + drugs.toString() + nondrugs.toString());
		
	}


}