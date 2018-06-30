package IOC.service;

import IOC.QuizMaster;

public class QuizServiceUsingDI {
    private QuizMaster quizMaster;

    public QuizMaster getQuizMaster() {
        return quizMaster;
    }

    public void setQuizMaster(QuizMaster quizMaster) {
        this.quizMaster = quizMaster;
    }

    public void askQuestion()
    {
        System.out.println(quizMaster.popQuestion());
    }
}
