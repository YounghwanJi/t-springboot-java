package com.template.tspringbootjava.service;

import com.template.tspringbootjava.dto.dev.DevTestResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DevService {

    public DevTestResponseDto getMessage() {
        return DevTestResponseDto.builder()
                .message("This is a dev message.")
                .build();

    }
}

