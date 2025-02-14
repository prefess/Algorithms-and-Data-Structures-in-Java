/*
 * Copyright (C) 2022 Thoai
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import com.rampatra.sorting.SelectionSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Thoai
 */
public class ThoaiSelectionSortTest {
    SelectionSort selectionSort = new SelectionSort();
    @Test
	public void tesInsertIntoSorted() {
		int[] inputArr = new int[] {1,3,5};
		int[] inputResult = new int[] {1,3,5};
		selectionSort.selectionSort(inputArr);
		assertArrayEquals(inputResult, inputArr);
	}

	@Test
	public void tesInsertIntoSorted2() {
		int[] inputArr = new int[] {5,3,1};
		int[] inputResult = new int[] {1,3,5};
		selectionSort.selectionSort(inputArr);
		assertArrayEquals(inputResult, inputArr);
	}

	@Test
	public void tesInsertIntoSorted3() {
		int[] inputArr = new int[] {4,5,3,2};
		int[] inputResult = new int[] {2,3,4,5};
		selectionSort.selectionSort(inputArr);
		assertArrayEquals(inputResult, inputArr);
	}
    
}
