package logicalQuestion.array;

public class ReverseElement {

	public static void main(String[] args) {
		int[] a={10,20,30,40,50};
		int[] temp=new int[a.length];
		int count=0;
		for(int i=a.length-1;i>=0;i--){
			temp[count]=a[i];
			count++;
		}
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");
		}
	}

}
