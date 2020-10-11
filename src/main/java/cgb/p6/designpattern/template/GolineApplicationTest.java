package cgb.p6.designpattern.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yannik Template
 */
public class GolineApplicationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(GolineApplicationTest.class);

    public static void main(String[] args) {
        Implementation Implementation = new Implementation(new NewGolineMethod());
        Implementation.goline("YD20200922", "产品经理");
        LOGGER.info("上线新投产方式");
        Implementation.changeMethod(new OldGolineMethod());
        Implementation.goline("YD20200925", "推广组");
    }
}
