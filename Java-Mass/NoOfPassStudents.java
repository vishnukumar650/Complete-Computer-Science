import java.util.Scanner;
public class NoOfPassStudents {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int noOfStudents;
        System.out.print("No. of students appeared for the exam : ");
        noOfStudents=scan.nextInt();
        System.out.print("Enter the marks of students one by one : ");
        int marks;int passCount=0;
        for(int i=0;i<noOfStudents;i++){
            marks=scan.nextInt();
            if(marks>=50)
                passCount++;
        }
        System.out.println("No. of students passed : "+passCount);
    }
}
