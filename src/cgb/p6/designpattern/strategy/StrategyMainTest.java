package cgb.p6.designpattern.strategy;

/** Main
 * Created by Yannik
 */
public class StrategyMainTest {

  public static void main(String[] args) {
    DiffStateryAI Ai = new DiffStateryAI(new UseCOMB());
    Ai.idmethod();

    Ai.changetStrategy(new UseGUID());
    Ai.idmethod();

    Ai.changetStrategy(new UseUUID());
    Ai.idmethod();
  }
}
