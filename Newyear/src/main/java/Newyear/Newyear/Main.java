package Newyear.Newyear;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Min weight of candy");
		int min = sc.nextInt();
		System.out.print("Max weight of candy");
		int max = sc.nextInt();
		System.out.print("Enter no of Gifts: ");
		int n = sc.nextInt();
		List<Gifts> giftList = new ArrayList<Gifts>();
		Gifts gift;
		for(int i = 0; i<n; i++) {
			gift = new Gifts();
			gift.chocolateInput();
			gift.sweetInput();
			giftList.add(gift);
		}
		int index = 0;
		for(Gifts gifts: giftList) {
				System.out.print("Weight of Gift " + (index + 1) + ": ");
				System.out.println(gifts.getGiftWeight());
				if(gifts.getCandies(min, max).size() == 0) System.out.println("Sorry No candies in this gift");
				else System.out.println("Candies : " + gifts.getCandies(min, max));
				index++;
		}
	}
}