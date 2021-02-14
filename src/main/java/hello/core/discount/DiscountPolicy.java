package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    /**
     * 할인
     * @param member : 멤버 객
     * @param price : 가격
     * @return : 할인대상금액
     */
    int discount(Member member, int price);
}
