package com.in28minutes.microservices.limitsservice.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LimitConfiguration {

    private int minimum;
    private int maximum;
}
