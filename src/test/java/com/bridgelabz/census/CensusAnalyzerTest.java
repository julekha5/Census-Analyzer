package com.bridgelabz.census;

import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerTest {

    private static final String INDIA_CENSUS_CSV_WRONG_FILETYPE = "E:\\eclipseProgram\\untitled\\Census-Analyzer\\src\\main\\resources\\IndiaStateCensusDataHeader.pdf";

    @Test
    public void givenIndianCensusCSVFileReturnsInCorrecFileType_But_PathShouldBeCorrect() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            censusAnalyzer.loadIndiaCensusData(INDIA_CENSUS_CSV_WRONG_FILETYPE);
            Assert.assertEquals(29, true);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }
}

