import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		int[] arr = {5, 4, 7, 1, 7, 3, 8, 10};
//		System.out.println("before = " + Arrays.toString(arr));
//		insertionSort(arr);
//		System.out.println("after = " + Arrays.toString(arr));
		
		// sắp xếp trước
		Arrays.sort(arr);
		// tìm kiếm nhị phần
		int index = binarySearch(arr, 8, 0, arr.length - 1);
		System.out.println(index);
	}
	
	public static int binarySearch(int[] arr, int search, int low, int high) {
//		int start = 0;
//		int end = arr.length - 1;

//		while (start <= end) {
//			int mid = (start + end) / 2;
//			if (arr[mid] == search) {
//				return mid;
//			} else if (arr[mid] < search) {
//				start = mid + 1;
//			} else {
//				end = mid - 1;
//			}
//		}
		if (low < high) {
			int mid = (low + high) / 2;
			if (arr[mid] == search) {
				return mid;
			} else if (arr[mid] < search) {
				return binarySearch(arr, search, mid + 1, high);
			} else if (arr[mid] > search) {
				return binarySearch(arr, search, low, mid - 1);
			}
		}
		return -1;
	}

//	public static void selectionSort(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//
//			int index = i;
//
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[index] < arr[j]) {
//					index = j;
//				}
//			}
//
//			if (index != i) {
//				int temp = arr[index];
//				arr[index] = arr[i];
//				arr[i] = temp;
//			}
//
//		}
//	}
//
//	public static void insertionSort(int[] arr) {
//		for (int i = 1; i < arr.length; i++) {
//
//			int curr = arr[i];
//			int j = i - 1;
//			// chạy nguược lại đằng sau
//			while (j >= 0 && arr[j] > curr) {
//				arr[j+1] = arr[j];
//				j--;
//			}
//			arr[j+1] = curr;
//		}
//	}
}