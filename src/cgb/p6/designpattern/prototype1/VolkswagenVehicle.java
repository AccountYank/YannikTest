package cgb.p6.designpattern.prototype1;

/**
 * 大众车
 */
public class VolkswagenVehicle extends Vehicle {

  @Override
  public VolkswagenVehicle clone() throws CloneNotSupportedException {
    return new VolkswagenVehicle();
  }

  @Override
  public String toString() {
    return "一辆大众车";
  }
}
