package marshmallow.controller;

import marshmallow.model.marshmallowMonster;
import marshmallow.veiw.MonsterDisplay;
import java.util.Scanner;

public class MarshmallowController
{

	private marshmallowMonster denonMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	
	public MonsterDisplay myDisplay()
	{
		
	
	 }
			
	public void start()
	{
		myDisplay.displaytInfo( denonMonster.toString());
		askQuestions();
		myDisplay.displayInfo("Updated monster info: " + denonMonster.toString);
	
	private void askQuestions()
	{
	System.out.println("I want a new name for a monster, type one please!");
	String newMonsterName = monsterScanner.next();
	denonMonster.setMonsterName(newMonsterName);
	}
}

	//String name = "Derf the Evil";
			//int eyes = 30;
			//double legs = 3.4;
			//double hair = 0.07;                       not supposed to be here
			//boolean hasBellyButton = false;
			
			//monsterScanner =
			//myDisplay = new MonsterDisplay();
			//denonMonster = new marshmallowMonster(name, eyes, hasBellyButton, nose, legs, hair);
