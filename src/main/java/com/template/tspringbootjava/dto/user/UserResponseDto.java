package com.template.tspringbootjava.dto.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.template.tspringbootjava.domain.user.UserEntity;
import com.template.tspringbootjava.domain.user.UserStatus;
import lombok.Builder;

import java.time.Instant;

@Builder
public record UserResponseDto(
        Long id,
        String email,
        String name,
        String phoneNumber,
        UserStatus status,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
        Instant createdAt,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
        Instant updatedAt
) {

    public static UserResponseDto from(UserEntity entity) {
        return new UserResponseDto(
                entity.getId(),
                entity.getEmail(),
                entity.getName(),
                entity.getPhoneNumber(),
                entity.getStatus(),
                entity.getCreatedAt(),
                entity.getUpdatedAt()
        );
    }
}
