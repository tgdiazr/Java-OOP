package FinalTest;

// Student Name:  Tania Diaz
// Date:          May 16, 2026
// Assignment:    CardDealer - FOP Approach
// Description:   This program builds a deck of 52 cards using an ArrayList of Strings.
//                Each card String holds 7 fields separated by commas:
//                card value, suit code, value text, suit text, total card text,
//                unique card code, and card available flag.
//                The main method parses each card String and prints each field
//                on its own labeled line.

import java.util.ArrayList;

public class CardDelear {

    public static void main(String[] args) {

        // Create the ArrayList to hold all 52 card strings
        ArrayList<String> deck = new ArrayList<String>();

        // Define suit codes, suit names, value names, and value numbers
        int[]    suitCodes  = {1, 2, 3, 4};
        String[] suitNames  = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] valueNames = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
                               "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

        // Build all 52 cards and add them to the deck
        for (int s = 0; s < suitCodes.length; s++) {
            for (int v = 1; v <= 13; v++) {

                int    suitCode      = suitCodes[s];
                String suitText      = suitNames[s];
                String valueText     = valueNames[v - 1];
                String totalCardText = valueText + " of " + suitText;
                int    uniqueCode    = suitCode * 100 + v;
                int    available     = 1;  // 1 means card has not been dealt yet

                // Build the card string with all 7 fields separated by commas
                String card = v + "," + suitCode + "," + valueText + "," + suitText + ","
                            + totalCardText + "," + uniqueCode + "," + available;

                deck.add(card);
            }
        }

        // Parse and print each card string field by field
        for (String thisCard : deck) {

            // Print the raw card string first
            System.out.println("Card: " + thisCard);

            // Split the card string into its 7 parts using the comma delimiter
            String[] parts = thisCard.split(",");

            // Extract each field by index
            String cardValue      = parts[0];
            String suitCode       = parts[1];
            String valueText      = parts[2];
            String suitText       = parts[3];
            // total card text is "X of Y" which contains a comma - rejoin parts 4 and 5 if needed
            // Since "Ace of Clubs" has no comma, parts[4] holds it correctly
            String totalCardText  = parts[4];
            String uniqueCardCode = parts[5];
            String cardAvailable  = parts[6];

            // Print each field on its own labeled line
            System.out.println("  card value: "      + cardValue);
            System.out.println("  suit code: "       + suitCode);
            System.out.println("  value text: "      + valueText);
            System.out.println("  suit text: "       + suitText);
            System.out.println("  total card text: " + totalCardText);
            System.out.println("  unique card code: "+ uniqueCardCode);
            System.out.println("  card available: "  + cardAvailable);
            System.out.println(); // blank line between cards
        }
    }
}
