package IOC;

import IOC.service.QuizService;
import IOC.service.QuizServiceUsingDI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuizProgram {
    public static void main(String[] args) {
        QuizService quizService = new QuizService();
        quizService.askQuestion();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        QuizServiceUsingDI quizServiceUsingDI =  (QuizServiceUsingDI) applicationContext.getBean("quizService");
        quizServiceUsingDI.askQuestion();
    }
}
