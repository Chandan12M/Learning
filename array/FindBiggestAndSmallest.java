package logicalQuestion.array;


public class FindBiggestAndSmallest {
	public static void main(String[] args) {
		int[] a={30,50,10,40,20};
		sort(a);
		System.out.println("biggest no is:"+a[a.length-1]);
		System.out.println("smallest no is:"+a[0]);
	}

	private static void sort(int[] a) {
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	}
}
