package algorithmProblemStatement;

import java.util.Scanner;

public class transactionCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of transactions:");

		int noOfTransactions = sc.nextInt();

		int arr[] = new int[noOfTransactions];
		System.out.println("Enter the transaction vlues:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the no of targets to be achieved");

		int noOfTargets = sc.nextInt();

		while (noOfTargets-- != 0) {

			System.out.println("Enter value of Target:");
			long targetValue = sc.nextLong();
			//System.out.println(targetValue);
			boolean isTargetAchieved = false;
			
			long sum=0;
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
				if(sum>=targetValue) {
					System.out.println("Target is achieved at "+(i+1));
					isTargetAchieved = true;
					break;
				}
				
			}
			if(isTargetAchieved==false) {
				System.out.println("Target is not Achieved");
			}
		}
	}

}
