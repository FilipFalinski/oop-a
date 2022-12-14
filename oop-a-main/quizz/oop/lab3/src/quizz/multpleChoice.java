package quizz;

import java.util.ArrayList;

public class multpleChoice extends question{

    private ArrayList<String> choices;


    /**
     Constructs a ChoiceQuestion with no choices
     */
    public multpleChoice()
    {
        choices = new ArrayList<String>();
    }

    public void addChoice(String choice, boolean correct)
    {
        choices.add(choice);
        if (correct)
        {
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }

    public void display()
    {
        super.display();

        for (int i = 0; i < choices.size(); i++)
        {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + " : " + choices.get(i));
        }

    }

}
