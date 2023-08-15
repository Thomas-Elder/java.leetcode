package SolutionsTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import Solutions.ExcelSheetColumnTitle;

public class ExcelSheetColumnTitleTests {

    private ExcelSheetColumnTitle _excelSheetColumnTitle;

    @BeforeEach
    void setUp(){
        _excelSheetColumnTitle = new ExcelSheetColumnTitle();
    }

    @Test
    void testColumnTitleConversion() {
        assertEquals("A", _excelSheetColumnTitle.convertToTitle(1));
        assertEquals("B", _excelSheetColumnTitle.convertToTitle(2));
        assertEquals("Z", _excelSheetColumnTitle.convertToTitle(26));
        assertEquals("AA", _excelSheetColumnTitle.convertToTitle(27));
        assertEquals("AB", _excelSheetColumnTitle.convertToTitle(28));
        assertEquals("ZY", _excelSheetColumnTitle.convertToTitle(701));
        assertEquals("ZZ", _excelSheetColumnTitle.convertToTitle(702));
        assertEquals("AAA", _excelSheetColumnTitle.convertToTitle(703));
        assertEquals("AAZ", _excelSheetColumnTitle.convertToTitle(728));
        assertEquals("ABA", _excelSheetColumnTitle.convertToTitle(729));
    }
}
