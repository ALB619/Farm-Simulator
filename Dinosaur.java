package cs143.axlal;

//abstract

public abstract class Dinosaur implements Comparable<Dinosaur> {
	
	private int hunger;
	
	private String name;
	
	private String howHungry = "error";
	
	private int hungerLevel = 0;
	
	public Dinosaur(int hunger, String name)
	{
		super();
		this.hunger = hunger;
		this.name = name;
	}
	
	public abstract int getHunger();
	
	public Integer getHungerforSort()	{
		
		return getHunger();
	}
	
	public String getHungerLevel()	{
		
		if(getHunger() >= 20)
		{
			howHungry = "starving";
		}
		else if(getHunger() >= 15)
		{
			howHungry = "very hungry";
		}
		else if(getHunger() >= 10)
		{
			howHungry = "hungry";
		}
		else if(getHunger() >= 5)
		{
			howHungry = "peckish";
		}
		else if(getHunger() >= 0)
		{
			howHungry = "full";
		}
		return howHungry;
		
	}
	
	public int getHungerLevel1()	{
		
		if(getHunger() >= 20)
		{
			hungerLevel = 4;
		}
		else if(getHunger() >= 15)
		{
			hungerLevel = 3;
		}
		else if(getHunger() >= 10)
		{
			hungerLevel = 2;
		}
		else if(getHunger() >= 5)
		{
			hungerLevel = 1;
		}
		else if(getHunger() >= 0)
		{
			hungerLevel = 0;
		}
		
		return hungerLevel;
		
	}
	
	
	public abstract void tick();
	
	public abstract boolean isAsleep();
	
	public abstract void feed();
	
	public abstract StringBuilder speak();
	
	public abstract String getName();
	
	public abstract String getType();
	
	public String toString()	{
		
		return getName() + " the " + getType() + " is " + getHungerLevel() + ".";
	}
	
	public int compareTo(Dinosaur dino) {
		
		return dino.getHungerforSort().compareTo(this.getHungerforSort());

	}

	public abstract boolean ifFull();
	
	
}
