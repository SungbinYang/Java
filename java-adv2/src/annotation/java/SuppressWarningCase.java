package annotation.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SuppressWarningCase {

    @SuppressWarnings("unused")
    public void unusedWarning() {
        int unusedVariable = 10;
    }

    @SuppressWarnings("deprecation")
    public void deprecationWarning() {
        Date date = new Date();
        int date1 = date.getDate();
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public void uncheckedCast() {
        List list = new ArrayList();

        List<String> list2 = (List<String>) list;
    }

    @SuppressWarnings("all")
    public void suppressAllWarnings() {
        Date date = new Date();
        date.getDate();

        List list = new ArrayList();
        List<String> stringList = (List<String>) list;
    }
}
