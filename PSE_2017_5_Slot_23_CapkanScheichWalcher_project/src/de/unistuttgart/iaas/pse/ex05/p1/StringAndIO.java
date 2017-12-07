package de.unistuttgart.iaas.pse.ex05.p1;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * Offers various text processing methods.
 *
 * @author Florian Walcher
 */
public class StringAndIO {

	/**
	 * Reads text from a file and counts the occurrence of each word. The result
	 * (i.e. which words occur in the file and how often) is print to the console.
	 *
	 * @param fileName
	 *            The name of the file to read from (may include a relative or
	 *            absolute path)
	 */
	public static void readTextAndCount(String fileName) {
		Map<String, Number> woerter = new HashMap<String, Number>();
		Scanner sc = new Scanner(fileName);
		while(sc.hasNext()) {
			if(woerter.containsKey(sc.next())) {
				woerter.put(sc.next(), woerter.get(sc.next()).intValue() + 1);
			} else {
				woerter.put(sc.next(), 0);
			}
		}
		sc.close();
		System.out.println(woerter.toString());
	}

	/**
	 * Checks if a character is a vowel.
	 *
	 * @param c
	 *            The character to check
	 * @return True if the character is a vowel
	 */
	public static boolean isVowel(char c) {
		switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'ä':
			case 'ö':
			case 'ü':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'Ö':
			case 'Ü':
			case 'Ä':
				return true;
			default: return false;
		}
	}

	/**
	 * Translates a string into Pig Latin by adding "pi" after each vowel.
	 *
	 * @param text
	 *            Text to translate
	 * @return returns Text translated into Pig-Latin
	 */
	public static String toPigLatin(String text) {
		StringBuilder pig = new StringBuilder(text);
		for (int i = text.length() - 1; i >= 0; i--) {
			if(isVowel(text.charAt(i))) {
				if(i == text.length() - 1 || (isVowel(text.charAt(i+1)) == false)) {
					pig.insert(i + 1, "pi");
				}
			}
		}
		return pig.toString();
	}

	/**
	 * only there for testing purpose
	 */
	public static void main(String[] args) {
		System.out.println(toPigLatin("aeiou"));
		System.out.println(toPigLatin("Meine Mutter isst gerne Fisch."));
		System.out.println("----------------------------------------");
		readTextAndCount("beispieltext.txt");
	}

}
