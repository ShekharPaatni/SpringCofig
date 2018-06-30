package IOC.service;

import IOC.QuizMaster;
import IOC.quiz.SpringQuizMaster;

public class QuizService {
    private QuizMaster quizMaster = new SpringQuizMaster();

    public void askQuestion()
    {
        System.out.println(quizMaster.popQuestion());
    }
}
