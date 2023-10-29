import java.util.Scanner;

public class AvrgScore{
String name;
float midtermScore;
float finalScore;

public float calculateScore(){
    
return midtermScore * 0.4f + finalScore * 0.6f ;
}

public void ShowStudentInfoAndScore(){
    
        System.out.println("name :"+this.name);
        System.out.println("midtern :"+this.midtermScore);
        System.out.println("finalscore:"+this.finalScore);
        System.out.println("Avrgscore:"+calculateScore());
        


}
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       

        AvrgScore avrgScore = new AvrgScore();
        System.out.println("Enter your student's name:");
        avrgScore.name = input.nextLine();

    System.out.println("Enter your midter's score:");
        avrgScore.midtermScore = input.nextFloat();

        System.out.println("Enter your final's score:");
        avrgScore.finalScore = input.nextFloat();
       avrgScore.ShowStudentInfoAndScore();
       




    }



}