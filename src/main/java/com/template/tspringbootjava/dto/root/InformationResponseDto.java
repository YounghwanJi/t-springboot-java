package com.template.tspringbootjava.dto.root;

import lombok.Builder;

@Builder
public record InformationResponseDto(BuildInformation build, GitInformation git) {
}
