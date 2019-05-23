package nations.main;

public class Map {

	private Tile[][] board;
	
	public Map(int height, int width) {
		
		board = new Tile[height][width];
		
	}
	
	public Tile[][] getTiles() {
		return board;
	}
	
}
