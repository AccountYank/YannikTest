package cgb.p6.designpattern.template;

/**
 * Created by Yannik 投产类
 */
public class Implementation {

    private GolineMethod method;

    public Implementation(GolineMethod method) {
        this.method = method;
    }

    /**
     * 投产
     *
     * @param description 版本
     * @param adviser     送交人
     */
    public void goline(String description, String adviser) {
        method.goline(description, adviser);
    }

    /**
     * 更换学习方法
     *
     * @param method
     */
    public void changeMethod(GolineMethod method) {
        this.method = method;
    }
}
