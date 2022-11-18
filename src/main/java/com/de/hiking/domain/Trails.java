package com.de.hiking.domain;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Trails {
  private Set<Trail> trails;

  public Trails(Set<Trail> trails) {
    this.trails = trails;
  }

  public void addTrail(Trail trail) {
    trails.add(trail);
  }

  public BigDecimal discount(UUID trailID) {
    return null;
  }
}
