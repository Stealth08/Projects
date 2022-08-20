import java.util.Scanner;
import javax.xml.transform.Source;
public class App {
    public static void main(String [] args) {
        String q1="Knot is a unit of ?\n"
                +"A) Speed\nB)Distance\nC)Deapth\nD)Accelration";
        String q2="One joule of work is said to be done when __:\n"
            +  "A)a force of 1 dyne causes a displacement of 1 cm\nB)a force of 1 dyne causes a displacement of 1 m\nC)a force of 1 N causes a displacement of 1 cm\nD)a force of 1 N causes a displacement of 1 m";
        String q3="The spray bottles used as window or household cleaner or perfume spray works on:\n"
                +"A)Capillary action\nB)Bernoullis Principle\nC)Pascals Law\nD)Stokes Law";
        String q4="If a Candle is make to burn in Zero Gravity__:\n"
                +"A)The Candle will burn for a very long time compared to normal gravity\nB)The flame of the candle will become round\nC)There is no impact of gravity on the burning of candle\nD)The Candle will not burn in zero gravity";
        String q5="Which of the following is the essential element for batteries used in electric cars?\n"
                +"A)Magnesium\nB)Lithium\nC)Sodium\nD)Bromine";
        String q6="Which of the following is an alkaline earth metal?\n"
                +"A)Pottasium\nB)Lead\nC)Copper\nD)Calcium";
        String q7="The Alkali metals are called good reducing agents. This implies that__:\n"
                +"A)They easily capture electrons\nB)They are not stable at room temperature\nC)They easily lose electrons\nD)They dont act with dilute acids";
        String q8="Which among the following is popularly called Hypo?\n"    
                +"A)Silver Bromide\nB)Silver nitrate\nC)Sodium thiosulphate\nD)Sodium phosphate";    
        Question [] questions ={
            new Question(q1,"A"),
            new Question(q2,"D"),
            new Question(q3,"B"),
            new Question(q4,"B"),
            new Question(q5,"B"),
            new Question(q6,"D"),
            new Question(q7,"C"),
            new Question(q8,"C")
        };
        test(questions);
    }
    public static void test(Question [] questions){
        int score=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<questions.length;i++)
        {
            if(i==0)
            System.out.println("PHYSICS\n");
            if(i==4)
            System.out.println("CHEMISTRY\n");
            System.out.println(questions[i].prompt);
            String answer=sc.nextLine();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println("You got "+score+"/"+questions.length);
    }
    
}
