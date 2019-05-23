package nations.main;
import nations.terrains.Terrain;
import nations.units.Unit;
import nations.improvements.Improvement;
import nations.improvements.NoImprovement;
import nations.nations.Nation;

public class Tile {

	private int production;
	private int gold;
	private int food;
	private Terrain terrain;
	private Nation owner;
	private Improvement improvement;
	private Unit unit;
	
	public Tile(Terrain terrain) {
		production = terrain.getProduction();
		gold = terrain.getGold();
		food = terrain.getFood();
		improvement = new NoImprovement();
		unit = null;
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
	
	public void setOwner(Nation nation) {
		owner = nation;
	}
	
	public void setImprovement(Improvement improvement) {
		this.improvement = improvement;
	}
	
	public void update() {
		production = terrain.getProduction() + improvement.getProduction(); 
		gold = terrain.getGold() + improvement.getGold(); 
		food = terrain.getFood() + improvement.getFood();
	}
	
}
