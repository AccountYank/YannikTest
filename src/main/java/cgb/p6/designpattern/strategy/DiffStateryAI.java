package cgb.p6.designpattern.strategy;

/** DiffStateryAI
 * Created by Yannik
 */
public class DiffStateryAI {

  private UseStrategy strategy;

  public DiffStateryAI(UseStrategy strategy) {
    this.strategy = strategy;
  }

  public void changetStrategy(UseStrategy strategy) {
    this.strategy = strategy;
  }

  public void idmethod() {
    this.strategy.use();
  }
}
