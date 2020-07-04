package com.ttnet.org.chromium.base.task;

import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@JNINamespace("base")
public class PostTask {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object sLock = new Object();
    private static Set<TaskRunner> sPreNativeTaskRunners = Collections.newSetFromMap(new WeakHashMap());
    private static final Executor sPrenativeThreadPoolExecutor = new ChromeThreadPoolExecutor();
    private static Executor sPrenativeThreadPoolExecutorOverride;
    private static final TaskExecutor[] sTaskExecutors = getInitialTaskExecutors();

    private static native void nativePostDelayedTask(boolean z, int i, boolean z2, boolean z3, byte b, byte[] bArr, Runnable runnable, long j);

    private static TaskExecutor[] getInitialTaskExecutors() {
        TaskExecutor[] taskExecutorArr = new TaskExecutor[5];
        taskExecutorArr[0] = new DefaultTaskExecutor();
        return taskExecutorArr;
    }

    public static void resetPrenativeThreadPoolExecutorForTesting() {
        synchronized (sLock) {
            sPrenativeThreadPoolExecutorOverride = null;
        }
    }

    static Executor getPrenativeThreadPoolExecutor() {
        synchronized (sLock) {
            if (sPrenativeThreadPoolExecutorOverride != null) {
                Executor executor = sPrenativeThreadPoolExecutorOverride;
                return executor;
            }
            Executor executor2 = sPrenativeThreadPoolExecutor;
            return executor2;
        }
    }

    private static void onNativeSchedulerShutdown() {
        synchronized (sLock) {
            sPreNativeTaskRunners = Collections.newSetFromMap(new WeakHashMap());
        }
    }

    private static void onNativeSchedulerReady() {
        synchronized (sLock) {
            Set<TaskRunner> set = sPreNativeTaskRunners;
            sPreNativeTaskRunners = null;
            for (TaskRunner initNativeTaskRunner : set) {
                initNativeTaskRunner.initNativeTaskRunner();
            }
        }
    }

    private static TaskExecutor getTaskExecutorForTraits(TaskTraits taskTraits) {
        return sTaskExecutors[taskTraits.mExtensionId];
    }

    public static SequencedTaskRunner createSequencedTaskRunner(TaskTraits taskTraits) {
        SequencedTaskRunner createSequencedTaskRunner;
        synchronized (sLock) {
            createSequencedTaskRunner = getTaskExecutorForTraits(taskTraits).createSequencedTaskRunner(taskTraits);
        }
        return createSequencedTaskRunner;
    }

    public static SingleThreadTaskRunner createSingleThreadTaskRunner(TaskTraits taskTraits) {
        SingleThreadTaskRunner createSingleThreadTaskRunner;
        synchronized (sLock) {
            createSingleThreadTaskRunner = getTaskExecutorForTraits(taskTraits).createSingleThreadTaskRunner(taskTraits);
        }
        return createSingleThreadTaskRunner;
    }

    public static TaskRunner createTaskRunner(TaskTraits taskTraits) {
        TaskRunner createTaskRunner;
        synchronized (sLock) {
            createTaskRunner = getTaskExecutorForTraits(taskTraits).createTaskRunner(taskTraits);
        }
        return createTaskRunner;
    }

    static boolean registerPreNativeTaskRunnerLocked(TaskRunner taskRunner) {
        if (sPreNativeTaskRunners == null) {
            return false;
        }
        sPreNativeTaskRunners.add(taskRunner);
        return true;
    }

    public static void setPrenativeThreadPoolExecutorForTesting(Executor executor) {
        synchronized (sLock) {
            sPrenativeThreadPoolExecutorOverride = executor;
        }
    }

    public static void postTask(TaskTraits taskTraits, Runnable runnable) {
        postDelayedTask(taskTraits, runnable, 0);
    }

    public static void registerTaskExecutor(int i, TaskExecutor taskExecutor) {
        synchronized (sLock) {
            sTaskExecutors[i] = taskExecutor;
        }
    }

    public static <T> T runSynchronously(TaskTraits taskTraits, Callable<T> callable) {
        return runSynchronouslyInternal(taskTraits, new FutureTask(callable));
    }

    private static <T> T runSynchronouslyInternal(TaskTraits taskTraits, FutureTask<T> futureTask) {
        runOrPostTask(taskTraits, futureTask);
        try {
            return futureTask.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void runOrPostTask(TaskTraits taskTraits, Runnable runnable) {
        if (getTaskExecutorForTraits(taskTraits).canRunTaskImmediately(taskTraits)) {
            runnable.run();
        } else {
            postTask(taskTraits, runnable);
        }
    }

    public static void runSynchronously(TaskTraits taskTraits, Runnable runnable) {
        runSynchronouslyInternal(taskTraits, new FutureTask(runnable, null));
    }

    public static void postDelayedTask(TaskTraits taskTraits, Runnable runnable, long j) {
        synchronized (sLock) {
            if (sPreNativeTaskRunners == null) {
                if (!taskTraits.mIsChoreographerFrame) {
                    nativePostDelayedTask(taskTraits.mPrioritySetExplicitly, taskTraits.mPriority, taskTraits.mMayBlock, taskTraits.mUseThreadPool, taskTraits.mExtensionId, taskTraits.mExtensionData, runnable, j);
                }
            }
            getTaskExecutorForTraits(taskTraits).postDelayedTask(taskTraits, runnable, j);
        }
    }
}
