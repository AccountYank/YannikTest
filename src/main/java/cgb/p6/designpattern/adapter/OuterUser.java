package cgb.p6.designpattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yannik
 */
public class OuterUser implements IOuterUser{

    @Override
    public Map getUserBaseInfo() {
        HashMap<String, String> baseInfo = new HashMap<String, String>();
        baseInfo.put("userName", "测试Yannik");
        baseInfo.put("mobileNumber", "18688888888");
        return baseInfo;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap<String, String> officeInfo = new HashMap<String, String>();
        officeInfo.put("jobPosition", "财务专家");
        officeInfo.put("officeTelNumber", "02038328888");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap<String, String> homeInfo = new HashMap<String, String>();
        homeInfo.put("homeAddress", "广东省广州市");
        homeInfo.put("homeTelNumber", "020-100");
        return homeInfo;
    }

}
