package com.storage.async;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Schedulers {
    static final int CPU = Runtime.getRuntime().availableProcessors();
    static final SchedulerCreator justCreator = new JustSchedulerCreator();
    static Handler mainHandler = new Handler(mainLooper);
    static Looper mainLooper = Looper.getMainLooper();
    static final SchedulerCreator netCreator = AsyncSchedulerInit.onNetScheduler(new NetSchedulerCreator());
    static final SchedulerCreator shortIoCreator = AsyncSchedulerInit.onDBScheduler(new ShortIOSchedulerCreator());
    static final SchedulerCreator uiCreator = new UISchedulerCreator();

    static final class JustHolder {
        static final Scheduler DEFAULT = new JustScheduler();

        JustHolder() {
        }
    }

    static class JustScheduler implements Scheduler {
        JustScheduler() {
        }

        public void execute(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    static class JustSchedulerCreator implements SchedulerCreator {
        JustSchedulerCreator() {
        }

        public Scheduler create() {
            return JustHolder.DEFAULT;
        }
    }

    static final class NetHolder {
        static final Scheduler DEFAULT = new NetScheduler();

        NetHolder() {
        }
    }

    static class NetScheduler implements Scheduler {
        ExecutorService threadPoolExecutor;

        NetScheduler() {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor((Schedulers.CPU * 2) + 1, (Schedulers.CPU * 4) + 1, 0, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() {
                private final AtomicInteger mCount = new AtomicInteger(1);

                public Thread newThread(Runnable runnable) {
                    StringBuilder sb = new StringBuilder("StorageNetScheduler #");
                    sb.append(this.mCount.getAndIncrement());
                    return new Thread(runnable, sb.toString());
                }
            });
            this.threadPoolExecutor = threadPoolExecutor2;
        }

        public void execute(Runnable runnable) {
            this.threadPoolExecutor.execute(runnable);
        }
    }

    static class NetSchedulerCreator implements SchedulerCreator {
        NetSchedulerCreator() {
        }

        public Scheduler create() {
            return NetHolder.DEFAULT;
        }
    }

    static final class ShortIOHolder {
        static final Scheduler DEFAULT = new ShortIOScheduler();

        ShortIOHolder() {
        }
    }

    static class ShortIOScheduler implements Scheduler {
        ExecutorService threadPoolExecutor;

        ShortIOScheduler() {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(2, 4, 1, TimeUnit.MINUTES, new LinkedBlockingDeque(), new ThreadFactory() {
                private final AtomicInteger mCount = new AtomicInteger(1);

                public Thread newThread(Runnable runnable) {
                    StringBuilder sb = new StringBuilder("StorageDBScheduler #");
                    sb.append(this.mCount.getAndIncrement());
                    return new Thread(runnable, sb.toString());
                }
            });
            this.threadPoolExecutor = threadPoolExecutor2;
        }

        public void execute(Runnable runnable) {
            this.threadPoolExecutor.execute(runnable);
        }
    }

    static class ShortIOSchedulerCreator implements SchedulerCreator {
        ShortIOSchedulerCreator() {
        }

        public Scheduler create() {
            return ShortIOHolder.DEFAULT;
        }
    }

    static final class UIHolder {
        static final Scheduler DEFAULT = new UIScheduler();

        UIHolder() {
        }
    }

    static class UIScheduler implements Scheduler {
        UIScheduler() {
        }

        public void execute(Runnable runnable) {
            if (runnable != null) {
                if (Schedulers.isUIThread()) {
                    runnable.run();
                } else {
                    Schedulers.mainHandler.post(runnable);
                }
            }
        }
    }

    static class UISchedulerCreator implements SchedulerCreator {
        UISchedulerCreator() {
        }

        public Scheduler create() {
            return UIHolder.DEFAULT;
        }
    }

    public static Scheduler current() {
        return justCreator.create();
    }

    public static Scheduler longIO() {
        return netCreator.create();
    }

    public static Scheduler shortIO() {
        return shortIoCreator.create();
    }

    /* renamed from: ui */
    public static Scheduler m145483ui() {
        return uiCreator.create();
    }

    static boolean isUIThread() {
        if (Looper.myLooper() == mainLooper) {
            return true;
        }
        return false;
    }
}
