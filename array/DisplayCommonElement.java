package logicalQuestion.array;

public class DisplayCommonElement {

	public static void main(String[] args) {
		int[] a={30,50,10,40,20};
		int[] b={40,60,70,80,20};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]==b[j]){
					System.out.println(a[i]+" ");
				}
			}
		}
	}

}
