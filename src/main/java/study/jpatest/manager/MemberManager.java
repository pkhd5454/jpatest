package study.jpatest.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.jpatest.entity.Member;

@Service
@RequiredArgsConstructor
public class MemberManager {

  @Transactional
  public void updateFlag(Member member) {
    member.setFlag(member.getFlag() + 2);
  }
}
