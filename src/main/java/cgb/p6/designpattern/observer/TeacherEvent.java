package cgb.p6.designpattern.observer;
import com.google.common.eventbus.Subscribe;
/**
 * Created by Yannik
 */
public class TeacherEvent {

        private String teacherName;

        public TeacherEvent(String teacherName) {
            this.teacherName = teacherName;
        }

        @Subscribe
        public void subscribe(Question question){
            System.out.println(this.teacherName + "老师，您好！" );
            System.out.println("您收到了一个来自“" + question.getUserName() + "”同学的提问，希望您解答。");
            System.out.println("问题为：");
            System.out.println(question.getContent());
        }
    }
