package com.octaviookumu.producer.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RiderLocation {
    private String riderId;
    private double latitude;
    private double longitude;
}
