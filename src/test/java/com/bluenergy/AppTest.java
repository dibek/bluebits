package com.bluenergy;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void arrayPosUsingBinary() throws Exception {
		
		ArraySearch arraySearch =  new ArraySearch();
		int[] firstArray = {2,3,4,5};
		int[] secondArray = {4,5};
		int pos = arraySearch.findPosArraysBinarySearch(firstArray, secondArray);
		assertTrue("Expecting 2", pos == 2);
		
	}
	
	
	@Test
	public void arrayPosUsingLoop() throws Exception {
		
		ArraySearch arraySearch =  new ArraySearch();
		int[] firstArray = {2,3,4,5};
		int[] secondArray = {4,5};
		int pos = arraySearch.findPosArraysLoop(firstArray, secondArray);
		assertTrue("Expecting 2", pos == 2);
		
	}
	
}
