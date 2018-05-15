package ua.nure.strebkov.Practice6.part1;

public class Word implements Comparable<Word> {
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

	public void upFrequency() {
		frequency++;
	}

	public void setFrequency(int frequency) {

		this.frequency = frequency;
	}

	@Override
	public int compareTo(Word o) {
		if (frequency == o.frequency) {
			return word.compareTo(o.word);
		} else {
			return -frequency + o.frequency;
		}
	}

	@Override
	public String toString() {
		return word + " : " + frequency;

	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Word other = (Word) obj;
			if (word == null) {
				if (other.word != null)
					return false;
			} else if (!word.equals(other.word))
				return false;
			return true;
		}
}


