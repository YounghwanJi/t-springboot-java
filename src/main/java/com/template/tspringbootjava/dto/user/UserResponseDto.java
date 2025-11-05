package com.template.tspringbootjava.dto.user;

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
        Instant createdAt,
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
