import java.util.*;


class student {
    double hindi,english,maths,physics,chemistry,TM,PERCENTAGE;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the marks of Hindi :-");
        hindi = sc.nextDouble();
        System.out.println("Please enter the marks of English :-");
        english = sc.nextDouble();
        System.out.println("Please enter the marks of Maths :-");
        maths = sc.nextDouble();
        System.out.println("Please enter the marks of Physics :-");
        physics = sc.nextDouble();
        System.out.println("Please enter the marks of Chemistry:-");
        chemistry = sc.nextDouble();
    }

    public void TotalMarks() {
         TM = (hindi+english+maths+physics+chemistry);
    }

    public void percentage(){
        PERCENTAGE = TM/5;
    }

    public void Grade(){
      if (PERCENTAGE>=90 && PERCENTAGE<100) {
        System.out.println("---- Congratulation A grade ----");
      }  
      else if(PERCENTAGE>=80 && PERCENTAGE<90) {
        System.out.println("Good job You got B grade");
      }
      else if(PERCENTAGE>=70 && PERCENTAGE<80) {
        System.out.println(" You got C grade");
      }
      else if(PERCENTAGE>=60 && PERCENTAGE<70) {
        System.out.println("Need more practice,  You got D grade");
      }
      else if(PERCENTAGE>=50 && PERCENTAGE<60) {
        System.out.println(" You got E grade");
      }
      else if(PERCENTAGE>=40 && PERCENTAGE<50) {
        System.out.println("God saves, You got F grade");
      }
      else {
        System.out.println("You was failed ...");
      }


}
    public void disp() {
        System.out.println("Total marks Obtained By a student = " + TM);
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

        System.out.println("Average percentage is = " + PERCENTAGE);
        
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        Grade();
    }

    public void reduce(student s) {
        s.input();
        s.TotalMarks();
        s.percentage();
        s.disp();
    }

   
}
public class STUDENT_GRADE {
    public static void main(String[] args) {
        student a = new student();
        a.reduce(a); //polymorphism is used 
    }
    
}