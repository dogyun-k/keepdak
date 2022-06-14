package com.study.keepdak.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class UpdateUserDto {
    private String name;
    private LocalDateTime birth;                  // timestamp;
    private String location;
    private String email;
    private String password;
}
