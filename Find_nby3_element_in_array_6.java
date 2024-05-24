class Find_nby3_element_in_array_6 {

	static void findMajority(int arr[], int n)
	{
		int flag=0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count > n/3) {
				System.out.print(arr[i]+" ");
				flag=1;
			}
		}
		if (flag==0)
			System.out.println("No Majority Element");

	}

	public static void main (String[] args) {
		int arr[] = { 2,2};
		int n = arr.length;
		findMajority(arr, n);
	}
}
