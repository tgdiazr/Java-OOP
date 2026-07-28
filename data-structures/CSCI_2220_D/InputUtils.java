import java.io.*;

public class InputUtils
{
//
// GetInt() - get int input from the keyboard
//
public static int GetInt()
   {
   int IntIn = 0;

   // set up the keyboard input stuff...
   BufferedReader reader;
   reader = new BufferedReader(new InputStreamReader(System.in));

   try
      {
      IntIn = Integer.parseInt(reader.readLine());
      }
   catch (IOException ioe)
      {
      System.out.println("Error receiving integer input.");
      return(-1);
      }

   return(IntIn);
   }  // end GetInt()

//
// GetDbl() - get double (float) input from the keyboard
//
public static double GetDbl()
   {
   double DblIn = 0;

   // set up the keyboard input stuff...
   BufferedReader reader;
   reader = new BufferedReader(new InputStreamReader(System.in));

   try
      {
      DblIn = Double.parseDouble(reader.readLine());
      }
   catch (IOException ioe)
      {
      System.out.println("Error receiving double input.");
      return(-1);
      }

   return(DblIn);
   }  // end GetDbl()

//
// GetStr() - get String input from the keyboard
//
public static String GetStr()
   {
   String StrIn = "";

   // set up the keyboard input stuff...
   BufferedReader reader;
   reader = new BufferedReader(new InputStreamReader(System.in));

   try
      {
      StrIn = reader.readLine();
      }
   catch (IOException ioe)
      {
      System.out.println("Error receiving string input.");
      return("");
      }

   return(StrIn);
   }   // end GetStr()
}   // end InputUtils class