package hexlet.code;

public enum UserChoice {
    EXIT,
    GREET,
    EVEN,
    CALC,
    GCD,
    PROGRESSION,
    PRIME;

    public static UserChoice fromInteger(int x) {
        switch (x) {
            case 0: return EXIT;
            case 1: return GREET;
            case 2: return EVEN;
            case 3: return CALC;
            case 4: return GCD;
            case 5: return PROGRESSION;
            case 6: return PRIME;
            default: throw new IllegalArgumentException("Enter number of task!");
        }
    }
}
