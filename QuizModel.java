package model;

import java.util.ArrayList;
import java.util.List;

public class QuizModel {

    private List<String> questions;
    private List<String[]> options;
    private List<String> correctAnswers;

    public QuizModel() {
    
        questions = new ArrayList<>();
        options = new ArrayList<>();
        correctAnswers = new ArrayList<>();
        questions.add("What is the capital of France?");
        options.add(new String[]{"1.Berlin","2.Madrid","3.Paris","4.Rome"});
        correctAnswers.add("3");

        questions.add("Which planet is known as the Red Planet?");
        options.add(new String[]{"1.Earth", "2.Mars","3.Jupiter","4.Venus"});
        correctAnswers.add("2");

        questions.add("What is the square root of 64?");
        options.add(new String[]{"1.6","2.7","3.8","4.9"});
        correctAnswers.add("3");
    }
    public int getTotalQuestions() {
        return questions.size();
    }
    public String getQuestion(int index) {
        return questions.get(index);
    }
    public String[] getOptions(int index) {
        return options.get(index);
    }
    public String getCorrectAnswer(int index) {
        return correctAnswers.get(index);
    }
}