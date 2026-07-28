package inpututils;  // Package declaration

public class Actor {
    private String mName;
    private int mAge;
    private int mFee;
    private double mRating;
    private double mRiskFactor; // NEW: holds the actor's current risk factor

    // Constructor
    public Actor(String _name, int _fee, int _age, double _rating) {
        mName = _name;
        mAge = _age;
        mFee = _fee;
        mRating = _rating;
        CalcActorRiskFactor(); // NEW: calculate risk factor when object is created
    }

    // GetActorName() - Returns the actor's name
    public String GetActorName() {
        return mName;
    }

    // GetActorAge() - Returns the actor's age
    public int GetActorAge() {
        return mAge;
    }

    // GetActorFee() - Returns the actor's fee
    public int GetActorFee() {
        return mFee;
    }

    // GetActorRating() - Returns the actor's rating
    public double GetActorRating() {
        return mRating;
    }

    // NEW: GetActorRiskFactor() - Returns the actor's risk factor
    public double GetActorRiskFactor() {
        return mRiskFactor;
    }

    // SetActorName() - Sets the actor's name
    public void SetActorName(String newName) {
        mName = newName;
    }

    // SetActorAge() - Sets the actor's age, then recalculates risk factor
    public void SetActorAge(int newAge) {
        mAge = newAge;
        CalcActorRiskFactor(); // NEW: recalculate risk factor when age changes
    }

    // SetActorFee() - Sets the actor's fee, then recalculates risk factor
    public void SetActorFee(int newFee) {
        mFee = newFee;
        CalcActorRiskFactor(); // NEW: recalculate risk factor when fee changes
    }

    // SetActorRating() - Sets the actor's rating, then recalculates risk factor
    public void SetActorRating(double newRating) {
        mRating = newRating;
        CalcActorRiskFactor(); // NEW: recalculate risk factor when rating changes
    }

    // NEW: CalcActorRiskFactor() - Calculates and stores the actor's risk factor
    private void CalcActorRiskFactor() {
        mRiskFactor = ((mAge * 1000 + mFee) / mRating) / 1000;
    }
}