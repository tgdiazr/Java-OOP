package inpututils;

import java.util.*;

public class ActorProfileOOP_almost {

    public static void main(String[] args) {

        String thisActorName = "";
        int i, howMany, thisActorAge, thisActorFee;
        double thisActorRating;

        // Create an ArrayList of Actor objects
        ArrayList<Actor> actors = new ArrayList<Actor>();

        LoadActors(actors);

        System.out.println("\nYou entered " + actors.size() + " actors ");

        if (actors.size() > 0) {
            DisplayActors(actors);
            System.out.println("\nThere are " + actors.size() + " actors in the ArrayList of Actor objects!");

            while (actors.size() > 0) {
                System.out.println("\nEnter 1 to Modify actors, Enter 2 to Remove actors, anything else to exit:");
                int option = InputUtils.GetInt();

                if (option == 1)
                    ModifyActors(actors);
                else if (option == 2)
                    RemoveActors(actors);
                else
                    break;
            }
        }
    } // end main

    // ----------------- Load Actors -----------------
    private static void LoadActors(ArrayList<Actor> actors) {
        String thisActorName;
        int thisActorAge, thisActorFee;
        double thisActorRating;

        while (true) {
            System.out.println("\nPlease enter the actor's name: ");
            thisActorName = InputUtils.GetStr();
            if (thisActorName.length() < 1)
                break;

            thisActorAge = 0;
            while (thisActorAge < 1) {
                System.out.println("Please enter the actor's age: ");
                thisActorAge = InputUtils.GetInt();
                if (thisActorAge < 1)
                    System.out.println("Invalid actor age. Please re-enter.");
            }

            thisActorFee = -1;
            while (thisActorFee < 0) {
                System.out.println("Please enter the actor's fee: ");
                thisActorFee = InputUtils.GetInt();
                if (thisActorFee < 1)
                    System.out.println("Invalid actor fee. Please re-enter.");
            }

            thisActorRating = 0;
            while (thisActorRating < 1 || thisActorRating > 10) {
                System.out.println("Please enter the actor's rating (1 - 10): ");
                thisActorRating = InputUtils.GetDbl();
                if (thisActorRating < 1)
                    System.out.println("Invalid actor rating. Please re-enter.");
            }

            // Create Actor object and add to ArrayList
            Actor thisActor = new Actor(thisActorName, thisActorFee, thisActorAge, thisActorRating);
            actors.add(thisActor);
        }
    }

    // ----------------- Display Actors -----------------
    private static void DisplayActors(ArrayList<Actor> actors) {
        System.out.println("\nHere are your actors: ");
        for (int i = 0; i < actors.size(); i++) {
            System.out.println("\nActor " + i + ": " + actors.get(i).GetActorName());
            System.out.println(" Fee: "        + actors.get(i).GetActorFee());
            System.out.println(" Age: "        + actors.get(i).GetActorAge());
            System.out.println(" Rating: "     + actors.get(i).GetActorRating());
            System.out.println(" Risk Factor: "+ actors.get(i).GetActorRiskFactor()); // NEW
        }
    }

    // ----------------- Modify Actors -----------------
    private static void ModifyActors(ArrayList<Actor> actors) {
        String thisActor = "abc", newName;
        int i, index, newFee, newAge;
        double newRating;

        ArrayList<String> actorNames = new ArrayList<String>();

        for (i = 0; i < actors.size(); i++)
            actorNames.add(actors.get(i).GetActorName());

        while (true) {
            System.out.println("\nEnter the actor's name you want to change info for (hit Enter when finished making changes): ");
            thisActor = InputUtils.GetStr();

            if (thisActor.length() > 0) {
                if (actorNames.contains(thisActor)) {
                    index = actorNames.indexOf(thisActor);
                    System.out.println(thisActor + " present in the list at location: " + index);

                    // Change name
                    System.out.println("\nEnter the new name for " + thisActor + " (hit Enter to leave as is): ");
                    newName = InputUtils.GetStr();
                    if (newName.length() > 0) {
                        System.out.println("Got it!");
                        thisActor = newName;
                        actorNames.set(index, newName);
                        actors.get(index).SetActorName(thisActor);
                    }

                    // Change fee
                    System.out.println("\nEnter the new fee for " + thisActor +
                            " (current fee: " + actors.get(index).GetActorFee() +
                            ") (Enter ZERO or less to leave as is): ");
                    newFee = InputUtils.GetInt();
                    if (newFee > 0) {
                        System.out.println("Got it!");
                        actors.get(index).SetActorFee(newFee);
                    }

                    // Change age
                    System.out.println("\nEnter the new age for " + thisActor +
                            " (current age: " + actors.get(index).GetActorAge() +
                            ") (Enter ZERO or less to leave as is): ");
                    newAge = InputUtils.GetInt();
                    if (newAge > 0) {
                        System.out.println("Got it!");
                        actors.get(index).SetActorAge(newAge);
                    }

                    // Change rating
                    System.out.println("\nEnter the new rating for " + thisActor +
                            " (current rating: " + actors.get(index).GetActorRating() +
                            ") (Enter a number out of range 1-10 to leave as is): ");
                    newRating = InputUtils.GetDbl();
                    if (newRating >= 1 && newRating <= 10) {
                        System.out.println("Got it!");
                        actors.get(index).SetActorRating(newRating);
                    }

                } else {
                    System.out.println(thisActor + " not present in the list.");
                }
            } else
                break;

            DisplayActors(actors);
        }
    }

    // ----------------- Remove Actors -----------------
    private static void RemoveActors(ArrayList<Actor> actors) {
        String thisActor;
        int i, index, fee, age;
        double rating;
        ArrayList<String> actorNames = new ArrayList<String>();

        for (i = 0; i < actors.size(); i++)
            actorNames.add(actors.get(i).GetActorName());

        while (actors.size() > 0) {
            System.out.println("\nEnter the actor's name you wish to remove the profile for (hit Enter when finished removing actors): ");
            thisActor = InputUtils.GetStr();
            if (thisActor.length() > 0) {
                if (actorNames.contains(thisActor)) {
                    index = actorNames.indexOf(thisActor);
                    System.out.println(thisActor + " present in the lists at location: " + index);
                    fee = actors.get(index).GetActorFee();
                    age = actors.get(index).GetActorAge();
                    rating = actors.get(index).GetActorRating();
                    actors.remove(index);
                    System.out.println("\n" + thisActor + " (Fee: " + fee + ", Age: " + age + ", Rating: " + rating + ") was removed! Bye-bye to that one!");
                } else
                    System.out.println(thisActor + " not present in the list.");
            } else
                break;

            DisplayActors(actors);
        }
    }
}