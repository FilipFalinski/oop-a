package quizz;

public class question {
    private String text;
    private String answer;

    public question(String text) {
        this.text = text;
        this.answer = answer;
    }

    public void display(){
        System.out.println(this.text);

    }

    public boolean checkanswer(String response){

        return response.equals(answer);

    }
}
