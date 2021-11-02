import java.util.*;
 
class ANS7 {
 
    // Function return true if given element
    // found in array
    private static void check(int[] arr, int toCheckValue)
    {
        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
 
        // Print the result
        System.out.println("Is " + toCheckValue
                           + " present in the array: " + test);
    }
 
    public static void main(String[] args)
    {
        int getValue;
        Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number : ");
        getValue = sc.nextInt();
        // Get the array
        int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 7, 52, 86, 47 };
 
        // Get the value to be checked
        int toCheckValue = getValue;
 
        // Print the array
        System.out.println("Array: "
                           + Arrays.toString(arr));
 
        // Check if this value is
        // present in the array or not
        check(arr, toCheckValue);
    }
}