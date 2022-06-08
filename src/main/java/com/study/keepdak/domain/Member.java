package com.study.keepdak.domain;

import com.study.keepdak.dto.CreateUserDto;
import com.study.keepdak.dto.UpdateUserDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@NoArgsConstructor
@Entity
public class Member {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer birth;                  // timestamp;
    private String location;
    private String email;
    private String password;

    public static Member of() { return new Member(); }

    @Builder
    public Member(
            String name,
            Integer birth,
            String location,
            String email,
            String password
    ) {
        this.name = name;
        this.birth = birth;
        this.location = location;
        this.email = email;
        this.password = password;
    }

    public static Member form(CreateUserDto createUserDto) {
        return Member.builder()
                .name(createUserDto.getName())
                .birth(createUserDto.getBirth())
                .location(createUserDto.getLocation())
                .email(createUserDto.getEmail())
                .password(createUserDto.getPassword())
                .build();
    }

    public void update(UpdateUserDto updateUserDto) {
        this.name = updateUserDto.getName();
        this.birth = updateUserDto.getBirth();
        this.location = updateUserDto.getLocation();
        this.email = updateUserDto.getEmail();
        this.password = updateUserDto.getPassword();
    }
}
