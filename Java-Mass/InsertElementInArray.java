import java.util.Scanner;
import java.util.ArrayList;
public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(5);
	arr.add(6);
	int position=scan.nextInt();
	int value=scan.nextInt();
	for(int size=arr.length;size>position;size--)
	{
		arr[size]=arr[size-1];
	}
	arr[position]=value;
            }
}
