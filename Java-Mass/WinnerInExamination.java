import java.util.Scanner;
public class WinnerInExamination {
    public static void main(String[] args) {
        
    
    int maths1,physics1,chemistry1;
    int maths2,physics2,chemistry2;
    Scanner scan=new Scanner(System.in);
    
    System.out.print("Enter the marks secured in mathematics by the student 1 : ");
    maths1=scan.nextInt();
    System.out.print("Enter the marks secured in physics by the student 1 : ");
    physics1=scan.nextInt();
    System.out.print("Enter the marks secured in chemistry by the student 1 : ");
    chemistry1=scan.nextInt();

    System.out.print("Enter the marks secured in mathematics by the student 2 : ");
    maths2=scan.nextInt();
    System.out.print("Enter the marks secured in physics by the student 2 : ");
    physics2=scan.nextInt();
    System.out.print("Enter the marks secured in chemistry by the student 2 : ");
    chemistry2=scan.nextInt();

    scan.close();

    int student1Total= maths1+physics1+chemistry1;
    int student2Total = maths2+physics2+chemistry2;

    if(student1Total>student2Total){
        System.out.println("Student 1 Wins in the battle");}
    else if(student2Total>student1Total){
        System.out.println("Student 2 Wins in the battle");}
    else{
        if(maths1>maths2)
            System.out.println("Student 1 Wins");
        else if(maths2>maths1)
            System.out.println("Student 2 Wins");
        else{
            if(physics1>physics2)
                System.out.println("Student 1 Wins");
            else if(physics2>physics1)
                System.out.println("Student 2 Wins");
            else{
                if(chemistry1>chemistry2)
                    System.out.println("Student 1 Wins");
                else if(chemistry2>chemistry1)
                    System.out.println("Student 2 Winds");
                else
                    System.out.println("Both Students Copied");
            }
        }

    }
}
}
