package de.unistuttgart.iaas.pse.ex05.p1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * Offers various text processing methods.
 * 
 * @author Sandro Speth
 * @version 1.0
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
		// TODO
	}

	/**
	 * Checks if a character is a vowel.
	 * 
	 * @param c
	 *            The character to check
	 * @return True if the character is a vowel
	 */
	public static boolean isVowel(char c) {
		// TODO
		return false;
	}

	/**
	 * Translates a string into Pig Latin by adding "pi" after each vowel.
	 * 
	 * @param text
	 *            Text to translate
	 * @return returns Text translated into Pig-Latin
	 */
	public static String toPigLatin(String text) {
		// TODO
		return null;
	}

	/**
	 * only there for testing purpose
	 */
	public static void main(String[] args) {
		System.out.println(toPigLatin("Meine Mutter isst gerne Fisch."));
		System.out.println("----------------------------------------");
		readTextAndCount("beispieltext.txt");
	}
	
}
