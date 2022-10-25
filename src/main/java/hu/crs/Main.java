package hu.crs;

import hu.crs.domain.NoteCircle;
import hu.crs.domain.Pitch;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var noteCircle = new NoteCircle();
        var random = new Random();

        Scanner myInput = new Scanner(System.in);

        //noinspection InfiniteLoopStatement
        while (true) {
            boolean success = false;

            var firstPitch = Pitch.values()[random.nextInt(0, 12)];
            var secondPitch = Pitch.values()[random.nextInt(0, 12)];

            while (!success) {
                int expectedInterval = noteCircle.interval(firstPitch, secondPitch);

                System.out.println(firstPitch + " - " + secondPitch + ": ");
                int actualInterval = myInput.nextInt();

                success = actualInterval == expectedInterval;
            }
        }
    }
}