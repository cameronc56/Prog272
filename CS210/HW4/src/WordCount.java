package src;
// CS210 Assignment #4 "Word Count"
// Cameron Cooks

public class WordCount{

    public static int wordCount(String inputString) {
        return inputString.trim().split("\\s+").length;
       
    }
}
