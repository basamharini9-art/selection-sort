//Bubble sort
public class BubbleSort {
	//bubbleSort WITHOUT swapped boolean
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		// traverse through all array elements
		for(int i = 0; i < n - 1; i++){
			//last i elements are already in place
			for(int j = 0; j < n - 1 - i; j++) {
				// swap id the element found is greater 
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
// utility method to print the array

public static void printArray(int[] arr){
    for(int num : arr) {
       System.out.print(num + " ");
    }
    System.out.println();
}

//main method to test the Bubble sort implementation

public static void main(String[] args){
    int [] arr = {5,3,8,4,2};
    System.out.println("Original array:");
    printArray(arr);

    bubbleSort(arr);
    System.out.println("Sorted array:");
    printArray(arr);
	
    }
}
