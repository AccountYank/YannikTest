package cgb.p6.designpattern.prototype1;

/**
 * 大众车乘客
 */
public class VolkswagenPassanger extends Passenger {

  @Override
  public VolkswagenPassanger clone() throws CloneNotSupportedException {
    return new VolkswagenPassanger();
  }

  @Override
  public String toString() {
    return "这位大众车乘客";
  }
}
