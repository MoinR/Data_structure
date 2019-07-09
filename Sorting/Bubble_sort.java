public class Bubble_sort{
     public static void main(String[] args) {
          int x[] = {50,2,85,14,48,14};
		int tmp;
          System.out.println("Array without sorting : ");          
          for(int i = 0; i < x.length; i++)
               System.out.println(x[i]);
          
          for(int i = 0; i < x.length; i++){
               for(int j = 0; j < x.length - 1 - i; j++){
                    if(x[j] > x[j + 1] ){
                         tmp = x[j];
                         x[j] = x[j+1];
                         x[j+1] = tmp;
                    }
               }
          }
          System.out.println("Sorted Array : ");     
		for(int i = 0; i < x.length; i++){
			System.out.println(x[i]);
		}
     }
}