package com.example.projektas2;

public class CharWordCounter {
    public static int CharCounter(String currentText)
    {
        int currentLength = currentText.length();
        return currentLength;
    }
    public static int WordCounter(String text)
    {
        text = text.replace("\n", " ");
        String[] textArray = text.split(" ");
        return textArray.length;
    }
}
