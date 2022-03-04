import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map{

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE		
	}
	
	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components; 
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet; 

	private int cookies = 0;

	public Map(int dim){
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}


	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}
		
	public boolean move(String name, Location loc, Type type) {
		//update locations, components, and field
		//use the setLocation method for the component to move it to the new location
		return false;
	}
	
	public HashSet<Type> getLoc(Location loc) {
		//wallSet and emptySet will help you write this method
		return null;
	}

	public boolean attack(String Name) {
		
		Location ghostLoc = locations.get(Name);
		
		if (ghostLoc == null) {
			return false;
		}
		
		// y+1
		Location check1 = new Location(ghostLoc.x, ghostLoc.y+1);
		
		// y-1
		Location check2 = new Location(ghostLoc.x, ghostLoc.y-1);

		// x+1
		Location check3 = new Location(ghostLoc.x+1, ghostLoc.y);

		// x-1
		Location check4 = new Location(ghostLoc.x-1, ghostLoc.y);
		
		
		if (field.get(check1).contains(Map.Type.PACMAN)
				&& (field.get(check1) != null)) {
			gameOver = true;
			return true;
		} else if (field.get(check2).contains(Map.Type.PACMAN)
				&& (field.get(check2) != null)) {
			gameOver = true;
			return true;
		}else if (field.get(check3).contains(Map.Type.PACMAN)
				&& (field.get(check3) != null)) {
			gameOver = true;
			return true;
		}else if (field.get(check4).contains(Map.Type.PACMAN)
				&& (field.get(check4) != null)) {
			gameOver = true;
			return true;
		}else {
			gameOver = false;
			return false;
		}
		
		//update gameOver
	}
	
	public JComponent eatCookie(String name) {
		//update locations, components, field, and cookies
		//the id for a cookie at (10, 1) is tok_x10_y1
		return null;
	}
}
