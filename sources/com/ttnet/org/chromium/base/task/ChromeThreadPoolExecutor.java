package com.ttnet.org.chromium.base.task;

import android.os.AsyncTask;
import android.os.Process;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ttnet.org.chromium.base.BuildConfig;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class ChromeThreadPoolExecutor extends ThreadPoolExecutor {
    private static final int CORE_POOL_SIZE = Math.max(2, Math.min(CPU_COUNT - 1, 4));
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final int MAXIMUM_POOL_SIZE = ((CPU_COUNT * 2) + 1);
    private static final BlockingQueue<Runnable> sPoolWorkQueue = new ArrayBlockingQueue(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
    private static final ThreadFactory sThreadFactory = new ThreadFactory() {
        private final AtomicInteger mCount = new AtomicInteger(1);

        static final /* synthetic */ void lambda$newThread$0$ChromeThreadPoolExecutor$1(Runnable runnable) {
            Process.setThreadPriority(10);
            runnable.run();
        }

        public Thread newThread(Runnable runnable) {
            ChromeThreadPoolExecutor$1$$Lambda$0 chromeThreadPoolExecutor$1$$Lambda$0 = new ChromeThreadPoolExecutor$1$$Lambda$0(runnable);
            StringBuilder sb = new StringBuilder("CrAsyncTask #");
            sb.append(this.mCount.getAndIncrement());
            return new Thread(chromeThreadPoolExecutor$1$$Lambda$0, sb.toString());
        }
    };

    ChromeThreadPoolExecutor() {
        this(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory);
    }

    private Map<String, Integer> getNumberOfClassNameOccurrencesInQueue() {
        int i;
        HashMap hashMap = new HashMap();
        for (Runnable className : (Runnable[]) getQueue().toArray(new Runnable[0])) {
            String className2 = getClassName(className);
            if (hashMap.containsKey(className2)) {
                i = ((Integer) hashMap.get(className2)).intValue();
            } else {
                i = 0;
            }
            hashMap.put(className2, Integer.valueOf(i + 1));
        }
        return hashMap;
    }

    public void execute(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException e) {
            Map numberOfClassNameOccurrencesInQueue = getNumberOfClassNameOccurrencesInQueue();
            StringBuilder sb = new StringBuilder("Prominent classes in AsyncTask: ");
            sb.append(findClassNamesWithTooManyRunnables(numberOfClassNameOccurrencesInQueue));
            throw new RejectedExecutionException(sb.toString(), e);
        }
    }

    private String findClassNamesWithTooManyRunnables(Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > 32) {
                sb.append((String) entry.getKey());
                sb.append(' ');
            }
        }
        if (sb.length() == 0) {
            return "NO CLASSES FOUND";
        }
        return sb.toString();
    }

    private static String getClassName(Runnable runnable) {
        Class cls;
        Class<NamedFutureTask> cls2 = runnable.getClass();
        if (cls2 == NamedFutureTask.class) {
            try {
                cls = ((NamedFutureTask) runnable).getBlamedClass();
            } catch (NoSuchFieldException e) {
                if (BuildConfig.DCHECK_IS_ON) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException e2) {
                if (BuildConfig.DCHECK_IS_ON) {
                    throw new RuntimeException(e2);
                }
            }
        } else {
            if (cls2.getEnclosingClass() == AsyncTask.class) {
                Field declaredField = cls2.getDeclaredField("this$0");
                declaredField.setAccessible(true);
                cls = declaredField.get(runnable).getClass();
            }
            return cls2.getName();
        }
        cls2 = cls;
        return cls2.getName();
    }

    ChromeThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }
}
