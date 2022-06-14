package com.study.keepdak.form;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter @Setter
public class MemberForm {
    private Long id;
    private String name;
   // private LocalDateTime birth;      // timestamp;
    private String location;
    private String email;
    private String password;
}
