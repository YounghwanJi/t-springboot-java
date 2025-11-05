package com.template.tspringbootjava.service;

import com.template.tspringbootjava.dto.root.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.BuildProperties;
import org.springframework.boot.info.GitProperties;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RootService {
    private final BuildProperties buildProperties;
    private final GitProperties gitProperties;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    public HealthcheckResponseDto getHealth() {
        return HealthcheckResponseDto.builder()
                .status("UP")
                .build();
    }

    public InformationResponseDto getApplicationInformation() {
        return InformationResponseDto.builder()
                .build(
                        BuildInformation.builder()
                                .name(buildProperties.getName())
                                .time(buildProperties.getTime())
                                .version(buildProperties.getVersion())
                                .profile(activeProfile)
                                .build()
                )
                .git(
                        GitInformation.builder()
                                .branch(gitProperties.getBranch())
                                .commit(
                                        GitCommit.builder()
                                                .id(gitProperties.getShortCommitId())
                                                .time(gitProperties.getCommitTime())
                                                .build()
                                )
                                .build()
                )
                .build();
    }
}

