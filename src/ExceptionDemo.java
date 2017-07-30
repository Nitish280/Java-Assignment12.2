import java.util.Scanner;
/**
 * 
 * @author Nitish Singh
 * here we are creating a class ExceptionDemo
 * which was asked to create 
 *
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter 5 string values in the string array:");
		// here we taking the string array of size 5
		String[] arr = new String[5];
		// here we use Scanner to take the input from the user
		Scanner sc = new Scanner(System.in);
		// here we are initializing our string array
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.next();
		}
		// here we are taking the string data type
		String string;
		System.out.print("\nEnter the string to search: ");
		// here we are using the Sc.next to taking the next input from the user
		string = sc.next();
		// here we are calling the method to search string in array
		String string1 = searchString(arr, string);
		// here If the method returned null, it means string not found
		if (string1 == null) {
			System.out.println("String not found.");
			// else string will be founded and result will print
		} else {
			System.out.println("String found.");
		}
		// here we are closing the Scanner
		sc.close();
	}

	// here we take the method to search the string
	private static String searchString(String[] arr, String str) {
		// here we are applying the try and catch for checking the exception
		try {
			int i;
			// here we initializing to search the string in array
			for (i = 0; i < arr.length; i++) {
				// If string found stop the loop
				if (arr[i].equals(str)) {
					break;
				}
			}
			// Here we are applying the condition to check the value of i is
			// equal
			// to the array length or not if the value is equal
			// then whole array traversed but
			// the string will not found
			if (i == arr.length) {
				// So exception is thrown
				throw new ValueNotFoundException();//
			} else {
				// here if the value of i is less than the array length
				// then the value will be found and
				// the string will return
				return str;
			}
		} catch (ValueNotFoundException e) {
			// here If the exception caught then null is returned
			return null;
		}
	}
}