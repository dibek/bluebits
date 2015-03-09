package com.bluenergy;

import java.util.Arrays;

/**
 * I am not using sorting because in the doc provided they don't talk about it
 * 
 * @author giuseppe
 *
 */
public class ArraySearch {

	/**
	 * I am not using ordering because in the doc provided they don't talk about
	 * it
	 * 
	 * In case of big array this method is much faster
	 * 
	 * @param firstArray
	 * @param secondArray
	 * @return
	 */
	public int findPosArraysBinarySearch(int[] firstArray, int[] secondArray) {
		int pos = 0;

		int posSec = 0;
		for (int sec : secondArray) {
			int a = Arrays.binarySearch(firstArray,sec);
			if (posSec == 0 && a > 0) {
				pos = a;
			}
			if (a < 0) {
				pos = -1;
			}
			posSec++;
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
		int posSec = 0;
		for (int sec : secondArray) {
			intPos = 0;
			fistArrayLoop: for (int valFir : firstArray) {

				if (sec == valFir && posSec == 0) {
					pos = intPos;
					// break mainLoop;
				}
				if (sec != valFir &&  intPos > pos && posSec > 0) {
					pos = -1;
				}
				intPos++;
			}
		posSec++;
		}
		return pos;
	}

}
