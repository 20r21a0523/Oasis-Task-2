package Oasis;
import java.util.*;
public class Game {
			static final Scanner s=new Scanner(System.in);
			void meth1()
			{
				Random r=new Random();
				System.out.println("Welcome To Number Guessing Game");
				int val;
				int rounds=3;
				int attempts;
				int score=0;
				for(int i=1;i<=rounds;i++)
				{
					val=r.nextInt(100);
					attempts=5;
					System.out.println("Round "+i);
				do
				{
					System.out.println("Guess the number:");
					int num=s.nextInt();
					if(val==num)
					{
						System.out.println("Yeah! You guessed the number");
					    score=score+attempts;
					    break;
					}
					else
					{
						if(num<val)
						{
							System.out.println("Oops!Number is too small");
						}
						else
						{
							System.out.println("Oops!Number is too large");
						}
						attempts--;
						System.out.println("you have left with only "+attempts+" attempts");
					}
					
				}while(attempts>0);
				System.out.println("All attemps completed");
				System.out.println("Round "+i+" score: "+attempts);
				System.out.println("The number was:"+val);
				}
				System.out.println("Game Finished");
				System.out.println("Your overall score: "+score);
			}
		    public static void main(String[] args) 
		    {
		      int a;
			  do
			  {
				  new Game().meth1();
				  System.out.println("Are you really want to play the game again? If yes type 1 if no type 0");
				   a=s.nextInt();
			  }while(a==1);
		    }
		}
