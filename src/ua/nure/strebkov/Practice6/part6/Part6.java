package ua.nure.strebkov.Practice6.part6;


import java.util.Scanner;

/** Develop a console application that analyzes the text.
 * The format of the input parameters of the application
 * command line (the program should understand both short
 * and long options):
 * -i (or --input) path to the input file;
 * -t (or --task) the name of the subtask.
 *
 * Tasks:
 * 1. frequency:
 * find the three words that occur most often in the input file,
 * and print them sorted alphabetically in reverse order
 * in the format: word ==> frequency.
 *
 * 2. length:
 * In the input file, find the three longest words and print them
 * in the format: word ==> number of letters in the word.
 * The list should be sorted in descending order of the number
 * of letters in the word.
 *
 * 3. duplicates:
 * In the input file, find the first three words that have duplicates,
 * and print their inversion in the upper case.
 */

public class Part6 {

	public static void main(String[] args) {
		String data = new Scanner(System.in).nextLine();
		CmdManager cmdManager = new CmdManager(data);
		cmdManager.getCommand().execute();
	}
}


