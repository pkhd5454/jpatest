package study.jpatest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.jpatest.entity.Member;
import study.jpatest.repository.MemberRepository;
import study.jpatest.service.MemberService;
import study.jpatest.service.MoneyService;

@RestController
@RequiredArgsConstructor
public class MemberController {

  private final MemberRepository memberRepository;
  private final MemberService memberService;
  private final MoneyService moneyService;

  @GetMapping("/update")
  public String update() {
    Member member = memberRepository.findById("hi1").get();

    memberService.update(member);

    moneyService.check(member);
    return "ok";
  }
}
