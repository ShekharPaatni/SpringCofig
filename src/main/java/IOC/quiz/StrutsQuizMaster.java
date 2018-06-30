package IOC.quiz;

import IOC.QuizMaster;

public class StrutsQuizMaster implements QuizMaster {
    @Override
    public String popQuestion() {
        return "Are you new to Struts?";
    }
}
