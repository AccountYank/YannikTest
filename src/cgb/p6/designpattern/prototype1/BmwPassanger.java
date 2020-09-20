package cgb.p6.designpattern.prototype1;

/**
 * 宝马车乘客
 */
public class BmwPassanger extends Passenger {

  @Override
  public BmwPassanger clone() throws CloneNotSupportedException {
    return new BmwPassanger();
  }

  @Override
  public String toString() {
    return "这位宝马车乘客";
  }
}
