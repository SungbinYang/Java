package me.sungbin;

public class Moim {

    int maxNumberOfAttendances;

    int numberOfCurrentEnrolment;

    public boolean isEnrollmentFull() {
        if (maxNumberOfAttendances == 0) {
            return false;
        }

        if (numberOfCurrentEnrolment < maxNumberOfAttendances) {
            return false;
        }

        return true;
    }
}
