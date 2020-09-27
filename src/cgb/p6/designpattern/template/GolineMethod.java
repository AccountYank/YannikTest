package cgb.p6.designpattern.template;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yannik 投产方法抽象类
 */

public abstract class GolineMethod {

    private static final Logger LOGGER = LoggerFactory.getLogger(GolineMethod.class);

    protected abstract String preGoline();

    protected abstract void Goline(String description);

    protected abstract void afterGoline(String adviser);

    public void goline(String description, String adviser) {
        String preGolineResult = preGoline();
        LOGGER.info("{}", preGolineResult);
        Goline(description);
        afterGoline(adviser);
    }
}
