package com.udacity.gradle.jokes;

import java.util.Random;

public class Joker {
    private static String[] jokes = {
            "This is totally a funny joke!",
            "This is totally a boring joke!",
            "This is totally a exciting joke!",
            "This is totally a useful joke!",
            "This is totally a unused joke!"};

    public String getRandomJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }
}
