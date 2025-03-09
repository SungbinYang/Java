package me.sungbin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoimTest {

    @Test
    void isFull() {
        Moim moim = new Moim();
        moim.maxNumberOfAttendances = 100;
        moim.numberOfCurrentEnrolment = 10;

        assertFalse(moim.isEnrollmentFull());
    }
}