public class Insertion_sort {
     public static void main(String[] args) {
          int x[] = {2,25,36,14,32,35,45}; 
          int tmp,i,j; 

          for(i = 1; i < x.length;i++){
               tmp = x[i];
               for(j = i; j > 0 && tmp < x[j-1]; j--){
                    x[j] = x[j-1];
               }
               x[j] = tmp;
          }
          for(i = 0; i < x.length; i++){
               System.out.println(x[i]);
          }          
     }     
}