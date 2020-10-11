package cgb.p6.designpattern.template;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yannik 旧的投产方式
 */

public class OldGolineMethod extends GolineMethod {

    private static final Logger LOGGER = LoggerFactory.getLogger(OldGolineMethod.class);

    @Override
    protected String preGoline() {
        return "（新）准备相关投产文档，拟稿提交投产流程";
    }

    @Override
    protected void Goline(String description) {
        LOGGER.info("投产版本：{}", description);
    }

    @Override
    protected void afterGoline(String adviser) {
        if (!adviser.equals("")) {
            LOGGER.info("流程发起，流程下一步送给{}审核", adviser);
        }
    }
}
