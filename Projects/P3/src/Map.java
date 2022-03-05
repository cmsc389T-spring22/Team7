import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

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

	public Map(int dim) {
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
		if (!field.containsKey(loc))
			field.put(loc, new HashSet<Type>());
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
		//check if null ? dont know if this is necessary
		if(field.get(loc) == null){
			return false;
		}
		//check if wall is at given location
		if(field.get(loc).contains(Map.Type.WALL)){
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
		// wallSet and emptySet will help you write this method
		if (field.get(loc) != null) {
			return field.get(loc);
		} else {
			return emptySet;
		}

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
		if(locations.get(name) != null && this.field.get(locations.get(name)) != null){
			if(this.field.get(locations.get(name)).contains(Type.PACMAN) && this.field.get(locations.get(name)).contains(Type.COOKIE)){
				Location temp = locations.get(name);
				this.field.remove(temp);
				locations.remove("tok_x"+temp.x+"_y"+temp.y);
				this.cookies += 1;
				return components.remove("tok_x"+temp.x+"_y"+temp.y);
			}
			return null;
		}
		
		return null; // complains otherwise.
		// update locations, components, field, and cookies
		// the id for a cookie at (10, 1) is tok_x10_y1

	}
}
