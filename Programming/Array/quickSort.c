#include<stdio.h>

void swap(int arr[], int i, int j)
{	
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
int partition(int arr[], int l, int r)
{
	if(l < r)
	{
		int pivot = arr[r];
		int i = (l -1);
		
		for(int j = l; j < r; j++)
		{
			if(arr[i] <= pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, (i+1), r);
		return i+1;
	}
}
void quickSort(int arr[], int l, int r)
{
	if(l < r)
	{
		int pi = partition(arr, l, r);
		
		quickSort(arr, l , pi-1);
		quickSort(arr, pi+1, r);
	}
}

void printArray(int arr[], int size)
{
	int i;
	for (i=0; i < size; i++)
		printf("%d ", arr[i]);
	printf("\n");
}

int main()
{
	int arr []= {39, 65, 95, 67, 12, 49};
	int n = sizeof(arr)/sizeof(arr[0]);
	quickSort(arr, 0, n-1);
	printf("---------------V----------------");
	printArray(arr, n);
	return 0;
}
