import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {10,5,8,20,2,18};
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			while(j>=0) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j+1];
					
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				j--;
			}
		}
System.out.println(Arrays.toString(arr));
	}

}
