package com.de.hiking.domain.exceptions;

import lombok.Getter;

@Getter
public class BookingValidationException extends RuntimeException {
  ValidationReason validationReason;

  public BookingValidationException(ValidationReason reason) {
    super("Invalid Booking: " + reason.toString());
    validationReason = reason;
  }

  public enum ValidationReason {
    EMPTY,
    TOO_YOUNG,
    NO_HIKERS,
    DUPLICATES
  }
}
