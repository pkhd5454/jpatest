package study.jpatest.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "MEMBER")
@Getter
@Setter
@ToString
public class Member {

  @Id
  @Column(name = "MEMBER_ID")
  private String id;

  @Column(name = "MONEY")
  private BigDecimal money;

  @Column(name = "FLAG")
  private int flag;
}
