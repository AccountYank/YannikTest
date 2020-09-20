package cgb.p6.designpattern.prototype1;

/**
 * 宝马车
 */
public class BmwVehicle extends Vehicle {

  @Override
  public BmwVehicle clone() throws CloneNotSupportedException {
    return new BmwVehicle();
  }

  @Override
  public String toString() {
    return "一辆宝马车";
  }
}
