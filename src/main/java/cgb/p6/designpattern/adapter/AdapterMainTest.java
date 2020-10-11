package cgb.p6.designpattern.adapter;

/**
 * Created by Yannik
 */
public class AdapterMainTest extends OuterUserInfo {
    public static void main(String[] args) {
        IUserInfo info = new UserInfo();
        IUserInfo outerinfo = new OuterUserInfo();

        info.getUserName();
        outerinfo.getUserName();

        info.getHomeAddress();
        outerinfo.getHomeAddress();

        info.getMobileNumber();
        outerinfo.getMobileNumber();

        info.getOfficeTelNumber();
        outerinfo.getOfficeTelNumber();

        info.getJobPositioin();
        outerinfo.getJobPositioin();

        info.getHomeTelNumber();
        outerinfo.getHomeTelNumber();

    }
}
