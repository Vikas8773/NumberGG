

import java.util.*;

class Game{
    int usernumber,computernumber;
    int counter;


    Game(){
        Random rd=new Random();
        computernumber=rd.nextInt(100);
    }

    public void takeuserinput(int n){
        usernumber=n;
    }

    public int isCorrectnumber(){
        if(usernumber>computernumber){
            return -1;
        }
        else if(usernumber<computernumber){
            return 1;
        }
        else{
            return 0;
        }
    }
    public void Counter(){
        counter++;
    }

}
public class NumberGuessingGame {
    public static void main(String[] args) {

        Game gm=new Game();
        Scanner sc=new Scanner(System.in);
        int n=0;

        while(true){
            System.out.println("Enter the number between 1-100:");
            n= sc.nextInt();
            gm.takeuserinput(n);

            if(gm.isCorrectnumber()==0){
                gm.Counter();
                System.out.println("Congrats!,you have guessed the correct number");
                System.out.println("Number of counts are "+gm.counter);
                break;
            } else if (gm.isCorrectnumber()==1) {
                gm.Counter();
                System.out.println("Higher number please!");
            }
            else {
                gm.Counter();
                System.out.println("Lower number please!");
            }
        }

    }
}
