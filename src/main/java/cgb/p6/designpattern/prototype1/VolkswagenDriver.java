package cgb.p6.designpattern.prototype1;

/**
 * 大众车司机
 */
public class VolkswagenDriver extends Driver {

  @Override
  public VolkswagenDriver clone() throws CloneNotSupportedException {
    return new VolkswagenDriver();
  }

  @Override
  public String toString() {
    return "这位大众车司机";
  }
}
