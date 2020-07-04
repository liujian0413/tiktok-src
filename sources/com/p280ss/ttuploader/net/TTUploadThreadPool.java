package com.p280ss.ttuploader.net;

import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.ttuploader.net.TTUploadThreadPool */
public class TTUploadThreadPool {
    private static volatile ThreadPoolExecutor mExecutorInstance;

    public static int getPoolSize() {
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        return mExecutorInstance.getPoolSize();
    }

    public static void shutdown() {
        if (mExecutorInstance != null) {
            mExecutorInstance.shutdown();
        }
    }

    public static ThreadPoolExecutor getExecutorInstance() {
        if (mExecutorInstance == null) {
            synchronized (TTUploadThreadPool.class) {
                if (mExecutorInstance == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, Integer.MAX_VALUE, 300, TimeUnit.SECONDS, new SynchronousQueue());
                    mExecutorInstance = threadPoolExecutor;
                }
            }
        }
        return mExecutorInstance;
    }

    public static Future addExecuteTask(Runnable runnable) {
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        return mExecutorInstance.submit(runnable);
    }
}
