import java.util.Scanner; //importing scanner 

/*
 * This program checks two numbers from user input & calculates if they sum to the same total
 */

//class
public class Unit1 {

	// main method
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);//// Setup to scan chars from System.in
		String numOne; //
		String numTwo;
		
		
		System.out.print("Enter first three digit number: ");// prompt user for input
		numOne = scnr.nextLine();// get integer from user

		System.out.println("Enter second three digit number: ");
		numTwo = scnr.nextLine();
		

		int nums1Hundreds = Integer.parseInt(Character.toString(numOne.charAt(0)));
		int nums2Hundreds = Integer.parseInt(Character.toString(numTwo.charAt(0)));
		int nums1Tens = Integer.parseInt(Character.toString(numOne.charAt(1)));
		int nums2Tens = Integer.parseInt(Character.toString(numTwo.charAt(1)));
		int nums1Ones = Integer.parseInt(Character.toString(numOne.charAt(2)));
		int nums2Ones = Integer.parseInt(Character.toString(numTwo.charAt(2)));

		System.out.println(nums1Hundreds + nums2Hundreds);
		System.out.println(nums1Tens + nums2Tens);
		System.out.println(nums1Ones + nums2Ones);

		if (nums1Hundreds + nums2Hundreds == nums1Tens + nums2Tens && nums1Tens + nums2Tens == nums1Ones + nums2Ones) {

			System.out.println(true);
		}

		else {
			System.out.println(false);
			
			
		}

	}

}