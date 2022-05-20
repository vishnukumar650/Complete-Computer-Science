/*
You have decided to build a pyramid of stones on this new year. The simple rule is that the top level of the pyramid must consist of 1 stone, the second level must consist of 1 + 2 = 3 stones, the third level must have 1 + 2 + 3 = 6 stones, and so on.

Effectively, the i-th level of the pyramid contains 1 + 2 + ... + (i - 1) + i stones.

You have got n stones and have to build a pyramid from them.

Team Masai wants to know what is the maximum height of the pyramid that you can make using the given stones.*/
import java.util.Scanner;
public class PyramidHeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        int total=0;int count=0;
        for(int i=1;i<=n;i++){
       		total=total+(i*(i+1)/2);
          	if(total<=n)
		{
			count++;
		}	
		else{
			System.out.println(count);
			return;
		}
           }
           
        System.out.println(count);

    }
}
