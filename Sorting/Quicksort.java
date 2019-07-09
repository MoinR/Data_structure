
public class Quicksort{
     public static void main(String[] args) {
          System.out.println("Started program ");
          int x[] = {1,4,5,6,7,2,3,8,9,10};
          
          QuickSort(x,0,x.length - 1);
          
          for(int i = 0; i < x.length; i++) 
               System.out.println(x[i]);

          
     }
     
     
     private static void QuickSort(int x[],int l,int u){
          int pivot;
          if(u >= l){
               pivot = split(x,l,u);
               QuickSort(x, l, pivot-1);
               QuickSort(x, pivot+1, u);
          }
     }
     private static int split(int x[],int l,int u){
          int i,j,p,tmp;

          i = l + 1; 
          j = u;
          p = x[l];

          while(j >= i){
               while(x[i] <= i)
                    i++;
               while(x[j] > p)
                    j--;
               if(j >= i){
                    tmp = x[i];
                    x[i] = x[j];
                    x[j] = tmp;
               }
          }
          tmp = x[l];
          x[l] = x[j];
          x[j] = tmp;
          return j;
     }

}