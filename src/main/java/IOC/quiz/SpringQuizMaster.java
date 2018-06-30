package IOC.quiz;

import IOC.QuizMaster;

public class SpringQuizMaster implements QuizMaster {
    @Override
    public String popQuestion() {
        return "Are you new to Spring?";
    }
}
