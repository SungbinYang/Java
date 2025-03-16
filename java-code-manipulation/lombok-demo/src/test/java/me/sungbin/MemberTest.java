package me.sungbin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void getterSetter() {
        Member member = new Member();
        member.setName("sungbin");

        assertEquals(member.getName(), "sungbin");
    }
}