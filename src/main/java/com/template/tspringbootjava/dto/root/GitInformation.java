package com.template.tspringbootjava.dto.root;

import lombok.Builder;

@Builder
public record GitInformation(String branch, GitCommit commit) {
}
