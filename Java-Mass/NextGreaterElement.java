import java.util.Scanner;
public class NextGreaterElement {
   public static void main(String[] args) {
      int arr[]={5,3,2,10,6,8,1,4,12,7,4};int nextbig=-1;
      for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    nextbig=arr[j];
                    break;
                }
          }
          System.out.println(arr[i]+" : "+nextbig);
          nextbig=-1;
      } 
   } 
}
