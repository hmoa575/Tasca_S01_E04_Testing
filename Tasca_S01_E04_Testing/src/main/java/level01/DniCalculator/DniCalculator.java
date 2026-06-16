package level01.DniCalculator;

public class DniCalculator {
    private final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public char calculateLetter(String id) {
        validateId(id);
        int IdNumber = Integer.parseInt(id);
        return LETTERS.charAt(IdNumber % 23);
    }

    private void validateId(String id) {
        if (id == null) {
            throw new IllegalArgumentException("DNI cannot be null.");
        }

        if (id.length() != 8) {
            throw new IllegalArgumentException("DNI must be 8 digits.");
        }

        if (!id.matches("\\d{8}")) {
            throw new IllegalArgumentException("DNI must be only numbers 0 - 9.");
        }

    }
}
