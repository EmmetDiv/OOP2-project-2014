
import java.util.*;
import javax.swing.*;

public class Game2 extends Cards2 {
	
	public static void main(String[] args){
		Cards2 deck= new Cards2();
		Scanner input = new Scanner(System.in);
	 int pcard1=deal();
	 int vpcard1 = value(pcard1);
	 int pcard2=deal();
	 int vpcard2 = value(pcard2);
	 int ptotal;
 	 ptotal = vpcard1+vpcard2;
	 int money;
	 int win=0;
	 int lose=0;
	 int ties=0;
	 String q="";
	 int bet;
	 int dcard1=deal();
	 int vdcard1 = value(dcard1);
	 int dcard2=deal();
	 int vdcard2 = value(dcard2);
	int dtotal;
	dtotal= vdcard1+vdcard2;
	
	 
	System.out.println(toString(pcard1));
	System.out.println(toString(pcard2));
	System.out.println(ptotal);
	

	if(ptotal==21){
		System.out.println("BlackJack you win");
	}
	if(ptotal>21){
		System.out.println("You busted");}
	else{
		System.out.print("Do you want another card(y-n): ");
		q = input.nextLine();
		if(q.equals("y")){
			ptotal+= value(deal());
			System.out.println(ptotal);
		}	
	}
	if(ptotal==21){
		System.out.println("BlackJack you win");
	}
	if(ptotal>21){
		System.out.println("You busted");}
	
	//dealer
	System.out.println("dealers GO");
	System.out.println(toString(dcard1));
	System.out.println(toString(dcard2));
	System.out.println(dtotal);
	if(dtotal >18 && dtotal <21){
		System.out.println("Dealer stay");
	}
	else{
		dtotal+=value(deal());
		System.out.println(dtotal);
	}
	if(dtotal >18 && dtotal <21){
		System.out.println("Dealer stay");
	}
	else{
		dtotal+=value(deal());
		System.out.println(dtotal);
	}
	if(dtotal == 21){
		System.out.println("Dealer wins");}
	if(dtotal >21){
		System.out.println("Dealer Bust");
			System.exit(0);}
		
		
	if(ptotal < dtotal){
		System.out.println("Dealer win");
		lose++;}
	else if (ptotal == dtotal){
		System.out.println("You tied");
			ties++;
		}
	else {
		System.out.println("You win");
		win++;}
		
}

}