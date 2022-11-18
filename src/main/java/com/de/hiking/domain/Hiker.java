package com.de.hiking.domain;

import java.util.UUID;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Hiker {

    private final UUID hikerId;
    private final String name;
    private final String surname;
    private final String mail;
    private final int age;

}
