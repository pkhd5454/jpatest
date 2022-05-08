package study.jpatest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.jpatest.entity.Member;

public interface MemberRepository extends JpaRepository<Member, String> {
}
