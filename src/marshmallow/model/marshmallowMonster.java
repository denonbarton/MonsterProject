package marshmallow.model;

public class marshmallowMonster
{
		private String monsterName;
		private int monsterEyes;
		private int monsterNoses;
		private double monsterLegs;
		private double monsterHair;
		private boolean monsterBellyButton;
		
		private marshmallowMonster()
		{
			
			
		}
		
		public marshmallowMonster(String monsterName, int monsterEyes, boolean monsterBellyButton, int monsterNoses, double monsterLegs, double monsterHair)
		{
			this.monsterName = monsterName;
			this.monsterEyes = monsterEyes;
			this.monsterNoses = monsterNoses;
			this.monsterLegs = monsterLegs;
			this.monsterHair = monsterHair;
			this.monsterBellyButton = monsterBellyButton;
		}
		
		public String toString()
		{
			String monsterInfo = " legs and its' name is " + monsterLegs + " Legs and its' name is " + monsterName;
		

		}
}