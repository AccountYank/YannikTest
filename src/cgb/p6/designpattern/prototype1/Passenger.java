package cgb.p6.designpattern.prototype1;

/**
 * 乘客
 */
public abstract class Passenger extends Prototype {

  @Override
  public abstract Passenger clone() throws CloneNotSupportedException;
}
