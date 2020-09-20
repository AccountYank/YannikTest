package cgb.p6.designpattern.prototype1;

/**
 * 司机
 */
public abstract class Driver extends Prototype {

  @Override
  public abstract Driver clone() throws CloneNotSupportedException;
}
