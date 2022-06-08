package com.study.keepdak.service;

import com.study.keepdak.domain.Member;
import com.study.keepdak.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    // sign in
    @Transactional
    public Long join(Member member) {
        log.info("UserService before validate");
      //  validateDuplicateUser(user);
        log.info("UserService after validate");

        userRepository.save(member);
        log.info("UserService after save");
        return member.getId();
    }

    // check duplicate user
    /*
    private void validateDuplicateUser(User user) {
        userRepository.findById(user.getId()).ifPresent(u -> new UserNotFoundException("already exist user"));
    }

    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Transactional
    public void update(Long id, UpdateUserDto updateUserDto) {
        Optional<User> user = userRepository.findById(id);
        user.orElseThrow(() -> { throw new IllegalArgumentException("user is not exist");} );
        user.get().update(updateUserDto);
        userRepository.save(user.get());
    }
     */
}
