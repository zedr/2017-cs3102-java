package ie.tcd.cs3102;

import java.io.BufferedReader;
import java.io.FileReader;


public class Main {
    static final int NUMWORDS = 235886;
    static final String FILENAME = "shuffled.txt";

    public static void main(String[] args) {
        String []words = readWords(FILENAME, NUMWORDS);

        // 1. Write code to test method findShortest()
        System.err.print("Test findShortest()... ");
        String[] results = findShortest(words);
        assert results[0].equals("p");
        assert results[1].equals("scientificophilosophical");
        System.err.println("OK!");

        // 2. Write code to test method countThreeOrFiveLetterWords()
        System.err.print("Test countThreeOrFiveLetterWords()... ");
        String message = countThreeOrFiveLetterWords(words);
        assert message.equals("1420,10230");
        System.err.println("OK!");

        // 3. Write code to test method meanWordLength()
        System.err.print("Test meanWordLength()... ");
        double mwl = meanWordLength(words);
        assert mwl == 9.569126612007494;
        System.err.println("OK!");

        // 4. Write code to test method frequencyDistribution()
        System.err.print("Test frequencyDistribution()... ");
        int[][] dist = frequencyDistribution(words);
        assert String.format("%d,%d", dist[0][0], dist[0][1]).equals("1,52");
        assert String.format("%d,%d", dist[23][0], dist[23][1]).equals("24,5");
        System.err.println("OK!");

        // 5. Write code to test method sortedWords()
        System.err.print("Test compareStrings()... ");
        assert compareStrings("abc", "abc") == 0;
        assert compareStrings("", "") == 0;
        assert compareStrings("ab", "abc") < 0;
        assert compareStrings("abc", "ab") > 0;
        assert compareStrings("abc", "bcd") < 0;
        assert compareStrings("bcd", "abc") > 0;
        assert compareStrings("", "abc") < 0;
        assert compareStrings("abc", "") > 0;
        System.err.println("OK!");

        // Sort the word list. This can take up to 6 minutes on an i7.
        System.err.print("Test sortedWords(), might take a few minutes... ");
        String[] sortedList = sortedWords(words);

        assert sortedList[0].equals("a");
        assert sortedList[1].equals("a");
        assert sortedList[2].equals("aa");
        assert sortedList[3].equals("aal");
        assert sortedList[NUMWORDS - 4].equals("zythia");
        assert sortedList[NUMWORDS - 3].equals("zythum");
        assert sortedList[NUMWORDS - 2].equals("zyzomys");
        assert sortedList[NUMWORDS - 1].equals("zyzzogeton");
        System.err.println("OK!");

        // Print the sorted words to stdout
        for (int i = 0; i < NUMWORDS; i++) {
            System.out.println(sortedList[i]);
        }

        // 6. Write code to test method removeFourLetterWords()
        System.err.print("Test removeFourLetterWords()... ");
        assert words[61].equals("yark");
        removeFourLetterWords(words);
        assert words[61].equals("");
        System.err.println("OK!");

    }

    // 1. Write code to find the shortest and longest word in the list (5 Marks)
    private static String[] findShortest(String[] words) {
        String shortest = "";
        String longest = "";
        String current = "";

        int shortestLen = 0;
        int longestLen = 0;
        int currentLen = 0;

        for (int i = 0; i < NUMWORDS; i++) {
            current = words[i];
            currentLen = current.length();

            if (currentLen < shortestLen || shortest.equals("")) {
                shortest = current;
                shortestLen = currentLen;
            }

            if (currentLen > longestLen) {
                longest = current;
                longestLen = currentLen;
            }
        }

        String[] results = {shortest, longest};

        return results;
    }


    // 2. Write code to count how any 3- and 5-letter words are in the list (5 Marks)
    private static String countThreeOrFiveLetterWords(String[] words) {
        int threeCount = 0;
        int fiveCount = 0;

        int currentLen = 0;

        for (int i = 0; i < NUMWORDS; i++) {
            currentLen = words[i].length();

            if (currentLen == 3) {
                threeCount += 1;
            }

            if (currentLen == 5) {
                fiveCount += 1;
            }
        }

        return String.format("%d,%d", threeCount, fiveCount);
    }

