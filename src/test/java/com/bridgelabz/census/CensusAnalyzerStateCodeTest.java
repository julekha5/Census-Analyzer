package com.bridgelabz.census;

import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerStateCodeTest {

    private static final String INDIA_STATE_CSV_PATH = "E:\\eclipseProgram\\untitled\\Census-Analyzer\\src\\main\\resources\\IndiaStateCode.csv";

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

<<<<<<< HEAD
    //2.2 Sad test case for incorrect record
=======
    //2.2 Sad Test case for wrong record
>>>>>>> UC2.2_WrongRecords
    @Test
    public void givenIndianStateCSVFileReturnsInCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_STATE_CSV_PATH);
<<<<<<< HEAD
            Assert.assertNotEquals(40, numOfRecord);
=======
            Assert.assertEquals(40, numOfRecord);
>>>>>>> UC2.2_WrongRecords
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

}
