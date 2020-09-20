package cgb.p6.designpattern.prototype1;

/**
 * 宝马车司机
 */
public class BmwDriver extends Driver {

  @Override
  public BmwDriver clone() throws CloneNotSupportedException {
    return new BmwDriver();
  }

  @Override
  public String toString() {
    return "这位宝马车司机";
  }
}
