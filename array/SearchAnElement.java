package logicalQuestion.array;

public class SearchAnElement {

	public static void main(String[] args) {
		int[] a={10,20,30,40,50};
		int num=30;
		for(int i=0;i<a.length;i++){
			if(a[i]==num){
				System.out.println("elemnt found at index position: "+i);
			}
		}
	}

}
