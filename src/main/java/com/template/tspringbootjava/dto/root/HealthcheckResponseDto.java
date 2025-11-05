package com.template.tspringbootjava.dto.root;

import lombok.Builder;

@Builder
public record HealthcheckResponseDto(String status) {
}
