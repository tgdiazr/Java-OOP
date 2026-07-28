package Tortilleria;

//
//  Tortilla - This file contains the data definitions and the methods for the Tortilla class.
//

public class Tortilla
{
   private String mType;   // corn, flour, or kamut
   private int mRating;    // quality of this tortilla in the range 1 - 5

   //
   // Tortilla() - this is the constructor for the class
   //
   public Tortilla(String _type, int _rating)
   {
      mType = _type;
      mRating = _rating;
   }

   //
   // GetTortillaType() - this method returns the tortilla type
   //
   public String GetTortillaType()
   {
      return(mType);
   }

   //
   // GetTortillaRating() - this method returns the tortilla rating
   //
   public double GetTortillaRating()
   {
      return(mRating);
   }

   //
   // ResetTortillaRating() - this method allows the user program to reset the tortilla rating
   //
   public void ResetTortillaRating(int _newRating)
   {
      mRating = _newRating;
   }

}
