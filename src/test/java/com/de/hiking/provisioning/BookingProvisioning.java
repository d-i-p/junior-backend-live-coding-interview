package com.de.hiking.provisioning;

import static com.de.hiking.provisioning.HikerProvisioning.hikerId;
import static com.de.hiking.provisioning.TrailProvisioning.trailId;

import com.de.hiking.domain.Booking;
import com.de.hiking.domain.Booking.BookingBuilder;
import com.de.hiking.domain.Hiker;
import java.util.HashSet;
import java.util.UUID;

public class BookingProvisioning {
  public final static UUID bookingId = UUID.randomUUID();
  public static BookingBuilder testBookingBuilder() {
    HashSet<Hiker> hikers = new HashSet<>();
    hikers.add(HikerProvisioning.testHikerBuilder().build());

    return Booking
      .builder()
      .bookingId(bookingId)
      .reservedByHikerId(hikerId)
      .bookMembers(hikers)
      .trailId(trailId);
  }
}
