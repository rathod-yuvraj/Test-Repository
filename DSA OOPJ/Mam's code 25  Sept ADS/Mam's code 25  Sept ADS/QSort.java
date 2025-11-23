
class QSort{
	
	
	static void quicksort(int arr[], int low, int high){
		if(low<high){
			int pi = partition(arr, low, high);
			quicksort(arr, low, pi-1);
			quicksort(arr, pi+1, high);
			
		}
		
	}
	
	static int partition(int arr[], int low, int high){
		int pivot = arr[high];
		int i = (low-1);
		for(int j=low;j<=high-1;j++){
			if(arr[j] < pivot){
				i++;
				swap(arr, i,j);
			}
		}
		swap(arr, i+1, high);
		return (i+1);
	
		
	}
	
	static void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	void display(int arr[]){
		int n = arr.length;
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
		
    public static void main(String[] args)
	{
		QSort b1 = new QSort();
		int arr[] = {44,77,22,99,11,55,66,33};
		
		int n = arr.length;
		
		System.out.println("Quick sort : UnSorted array");
		b1.display(arr);
		
		quicksort(arr,0, n-1);
		
		System.out.println("Quick sort : Sorted array");
		b1.display(arr);
	
		
    }
    
 
}

