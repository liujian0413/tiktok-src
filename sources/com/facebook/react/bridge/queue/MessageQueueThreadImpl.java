package com.facebook.react.bridge.queue;

import android.os.Looper;
import android.os.Process;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.lynx.base.JavaHandlerThread;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class MessageQueueThreadImpl implements MessageQueueThread {
    private final String mAssertionErrorMessage;
    private final MessageQueueThreadHandler mHandler;
    private volatile boolean mIsFinished;
    private final Looper mLooper;
    private final String mName;

    public Looper getLooper() {
        return this.mLooper;
    }

    public String getName() {
        return this.mName;
    }

    public void assertIsOnThread() {
        SoftAssertions.assertCondition(isOnThread(), this.mAssertionErrorMessage);
    }

    public boolean isOnThread() {
        if (this.mLooper.getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public void quitSynchronous() {
        this.mIsFinished = true;
        this.mLooper.quit();
        if (this.mLooper.getThread() != Thread.currentThread()) {
            try {
                this.mLooper.getThread().join();
            } catch (InterruptedException unused) {
                StringBuilder sb = new StringBuilder("Got interrupted waiting to join thread ");
                sb.append(this.mName);
                throw new RuntimeException(sb.toString());
            }
        }
    }

    public <T> Future<T> callOnQueue(final Callable<T> callable) {
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new Runnable() {
            public void run() {
                try {
                    simpleSettableFuture.set(callable.call());
                } catch (Exception e) {
                    simpleSettableFuture.setException(e);
                }
            }
        });
        return simpleSettableFuture;
    }

    public void assertIsOnThread(String str) {
        boolean isOnThread = isOnThread();
        StringBuilder sb = new StringBuilder();
        sb.append(this.mAssertionErrorMessage);
        sb.append(" ");
        sb.append(str);
        SoftAssertions.assertCondition(isOnThread, sb.toString());
    }

    public void runOnQueue(Runnable runnable) {
        if (this.mIsFinished) {
            StringBuilder sb = new StringBuilder("Tried to enqueue runnable on already finished thread: '");
            sb.append(getName());
            sb.append("... dropping Runnable.");
            C13286a.m38860c("ReactNative", sb.toString());
        }
        this.mHandler.post(runnable);
    }

    private static MessageQueueThreadImpl createForMainThread(String str, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        MessageQueueThreadImpl messageQueueThreadImpl = new MessageQueueThreadImpl(str, Looper.getMainLooper(), queueThreadExceptionHandler);
        if (UiThreadUtil.isOnUiThread()) {
            Process.setThreadPriority(-4);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public final void run() {
                    Process.setThreadPriority(-4);
                }
            });
        }
        return messageQueueThreadImpl;
    }

    public static MessageQueueThreadImpl create(MessageQueueThreadSpec messageQueueThreadSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        switch (messageQueueThreadSpec.getThreadType()) {
            case MAIN_UI:
                return createForMainThread(messageQueueThreadSpec.getName(), queueThreadExceptionHandler);
            case NEW_BACKGROUND:
                return startNewBackgroundThread(messageQueueThreadSpec.getName(), messageQueueThreadSpec.getStackSize(), queueThreadExceptionHandler);
            case LAYOUT:
                return startLayoutThread(messageQueueThreadSpec.getName(), messageQueueThreadSpec.getStackSize(), queueThreadExceptionHandler);
            default:
                StringBuilder sb = new StringBuilder("Unknown thread type: ");
                sb.append(messageQueueThreadSpec.getThreadType());
                throw new RuntimeException(sb.toString());
        }
    }

    private static MessageQueueThreadImpl startLayoutThread(String str, long j, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        StringBuilder sb = new StringBuilder("mqt_");
        sb.append(str);
        JavaHandlerThread create = JavaHandlerThread.create(sb.toString());
        create.maybeStart();
        return new MessageQueueThreadImpl(str, create.getLooper(), queueThreadExceptionHandler);
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        this.mName = str;
        this.mLooper = looper;
        this.mHandler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
        StringBuilder sb = new StringBuilder("Expected to be called from the '");
        sb.append(getName());
        sb.append("' thread!");
        this.mAssertionErrorMessage = sb.toString();
    }

    private static MessageQueueThreadImpl startNewBackgroundThread(String str, long j, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        C142503 r3 = new Runnable() {
            public final void run() {
                Process.setThreadPriority(-4);
                Looper.prepare();
                simpleSettableFuture.set(Looper.myLooper());
                Looper.loop();
            }
        };
        StringBuilder sb = new StringBuilder("mqt_");
        sb.append(str);
        Thread thread = new Thread(null, r3, sb.toString(), j);
        thread.start();
        return new MessageQueueThreadImpl(str, (Looper) simpleSettableFuture.getOrThrow(), queueThreadExceptionHandler);
    }
}
