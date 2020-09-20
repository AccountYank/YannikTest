package cgb.p6.designpattern.prototype1;

/**
 * 原型
 */
public abstract class Prototype implements Cloneable {

  @Override
  public abstract Prototype clone() throws CloneNotSupportedException;
}
