package com.de.hiking.domain;


import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Booking {

    private final UUID bookingId;
    private final UUID reservedByHikerId;
    private final LocalDate bookingDate;
    private final UUID trailId;
    private final Set<Hiker> bookMembers;
}
