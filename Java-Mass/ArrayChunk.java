import java.util.Scanner;
public class ArrayChunk {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]={65,62,12,34,87,63,97,46,77};
        int n=scan.nextInt();
        int noOfRowsRequired=arr.length/n+arr.length%n;
        System.out.println(noOfRowsRequired);

        int arrChunk[][]=new int[noOfRowsRequired][n];
        int count=0;
        for(int i=0;i<noOfRowsRequired;i++){
            for(int j=0;j<n;j++){
                if(count<arr.length){
                    arrChunk[i][j]=arr[count];
                    count++;
                }
                
            }
        }
        count=0;
        for(int i=0;i<noOfRowsRequired;i++){
            for(int j=0;j<n;j++){
                if(count<arr.length)
                System.out.print(arrChunk[i][j]+" ");
                count++;
            }
            System.out.println();
        }
    }
}
