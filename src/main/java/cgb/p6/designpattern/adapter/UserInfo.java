package cgb.p6.designpattern.adapter;

/**
 * Created by Yannik
 */
public class UserInfo implements IUserInfo{

    @Override
    public String getUserName() {
        System.out.println("获取供应商姓名");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("获取供应商家庭地址");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("获取供应商移动手机号");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("获取供应商办公室电话");
        return null;
    }

    @Override
    public String getJobPositioin() {
        System.out.println("获取供应商职位");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("获取供应商家庭联系电话");
        return null;
    }

}
