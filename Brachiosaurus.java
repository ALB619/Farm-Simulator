package cs143.axlal;

import java.util.Random;

public class Brachiosaurus extends Dinosaur{
	
	//Dinosaur 1
	
	private boolean sleep = false;
	
	private int hunger = 0;
	
	private String name;
	
	private String sound = "Reeeaarrr ";
	
	private String type = "Brachiosaurus";

	public Brachiosaurus(int hunger, String name) {
		super(hunger, name);
		this.hunger = hunger;
		this.name = name;
	}

	@Override
	public StringBuilder speak() {
		
		StringBuilder speak = new StringBuilder();
		
		if(isAsleep())
		{
			speak.append("snore");
		}
		else
		{
			int amountSpeaks = (getHungerLevel1() + 1) * 2;
		
			for(int i = 0; i < amountSpeaks; i++)
			{
				speak.append(sound);
			}
		}

		return speak;
		
	}

	@Override
	public void feed() {
		
		if(isAsleep() == false)
		{
			if(hunger > 4)
			{
				hunger = hunger - 5;
			
				Random rand = new Random();
		
				int slp = rand.nextInt(10);
		
				if(slp == 1)
				{
					sleep = true;
				}
			}
		}
	}

	@Override
	public String getName() {
		
		return name;
	}
	

	public int getHunger() {
		
		return hunger;
	}
	
	public String getType() {
		
		return type;
	}

	@Override
	public void tick() 
	{
		if(hunger < 24)
		{
			hunger = hunger + 1;
		}

		sleep = false;
		
	}
	
	public boolean isAsleep()	{
		
		if(sleep == true)
		{
			return true;
		}
		else return false;
	}

	public boolean ifFull()	{
		
		if(hunger < 5)
		{
			return true;
		}
		else return false;
	}
}