    // 3. Write code to find the average word length (10 Marks)
    private static double meanWordLength(String[] words) {
        double mwl = 0.0;

        if (NUMWORDS > 0) {

            double sum = 0.0;

            for (int i = 0; i < NUMWORDS; i++) {
                sum += words[i].length();
            }

            mwl = sum / NUMWORDS;
        }

        return mwl;
    }

    // 4. Write code to build a frequency distribution of words lengths in the list (20 Marks)
    //    Hint: You need to build a two-dimensional array of the form:
    //          [ [1, p], [2, q], [3, e], ... ]
    //          where p, q, r are integer word counts for words of length 1, 2, 3 respectively
    //
    //          Wrong return type?
    private static int[][] frequencyDistribution(String[] words) {
        // Use findShortest() to calculate the length of the longest word in the
        // list.
        int longestLen = findShortest(words)[1].length();
        int[][] fdt = new int[longestLen][2];
        int wordLen;

        // Initialise the two-dimensional array
        for (int i = 0; i < longestLen; i++) {
            fdt[i][0] = i + 1;
            fdt[i][1] = 0;
        }

        for (int i = 0; i < NUMWORDS; i++) {
            wordLen = words[i].length();
            if (wordLen > 0) {
                fdt[wordLen - 1][1] += 1;
            }
        }

        return fdt;
    }

    /*
     * Compare two strings, return a value that states if one is greater than
     * the other.
     *
     * Signature inspired by the stdlib strcmp() function.
     * Emulates the behaviour of Unix "sort" with LC_COLLATE=C, that does not
     * ignore slashes.
     *
     * @return  -1 if the first given string is lower
     *           1 if the second string is lower
     *           0 if both strings are equal
     */
    private static int compareStrings(String first, String second) {
        final int firstLen = first.length();
        final int secondLen = second.length();
        char ch1, ch2;

        // Scan both strings and compare the ordinal value of each character.
        // Note: chars can be compared directly using operators.
        for (int i = 0, l = 0; i < firstLen && l < secondLen; i++, l++) {
            ch1 = first.charAt(i);
            ch2 = second.charAt(l);

            if (ch1 < ch2) {
                return -1;
            } else if (ch2 < ch1) {
                return 1;
            }
        }

        // Check if the strings have the same length; is so, they are equal.
        // If not, the shorter is considered to be the lesser.
        if (firstLen < secondLen) {
            return -1;
        } else if (secondLen < firstLen) {
            return 1;
        } else {
            return 0;
        }
    }

    // 5. Write code to build a sorted version of the list (in ascending order) (40 Marks)
    private static String[] sortedWords(String[] words) {
        // First, create and use a copy of the words array, as we do not want
        // to mutate the original array.
        String[] sortedWords = words.clone();
        final int wordCount = sortedWords.length;

        // Only sort if there are more than one words.
        if (wordCount > 1) {

            // Implement the Insertion Sort algorithm.
            //
            // Iterate through the array of strings.
            for (int i = 1, l = 0; i < wordCount; i++, l = i - 1) {
                // Select the key. Everything to our left should already be
                // sorted.
                String key = sortedWords[i];

                // If we have not reached beyond the left bound of the array,
                // and the key is unsorted, begin sorting backwards. Continue
                // until we find a string that is lesser than the current key.
                while (l >= 0 && compareStrings(sortedWords[l], key) > 0) {
                    // Move the greater string in the next slot.
                    sortedWords[l + 1] = sortedWords[l];
                    // Decrease the search index, so we can check the previous
                    // string in the next loop.
                    l -= 1;
                }
                // Finally, reposition the key.
                sortedWords[l + 1] = key;
            }
        }
        return sortedWords;
    }

    // 6. Write code to remove all four-letter words from the original list (20 Marks)
    private static void removeFourLetterWords(String[] words) {
        for (int i = 0; i < NUMWORDS; i++) {
            if (words[i].length() == 4) {
                words[i] = "";
            }
        }
    }

    // Helper: Read the words list from a file into a string array
    private static String[] readWords(String filename, int count) {
        String[] words = new String[count];

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int i = 0;
            for (String line; (line = br.readLine()) != null && i < count;) {
                words[i++] = line;
            }
        } catch (java.io.IOException e) {
            System.err.println("File: " + filename + " could not be found.");
        }
        return words;
    }
}
