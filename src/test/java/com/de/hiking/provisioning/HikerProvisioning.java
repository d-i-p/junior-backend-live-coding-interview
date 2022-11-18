package com.de.hiking.provisioning;

import com.de.hiking.domain.Hiker;
import com.de.hiking.domain.Hiker.HikerBuilder;
import java.util.UUID;

public class HikerProvisioning {

  public final static String testMail = "henry@element.in";
  public final static UUID hikerId = UUID.randomUUID();

  public static HikerBuilder testHikerBuilder() {
    return Hiker
      .builder()
      .hikerId(hikerId)
      .mail(testMail)
      .age(20)
      .name("Henry").surname("Humboldt");
  }
}
