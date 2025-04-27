import java.util.*;
public class scoreb {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.print("ENTER NUMBER OF PLAYERS: ");
int np = obj.nextInt();
obj.nextLine();
String[] name = new String[np];
int[] score = new int[np];
int[] balls = new int[np];
int[] strikeRate= new int[np];
for(int i=0;i<np;i++)
{
System.out.println("ENTER PLAYER NAME");
name[i]=obj.nextLine();
System.out.println("ENTER SCORE OF THE PLAYER");
score[i]=obj.nextInt();
System.out.println("ENTER THE BALLS HE FACED");
balls[i]=obj.nextInt();
obj.nextLine();// this line will direct control to the line 32 to 27
// if not name input will not work and gives score input bcz that is int
}
System.out.println("ENTER TEAM NAME:");
String tname=obj.nextLine();
System.out.println("\n------------ " + tname + " Scorecard ------------");
System.out.printf("%-20s %-10s %-12s %-12s\n", "Player Name",
"Runs", "Balls Faced", "Strike Rate");
System.out.println("----------------------------------------------------------");
int totalScore=0;
for(int i=0; i<np;i++)
{
if (balls[i] > 0)
strikeRate[i] = (score[i] * 100) / balls[i];
totalScore=totalScore+score[i];
System.out.printf("%-20s %-10d %-12d %-20d \n",name[i], score[i], balls[i], strikeRate[i]);
}System.out.println("----------------------------------------------------------");
}
}
