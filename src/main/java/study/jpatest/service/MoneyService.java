package study.jpatest.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.jpatest.entity.Member;
import study.jpatest.manager.MemberManager;

@Slf4j
@Service
@RequiredArgsConstructor
public class MoneyService {

  private final MemberManager memberManager;

  @Transactional
  public void check(Member member) {
    log.info("MoneyService.check member={}", member);
    try {
      if (member.getId().equals("hi1")) {
        throw new IllegalStateException();
      }
    } catch (Exception e) {
      log.error("exception", e);
      memberManager.updateFlag(member);
      return;
    }

    member.setFlag(member.getFlag() + 1);
  }
}
