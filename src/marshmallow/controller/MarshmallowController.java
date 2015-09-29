package marshmallow.controller;

import marshmallow.model.marshmallowMonster;
import marshmallow.veiw.MonsterDisplay;
import java.util.Scanner;

public class MarshmallowController
{
	private marshmallowMonster denonMonster;
	private marshmallowMonster userMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	
	public MarshmallowController()
	{
		String name = "derf the Evil";
		int eyes = 30;
		int noses = 0;
		double Legs = 3.4;
		double Hair = 0.07;
		boolean hasBellyButton = true;
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		denonMonster = new marshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	
	 }
			
	public void start()
	{
		myDisplay.displayInfo(denonMonster.toString());
		askQuestions();
		myDisplay.displayInfo("Updated monster info: " + denonMonster.toString);
	
	private void askQuestions()
	
	{
	System.out.println("I want a new name for a monster, type one please!");
	String newMonsterName = monsterScanner.next();
	denonMonster.setMonsterName(newMonsterName);
	
	System.out.println("I want a new name for a monster, type one please!");
	int updatedNoses = monsterScanner.nextInt();
	denonMonster.setMonsterName(newMonsterName);
	
	System.out.println("I want a new name for a monster, type one please!");
	Double newupdatedLegs = monsterScanner.nextDouble();
	denonMonster.setMonsterName(newMonsterName);
	
	System.out.println("I want a new name for a monster, type one please!");
	Double newupdatedHair = monsterScanner.nextDouble();
	denonMonster.setMonsterName(newMonsterName);
	
	System.out.println("I want a new name for a monster, type one please!");
	Boolean newupdatedBellyButtons = monsterScanner.nextBoolean();
	denonMonster.setMonsterName(newMonsterName);
	}
	
	/**
	 *  Creates a MarshMallowMonster instance from use input.
	 */
	
	private void createUserMonster()	
	}

	System.out.Println("What is your monsters name?")
	String userName;
	userName = monsterScanner.nextline();
	system.out.println("How many legs will it have? this is a decimal value");
	double userLegs = monsterScanner.nextDouble();
	Sytem.out.println("How much hair does it have, another decimal value");
	double userHair;
	userHair = monsterscanner.nextDouble();
	System.out.println("does it have a belly button? ture or false");
	boolean hasBellyButton = monsterScanner.nextBoolean();
	System.out.println("number of eyes on the monster");
	int userEyes = monsterScanner.nextInt();
	System.out.println("How many noses does it have?");
	int userNoses = monsterScanner.nextInt();
	
	
	{
		
	}
}
}



	
