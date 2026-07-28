// WayHomeBugs.java
// Author: Tania Diaz
// Course: CSCI 2220
// Date: March 23, 2026
// Description: This program uses a Stack to track locations visited by the user.
//              The user enters coordinates one by one and when done, the program
//              pops each location off the Stack to guide the user back home
//              in reverse order.

package Stack;

import java.util.*;

public class WayHomeBugs {

	public static void main(String[] args) {
		
		Stack<String> locations = new Stack<String>();
		String thisLocation = "xyz";
		String nuttin = "xyz";
		Scanner scanner = new Scanner(System.in);
		
		while ( thisLocation.length() > 0 )
		{
			System.out.println("\nPut in your current coordinates,\n   or press Enter when ready to go back home: ");
			thisLocation = scanner.nextLine();
			if ( thisLocation.length() > 0 )
				locations.push(thisLocation);
		}
		
		System.out.println("\nHeading home!");
		
		// pop items off locations Stack as user is ready for their next waypoint...
		// ... keep popping until the Stack is depleted...
		while ( !locations.isEmpty() )    // BUG fixed: was a for loop with locations.size() but the size gets smaller every time we pop so it wasnt showing all the waypoints
		{
			System.out.println("\nPress Enter to receive your next waypoint\n   on your journey back to your starting point: ");
			nuttin = scanner.nextLine();
			System.out.println("On your journey home, go to this waypoint: " + locations.pop());
		}
		
		System.out.println("\nYou should be back home now!");
		
		scanner.close();
	}

}