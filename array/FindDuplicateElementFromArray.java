package logicalQuestion.array;

import java.util.Scanner;

public class FindDuplicateElementFromArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of an array");
		int num=sc.nextInt();
		int[] a=new int[num];
		System.out.println("enter number");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		int count=0;
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					b[count]=a[i];
					count++;
					break;
				}
			}
		}
		for(int i=0;i<b.length;i++){
		System.out.println(b[i]);
		}

	}

}
