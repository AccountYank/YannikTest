package cgb.p6.designpattern.adapter;

import java.util.Map;

/**
 * Created by Yannik
 */
public interface IOuterUser {

    //基本信息，如名字、性别、手机号等
    public Map getUserBaseInfo();
    //工作相关
    public Map getUserOfficeInfo();
    //家庭相关
    public Map getUserHomeInfo();
}
