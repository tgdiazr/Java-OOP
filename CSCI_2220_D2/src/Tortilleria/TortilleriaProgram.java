package Tortilleria;

//
//  TortilleriaProgram - Simulates the tortilla cooking and serving process
//                       at Tom's Tortilla Factory.
//
//  Cooking phase:  tortillas are pushed onto a main stack until the cook says 'done'.
//  Serving phase:  customers request a type; the program pops tortillas off the main
//                  stack onto a temp stack to find the first match, serves it, then
//                  restores the temp stack back onto the main stack.
//

import java.util.Stack;
import java.util.Scanner;

public class TortilleriaProgram
{

   //
   // cookTortillas() - prompts the cook to add tortillas to the main stack.
   //                   Validates type (corn/flour/kamut) and rating (1-5).
   //                   Stops when the cook types 'done'.
   //
   public static void cookTortillas(Stack<Tortilla> mainStack, Scanner sc)
   {
      System.out.println("=== Tom's Tortilla Factory - Cooking Phase ===");

      while (true)
      {
         // Prompt for tortilla type
         System.out.print("\nEnter tortilla type (corn, flour, kamut) or 'done' to stop cooking: ");
         String type = sc.nextLine().trim().toLowerCase();

         // Check if cooking is finished
         if (type.equals("done"))
         {
            System.out.println("Cooking complete! " + mainStack.size() + " tortilla(s) on the stack.");
            break;
         }

         // Validate the tortilla type
         if (!type.equals("corn") && !type.equals("flour") && !type.equals("kamut"))
         {
            System.out.println("  *** Invalid type! Please enter 'corn', 'flour', or 'kamut'. ***");
            continue;
         }

         // Prompt for quality rating
         System.out.print("Enter quality rating (1-5): ");
         String ratingInput = sc.nextLine().trim();
         int rating;

         // Validate that rating is a number
         try
         {
            rating = Integer.parseInt(ratingInput);
         }
         catch (NumberFormatException e)
         {
            System.out.println("  *** Invalid rating! Please enter a whole number between 1 and 5. ***");
            continue;
         }

         // Range-check the rating
         if (rating < 1 || rating > 5)
         {
            System.out.println("  *** Invalid rating! Rating must be between 1 and 5. ***");
            continue;
         }

         // All input valid -- create the tortilla and push it onto the main stack
         Tortilla t = new Tortilla(type, rating);
         mainStack.push(t);
         System.out.println("  Added: " + type + " tortilla (rating: " + rating + ") to the stack.");
      }
   }

   //
   // serveTortillas() - customers request a tortilla type.
   //                    Searches the main stack via a temp stack, serves the first
   //                    match found, then restores the temp stack to the main stack.
   //                    Stops when the customer types 'done'.
   //
   public static void serveTortillas(Stack<Tortilla> mainStack, Scanner sc)
   {
      System.out.println("\n=== Tom's Tortilla Factory - Serving Phase ===");

      while (true)
      {
         // Prompt for the desired tortilla type
         System.out.print("\nWhat type of tortilla would you like? (corn, flour, kamut) or 'done' to leave: ");
         String request = sc.nextLine().trim().toLowerCase();

         // Check if the customer is done
         if (request.equals("done"))
         {
            System.out.println("Thanks for visiting Tom's Tortilla Factory! Goodbye!");
            break;
         }

         // Validate the requested type
         if (!request.equals("corn") && !request.equals("flour") && !request.equals("kamut"))
         {
            System.out.println("  *** We only serve corn, flour, or kamut tortillas. ***");
            continue;
         }

         // Use a temp stack to search for the requested tortilla
         Stack<Tortilla> tempStack = new Stack<Tortilla>();
         boolean found = false;

         // Pop from main stack into temp stack until we find the requested type
         while (!mainStack.isEmpty())
         {
            Tortilla current = mainStack.pop();

            if (current.GetTortillaType().equals(request))
            {
               // Found it -- serve it to the customer
               System.out.println("  Here is your " + current.GetTortillaType()
                     + " tortilla! (quality rating: " + (int)current.GetTortillaRating() + ")");
               found = true;
               break;
            }
            else
            {
               // Not a match -- hold it on the temp stack
               tempStack.push(current);
            }
         }

         // Let the customer know if their type was not found
         if (!found)
         {
            System.out.println("  Sorry, we are out of " + request + " tortillas!");
         }

         // Restore the temp stack back onto the main stack
         while (!tempStack.isEmpty())
         {
            mainStack.push(tempStack.pop());
         }

         // Notify if the stack is now completely empty
         if (mainStack.isEmpty())
         {
            System.out.println("  The tortilla stack is now empty - no more tortillas available!");
         }
      }
   }

   //
   // main() - entry point; runs the cooking phase then the serving phase.
   //
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      Stack<Tortilla> mainStack = new Stack<Tortilla>();

      // Phase 1: Cook and stack the tortillas
      cookTortillas(mainStack, sc);

      // Phase 2: Serve tortillas to customers
      serveTortillas(mainStack, sc);

      sc.close();
   }

}
