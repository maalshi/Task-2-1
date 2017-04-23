import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import Comparators.NameComparator;
import Comparators.PowerComparator;
import Items.ElectricityItem;
import Items.Fan;
import Items.Refrigirator;
import Items.VacuumCleaner;



public class Main {
	   

		public static void main(String[] args) throws IOException {
		
		
		ArrayList<ElectricityItem> list = new ArrayList<ElectricityItem>();
		try{
			
		
		VacuumCleaner vacuumCleanerSamsung=VacuumCleaner.VacuumCleanerSamsung(); //create an object for one of the items
		vacuumCleanerSamsung.turnOn();											//turn on this object
		//ArrayListExtenstion.Add(list, vacuumCleanerSamsung);  									  // add turned on object t collection
		list.add(VacuumCleaner.VacuumCleanerLG()); 							//add turned off object to collection
		list.add(Refrigirator.RefrigiratorAtlant());						//add turned off object to collection
		Refrigirator refrigirator = Refrigirator.RefrigiratorNotAtlant();	
		refrigirator.turnOn();
		list.add(refrigirator);
		list.add(Fan.FanHuawei());
		list.add(Fan.FanSamsung());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	
		
		
		
		 
		   
		
		//show status of the electroitems, it turned on -perform work
		for(int i=0;i<list.size(); i++)
		{
			ElectricityItem item=list.get(i);
			if (item.getTurnedOn()==true)
			
				try {
					System.out.println(item.working());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			
		}
		
		//count sum of consumption
		int sum=0;
		for(int i=0;i<list.size(); i++)
		{
			ElectricityItem item=list.get(i);
			if (item.getTurnedOn()==true)
			{
				sum+=item.getConsumption();
			}
		}
		
		System.out.println(sum);
		
		//illustration of exception
		try {
			list.get(0).setPower(-3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		//sorting according to power
		Collections.sort(list, new PowerComparator());
		System.out.println("Sorting according to Power in ascending order:");
		for (int i =0; i<list.size();i++){
			System.out.println(list.get(i).getPower() + " " + list.get(i).getName()+ " " + list.get(i).getConsumption());
		}
		
		//sorting according to name
		Collections.sort(list, new NameComparator());
		System.out.println("Sorting according to Name in ascending order:");
		for (int i =0; i<list.size();i++){
			System.out.println(list.get(i).getName() + " " + list.get(i).getPower() + " " + list.get(i).getConsumption());
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter min power, min consumption");
		int minPower= sc.nextInt();
		int minConsumption = sc.nextInt();
		sc.close();
		
		int size=list.size();
		for (int i =0; i<size;i++){
			ElectricityItem item = list.get(i);
			if (item.getPower()>=minPower && item.getConsumption()>= minConsumption){
				System.out.println(item);
			}
		}
		
		
		
		
		
		
		

		   

		}	

	
}