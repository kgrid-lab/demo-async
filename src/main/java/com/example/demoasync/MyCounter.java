package com.example.demoasync;

import java.util.concurrent.TimeUnit;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyCounter {

  @Async
  public void mullItOver()  {
    for (int i=0; i<5; i++)  {
      System.out.println(i);
      try {
        TimeUnit.MILLISECONDS.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
