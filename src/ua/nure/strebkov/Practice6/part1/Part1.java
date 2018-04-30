package ua.nure.strebkov.Practice6.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part1 {
	
		public static final String ENCODING = "Cp1251";
		public static void main(String[] args) throws IOException {
			System.out.println("Enter words:");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in, ENCODING));
			String text = in.readLine();
			WordContainer wc = new WordContainer();
			if (text != null) {
				for (String word : text.split(" ")) {
					wc.add(word);
				}
			}			
			wc.print(); 
		}
	}
	

