package com.octaviookumu.consumer.domain;

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
