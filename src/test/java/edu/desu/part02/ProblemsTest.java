package edu.desu.part02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemsTest {
    @Test
    public void wordCountTest01(){
        Problems Problems = new Problems();
        String input = "Hello World";

        String expected = "2";
        String actual = Problems.wordCount(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wordCountTest02(){
        Problems Problems = new Problems();
        String input = "one 22 three";

        String expected = "3";
        String actual = Problems.wordCount(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstReverseTest01(){
        Problems Problems = new Problems();
        String input = "Hello World and Coders";

        String expected = "sredoC dna dlroW olleH";
        String actual = Problems.firstReverse(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstReverseTest02(){
        Problems Problems = new Problems();
        String input = "Do you think you can code?";

        String expected = "?edoc nac uoy kniht uoy oD";
        String actual = Problems.firstReverse(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void longestWordTest01(){
        Problems Problems = new Problems();
        String input = "fun&!! time";

        String expected = "time";
        String actual = Problems.longestWord(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void longestWordTest02(){
        Problems Problems = new Problems();
        String input = "I love dogs";

        String expected = "love";
        String actual = Problems.longestWord(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void swapCaseyTest01(){
        Problems Problems = new Problems();
        String input = "Hello-LOL";

        String expected = "hELLO-lol";
        String actual = Problems.swapCase(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void swapCaseyTest02(){
        Problems Problems = new Problems();
        String input = "Sup DUDE!!?";

        String expected = "sUP dude!!?";
        String actual = Problems.swapCase(input);
        Assertions.assertEquals(expected, actual);
    }
}
