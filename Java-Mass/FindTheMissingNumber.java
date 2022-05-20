public class FindTheMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,6,7,9,3,4,10,8};
        int requiredSum=((arr.length)+1)*((arr.length+2))/2;
        System.out.println(requiredSum);
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
         sum+=arr[i];   
        }
        System.out.println("Missing number is "+(requiredSum-sum));
    }    
}
