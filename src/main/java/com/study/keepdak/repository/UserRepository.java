package com.study.keepdak.repository;

import com.study.keepdak.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UserRepository {

    @Autowired
    private EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

}
