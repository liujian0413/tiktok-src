package com.storage.async;

public interface Excutor {
    Observable observeOn(Scheduler scheduler);

    Observable schudleOn(Scheduler scheduler);
}
