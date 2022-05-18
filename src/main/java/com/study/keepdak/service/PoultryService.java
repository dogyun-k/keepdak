package com.study.keepdak.service;

import com.study.keepdak.domain.Poultry;
import com.study.keepdak.dto.CreatePoultryDto;
import com.study.keepdak.dto.UpdatePoultryDto;
import com.study.keepdak.exception.PoultryNotFoundException;
import com.study.keepdak.repository.PoultryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PoultryService {

    private final PoultryRepository poultryRepository;

    public List<Poultry> findAll() {
        return poultryRepository.findAll();
    }

    public Poultry findById(Long id) {
        return poultryRepository.findById(id)
                .orElseThrow(
                        () -> new PoultryNotFoundException("사양 정보를 찾을 수 없습니다.")
                );
    }

    public void save(CreatePoultryDto createPoultryDto) {
        poultryRepository.save(Poultry.from(createPoultryDto));
    }

    @Transactional
    public void update(Long id, UpdatePoultryDto updatePoultryDto) {
        Poultry poultry = poultryRepository.getById(id);
        poultry.update(updatePoultryDto);
        poultryRepository.save(poultry);
    }

    public void delete(Long id) {
        poultryRepository.deleteById(id);
    }
}
