import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Console {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Drug> drugs = new ArrayList<>();
		ArrayList<NonDrug> nondrugs = new ArrayList<>();

		Warehouse warehouse = new Warehouse("South Street", "ID-001", nondrugs, drugs);
	
		
	drugs.add(new Drug("Tylenol", "Acetaminophen", "Tablet", "500mg", 500, 200, 600, "23/06/24"));
	drugs.add(new Drug("Dulcolax", "Bisacodyl", "Suppository", "5mg", 150, 210, 300, "01/01/25"));
	drugs.add(new Drug("Norvasc", "Amlodipine", "Tablet", "10mg", 300, 350, 400, "09/09/27"));
	
	nondrugs.add(new NonDrug("PG", "Syringe", 80, 74, 100, "12/12/22"));
	nondrugs.add(new NonDrug("Seff", "PillCutter", 45, 50, 55, "14/01/25"));
	nondrugs.add(new NonDrug("Scholl", "Bandage", 90, 45, 100, "12/04/27"));

	
	String option;
	boolean type = false;

	System.out.println("Welcome");
	System.out.println("Kindly choose from the menu options below or QUIT to exit program");
	System.out.println("a. Search for Drug");
	System.out.println("b. Search for NonDrug");
	System.out.println("c. Check reorder qty for Drug");
	System.out.println("d. Check reorder qty for NonDrug");
	System.out.println("e. Transfer Drug");
	System.out.println("f. Transfer NonDrug");
	System.out.println("g. Receive Drug into WareHouse");
	System.out.println("h. Receive NonDrug into WareHouse");
	System.out.println("i. Print Drug list");
	System.out.println("j. Print Non Drug list");
	System.out.println("k. Print Contents of warehouse");	

	
	
	option = keyboard.nextLine();
	 
	while(true) {

		if (option.equalsIgnoreCase("QUIT")) {
	        break;
	    }

	    switch (option) {

	            case "a":
	            	System.out.println("Enter brandName of Drug");
	            	String a = keyboard.nextLine();
	                for (int i = 0; i < drugs.size(); i++){
	                	if (a.equalsIgnoreCase(drugs.get(i).getBrandName().toString())){
	                		System.out.println(drugs.get(i));
	                		type = true;
	                	}
	                }if (type == false){
	                	System.out.println("Drug not available");
	                }
	                type = false; 
	                System.out.println(" ");
	                break;

	            case "b":
	             	System.out.println("Enter brandName of NonDrug");
	            	String b = keyboard.nextLine();
	                for (int i = 0; i < nondrugs.size(); i++){
	                	if (b.equalsIgnoreCase(nondrugs.get(i).getBrandName().toString())){
	                		System.out.println(nondrugs.get(i));
	                		type = true;
	                	}
	                }if (type == false){
	                	System.out.println("NonDrug not available");
	                }
	                type = false;
	                System.out.println(" ");
	                break;

	            case "c":
	             	System.out.println("Enter brandName of Drug");
	             	String c = keyboard.nextLine();
	             	for (int i = 0; i < drugs.size(); i++){
	                	if (c.equalsIgnoreCase(drugs.get(i).getBrandName().toString())){
	                		drugs.get(i).reorderQty();
	                		type = true;
	                	}
	                }if (type == false){
	                	System.out.println("Drug not available");
	                }
	                type = false;
	                System.out.println("");
	                break;

	            case "d":
	                System.out.println("Enter brandName of NonDrug");
	             	String d = keyboard.nextLine();
	             	for (int i = 0; i < nondrugs.size(); i++){
	                	if (d.equalsIgnoreCase(nondrugs.get(i).getBrandName().toString())){
	                		nondrugs.get(i).reorderQty();
	                		type = true;
	                	}
	                }if (type == false){
	                	System.out.println("NonDrug not available");
	                }
	                type = false;
	                System.out.println(" ");
	                break;

	            case "e":
	        		System.out.println("Enter brandName of Drug");
	        		String e = keyboard.nextLine();
	        		for (int i = 0; i < drugs.size(); i++){
	                	if (e.equalsIgnoreCase(drugs.get(i).getBrandName().toString())){
	                		System.out.printf("Quantity of %s available to be transferred is %d\n", drugs.get(i).getBrandName(), drugs.get(i).getActualQty());
	                		System.out.println("Enter qty to be transferred");
	                		try 
	                		{
	                			int tq = keyboard.nextInt();
	                			keyboard.nextLine();
	                			drugs.get(i).transfer(tq);
	                			System.out.println(" ");
	                			
	                		}
	                		catch (InputMismatchException exception)
	                		{
	                			System.out.println("Kindly enter a valid Integer");

	                		}
	             
	                		type = true;
	                	}
	                }

	                if (type == false){
	                	System.out.println("Drug not available");
	                }

	                type = false;
	                System.out.println();
	                break;

	            case "f":
	                System.out.println("Enter brandName of NonDrug");
	        		String f = keyboard.nextLine();
	        		for (int i = 0; i < nondrugs.size(); i++){
	                	if (f.equalsIgnoreCase(nondrugs.get(i).getBrandName().toString())){
	                		System.out.printf("Quantity of %s available to be transferred is %d\n", nondrugs.get(i).getBrandName(), nondrugs.get(i).getActualQty());
	                		System.out.println("Enter qty to be transferred");
	                		try
	                		{
		                		int tq = keyboard.nextInt();
		                		keyboard.nextLine();
		                		nondrugs.get(i).transfer(tq);
		                		System.out.println(" ");
	                		}
	                		catch (InputMismatchException exception)
	                		{
	                			System.out.println("Kindly enter a valid Integer");
	                		}
	                		finally
	                		{
	                			keyboard.nextLine();
	                		}

	                		type = true;
	                	}
	                }if (type == false){
	                	System.out.println("NonDrug not available");
	                }
	                type = false;
	                System.out.println(" ");
	                break;

	            case "g":
	              	System.out.println("Enter brandName of Drug");
	            	String g = keyboard.nextLine();
	                for (int i = 0; i < drugs.size(); i++){
	                	if (g.equalsIgnoreCase(drugs.get(i).getBrandName().toString())){
	                		System.out.println("Please enter qty to be received");
	                		try{
		                		int rec = keyboard.nextInt();
		                		keyboard.nextLine();
		                		drugs.get(i).receive(rec);
	                		}
	                		catch (InputMismatchException exception)
	                		{
	                			System.out.println("Kindly enter a valid Integer");
	                		}
	          

	                		type = true;
	                	}
	                }if (type == false){
	                	System.out.println("Drug not available");
	                }
	                type = false;
	                System.out.println(" ");
	                break;

	            case "h":
	               System.out.println("Enter brandName of NonDrug");
	            	String h = keyboard.nextLine();
	                for (int i = 0; i < nondrugs.size(); i++){
	                	if (h.equalsIgnoreCase(nondrugs.get(i).getBrandName().toString())){
	                		System.out.println("Please enter qty to be received");
	                		try{
		                		int rec = keyboard.nextInt();
		                		keyboard.nextLine();
		                		nondrugs.get(i).receive(rec);
	                		}
	                		catch (InputMismatchException exception)
	                		{
	                			System.out.println("Kindly enter a valid Integer");
	                		}
	                		

	                		type = true;
	                	}
	                }if (type == false){
	                	System.out.println("NonDrug not available");
	                }
	                type = false;
	                System.out.println(" ");
	                break;

	            case "i":
	                // for(int i = 0; i < drugs.size(); i++){
	                // 	System.out.println(drugs.get(i));
	                // }
	                // System.out.println(" ");
	               	Collections.sort(drugs);

	            	for(Drug z: drugs){
	            		System.out.println(z);
	            	}
	                break;

	            case "j":
	               // for(int i = 0; i < nondrugs.size(); i++){
	               //  	System.out.println(nondrugs.get(i));
	               //  }
	               //  System.out.println(" ");
	            	Collections.sort(nondrugs);

	            	for(NonDrug y: nondrugs){
	            		System.out.println(y);
	            	}
	                break;

	            case "k":
	            	Collections.sort(drugs);

	            	for(Drug z: drugs){
	            		System.out.println(z);
	            	}

	            	Collections.sort(nondrugs);

	            	for(NonDrug y: nondrugs){
	            		System.out.println(y);
	            	}

	               // for(int i = 0; i < drugs.size(); i++){
	               //  	System.out.println(drugs.get(i));
	               //  }

	               //  for(int i = 0; i < nondrugs.size(); i++){
	               //  	System.out.println(nondrugs.get(i));
	               //  }
	               //  System.out.println(" ");
	                break;

	            default:
	                System.out.println("Wrong input!!");
	                System.out.println();
	                break;       
	    }

    System.out.println("Enter menu option to continue or \"QUIT\" to exit");
    option = keyboard.nextLine();

    }
  }	
}
