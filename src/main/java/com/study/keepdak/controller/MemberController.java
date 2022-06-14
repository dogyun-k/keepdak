package com.study.keepdak.controller;


import com.study.keepdak.domain.Member;
import com.study.keepdak.form.MemberForm;
import com.study.keepdak.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
@Slf4j
public class MemberController {

    @Autowired
    private final MemberService memberService;

    @GetMapping
    public String members(Model modal) {
        List<Member> members = memberService.findMembers();
        modal.addAttribute("members", members);
        for (Member member : members) {
            System.out.println(member);
        }
        return "user/memberList";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("MemberForm", new MemberForm());
        return "user/createUserForm";
    }

    @GetMapping("/update")
    public String updateForm(Model model) {
        MemberForm form = new MemberForm();
        form.setId(1L);

        model.addAttribute("MemberForm", form);
        return "user/updateUserForm";
    }

    @PostMapping("/update")
    public String update(@Valid MemberForm memberForm, BindingResult result) {

        if (result.hasErrors()) {
            log.info(result.toString());
            return "user/updateUserForm";
        }

        Member member = memberService.findOne(1L);
        member.setName("234");
        member.setLocation("234");
        member.setEmail("234");
        member.setPassword("234");

        memberService.join(member);

        return "user/updateUserForm";
    }

    @PostMapping("/new")
    public String create(@Valid MemberForm memberForm, BindingResult result) {
        if (result.hasErrors()) {
            log.info(result.toString());
            return "user/createUserForm";
        }

        Member member = new Member();
        member.setName(memberForm.getName());
        member.setPassword(memberForm.getPassword());
        member.setEmail(memberForm.getEmail());
        // member.setBirth(userForm.getBirth());
        member.setLocation(memberForm.getLocation());

        memberService.join(member);

        return "redirect:/";
    }

    @PutMapping("/{id}")
    public String updateMember() {
        log.info("PutMapping");
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String deleteMember(@PathVariable("id") Long id) {
        log.info("deletememet");
        log.info(id.toString());
        Member member = memberService.findOne(id);
        log.info(member.toString());
        memberService.deleteMember(member);

        log.info("after delete query");
        return "redirect:/";
    }
}
