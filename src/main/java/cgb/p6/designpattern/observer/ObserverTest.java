package cgb.p6.designpattern.observer;
import com.google.common.eventbus.EventBus;
/**
 * Created by Yannik
 */
public class ObserverTest {
        public static void main(String[] args) {
            Question question = new Question();
            question.setUserName("焱坤");
            question.setContent("如何快速学完Spring？");
            EventBus eventBus = new EventBus();
            TeacherEvent guavaEvent = new TeacherEvent("TOM-谭");
            eventBus.register(guavaEvent);
            eventBus.post(question);
        }
    }
