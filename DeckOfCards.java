package DeckOfCards.java;

import java.util.*;

public class DeckOfCards {
	static String[] Suits = { "Clubs", "Diamond", "Hearts", "Spades" };
	static String[] Rank = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "king", "Ace" };
	static String[][] deck = new String[Suits.length][Rank.length];

	public static void cards() {
		for (int i = 0; i < Suits.length; i++) {
			for (int j = 0; j < Rank.length; j++) {
				deck[i][j] = Suits[i] + Rank[j];
			}

		}
	}

	public static void shuffle() {
		Random shuffle = new Random();
		for (int i = 0; i < Suits.length; i++) {
			for (int j = 0; j < Rank.length; j++) {
				int m = shuffle.nextInt(i + 1);
				int n = shuffle.nextInt(j + 1);
				String temp = deck[i][j];
				deck[i][j] = deck[m][n];
				deck[m][n] = temp;
			}
		}
	}

	public static void distribute() {
		for (int i = 0; i <=4; i++) {
			System.out.println("");
			System.out.println("Cards recieved by players " + (i + 1) + " is ");
			for (int j = 0; j < 9; j++) {
				System.out.println(" " + deck[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("welcome to the program of DECK OF CARDS");
		cards();
		shuffle();
		distribute();
	}
}