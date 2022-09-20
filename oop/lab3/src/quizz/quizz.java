package quizz;

import java.util.Scanner;

public class quizz {
    public static void main(String[] args) {


        question question1 = new question("what is the capital of Ireland");
        Scanner in = new Scanner(System.in);
        question1.display();
        String response = in.nextLine();
        System.out.println(question1.checkanswer(response));

    }

}
