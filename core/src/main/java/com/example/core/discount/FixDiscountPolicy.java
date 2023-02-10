package com.example.core.discount;

import com.example.core.member.Grade;
import com.example.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1000원 할인하겠다.

    @Override
    public int discount(Member Member, int Price) {
        if(Member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }
        else return 0;
    }
}
