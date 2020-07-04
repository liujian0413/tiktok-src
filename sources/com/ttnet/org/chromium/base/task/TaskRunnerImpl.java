package com.ttnet.org.chromium.base.task;

import android.util.Pair;
import com.ttnet.org.chromium.base.LifetimeAssert;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@JNINamespace("base")
public class TaskRunnerImpl implements TaskRunner {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean mIsDestroying;
    private final LifetimeAssert mLifetimeAssert;
    protected final Object mLock;
    protected long mNativeTaskRunnerAndroid;
    protected List<Pair<Runnable, Long>> mPreNativeDelayedTasks;
    protected LinkedList<Runnable> mPreNativeTasks;
    protected final Runnable mRunPreNativeTaskClosure;
    private final int mTaskRunnerType;
    private final TaskTraits mTaskTraits;
    private final String mTraceEvent;

    private native void nativeDestroy(long j);

    private native long nativeInit(int i, boolean z, int i2, boolean z2, boolean z3, byte b, byte[] bArr);

    private native void nativePostDelayedTask(long j, Runnable runnable, long j2);

    /* access modifiers changed from: protected */
    public native boolean nativeBelongsToCurrentThread(long j);

    public void disableLifetimeCheck() {
        LifetimeAssert.setSafeToGc(this.mLifetimeAssert, true);
    }

    /* access modifiers changed from: protected */
    public void destroyInternal() {
        if (this.mNativeTaskRunnerAndroid != 0) {
            nativeDestroy(this.mNativeTaskRunnerAndroid);
        }
        this.mNativeTaskRunnerAndroid = 0;
    }

    public void initNativeTaskRunner() {
        synchronized (this.mLock) {
            initNativeTaskRunnerInternal();
            migratePreNativeTasksToNative();
        }
    }

    /* access modifiers changed from: protected */
    public void schedulePreNativeTask() {
        PostTask.getPrenativeThreadPoolExecutor().execute(this.mRunPreNativeTaskClosure);
    }

    public void destroy() {
        synchronized (this.mLock) {
            LifetimeAssert.setSafeToGc(this.mLifetimeAssert, true);
            this.mIsDestroying = true;
            destroyInternal();
        }
    }

    /* access modifiers changed from: protected */
    public void initNativeTaskRunnerInternal() {
        if (this.mNativeTaskRunnerAndroid == 0) {
            this.mNativeTaskRunnerAndroid = nativeInit(this.mTaskRunnerType, this.mTaskTraits.mPrioritySetExplicitly, this.mTaskTraits.mPriority, this.mTaskTraits.mMayBlock, this.mTaskTraits.mUseThreadPool, this.mTaskTraits.mExtensionId, this.mTaskTraits.mExtensionData);
        }
    }

