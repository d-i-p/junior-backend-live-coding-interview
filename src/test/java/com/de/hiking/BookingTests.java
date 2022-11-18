package com.de.hiking;


import static com.de.hiking.provisioning.TrailProvisioning.testTrail;

import com.de.hiking.domain.Booking;
import com.de.hiking.domain.Hiker;
import com.de.hiking.domain.Trail;
import com.de.hiking.provisioning.BookingProvisioning;
import com.de.hiking.provisioning.HikerProvisioning;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class BookingTests {

  @Test
  @DisplayName("A valid booking can be made with one hiker.")
  public void aBookingCanBeMade() {
    // Given
    Hiker testHiker = HikerProvisioning.testHikerBuilder().build();
    Trail testTrail = testTrail();
    Booking testBooking = BookingProvisioning.testBookingBuilder().build();

    // When
    testTrail.process(testBooking);

    // Then
    Booking processedBooking = testTrail.getBookings().get(0);
    Assertions.assertEquals(1, processedBooking.getBookMembers().size() );
    Assertions.assertTrue(processedBooking.getBookMembers().contains(testHiker));
  }
}
