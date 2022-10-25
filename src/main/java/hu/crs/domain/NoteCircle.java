package hu.crs.domain;

public class NoteCircle {
    public int interval(final Pitch firstPitch, final Pitch secondPitch) {
        var difference = Math.abs(firstPitch.ordinal() - secondPitch.ordinal());

        if (difference <= 6) return difference;
        else return 12 - difference;
    }
}
