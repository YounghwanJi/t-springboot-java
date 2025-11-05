package com.template.tspringbootjava.controller.v1.root;

import com.template.tspringbootjava.dto.root.HealthcheckResponseDto;
import com.template.tspringbootjava.dto.root.InformationResponseDto;
import com.template.tspringbootjava.service.RootService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/")
public class RootController {

    private final RootService rootService;

    @GetMapping("/health")
    public ResponseEntity<HealthcheckResponseDto> getHealthcheck() {
        return ResponseEntity.ok(rootService.getHealth());
    }

    @GetMapping("/info")
    public ResponseEntity<InformationResponseDto> getApplicationInformation() {
        return ResponseEntity.ok(rootService.getApplicationInformation());
    }

}
