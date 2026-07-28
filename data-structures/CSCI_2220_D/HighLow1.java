// the HighLow program!
public class HighLow1
   { // here is the main method of the program
   public static void main(String[] args)
      {
      int numCount=0, goAgain, thisNum, HighNum=0, LowNum=0;

      System.out.println("The HighLow program! \nThis program will allow you to enter some numbers, \nand will then tell you the high and low number from the list.");

      while (true)
         {
         System.out.println("\nPlease enter number " + numCount + ": ");
         thisNum = InputUtils.GetInt();

         if ( numCount == 0 )
	        HighNum = LowNum = thisNum;
         else if ( thisNum > HighNum )
            HighNum = thisNum;
         else if ( thisNum < LowNum )
            LowNum = thisNum;

         numCount++;
         System.out.println("\nEnter another number? Press 1 for yes: ");
         goAgain = InputUtils.GetInt();
         if ( goAgain != 1 )
            break;
         }

      System.out.println("You entered " + numCount + " numbers. The high number is: " + HighNum + " and the low number is " + LowNum);
      }   // end main
   }   // end class