import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.*;
 import static org.junit.Assert.*;



// class TestRunner {
// 	public static void main(String[] args) {
// 	   Result result = JUnitCore.runClasses(TestMapEatCookie.class);
		 
// 	   for (Failure failure : result.getFailures()) {
// 		  System.out.println(failure.toString());
// 	   }
		 
// 	   System.out.println(result.wasSuccessful());
// 	}
//  }  

public class TestMapEatCookie {

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE		
	}

	@Test
	public void testMapEatCookie() throws FileNotFoundException{

		MainFrame frame = new MainFrame();
		Location location = new Location(4, 6);
		PacMan pacman = frame.addPacMan(location);
	
		frame.add(new CookieComponent(4, 6, 20));
		frame.getMap().eatCookie(pacman.myName);

		// if (frame.getMap() == null ) {
		// 	System.out.print("null");
		// }
		// if (frame.getMap().getLoc(location) == null ) {
		// 	System.out.print("null part 2");
		// }

		assertTrue(frame.getMap().getLoc(location).contains(Map.Type.COOKIE) == false);
	}
}
