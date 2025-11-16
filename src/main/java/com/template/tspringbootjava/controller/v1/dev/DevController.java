package com.template.tspringbootjava.controller.v1.dev;

import com.template.tspringbootjava.dto.dev.DevTestResponseDto;
import com.template.tspringbootjava.service.DevService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/dev")
@Profile({"local", "dev"})
public class DevController {

    private final DevService devService;

    @GetMapping("/test")
    public ResponseEntity<DevTestResponseDto> getDevMessage() {
        return ResponseEntity.ok(devService.getMessage());
    }

}
