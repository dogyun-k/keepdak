package com.study.keepdak.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UpdateUserDto {
    private String name;
    private Integer birth;                  // timestamp;
    private String location;
    private String email;
    private String password;
}
