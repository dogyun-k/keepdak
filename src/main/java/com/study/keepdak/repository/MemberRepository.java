package com.study.keepdak.repository;

import com.study.keepdak.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MemberRepository {

    @Autowired
    private EntityManager em;

    public Member findOne(Long id) {
        return em.find(Member.class, id);
    }

    public void save(Member member) {
        em.persist(member);
    }

    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }

    @Transactional
    public void deleteMember(Member member) {
        em.remove(member);
    }
}
