package com.template.tspringbootjava.dto.root;

import lombok.Builder;

import java.time.Instant;

@Builder
public record BuildInformation(String name, String version, Instant time, String profile) {
}
