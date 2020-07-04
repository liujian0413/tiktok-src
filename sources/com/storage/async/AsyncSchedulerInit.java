package com.storage.async;

public class AsyncSchedulerInit {
    static volatile boolean lockdown;
    static volatile SchedulerCreator onInitDBHandler;
    static volatile SchedulerCreator onInitNetHandler;

    public static SchedulerCreator getDBSchedulerHandler() {
        return onInitDBHandler;
    }

    public static SchedulerCreator getNetSchedulerHandler() {
        return onInitNetHandler;
    }

    public static boolean isLockdown() {
        return lockdown;
    }

    public static void lockdown() {
        lockdown = true;
    }

    public static void setDBSchedulerHandler(SchedulerCreator schedulerCreator) {
        if (!lockdown) {
            onInitDBHandler = schedulerCreator;
        }
    }

    public static void setNetSchedulerHandler(SchedulerCreator schedulerCreator) {
        if (!lockdown) {
            onInitNetHandler = schedulerCreator;
        }
    }

    public static SchedulerCreator onDBScheduler(SchedulerCreator schedulerCreator) {
        lockdown();
        if (onInitDBHandler != null) {
            return onInitDBHandler;
        }
        return schedulerCreator;
    }

    public static SchedulerCreator onNetScheduler(SchedulerCreator schedulerCreator) {
        lockdown();
        if (onInitNetHandler != null) {
            return onInitNetHandler;
        }
        return schedulerCreator;
    }
}
