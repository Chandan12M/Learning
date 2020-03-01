package logicalQuestion.array;

import java.util.Set;
import java.util.TreeSet;

public class SortingStringArray {

	public static void main(String[] args) {
		String[] s=new String[4];
		s[0]="sonu";
		s[1]="monu";
		s[2]="kamran";
		s[3]="chandan";
		//using Set
		/*Set<String> set=new TreeSet<String>();
		for(int i=0;i<s.length;i++){
			set.add(s[i]);
		}
		System.out.println(set);*/
		
		//without Set
		
		for(int i=0;i<s.length;i++){
			for(int j=i;j<s.length;j++){
				if(s[i].compareTo(s[j])>0){
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(String nstr:s){
			System.out.print(nstr+" ");
		}
	}

}
