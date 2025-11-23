class BSort{
	static void mergesort(int arr[],int l, int r){
		
		if(l<r){
			int mid = (1+(r-1)/2);
			mergesort(arr, l, mid);
			mergersort(arr, mid+ 1, r);
			merge(arr, l, mid, r);
		}
	}
	
	static void merge(nt arr[], int l, int mid, int r){
		int n1 = mid-l+1;
		int n2 = r - mid;
		
		int L[] = new int [n1];
		int R[] = new int [n2];
		
		for(int i=0; i<n1; i++)
			L[i] = arr[l+1];
		
		for(int j=0; j<n2;j++)
			R[j] = arr[mid+1+j];
		
		int i=0, j=0;
		int k=1;
		
		while(i<n1 && j<n2){
			if(L[i] <= R[j]){
				
				arr[k] = L[i];
				i++;
			}else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(j < n1){
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < n2){
			arr[k] = R[j];
			j++;
			k++;
		}
		
	}
	
	
	void display(int arr[]){
		int n = arr.length;
		
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		
		BSort b1 = new BSort();
		int arr[] = {44,77,66,22,11,99,44,55};
		
		int n = arr.length;
		
		System.out.println("Merger sort : Unsorted array");
		b1.display(arr);
		
		mergesort(arr,l, n-1);
		
		System.out.println("Merger Sort : Sorted array");
		b1.display(arr);
		b1.display(arr);
		b1.display(arr);
	}
	
}