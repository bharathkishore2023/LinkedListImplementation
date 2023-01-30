import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr1[]= {9,8,7,6,5,4,3,2,1,0};
		int operations[][]= {{0,9},{4,5},{3,6},{2,7},{1,8},{0,9}};
		for( int i=0;i<operations.length;i++) {
			int temp[]=reverse(operations[i][0],operations[i][1],arr1);
			arr1=temp;
		}
		System.out.print(Arrays.toString(arr1));
	}
	public static int[] reverse(int i,int j,int[] arr) {
		int ct=j;
		while(j>=i) {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			j--;
			i++;
		}
		return arr;
	}
	
}
