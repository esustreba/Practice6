package ua.nure.strebkov.Practice6.part6;

import ua.nure.strebkov.Practice6.part1.Word;
import ua.nure.strebkov.Practice6.part1.WordContainer;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Command {
    private static final String[] TASKS = { "frequency", "length", "duplicates" };
    private File file;
    private String task;

    public Command(String path, String task) {
        file = new File(path);
        this.task = task;
    }

    public void execute() {
        String inputData = Util.readFile(file);
        if (!Objects.isNull(inputData)) {

            if (task.equals(TASKS[0])) {
                executeFrequency(inputData);
            } else if (task.equals(TASKS[1])) {
                executeLength(inputData);
            } else if (task.equals(TASKS[2])) {
                executeDuplicates(inputData);
            } else {
                throw new UnsupportedOperationException("Invalid command.");
            }
        }
    }

    private void executeFrequency(String s) {
        WordContainer wordContainer = new WordContainer();
        wordContainer.add(s);
        List<Word> resultList = wordContainer.getWords();

        for (int i = 2; i >= 0; i--) {
            System.out.println(resultList.get(i));
        }

    }

    private <T> void executeLength(String s) {
        HashSet<String> nonDuplicatesSet = new HashSet<>(Arrays.asList(s.split(" ")));
        ArrayList<String> resultList = new ArrayList<>(nonDuplicatesSet);
        Collections.sort(resultList, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }

        });
        Iterator<String> iterator = resultList.listIterator();
        int currentLength = 0;
        int counter = 0;
        while (counter < 3) {
            String word = iterator.next();
            if (currentLength > word.length()) {
                currentLength = word.length();
                System.out.println(word + " ==> " + word.length());
                counter++;
            }
            if (currentLength == 0) {
                currentLength = word.length();
                System.out.println(word + " ==> " + word.length());
                counter++;
            }
        }
    }

    private void executeDuplicates(String s) {
        HashSet<String> nonDuplicatesSet = new HashSet<>();
        List<String> duplicatesList = new ArrayList<>();
        String[] inputDataArray = s.split(" ");

        for (String word : inputDataArray) {
            if (nonDuplicatesSet.contains(word) && !duplicatesList.contains(word)) {
                duplicatesList.add(word);
            }
            nonDuplicatesSet.add(word);

        }
        if (!(duplicatesList.size() < 3)) {

            String result = "";
            StringBuilder resultBuilder = new StringBuilder();
            for (int i = 0; i <= 2; i++) {
                resultBuilder.append(duplicatesList.get(i)).reverse();
                result += resultBuilder.toString() + "\n";
                resultBuilder.setLength(0);
            }
            System.out.println(result.toUpperCase());
        }
        System.out.println("No duplicates");
    }


}
