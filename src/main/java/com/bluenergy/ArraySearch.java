package com.bluenergy;

import java.util.Arrays;

/**
 * I am not using sorting because in the doc provided they don't talk about it
 * @author giuseppe
 *
 */
public class ArraySearch {

	/**
	 * I am not using ordering because in the doc provided they don't talk about it
	 * 
	 * In case of big array this method is much faster
	 * 
	 * @param firstArray
	 * @param secondArray
	 * @return
	 */
	public int findPosArraysBinarySearch(int[] firstArray, int[] secondArray) {
		int pos = 0;

		int a = Arrays.binarySearch(firstArray, secondArray[0]);
		if (a > 0) {
			pos = a;

		}

		return pos;
	}

	/**
	 * In case of small array this method is faster
	 * 
	 * @param firstArray
	 * @param secondArray
	 * @return
	 */
	public int findPosArraysLoop(int[] firstArray, int[] secondArray) {
		int pos = 0;

		int intPos = 0;
		mainLoop: for (int valFir : firstArray) {

			if (secondArray[0] == valFir) {
				pos = intPos;
				break mainLoop;
			}
			intPos++;
		}

		return pos;
	}

}
