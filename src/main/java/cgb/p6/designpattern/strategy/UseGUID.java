package cgb.p6.designpattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yannik
 */
public class UseGUID implements UseStrategy {

  private static final Logger LOGGER = LoggerFactory.getLogger(UseGUID.class);

  @Override
  public void use() {
    LOGGER.info("根据场景分析该情况请使用GUID—ID!");
  }
}
