package String;

public class dutchFlag {
	public static void dutchSwap(int[] arr) {
		int high = arr.length - 1;
		int low = 0;
		int mid = 0;
		int temp = 0;

		while (mid <= high) {
			switch (arr[mid]) {
			case 0:
			{
				// swap(arr, low, mid);
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			}

			case 1: {
				mid++;
				break;
			}

			case 2: {
				// swap(arr, mid, high);
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
			}
			}
		}

	}
	/*
	 * private static void swap(int[] arr, int low, int mid) { int temp =
	 * arr[low]; arr[low] = arr[mid]; arr[mid] = temp; }
	 */

	private static void printArray(int[] arr, int arr_size) {
		int i;
		for (i = 0; i < arr_size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int arr_size = arr.length;
		dutchSwap(arr);
		System.out.println("Array after seggregation ");
		printArray(arr, arr_size);
	}
}
