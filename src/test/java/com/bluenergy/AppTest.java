package com.bluenergy;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void arrayPosUsingBinary1() throws Exception {

		ArraySearch arraySearch = new ArraySearch();
		int[] firstArray = { 2, 3, 4, 5 };
		int[] secondArray = { 4, 5 };
		int pos = arraySearch
				.findPosArraysBinarySearch(firstArray, secondArray);
		assertTrue("Expecting 2", pos == 2);

	}

	@Test
	public void arrayPosUsingBinary2() throws Exception {

		ArraySearch arraySearch = new ArraySearch();
		int[] firstArray = { 2, 3, 4, 5 };
		int[] secondArray = { 5 };
		int pos = arraySearch
				.findPosArraysBinarySearch(firstArray, secondArray);
		assertTrue("Expecting 3", pos == 3);

	}
	
	
	@Test
	public void arrayPosUsingBinary3() throws Exception {

		ArraySearch arraySearch = new ArraySearch();
		int[] firstArray = { 2, 3, 4, 5 };
		int[] secondArray = {4,7 };
		int pos = arraySearch
				.findPosArraysBinarySearch(firstArray, secondArray);
		assertFalse("Expecting 2", pos == 2);

	}
	
	@Test
	public void arrayPosUsingBinary4() throws Exception {

		ArraySearch arraySearch = new ArraySearch();
		int[] firstArray = { 2, 3, 4, 5 };
		int[] secondArray = {4,5,7 };
		int pos = arraySearch
				.findPosArraysBinarySearch(firstArray, secondArray);
		assertFalse("Expecting 2", pos == 2);

	}


	@Test
	public void arrayPosUsingLoop() throws Exception {

		ArraySearch arraySearch = new ArraySearch();
		int[] firstArray = { 2, 3, 4, 5 };
		int[] secondArray = { 4, 5 };
		int pos = arraySearch.findPosArraysLoop(firstArray, secondArray);
		assertTrue("Expecting 2", pos == 2);

	}

	@Test
	public void arrayPosUsingLoop2() throws Exception {

		ArraySearch arraySearch = new ArraySearch();
		int[] firstArray = { 2, 3, 4, 5 };
		int[] secondArray = { 5 };
		int pos = arraySearch.findPosArraysLoop(firstArray, secondArray);
		assertTrue("Expecting 3", pos == 3);

	}
	
	@Test
	public void arrayPosUsingLoop3() throws Exception {

		ArraySearch arraySearch = new ArraySearch();
		int[] firstArray = { 2, 3, 4, 5 };
		int[] secondArray = { 4,7 };
		int pos = arraySearch.findPosArraysLoop(firstArray, secondArray);
		assertFalse("Expecting 2", pos == 2);

	}
	
	@Test
	public void arrayPosUsingLoop4() throws Exception {

		ArraySearch arraySearch = new ArraySearch();
		int[] firstArray = { 2, 3, 4, 5 ,6 };
		int[] secondArray = { 4,5,7 };
		int pos = arraySearch.findPosArraysLoop(firstArray, secondArray);
		assertFalse("Expecting 2", pos == 2);

	}

}
