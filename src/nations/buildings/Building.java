package nations.buildings;

public class Building {

	private int production;
	private int gold;
	private int food;
	private int science;
	private int population;
	
	public Building(int production, int gold, int food, int science, int population) {
		this.production = production;
		this.gold = gold;
		this.food = food;
		this.science = science;
		this.population = population;
	}
	
	public int getProduction() {
		return production;
	}
	
	public int getGold() {
		return gold;
	}
	
	public int getFood() {
		return food;
	}
	
	public int getScience() {
		return science;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public void update() {
		
	}
	
}
