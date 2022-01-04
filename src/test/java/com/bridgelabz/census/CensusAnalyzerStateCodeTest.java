package com.bridgelabz.census;

import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerStateCodeTest {

    private static final String INDIA_STATE_CSV_PATH = "E:\\eclipseProgram\\untitled\\Census-Analyzer\\src\\main\\resources\\IndiaStateCode.csv";
    private static final String INDIA_STATE_CSV_WRONG_FILETYPE = "E:\\eclipseProgram\\untitled\\Census-Analyzer\\src\\main\\resources\\IndiaStateCode.pdf";
    private static final String INDIA_STATE_CSV_PATH_DELIMETER = "E:\\eclipseProgram\\untitled\\Census-Analyzer\\src\\main\\resources// IndiaStateCode.csv";

    //2.1 Happy Test case for correct record match
    @Test
    public void givenIndianStateCSVFileReturnsCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_STATE_CSV_PATH);
            Assert.assertEquals(37, numOfRecord);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

    //2.2 Sad Test case for wrong record
    @Test
    public void givenIndianStateCSVFileReturnsInCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_STATE_CSV_PATH);
            Assert.assertNotEquals(37, numOfRecord);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

    //UseCase 2.3 Path is correct but file type is incorrect
    @Test
    public void givenIndianStateCSVFileReturnsInCorrecFileType_But_PathShouldBeCorrect() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_STATE_CSV_WRONG_FILETYPE);
            Assert.assertEquals(29, numOfRecord);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

    //UseCase 2.4 Path is correct but delimiter incorrect
    @Test
    public void givenIndianStateCSVFileReturnsIncorrectDelimeter() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            censusAnalyzer.loadIndiaStateCodeData(INDIA_STATE_CSV_PATH_DELIMETER);
            Assert.assertTrue("Wrong delimiter", true);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }
}
