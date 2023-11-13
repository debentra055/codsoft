import java.util.Scanner;

class gross{
    public int genrate(int max,int min){
        return (int) (Math.random()*(max - min + 1) + min);
    }
}

public class numbergame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        gross gr = new gross();
        int totalAttempts = 0;
        int win = 0;

        while (true) {
            System.out.println("Enter the minimum number");
            int min = sc.nextInt();
            System.out.println("Enter the maximum number");
            int max = sc.nextInt();
            sc.nextLine();

            int cnum = gr.genrate(min, max);
            int attempts = 0;

            while (true) {
                System.out.println("Guess a number between "+min+" and "+max);
                int gnum = sc.nextInt();
                attempts++;

                if (gnum > cnum) {
                    System.out.println("Your guess is too high.");
                } else if (gnum < cnum){
                    System.out.println("Your guess is too low.");
                }else{
                    System.out.println("Correct Guess");
                    win++;
                    break;
                }
            }
            totalAttempts += attempts;
            System.out.println("Attempts = " + attempts);
            System.out.println("Wins = " + win);

            double winrate = (double) win / totalAttempts*100;
            System.out.printf("Your winrate is %.2f%%\n",winrate);

            System.out.println("Do you want to play again (yes/no)");
            String playAgain = sc.next();
            if(!playAgain.equalsIgnoreCase("yes")){
                sc.close();
                System.exit(0);
            }
            sc.nextLine();
        }
    }
}
