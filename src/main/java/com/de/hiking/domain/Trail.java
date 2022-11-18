package com.de.hiking.domain;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Trail {
    private UUID trailId;
    private String name;
    private double price;
    private int minAge;
    private int maxAge;
    private LocalTime startTrail;
    private LocalTime endTrail;
    private List<Booking> bookings = new ArrayList<>();

    public void process(Booking booking) {
        bookings.add(booking);
    }
}