    /* access modifiers changed from: protected */
    public void migratePreNativeTasksToNative() {
        if (this.mPreNativeTasks != null) {
            Iterator it = this.mPreNativeTasks.iterator();
            while (it.hasNext()) {
                postDelayedTaskToNative((Runnable) it.next(), 0);
            }
            for (Pair pair : this.mPreNativeDelayedTasks) {
                postDelayedTaskToNative((Runnable) pair.first, ((Long) pair.second).longValue());
            }
            this.mPreNativeTasks = null;
            this.mPreNativeDelayedTasks = null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        switch(r4.mTaskTraits.mPriority) {
            case 1: goto L_0x0030;
            case 2: goto L_0x002b;
            default: goto L_0x0025;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        android.os.Process.setThreadPriority(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        android.os.Process.setThreadPriority(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        android.os.Process.setThreadPriority(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (r0 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0041, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0045, code lost:
        if (r0 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0047, code lost:
        if (r1 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x004e, code lost:
        com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0052, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r0 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        r0.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void runPreNativeTask() {
        /*
            r4 = this;
            java.lang.String r0 = r4.mTraceEvent
            com.ttnet.org.chromium.base.TraceEvent r0 = com.ttnet.org.chromium.base.TraceEvent.scoped(r0)
            r1 = 0
            java.lang.Object r2 = r4.mLock     // Catch:{ Throwable -> 0x0043 }
            monitor-enter(r2)     // Catch:{ Throwable -> 0x0043 }
            java.util.LinkedList<java.lang.Runnable> r3 = r4.mPreNativeTasks     // Catch:{ all -> 0x003e }
            if (r3 != 0) goto L_0x0015
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0014
            r0.close()
        L_0x0014:
            return
        L_0x0015:
            java.util.LinkedList<java.lang.Runnable> r3 = r4.mPreNativeTasks     // Catch:{ all -> 0x003e }
            java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x003e }
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x003e }
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            com.ttnet.org.chromium.base.task.TaskTraits r2 = r4.mTaskTraits     // Catch:{ Throwable -> 0x0043 }
            int r2 = r2.mPriority     // Catch:{ Throwable -> 0x0043 }
            switch(r2) {
                case 1: goto L_0x0030;
                case 2: goto L_0x002b;
                default: goto L_0x0025;
            }     // Catch:{ Throwable -> 0x0043 }
        L_0x0025:
            r2 = 10
            android.os.Process.setThreadPriority(r2)     // Catch:{ Throwable -> 0x0043 }
            goto L_0x0034
        L_0x002b:
            r2 = -1
            android.os.Process.setThreadPriority(r2)     // Catch:{ Throwable -> 0x0043 }
            goto L_0x0034
        L_0x0030:
            r2 = 0
            android.os.Process.setThreadPriority(r2)     // Catch:{ Throwable -> 0x0043 }
        L_0x0034:
            r3.run()     // Catch:{ Throwable -> 0x0043 }
            if (r0 == 0) goto L_0x003d
            r0.close()
            return
        L_0x003d:
            return
        L_0x003e:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            throw r3     // Catch:{ Throwable -> 0x0043 }
        L_0x0041:
            r2 = move-exception
            goto L_0x0045
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0045:
            if (r0 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x0052
            r0.close()     // Catch:{ Throwable -> 0x004d }
            goto L_0x0055
        L_0x004d:
            r0 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r1, r0)
            goto L_0x0055
        L_0x0052:
            r0.close()
        L_0x0055:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.task.TaskRunnerImpl.runPreNativeTask():void");
    }

    TaskRunnerImpl(TaskTraits taskTraits) {
        this(taskTraits, "TaskRunnerImpl", 0);
    }

    public void postTask(Runnable runnable) {
        postDelayedTask(runnable, 0);
    }

    /* access modifiers changed from: protected */
    public void postDelayedTaskToNative(Runnable runnable, long j) {
        nativePostDelayedTask(this.mNativeTaskRunnerAndroid, runnable, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void postDelayedTask(java.lang.Runnable r5, long r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            java.util.LinkedList<java.lang.Runnable> r1 = r4.mPreNativeTasks     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x000c
            r4.postDelayedTaskToNative(r5, r6)     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x000c:
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x001b
            java.util.LinkedList<java.lang.Runnable> r6 = r4.mPreNativeTasks     // Catch:{ all -> 0x002d }
            r6.add(r5)     // Catch:{ all -> 0x002d }
            r4.schedulePreNativeTask()     // Catch:{ all -> 0x002d }
            goto L_0x0029
        L_0x001b:
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x002d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x002d }
            r1.<init>(r5, r6)     // Catch:{ all -> 0x002d }
            java.util.List<android.util.Pair<java.lang.Runnable, java.lang.Long>> r5 = r4.mPreNativeDelayedTasks     // Catch:{ all -> 0x002d }
            r5.add(r1)     // Catch:{ all -> 0x002d }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r5
        L_0x002d:
            r5 = move-exception
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.task.TaskRunnerImpl.postDelayedTask(java.lang.Runnable, long):void");
    }

    protected TaskRunnerImpl(TaskTraits taskTraits, String str, int i) {
        this.mLock = new Object();
        this.mRunPreNativeTaskClosure = new TaskRunnerImpl$$Lambda$0(this);
        this.mLifetimeAssert = LifetimeAssert.create(this);
        this.mPreNativeTasks = new LinkedList<>();
        this.mPreNativeDelayedTasks = new ArrayList();
        this.mTaskTraits = taskTraits;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".PreNativeTask.run");
        this.mTraceEvent = sb.toString();
        this.mTaskRunnerType = i;
        if (!PostTask.registerPreNativeTaskRunnerLocked(this)) {
            initNativeTaskRunner();
        }
    }
}
