package com.ttnet.org.chromium.base.task;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("base")
public class SingleThreadTaskRunnerImpl extends TaskRunnerImpl implements SingleThreadTaskRunner {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Handler mHandler;
    private final boolean mPostTaskAtFrontOfQueue;

    private void postAtFrontOfQueue() {
        if (VERSION.SDK_INT >= 21) {
            Message obtain = Message.obtain(this.mHandler, this.mRunPreNativeTaskClosure);
            obtain.setAsynchronous(true);
            this.mHandler.sendMessageAtFrontOfQueue(obtain);
            return;
        }
        this.mHandler.postAtFrontOfQueue(this.mRunPreNativeTaskClosure);
    }

    /* access modifiers changed from: protected */
    public void schedulePreNativeTask() {
        if (this.mHandler != null) {
            if (this.mPostTaskAtFrontOfQueue) {
                postAtFrontOfQueue();
            } else {
                this.mHandler.post(this.mRunPreNativeTaskClosure);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r6.mHandler == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r6.mHandler.getLooper().getThread() != java.lang.Thread.currentThread()) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean belongsToCurrentThread() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            long r1 = r6.mNativeTaskRunnerAndroid     // Catch:{ all -> 0x002d }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0013
            long r1 = r6.mNativeTaskRunnerAndroid     // Catch:{ all -> 0x002d }
            boolean r1 = r6.nativeBelongsToCurrentThread(r1)     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r1
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            android.os.Handler r0 = r6.mHandler
            r1 = 0
            if (r0 == 0) goto L_0x002c
            android.os.Handler r0 = r6.mHandler
            android.os.Looper r0 = r0.getLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r0 != r2) goto L_0x002b
            r0 = 1
            return r0
        L_0x002b:
            return r1
        L_0x002c:
            return r1
        L_0x002d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.task.SingleThreadTaskRunnerImpl.belongsToCurrentThread():boolean");
    }

    public SingleThreadTaskRunnerImpl(Handler handler, TaskTraits taskTraits) {
        this(handler, taskTraits, false);
    }

    public SingleThreadTaskRunnerImpl(Handler handler, TaskTraits taskTraits, boolean z) {
        super(taskTraits, "SingleThreadTaskRunnerImpl", 2);
        this.mHandler = handler;
        this.mPostTaskAtFrontOfQueue = z;
    }
}
