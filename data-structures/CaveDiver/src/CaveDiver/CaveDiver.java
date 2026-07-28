package CaveDiver;

//
//  CaveDiver - Guides a cave diver back to their starting point using a Stack.
//
//  As the diver enters the cave, each Left or Right turn at a fork is pushed
//  onto the stack.  When the diver is ready to exit, the stack is popped and
//  each direction is reversed so the diver retraces their path safely.
//

import java.util.Stack;
import java.util.Scanner;

public class CaveDiver
{

   //
   // enterCave() - prompts the diver to enter L or R at each fork.
   //               Pushes each valid turn onto the dive stack.
   //               Stops when the diver enters 'done'.
   //
   public static void enterCave(Stack<String> diveStack, Scanner sc)
   {
      System.out.println("==========================================");
      System.out.println("       Welcome to the Cave Diver!");
      System.out.println("==========================================");
      System.out.println("Enter your turns as you dive into the cave.");
      System.out.println("Type 'L' for Left, 'R' for Right.");
      System.out.println("Type 'done' when you are ready to turn around.");
      System.out.println("==========================================\n");

      while (true)
      {
         System.out.print("Enter turn at next fork (L / R) or 'done' to turn around: ");
         String turn = sc.nextLine().trim().toUpperCase();

         if (turn.equals("DONE"))
         {
            System.out.println("\nOK - time to head back out. Good luck!\n");
            break;
         }
         else if (turn.equals("L"))
         {
            diveStack.push("L");
            System.out.println("  --> You went Left.  Turn recorded.\n");
         }
         else if (turn.equals("R"))
         {
            diveStack.push("R");
            System.out.println("  --> You went Right.  Turn recorded.\n");
         }
         else
         {
            System.out.println("  *** Invalid input! Please enter 'L', 'R', or 'done'. ***\n");
         }
      }
   }

   //
   // exitCave() - pops each turn off the stack and tells the diver the
   //              REVERSE direction to take at each fork on the way out.
   //              Waits for Enter between each instruction.
   //
   public static void exitCave(Stack<String> diveStack, Scanner sc)
   {
      System.out.println("==========================================");
      System.out.println("     Guiding you back out of the cave...");
      System.out.println("==========================================\n");

      if (diveStack.isEmpty())
      {
         System.out.println("You made no turns - you are already at the start!");
         return;
      }

      int forkNum = 1;

      // Pop each turn and reverse it to guide the diver out
      while (!diveStack.isEmpty())
      {
         String lastTurn = diveStack.pop();
         String reverseDirection;

         // Reverse the direction: L becomes R, R becomes L
         if (lastTurn.equals("L"))
            reverseDirection = "Right";
         else
            reverseDirection = "Left";

         System.out.println("Fork #" + forkNum + ": Go " + reverseDirection + ".");

         // Wait for the diver to confirm before giving the next instruction
         if (!diveStack.isEmpty())
         {
            System.out.print("Press Enter when you are ready for the next instruction...");
            sc.nextLine();
            System.out.println();
         }

         forkNum++;
      }

      System.out.println("\n==========================================");
      System.out.println("  You have made it safely back to the start!");
      System.out.println("==========================================");
   }

   //
   // main() - entry point: guide the diver in, then guide them back out.
   //
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      Stack<String> diveStack = new Stack<String>();

      // Phase 1: Diver enters the cave, recording turns
      enterCave(diveStack, sc);

      // Phase 2: Guide the diver back out using the reversed stack
      exitCave(diveStack, sc);

      sc.close();
   }

}
