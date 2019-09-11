import java.lang.Math;
import java.util.Scanner;

public class yahtzee {
	
	private int d_one, d_two, d_three, d_four, d_five;
	
	public void set_done(int val) {d_one = val; }
	public void set_dtwo(int val) {d_two = val; }
	public void set_dthree(int val) {d_three = val; }
	public void set_four(int val) {d_four = val; }
	public void set_five(int val) {d_five = val; }
	
	public yahtzee() {
		 d_one = 1;
		 d_two = 1;
		 d_three = 1;
		 d_four = 1;
		 d_five = 1;
	}

	public int getRandomDievalue() {
		int nb;
		nb = (int)(Math.random() * 6) + 1;
		return nb;
		
	}
	
	/*public void rollDice() {
		d_one = getRandomDievalue();
		d_two = getRandomDievalue();
		d_three = getRandomDievalue();
		d_four = getRandomDievalue();
		d_five = getRandomDievalue();
	}*/
	
	public void rollDice() {
		int[] dice_array;
		dice_array = new int[5];
		for(int i=0;i<5;i++) {
			dice_array[i] = getRandomDievalue();
			System.out.println(dice_array[i]);
		}
	}
	
	public void rollDice(int[] dice_array) {
		for(int i=0;i<dice_array.length;i++) {
			dice_array[i] = getRandomDievalue();
			System.out.println(i + ") " + dice_array[i]);
		}
		
	}
	
	public void reroll() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which dice do you want to re-roll ? (from 1 to 5)");
		int resp = sc.nextInt();
		switch(resp) {
		case 1:
			rollDice();
			break;
		case 2:
			rollDice();
			break;
		case 3:
			rollDice();
			break;
		case 4:
			rollDice();
			break;
		case 5:
			rollDice();
			break;
		default:
			reroll();
			break;
		}
		sc.close();
		
	}
	
	public int get_yahtzee(int[] dice_array){
		rollDice();
		for(int i=0;i<dice_array.length;i++) {
			if(dice_array[i] != dice_array[i+1]) {
				return 0;
			}
		}
		System.out.println("You got a Yahtzee !");
		return 1;
	}
	
	public static void main(String[] args) {
		int[] array = new int[5];
		yahtzee Obj = new yahtzee();
		Obj.rollDice(array);
	}

}
