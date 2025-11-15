package com.template.tspringbootjava.controller.v1.user;

import com.template.tspringbootjava.dto.common.PageResponseDto;
import com.template.tspringbootjava.dto.user.UserCreateRequestDto;
import com.template.tspringbootjava.dto.user.UserResponseDto;
import com.template.tspringbootjava.dto.user.UserUpdateRequestDto;
import com.template.tspringbootjava.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/users")
public class UserController {
    private final UserService userService;

    /**
     * 사용자 생성
     * POST /api/users
     */
    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(@Valid @RequestBody UserCreateRequestDto request) {
        UserResponseDto response = userService.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    /**
     * 사용자 조회 (단건)
     * GET /api/users/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUser(@PathVariable Long id) {
        UserResponseDto response = userService.getUser(id);
        return ResponseEntity.ok(response);
    }

    /**
     * 모든 사용자 조회 (페이징)
     * GET /api/users?page=0&size=10&sort=createdAt,desc
     */
    @GetMapping
    public ResponseEntity<PageResponseDto<UserResponseDto>> getAllUsers(
            @PageableDefault(size = 10, sort = "createdAt", direction = Sort.Direction.DESC) Pageable pageable) {
        PageResponseDto<UserResponseDto> response = userService.getAllUsers(pageable);
        return ResponseEntity.ok(response);
    }

    /**
     * 사용자 수정
     * PUT /api/users/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDto> updateUser(
            @PathVariable Long id,
            @Valid @RequestBody UserUpdateRequestDto request) {
        UserResponseDto response = userService.updateUser(id, request);
        return ResponseEntity.ok(response);
    }

    /**
     * 사용자 삭제
     * DELETE /api/users/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
