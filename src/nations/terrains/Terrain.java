package nations.terrains;

public abstract class Terrain {

	private int production;
	private int gold;
	private int food;
	
	public Terrain(int production, int gold, int food) {
		this.production = production;
		this.gold = gold;
		this.food = food;
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
	
}
