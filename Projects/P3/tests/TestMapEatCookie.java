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

		NoFrame frame = new NoFrame();
		Location location = new Location(1, 1);
		PacMan pacman = frame.addPacMan(location);
		assertTrue(frame.getMap().getLoc(location).contains(Map.Type.COOKIE) == true);

		frame.getMap().eatCookie(pacman.myName);

		assertTrue(frame.getMap().getLoc(location).contains(Map.Type.COOKIE) == false);
	}
}
