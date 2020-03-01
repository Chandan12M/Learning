package logicalQuestion.array;

import java.util.Arrays;

public class FindOccuranceFromGivenStringArray {

	public static void main(String[] args) {
		String[] ch={"sonu","monu","sonu","monu","kamran","kamran"};
		Arrays.sort(ch);
		for (int i=0; i<ch.length; i++) {
			int count=1;
			for (int j=i+1; j<ch.length; j++) {
				if(ch[i].equals(ch[j])){
					count=count+1;
					i=j;
				}
			}
			System.out.println(ch[i]+"= "+count);
		}
	}
}
