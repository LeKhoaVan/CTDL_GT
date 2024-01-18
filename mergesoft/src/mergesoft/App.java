package mergesoft;

public class App {
	class HelloWorld {
	    public static void mergeArray(int [] a, int left, int mid, int right) {
	        int lenghtLeft = mid - left + 1;
	        int lenghtRight = right - mid;
	        
	        int [] arrLeft = new int[lenghtLeft];
	        int [] arrRight = new int[lenghtRight];
	        
	        for(int i = 0; i<lenghtLeft; i++) {
	            arrLeft[i] = a[left + i]; 
	        }
	        
	        for(int i = 0; i<lenghtRight; i++) {
	            arrRight[i] = a[mid + 1 + i]; 
	        }
	        
	        int nLeft = 0;
	        int nRight = 0;
	        int indexArray = left;
	        
	        while(nLeft < lenghtLeft && nRight < lenghtRight) {
	            if(arrLeft[nLeft] <= arrRight[nRight]){
	                a[indexArray] = arrLeft[nLeft];
	                nLeft++;
	                indexArray++;
	            } else {
	                a[indexArray] = arrRight[nRight];
	                nRight++;
	                indexArray++;
	            }
	        }
	        
	        while(nLeft < lenghtLeft) {
	            a[indexArray] = arrLeft[nLeft];
	            nLeft++;
	            indexArray++;
	        }
	        
	        while(nRight < lenghtRight) {
	            a[indexArray] = arrRight[nRight];
	            nRight++;
	            indexArray++;
	        }
	        
	        
	    }
	    public static void mergeSort(int []a, int left, int right){
	        if(left < right) {
	            int mid = left + (right-left)/2;
	            mergeSort(a,left,mid);
	            mergeSort(a,mid + 1, right);
	            mergeArray(a, left, mid, right);
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = { 12, 11, 13, 5, 6, 7 };
	        mergeSort(arr, 0, arr.length - 1);
	        int n = arr.length;
	        for(int i =0; i < n; i++) {
	            System.out.printf("%d, ",arr[i]);
	        }
	    }
	}
}