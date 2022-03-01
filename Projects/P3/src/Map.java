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

		//checking for bounds
		if(loc.x < 0 || loc.x > dim || loc.y < 0 || loc.y > dim){
			return false;
		}
		//check if wall is at given location
		if(field.get(loc).contains(Map.Type.WALL)){
			return false;
		}
		//check if null ? dont know if this is necessary
		if(field.get(loc) == null){
			return false;
		}
		//only pacman or ghost can move
		if(type != Type.PACMAN && type != Type.GHOST){
			return false;
		}
		//get old location of object
		Location current = locations.get(name);
		HashSet<Type> objInField = field.get(current);
		objInField.remove(type);

		//updating field
		components.get(name).setLocation(loc.x,loc.y);
		field.put(loc,new HashSet<Type>());
		field.get(loc).add(type);
		locations.put(name,loc);

		return true;
	}
	
	public HashSet<Type> getLoc(Location loc) {
		//wallSet and emptySet will help you write this method
		return null;
	}

	public boolean attack(String Name) {
		//update gameOver
		return false;
	}
	
	public JComponent eatCookie(String name) {
		//update locations, components, field, and cookies
		//the id for a cookie at (10, 1) is tok_x10_y1
		return null;
	}
}