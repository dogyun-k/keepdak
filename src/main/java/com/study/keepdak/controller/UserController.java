package com.study.keepdak.controller;


import com.study.keepdak.domain.Member;
import com.study.keepdak.dto.CreateUserDto;
import com.study.keepdak.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
@Slf4j
public class UserController {

    @Autowired
    private final UserService userService;

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("userForm", new CreateUserDto());
        return "user/createUserForm";
    }

    @PostMapping("/new")
    public String create(@Valid CreateUserDto userForm, BindingResult result) {

        log.info("UserController before create");
        if (result.hasErrors()) {
            return "user/createUserForm";
        }
        log.info("UserController check error");

        Member member = new Member();
        member.setName(userForm.getName());
        member.setPassword(userForm.getPassword());
        member.setEmail(userForm.getEmail());
        member.setBirth(userForm.getBirth());
        member.setLocation(userForm.getLocation());

        log.info("UserController fill date");

        userService.join(member);

        log.info("UserController join service");
        return "redirect:/";
    }
}
