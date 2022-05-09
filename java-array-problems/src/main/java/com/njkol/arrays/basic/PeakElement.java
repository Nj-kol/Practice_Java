package com.njkol.arrays.basic;

/** 
 * https://www.youtube.com/watch?v=a7D77DdhlFc
 * 
 * https://www.youtube.com/watch?v=L7gNay1c4ak
 * 
 * @author Nilanjan
 *
 */
public class PeakElement {

	public Integer getPeakElement(int[] arr) {
		 
        if (arr == null || arr.length == 0) {
            return null;
        }
 
        int n = arr.length;
        
        int start = 0;
        int end = n - 1;
  
        while (start <= end) {      
  
             int mid = (start + end) / 2;
        
             if ((mid == 0 || arr[mid - 1] <= arr[mid]) 
                && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
                return arr[mid];
  
             } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
               end = mid - 1;
  
             } else {
               start = mid + 1;
             }
        }
  
      return -1;
    }
 
	public void sample () {
		
		
	}
}
