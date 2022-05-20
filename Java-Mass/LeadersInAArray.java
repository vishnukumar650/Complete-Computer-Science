public class LeadersInAArray {
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int flag=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i])
                    {
                        flag = 1;
                        break;
                    }
            }
            if(flag==0)
                System.out.print(arr[i]+" ");
            flag=0;
        }
    }    
}
