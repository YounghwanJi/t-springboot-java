package com.template.tspringbootjava.dto.root;

import lombok.Builder;

import java.time.Instant;

@Builder
public record GitCommit(String id, Instant time) {
}