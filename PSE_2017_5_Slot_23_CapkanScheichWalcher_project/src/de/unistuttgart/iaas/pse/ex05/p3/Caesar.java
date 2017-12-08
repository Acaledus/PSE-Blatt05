package de.unistuttgart.iaas.pse.ex05.p3;

import java.util.ArrayList;
import java.util.List;

/**
 * String encryption based on the "Caesar cipher"
 * (https://en.wikipedia.org/wiki/Caesar_cipher)
 * @author Daniel Capkan, Matrikelnummer: 3325960, st156303@stud.uni-stuttgart.de
 * @author Mario Scheich, Matrikelnummer: 3232655 , st151491@stud.uni-stuttgart.de
 * @author Florian Walcher, Matrikelnummer: 3320185, st156818@stud.uni-stuttgart.de
 */
public class Caesar {

	/**
	 * Encrypts a text with Caesar ciphering and returns a list of all possible
	 * encryptions. Only characters with an ASCII value between 65 and 90 and
	 * between 97 and 122 are encrypted, all other characters stay unchanged.
	 *
	 * @param text
	 *            The text to encrypt
	 * @return All possible encryptions of the given text that can be created using
	 *         the "Caesar cipher"
	 */
	public static List<String> cipher(String text) {
		List<String> cipher = new ArrayList<String>();

		for (int i = 0; i < 26; i++) { //Iteriert durch die 23 Möglichkeiten einer Verschlüsselung.
			char[] inZeichen = text.toCharArray(); //Erstellt eine Kopie des Textes als Char-Array.
			for (int j = 0; j < inZeichen.length; j++) { //Iteriert durch die Zeichen des Textes.
				if (inZeichen[j] < 91 && inZeichen[j] > 64) { //Falls das Zeichen ein Großbuchstabe ist:
					inZeichen[j] = (char)(inZeichen[j] + i);
					if (inZeichen[j] >= 91) {
						inZeichen[j] = (char)(inZeichen[j] - 26);
					}
				} else if (inZeichen[j] < 123 && inZeichen[j] > 96) { //Falls das Zeichen ein Kleinbuchstabe ist:
					inZeichen[j] = (char)(inZeichen[j] + i);
					if (inZeichen[j] >= 123) {
						inZeichen[j] = (char)(inZeichen[j] - 26);
					}
				}
			}
			String s = new String(inZeichen);
			cipher.add(s);
		}
		return cipher;
	}
	public static void main(String[] args) {
		System.out.println(cipher("Hallo, dies ist ein Beispieltext für PSE"));
	}
}