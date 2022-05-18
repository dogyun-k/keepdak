package com.study.keepdak.controller;

import com.study.keepdak.domain.Poultry;
import com.study.keepdak.dto.CreatePoultryDto;
import com.study.keepdak.dto.UpdatePoultryDto;
import com.study.keepdak.service.PoultryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/poultry")
@RestController
public class PoultryController {

    private final PoultryService poultryService;

    @GetMapping
    public List<Poultry> getPoultryList() {
        return poultryService.findAll();
    }

    @GetMapping("/{id}")
    public Poultry getPoultryDetail(@PathVariable Long id) {
        return poultryService.findById(id);
    }

    @GetMapping("/new")
    public String viewCreatePoultry() {
        return null;
    }

    @PostMapping
    public CreatePoultryDto createPoultry(@RequestBody CreatePoultryDto createPoultryDto) {
        poultryService.save(createPoultryDto);
        return createPoultryDto;
    }

    @GetMapping("/change")
    public String viewUpdatePoultry() {
        return null;
    }

    @PutMapping("/{id}")
    public String updatePoultry(@PathVariable Long id, @RequestBody UpdatePoultryDto updatePoultryDto) {
        poultryService.update(id, updatePoultryDto);
        return null;
    }

    @DeleteMapping("/{id}")
    public String deletePoultry(@PathVariable Long id) {
        poultryService.delete(id);
        return null;
    }

}
