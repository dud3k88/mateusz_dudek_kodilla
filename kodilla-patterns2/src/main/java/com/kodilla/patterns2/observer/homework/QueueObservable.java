package com.kodilla.patterns2.observer.homework;

public interface QueueObservable {
    void registerObserver(MentorObserver observer);
    void notifyObserver();
    void removeObserver(MentorObserver observer);
}
