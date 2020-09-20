package cgb.p6.designpattern.prototype1;

/**
 * 车
 */
public abstract class Vehicle extends Prototype {

  @Override
  public abstract Vehicle clone() throws CloneNotSupportedException;
}
