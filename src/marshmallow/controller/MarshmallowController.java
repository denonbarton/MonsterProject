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
		double legs = 3.4;
		double hair = 0.07;
		boolean hasBellyButton = true;
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		denonMonster = new marshmallowMonster (name, eyes, hasBellyButton, noses, legs, hair );
		// 
	
	 }
			
	public void start()
	{
		myDisplay.displayInfo(denonMonster.toString());
		askQuestions();
		myDisplay.displayInfo("Updated monster info: " + userMonster.toString());
	}
	
	private void askQuestions()
	
	
	{
		String newMonsterName = monsterScanner.next();
        denonMonster.setMonsterName(newMonsterName);
       
        System.out.println("How many eyes should I have?");
        int updatedEyes = monsterScanner.nextInt();
        denonMonster.setMonsterEyes(updatedEyes);
        System.out.println("How many noses should I have?");
        int updatedNoses = monsterScanner.nextInt();
        denonMonster.setMonsterNoses(updatedNoses);
        System.out.println("How many legs?");
        double updatedLegs = monsterScanner.nextDouble();
        System.out.println("How much hair?");
        double updatedHair = monsterScanner.nextDouble();
        System.out.println("Should I have a belly button? True or False.");
        boolean updatedBellyButton = monsterScanner.nextBoolean();
	}
	/**
	 *  Creates a MarshMallowMonster instance from use input.
	 */
	
	private void createUserMonster()	
	{

	System.out.println("What is your monsters name? boop.");
    String userName;
    userName = monsterScanner.nextLine();
    System.out.println("How many legs will it have? This is a decimal value. meep.");
    double userLegs = monsterScanner.nextDouble();
    System.out.print("How much hair does it have? Another decimal please. beep.");
    double userHair;
    userHair = monsterScanner.nextDouble();
    System.out.println("Does it have a belly button? True or False. blep.");
    boolean hasBellyButton = monsterScanner.nextBoolean();
    System.out.println("Number of eyes on the monster. pepe");
    int userEyes = monsterScanner.nextInt();
    System.out.println("How many noses? sqwoop.");
    int userNoses = monsterScanner.nextInt();
	
	
	}
}



	
