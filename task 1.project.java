import java.util.Scanner;
public class StudentGrade{
     /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter the marks obtain of these subject");
        Scanner sc=new Scanner (System.in);
        System.out.print("Science: ");
        float a=sc.nextFloat();
        System.out.print("Math   : ");
        float b=sc.nextFloat();
        System.out.print("English: ");
        float c=sc.nextFloat();
        System.out.print("Social : ");
        float d=sc.nextFloat();
        System.out.print("Health : ");
        float e=sc.nextFloat();
        float total=(a+b+c+d+e);
        float percentage=(total)/5;
        String Grade;
        if (percentage >= 90) {
            Grade = "A+";
        } else if (percentage >= 80) {
            Grade = "A";
        } else if (percentage >= 70) {
            Grade = "B+";
        } else if (percentage >= 60) {
            Grade = "B";
        } else if(percentage >=55){
            Grade = "C+";
        } else if(percentage >=50){
            Grade="C";
        } else if(percentage >=40){
            Grade ="D";
        }
        else  {
            Grade = "F";
        }

        System.out.println("The total Mark obtain is: "+total);
        System.out.println("The total percentage of these Subject is: "+percentage+"%");
        System.out.println("Grade: "+Grade);
    }
}