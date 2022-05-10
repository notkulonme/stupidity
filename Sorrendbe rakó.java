package bot;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers do you want?");
		int random_menny = Integer.parseInt(scanner.nextLine());
		System.out.println("What is the maximum value?");
		int max_value = Integer.parseInt(scanner.nextLine())+1;
		int ennyi_van = 1;
		while (ennyi_van<random_menny) {
			int random_number = random.nextInt(max_value);
			//System.out.println(random_number);
			if(numbers.contains(random_number)) {
			}
			else {
				numbers.add(random_number);
				ennyi_van++;
			}
		}
		//System.out.println(ennyi_van);
		System.out.println(numbers);
		ArrayList<Integer> sorrend = new ArrayList<Integer>();
		while(numbers.size()!=0) {
			int min = numbers.get(0);		
			for(int i=0; i<=numbers.size()-1;i++) {
				if (min>numbers.get(i)) {
					min=numbers.get(i);
					
				}
			}
			numbers.remove(numbers.indexOf(min));
			sorrend.add(min);		
		}
		System.out.println(sorrend);
	}	
}