package quizz;

import java.util.Scanner;

public class quizz {
    public static void main(String[] args) {
        multpleChoice first = new multpleChoice();
        first.setText("what is the national language of ireland?");
        first.addChoice("#german", false);
        first.addChoice("french", false);
        first.addChoice("irish", true);
        first.addChoice("polish", false);

        multpleChoice second = new multpleChoice();
        second.setText("what is the capital of irreland?");
        second.addChoice("london", false);
        second.addChoice("dublin", true);
        second.addChoice("berlin", false);
        second.addChoice("warsaw", false);

        presentQuestion(first);
        presentQuestion(second);
    }

    public static void presentQuestion(multpleChoice q)
    {
        q.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
    }


