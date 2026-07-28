package TheIceCreamProgram;

//
//  TheIceCreamProgram - Lets the user build a cone of up to 4 scoops,
//                       analyzes the cone for total calories and average
//                       flavor rating, then lets the user eat the cone
//                       from the top scoop down.
//
//  Uses a Stack<IceCreamScoop> to model the cone.
//  The first scoop added is the bottom; the last scoop added is eaten first.
//

import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;

public class TheIceCreamProgram
{
   static final int MAX_SCOOPS = 4;   // cone scoop limit

   //
   // displayCone() - prints the cone art with all current scoops.
   //                 Bottom of stack = bottom scoop = printed last on screen.
   //
   public static void displayCone(Stack<IceCreamScoop> cone)
   {
      System.out.println();

      if (cone.isEmpty())
      {
         // Empty cone - just show the waffle cone shape
         System.out.println("          (empty)");
         System.out.println("          \\      /");
         System.out.println("           \\    /");
         System.out.println("            \\  /");
         System.out.println("             \\/");
      }
      else
      {
         // Copy stack to list so we can iterate bottom->top
         // index 0 = bottom scoop, last index = top scoop
         ArrayList<IceCreamScoop> scoopList = new ArrayList<>(cone);

         // Print from top scoop down to bottom scoop
         for (int i = scoopList.size() - 1; i >= 0; i--)
         {
            String flavor = scoopList.get(i).GetIceCreamScoopFlavor();
            if (flavor.length() > 12) flavor = flavor.substring(0, 12);
            System.out.printf("         ( %-12s )\n", flavor);
         }
         System.out.println("          \\      /");
         System.out.println("           \\    /");
         System.out.println("            \\  /");
         System.out.println("             \\/");
      }
      System.out.println();
   }

   //
   // buildCone() - prompts the user to add scoops (up to MAX_SCOOPS).
   //               Validates calories (>= 0) and rating (1-10).
   //               Stops early if the user enters an empty flavor string.
   //
   public static void buildCone(Stack<IceCreamScoop> cone, Scanner sc)
   {
      System.out.println("============================================");
      System.out.println("   Welcome to the Ice Cream Cone Builder!");
      System.out.println("============================================");

      while (cone.size() < MAX_SCOOPS)
      {
         int scoopNum = cone.size() + 1;
         System.out.println("\n--- Scoop #" + scoopNum + " ---");
         displayCone(cone);

         // Prompt for flavor; empty string means the user is done
         System.out.print("Enter ice cream flavor (or press Enter to finish): ");
         String flavor = sc.nextLine().trim();

         if (flavor.length() == 0)
         {
            System.out.println("  Cone building complete!");
            break;
         }

         // Validate calories - must be zero or greater
         int calories = -1;
         while (calories < 0)
         {
            System.out.print("Enter calorie count for " + flavor + " (0 or more): ");
            String calInput = sc.nextLine().trim();
            try
            {
               calories = Integer.parseInt(calInput);
               if (calories < 0)
                  System.out.println("  *** Calories must be zero or greater. Try again. ***");
            }
            catch (NumberFormatException e)
            {
               System.out.println("  *** Invalid input. Please enter a whole number. ***");
               calories = -1;
            }
         }

         // Validate flavor rating - must be 1 through 10
         int rating = 0;
         while (rating < 1 || rating > 10)
         {
            System.out.print("Enter flavor rating for " + flavor + " (1-10): ");
            String ratingInput = sc.nextLine().trim();
            try
            {
               rating = Integer.parseInt(ratingInput);
               if (rating < 1 || rating > 10)
                  System.out.println("  *** Rating must be between 1 and 10. Try again. ***");
            }
            catch (NumberFormatException e)
            {
               System.out.println("  *** Invalid input. Please enter a whole number. ***");
               rating = 0;
            }
         }

         // All input valid -- push the new scoop onto the cone stack
         cone.push(new IceCreamScoop(flavor, calories, rating));
         System.out.println("  Added: " + flavor + " scoop! (" + calories + " cal, rating: " + rating + "/10)");
      }

      // Warn if the user reached the 4-scoop maximum
      if (cone.size() == MAX_SCOOPS)
      {
         System.out.println("\n  *** DANGER! Your cone is at the 4-scoop limit! No more scoops allowed! ***");
      }
   }

   //
   // analyzeCone() - prints the total calories and average flavor rating.
   //
   public static void analyzeCone(Stack<IceCreamScoop> cone)
   {
      System.out.println("============================================");
      System.out.println("             Cone Analysis");
      System.out.println("============================================");

      if (cone.isEmpty())
      {
         System.out.println("  Your cone has no scoops to analyze.");
         System.out.println("============================================");
         return;
      }

      int totalCalories = 0;
      int totalRating   = 0;

      // Accumulate calories and ratings across all scoops
      for (IceCreamScoop scoop : cone)
      {
         totalCalories += scoop.GetIceCreamScoopCalories();
         totalRating   += scoop.GetIceCreamScoopRating();
      }

      double avgRating = (double) totalRating / cone.size();

      System.out.println("  Number of scoops  : " + cone.size());
      System.out.printf ("  Total calories    : %d\n", totalCalories);
      System.out.printf ("  Average rating    : %.1f / 10\n", avgRating);
      System.out.println("============================================");
   }

   //
   // eatCone() - lets the user eat the cone one scoop at a time, top first.
   //             Previews the next flavor, waits for Enter, then pops and confirms.
   //
   public static void eatCone(Stack<IceCreamScoop> cone, Scanner sc)
   {
      System.out.println("\n============================================");
      System.out.println("         Time to eat your cone!");
      System.out.println("============================================");

      while (!cone.isEmpty())
      {
         // Peek at the top scoop so we can tell the user what's next
         String nextFlavor = cone.peek().GetIceCreamScoopFlavor();
         System.out.println("\nNext up: " + nextFlavor + " scoop!");
         System.out.print("Press Enter when you are ready to eat it...");
         sc.nextLine();

         // Pop the top scoop and confirm to the user
         IceCreamScoop eaten = cone.pop();
         System.out.println("  Mmm! You just ate the " + eaten.GetIceCreamScoopFlavor() + " scoop!");

         // Show the cone after eating this scoop
         displayCone(cone);
      }

      // All scoops are gone
      System.out.println("============================================");
      System.out.println("  All ice cream is finished! Enjoy the cone!");
      System.out.println("============================================");
   }

   //
   // main() - entry point: build, analyze, then eat the cone.
   //
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      Stack<IceCreamScoop> cone = new Stack<IceCreamScoop>();

      // Phase 1: Build the cone
      buildCone(cone, sc);

      // Show the fully built cone
      System.out.println("\nYour finished cone:");
      displayCone(cone);

      // Phase 2: Analyze the cone
      analyzeCone(cone);

      // Phase 3: Eat the cone
      eatCone(cone, sc);

      sc.close();
   }

}
