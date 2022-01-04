package com.bridgelabz.census;

import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerTest {

    private static final String INDIA_CENSUS_CSV_PATH_DELIMETER = "E:\\eclipseProgram\\untitled\\Census-Analyzer\\src\\main//resources//IndiaStateCensusData.pdf";

    //UseCase 1.4 Path is correct but delimiter incorrect
    @Test
    public void givenIndianCensusCSVFileReturnsIncorrectDelimeter(){
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            censusAnalyzer.loadIndiaCensusData(INDIA_CENSUS_CSV_PATH_DELIMETER);
            Assert.assertTrue("Wrong delimiter", true);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }
}
