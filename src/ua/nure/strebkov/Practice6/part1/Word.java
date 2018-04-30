package ua.nure.strebkov.Practice6.part1;

public class Word {
	private String word;
	private int frequency;

	public Word(String word) {
		this.word = word;
		frequency = 1;
	}

	public int getFrequency() {
		return frequency;
	}

	public String getWord() {
		return word;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

}
