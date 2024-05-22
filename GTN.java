package Guess_The_Number;

import java.util.Scanner;
import java.util.Random;

class GuessTheNumber{
    int chosen_no;
    int p1_no;
    int p2_no;

}
public class GTN {
    public static void main(String[] args) {
        GuessTheNumber comp= new GuessTheNumber();
        GuessTheNumber p1= new GuessTheNumber();
        GuessTheNumber p2= new GuessTheNumber();
        Random rn= new Random();
        comp.chosen_no= rn.nextInt(100);
        Scanner sc= new Scanner(System.in);
        p1.p1_no= sc.nextInt();
        p2.p2_no= sc.nextInt();

        for (;p1.p1_no>comp.chosen_no || p1.p1_no<comp.chosen_no || p1.p1_no==comp.chosen_no;) {
            System.out.println("PLAYER 1 has chosen: "+p1.p1_no);
            if(p1.p1_no-comp.chosen_no<=5 && p1.p1_no-comp.chosen_no>0){
                System.out.println("VERY CLOSE, try a lower no.");
            }
            else if(p1.p1_no-comp.chosen_no<=10 && p1.p1_no-comp.chosen_no>5){
                System.out.println("CLOSE, try a lower no.");
            }
            else if(p1.p1_no>comp.chosen_no){
                System.out.println("BIGGER");
            }
            else if(comp.chosen_no-p1.p1_no<=5 && comp.chosen_no-p1.p1_no>0){
                System.out.println("VERY CLOSE, try a higher no.");
            }
            else if(comp.chosen_no-p1.p1_no<=10 && comp.chosen_no-p1.p1_no>5){
                System.out.println("CLOSE, try a higher no.");
            }
            else if(p1.p1_no<comp.chosen_no){
                System.out.println("SMALLER");
            }
            else if(p1.p1_no==comp.chosen_no && p2.p2_no==comp.chosen_no){
                System.out.println("PLAYER 2 has chosen: "+p2.p2_no);
                System.out.println("BULLS-EYE, But it's a tie");
                break;
            }
            else if(p1.p1_no==comp.chosen_no){
                System.out.println("PLAYER 2 has chosen: "+p2.p2_no);
                System.out.println("BULLS-EYE");
                System.out.println("PLAYER 1 has won!!!");
                break;
            }
            for (;p2.p2_no>comp.chosen_no || p2.p2_no<comp.chosen_no || p2.p2_no==comp.chosen_no;) {
                System.out.println("PLAYER 2 has chosen: "+p2.p2_no);
                if(p2.p2_no-comp.chosen_no<=5 && p2.p2_no-comp.chosen_no>0){
                    System.out.println("VERY CLOSE, try a lower no.");
                    break;
                }
                else if(p2.p2_no-comp.chosen_no<=10 && p2.p2_no-comp.chosen_no>5){
                    System.out.println("CLOSE, try a lower no.");
                    break;
                }
                else if(p2.p2_no>comp.chosen_no){
                    System.out.println("BIGGER");
                    break;
                }
                else if(comp.chosen_no-p2.p2_no<=5 && comp.chosen_no-p2.p2_no>0){
                    System.out.println("VERY CLOSE, try a higher no.");
                    break;
                }
                else if(comp.chosen_no- p2.p2_no<=10 && comp.chosen_no-p2.p2_no>5){
                    System.out.println("CLOSE, try a higher no.");
                    break;
                }
                else if(p2.p2_no<comp.chosen_no){
                    System.out.println("SMALLER");
                    break;
                }
                else if(p2.p2_no==comp.chosen_no){
                    System.out.println("BULLS-EYE");
                    System.out.println("PLAYER 2 has won!!!");
                    break;
                }
            }
            p1.p1_no= sc.nextInt();
            p2.p2_no= sc.nextInt();
        }
    }
}
