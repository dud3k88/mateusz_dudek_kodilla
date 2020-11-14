package com.kodilla.patterns2.obserer.homework;

import com.kodilla.patterns2.observer.homework.Mentor;
import com.kodilla.patterns2.observer.homework.Student;
import com.kodilla.patterns2.observer.homework.StudentTask;
import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {
    @Test
    public void notifyAboutNewTask() {
        //given
        StudentTask janNowak = new StudentTask(new Student("Jan Nowak"));
        StudentTask karolMroz = new StudentTask(new Student("Karol Mróz"));
        StudentTask karolinaKac = new StudentTask(new Student("Karolina Kac"));
        Mentor lordWader = new Mentor("Lord Wader");
        Mentor kasiaKopec = new Mentor("Kasia Kopeć");

        janNowak.registerObserver(lordWader);
        karolMroz.registerObserver(lordWader);
        karolinaKac.registerObserver(kasiaKopec);

        //when
        janNowak.addTaskToQueue("zadanie 20.1");
        karolinaKac.addTaskToQueue("zadanie 18.1");
        janNowak.addTaskToQueue("zadanie 20.2");
        janNowak.addTaskToQueue("zadanie 20.3");
        karolMroz.addTaskToQueue("zadanie 10.1");
        karolinaKac.addTaskToQueue("zadanie 18.2");

        //then
        assertEquals(4, lordWader.getUpdateCount());
        assertEquals(2, kasiaKopec.getUpdateCount());
        assertEquals(1, karolMroz.getExercises().size());
        assertEquals(2, karolinaKac.getExercises().size());
        assertEquals(3, janNowak.getExercises().size());
    }
}