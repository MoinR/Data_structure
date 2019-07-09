public class Selection_sort {
	public static void main(String args[]){
		int x[] = {50,2,85,14,48,14};
		int tmp;
		
		for(int i = 0; i < x.length; i++){
			for(int j = i+1; j < x.length; j++){
				if(x[i] > x[j] ){
					tmp = x[i];
					x[i] = x[j];
					x[j] = tmp;
				}
			}
		}
		for(int i = 0; i < x.length; i++){
			System.out.println(x[i]);
		}
		
		
		
	}
}
