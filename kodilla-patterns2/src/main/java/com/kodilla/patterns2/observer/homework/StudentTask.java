package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentTask implements QueueObservable {
    private final Student student;
    private final Deque<String> exercise;
    private final List<MentorObserver> observers;

    public StudentTask(Student student) {
        this.student = student;
        exercise = new ArrayDeque<>();
        observers = new ArrayList<>();
    }

    public void addTaskToQueue(String task) {
        exercise.offerLast(task);
        notifyObserver();
    }

    @Override
    public void registerObserver(MentorObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (MentorObserver observer : observers) {
            observer.notifyAboutNewTask(this);
        }
    }

    @Override
    public void removeObserver(MentorObserver observer) {
        observers.remove(observer);
    }

    public Student getStudent() {
        return student;
    }

    public Deque<String> getExercises() {
        return exercise;
    }

    public List<MentorObserver> getObservers() {
        return observers;
    }
}
