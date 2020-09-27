package cgb.p6.designpattern.adapter;

import java.util.Map;

/**
 * Created by Yannik *Adapter
 */
public class OuterUserInfo extends OuterUser implements IUserInfo{

    private Map baseInfo = getUserBaseInfo();//供应商基本信息
    private Map homeInfo = getUserHomeInfo();//供应商家庭信息
    private Map officeInfo = getUserOfficeInfo();//供应商工作信息

    @Override
    public String getUserName() {
        String userName = (String)baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPositioin() {
        String jobPosition = (String) officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
