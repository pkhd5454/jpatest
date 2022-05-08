package study.jpatest.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.jpatest.entity.Member;

import java.math.BigDecimal;

@Service
@Transactional
public class MemberService {

  public void update(Member member) {
    member.setMoney(BigDecimal.valueOf(12345));
  }
}
