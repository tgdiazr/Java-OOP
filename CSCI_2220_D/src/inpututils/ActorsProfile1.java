package inpututils;

import java.util.*;

public class ActorsProfile1
   {
   public static void main(String args[])
      {
      ArrayList<String> actorNames = new ArrayList<String>();
      ArrayList<Integer> actorFees = new ArrayList<Integer>();
      ArrayList<Integer> actorAges = new ArrayList<Integer>();
      ArrayList<Double> actorRatings = new ArrayList<Double>();

      System.out.println("This program allows you to enter name, fee, age, and rating (double) of actors, \nand it stores them in four different Java ArrayLists.\nSounds like a complicated program!");
      System.out.println("When you are finished entering actors, just hit Enter with no name.");
      System.out.println("After entering actors, you can modify names, fees, ages, ratings in the ArrayLists.\nWow!");

      LoadActors(actorNames, actorFees, actorAges, actorRatings);
      if ( actorNames.size() > 0 )
         {
         DisplayActors(actorNames, actorFees, actorAges, actorRatings);
         System.out.println("\nThere are " + actorNames.size() + " actors in your portfolio!");
         while ( actorNames.size() > 0 )
            {
            System.out.println("\nEnter 1 to Modify actor info, Enter 2 to Remove actors, anything else to exit:");
            int option = InputUtils.GetInt();
            if ( option == 1 )
               ModifyActors(actorNames, actorFees, actorAges, actorRatings);
            else if ( option == 2 )
               RemoveActors(actorNames, actorFees, actorAges, actorRatings);
            else
               break;
		    }
	     }
      }

   private static void LoadActors(ArrayList<String> actorNames, ArrayList<Integer> actorFees, ArrayList<Integer> actorAges, ArrayList<Double> actorRatings)
      {
      String thisActorName = "abc";
      int thisActorFee, thisActorAge;
      double thisActorRating;

      while ( true )  // allow the user to enter some names/fees/ages/ratings from the keyboard
         {
         // get actor name
         System.out.println("\nEnter name for actor #" + actorNames.size() + ": ");
         thisActorName = InputUtils.GetStr();
         if ( thisActorName.length() > 0 )
            {
            actorNames.add(thisActorName);

            // get actor fee
            while ( true )
               {
               System.out.println("Enter fee for " + thisActorName + ": ");
               thisActorFee = InputUtils.GetInt();
               if ( thisActorFee > 0 )
                  {
                  actorFees.add(thisActorFee);
                  break;
			      }
               else
                  System.out.println("Invalid fee! SAG requires all actors to be paid at least $1. Please reenter. ");
		       }

            // get actor age
            while ( true )
               {
               System.out.println("Enter age for " + thisActorName + ": ");
               thisActorAge = InputUtils.GetInt();
               if ( thisActorAge > 0 )
                  {
                  actorAges.add(thisActorAge);
                  break;
			      }
               else
                  System.out.println("Invalid age! SAG requires all actors to be at least 1 year old. Don't lie! Please reenter. ");
		       }

            // get actor rating
            while ( true )
               {
               System.out.println("Enter rating (1 - 10, fractional values OK) for " + thisActorName + ": ");
               thisActorRating = InputUtils.GetDbl();
               if ( thisActorRating >= 1 && thisActorRating <= 10 )
                  {
                  actorRatings.add(thisActorRating);
                  System.out.println("Successfully entered: " + thisActorName + " Fee: " + thisActorFee + " Age: " + thisActorAge + " Rating: " + thisActorRating);
                  break;
			      }
               else
                  System.out.println("Invalid rating! ratings cannot be less than 1, or greater than 10. Please reenter. ");
		       }
		    }    // end if user entered name of length > 0
         else
            break;
	     }
      }

   private static void DisplayActors(ArrayList<String> actorNames, ArrayList<Integer> actorFees, ArrayList<Integer> actorAges, ArrayList<Double> actorRatings)
      {
      System.out.println("\nHere are your actors: ");
      for ( int i = 0; i < actorNames.size(); i++ )
         {
         System.out.println("\n  Name: "+ actorNames.get(i));
         System.out.println("   Fee: "+ actorFees.get(i));
         System.out.println("   Age: "+ actorAges.get(i));
         System.out.println("Rating: "+ actorRatings.get(i));
	     }
      }


   private static void ModifyActors(ArrayList<String> actorNames, ArrayList<Integer> actorFees, ArrayList<Integer> actorAges, ArrayList<Double> actorRatings)
      {
      String thisActor = "abc", newName;
      int index, newFee, newAge;
      double newRating;

      while ( true )
         {
         System.out.println("\nEnter the actor's name you want to change info for (hit Enter when finished making changes): ");
         thisActor = InputUtils.GetStr();
         if ( thisActor.length() > 0 )
            {
            if ( actorNames.contains(thisActor) )
               {
               index = actorNames.indexOf(thisActor);
               System.out.println(thisActor + " present in the list at location: " + index);

               // allow user to change name
               System.out.println("\nEnter the new name for " + thisActor + " (hit Enter to leave as is): ");
               newName = InputUtils.GetStr();
               if ( newName.length() > 0 )
                  {
                  System.out.println("Got it! ");
                  thisActor = newName;
                  actorNames.set(index, newName);
			      }

               // allow user to change fee
               System.out.println("\nEnter the new fee for " + thisActor + " (current fee: " + actorFees.get(index) + ") (Enter ZERO or less to leave as is): ");
               newFee = InputUtils.GetInt();
               if ( newFee > 0 )
                  {
                  System.out.println("Got it! ");
                  actorFees.set(index, newFee);
			      }

               // allow user to change age
               System.out.println("\nEnter the new age for " + thisActor + " (current age: " + actorAges.get(index) + ") (Enter ZERO or less to leave as is): ");
               newAge = InputUtils.GetInt();
               if ( newAge > 0 )
                  {
                  System.out.println("Got it! ");
                  actorAges.set(index, newAge);
			      }

               // allow user to change rating
               System.out.println("\nEnter the new rating for " + thisActor + " (current rating: " + actorRatings.get(index) + ") (Enter a number out of range 1-10 to leave as is): ");
               newRating = InputUtils.GetDbl();
               if ( newRating >= 1 && newRating <= 10 )
                  {
                  System.out.println("Got it! ");
                  actorRatings.set(index, newRating);
			      }
		       }
            else
               System.out.println(thisActor + " not present in the list.");
		    }
         else
            break;

         DisplayActors(actorNames, actorFees, actorAges, actorRatings);
		 }
      }

   private static void RemoveActors(ArrayList<String> actorNames, ArrayList<Integer> actorFees, ArrayList<Integer> actorAges, ArrayList<Double> actorRatings)
      {
      String thisActor;
      int index, fee, age;
      double rating;

      while ( actorNames.size() > 0 )
         {
         System.out.println("\nEnter the actor's name you wish to remove the profile for (hit Enter when finished removing names): ");
         thisActor = InputUtils.GetStr();
         if ( thisActor.length() > 0 )
            {
            if ( actorNames.contains(thisActor) )
               {
               index = actorNames.indexOf(thisActor);
               System.out.println(thisActor + " present in the lists at location: " + index);
               fee = actorFees.get(index);
               age = actorAges.get(index);
               rating = actorRatings.get(index);

               actorNames.remove(index);
               actorFees.remove(index);
               actorAges.remove(index);
               actorRatings.remove(index);

               System.out.println("\n" + thisActor + " (Fee: " + fee + ", Age: " + age + ", Rating: " + rating + ") was removed! Bye-bye to that one!");
		       }
            else
               System.out.println(thisActor + " not present in the list.");
		    }
         else
            break;

         DisplayActors(actorNames, actorFees, actorAges, actorRatings);
		 }
      }
   }