package com.de.hiking.provisioning;

import static com.de.hiking.provisioning.BookingProvisioning.testBookingBuilder;

import com.de.hiking.domain.Booking;
import com.de.hiking.domain.Trail;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TrailProvisioning {
  public final static UUID trailId = UUID.randomUUID();
  public final static int defaultMinAge = 18;
  public final static int defaultMaxAge = 60;

  public static Trail testTrail()  {
    Trail trail = new Trail();
    trail.setTrailId(trailId);
    trail.setName("Test Trail");
    trail.setStartTrail(LocalTime.of(8, 30));
    trail.setEndTrail(LocalTime.of(14,40));
    trail.setMinAge(defaultMinAge);
    trail.setMaxAge(defaultMaxAge);
    trail.setPrice(30.0);
    return trail;
  }

  public static Trail trailWithNumberOfBookings(int numberOfBookings) {
    List<Booking> bookingList = IntStream
      .range(0, numberOfBookings)
      .mapToObj(i -> testBookingBuilder().bookingId(UUID.randomUUID()).build())
      .collect(Collectors.toList());

    Trail testTrail = new Trail();
    testTrail.setTrailId(UUID.randomUUID());
    testTrail.setBookings(bookingList);
    return testTrail;
  }
}
