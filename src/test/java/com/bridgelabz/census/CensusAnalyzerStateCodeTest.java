package com.bridgelabz.census;

import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerStateCodeTest {

    private static final String INDIA_CENSUS_CSV_PATH = "E:\\eclipseProgram\\untitled\\Census-Analyzer\\src\\main\\resources\\IndiaStateCode.csv";

    //2.1 Happy Test case for correct record match
    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_CENSUS_CSV_PATH);
            Assert.assertEquals(37, numOfRecord);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

}
