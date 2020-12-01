
public class SeperateZeros {
	
	static void methodPush(int a[], int n) 
    { 
        int temp = 0;  
        for (int i = 0; i < n; i++) 
            if (a[i] != 0) 
                a[temp++] = a[i];
        //temp++;
        while (temp < n) 
            a[temp] = 0;
        //temp++;
    } 

	public static void main(String[] args) {
		
		int arr[] = {0,0,1,2,0,0,4,5,0,0}; 
        int x = arr.length; 
        methodPush(arr, x); 
        System.out.println("Array list is like "); 
        for (int i=0; i<x; i++) 
            System.out.print(arr[i]+" "); 
		

	}

}
