package com.facebook.drawee.components;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DraweeEventTracker {

    /* renamed from: b */
    private static final DraweeEventTracker f35425b = new DraweeEventTracker();

    /* renamed from: c */
    private static boolean f35426c = true;

    /* renamed from: a */
    private final Queue<Event> f35427a = new ArrayBlockingQueue(20);

    public enum Event {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    public String toString() {
        return this.f35427a.toString();
    }

    private DraweeEventTracker() {
    }

    /* renamed from: a */
    public static DraweeEventTracker m39231a() {
        if (f35426c) {
            return new DraweeEventTracker();
        }
        return f35425b;
    }

    /* renamed from: a */
    public final void mo32731a(Event event) {
        if (f35426c) {
            if (this.f35427a.size() + 1 > 20) {
                this.f35427a.poll();
            }
            this.f35427a.add(event);
        }
    }
}
