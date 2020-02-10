package Newyear.Newyear;

import java.util.*;

class Gifts {
	static Scanner sc = new Scanner(System.in);
	List<Chocolates> chocolatesList = new ArrayList<Chocolates>();
	List<Sweets> sweetsList = new ArrayList<Sweets>();
	int weight;
	
	public  void chocolateInput() {
		System.out.print("No of Chocolates");
		int n = sc.nextInt();
		Chocolates choco;
		for(int i = 0; i<n; i++) {
			System.out.print("Name of chacolate");
			choco = new Chocolates();
			sc.nextLine();
			String name = sc.nextLine();
			choco.setName(name);
			System.out.print("Weight" + choco.getName() +": ");
			int weight = sc.nextInt();
			choco.setWeight(weight);
			chocolatesList.add(choco);
		}
	}
	public void sweetInput() {
		System.out.print("No of Sweets");
		int n = sc.nextInt();
		Sweets sweet;
		for(int i = 0; i<n; i++) {
			System.out.print("Name of Sweet");
			sweet = new Sweets();
			sc.nextLine();
			String name = sc.nextLine();
			sweet.setName(name);
			System.out.println("Weight" + sweet.getName() + ": ");
			int weight = sc.nextInt();
			sweet.setWeight(weight);
			sweetsList.add(sweet);
		}
			
	}
	public int getGiftWeight() {
		int totalChocolatesWeight = 0;
		int totalSweetsWeight = 0;
		for(Chocolates choco: chocolatesList) {
			totalChocolatesWeight += choco.getWeight();
		}
		for(Sweets sweet: sweetsList) {
			totalSweetsWeight += sweet.getWeight();
		}
		return totalChocolatesWeight + totalSweetsWeight;
	}
	public List<String> getCandies(int minWeight, int maxWeight) {
		List<String> candiList = new ArrayList<String>();
		for(Sweets candy: sweetsList) {
			if(candy.getWeight()>=minWeight && candy.getWeight()<=maxWeight) 
				candiList.add(candy.getName());
		}
		return candiList;
	}
}