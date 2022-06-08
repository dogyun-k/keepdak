package com.study.keepdak.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CreateUserDto {
    private String name;
    private Integer birth;      // timestamp;
    private String location;
    private String email;
    private String password;
}
