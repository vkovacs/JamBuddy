package hu.crs.domain;

public enum Pitch {
    A("A", "A"),
    A_SHARP("A#", "Bb"),
    B("B", "B"),
    C("C", "C"),
    C_SHARP("C#", "Db"),
    D("D", "D"),
    D_SHARP("D#", "Eb"),
    E("E", "E"),
    F("F", "F"),
    F_SHARP("F#", "Gb"),
    G("G", "G"),
    G_SHARP("G#", "Ab");
    final String representation0;
    final String representation1;

    Pitch(final String representation0, final String representation1) {
        this.representation0 = representation0;
        this.representation1 = representation1;
    }

    @Override
    public String toString() {
        if (!representation0.equals(representation1)) {
            return representation0 + '/' + representation1;
        }
        return representation0;
    }

    public static Pitch of(String pitchString) {
        for (var pitch : Pitch.values()) {
            if (pitch.representation0.equals(pitchString) || pitch.representation1.equals(pitchString)) {
                return pitch;
            }
        }
        throw new IllegalArgumentException();
    }

}
