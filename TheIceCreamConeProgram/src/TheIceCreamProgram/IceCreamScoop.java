package TheIceCreamProgram;

//
//  IceCream - This file contains the data definitions and the methods for the IceCream class.
//

public class IceCreamScoop
{
   private String mFlavor;
   private int mCalories;
   private int mRating;

   //
   // IceCreamScoop() - this is the constructor for the class;
   //
   public IceCreamScoop(String _flavor, int _calories, int _rating)
   {
      mFlavor   = _flavor;
      mCalories = _calories;
      mRating   = _rating;
   }

   //
   // GetIceCreamScoopFlavor() - this method returns the ice cream scoop's flavor... e.g. chocolate
   //
   public String GetIceCreamScoopFlavor()
   {
      return(mFlavor);
   }

   //
   // GetIceCreamScoopCalories() - this method returns the ice cream scoop's calorie count
   //
   public int GetIceCreamScoopCalories()
   {
      return(mCalories);
   }

   //
   // GetIceCreamScoopRating() - this method returns the ice cream scoop's flavor rating
   //
   public double GetIceCreamScoopRating()
   {
      return(mRating);
   }

}

