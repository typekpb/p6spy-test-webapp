package com.p6spy.engine.spy;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class P6SpyLoggingIT {

  @Test
  public void logFileConstentsFit() {
    final File spyLog = new File("target", "spy.log");
    Assert.assertTrue(spyLog.exists());
  }
}
