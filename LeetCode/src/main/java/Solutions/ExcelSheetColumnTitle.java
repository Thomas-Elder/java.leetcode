package Solutions;

public class ExcelSheetColumnTitle {

    // Given an integer returns the column letter combination.
    public String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26;
            char digit = (char) ('A' + remainder);
            result.insert(0, digit);
            columnNumber = (columnNumber - 1) / 26;
        }

        return result.toString();
    }
}
