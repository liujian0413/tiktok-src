package com.lynx.base;

import android.os.Handler;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SystemMessageHandler extends Handler {
    private boolean mIsRunning;
    private Method mMessageMethodSetAsynchronous;
    private long mMessagePumpDelegateNative;

    private native void nativeRunWork(long j);

    private void stop() {
        this.mIsRunning = false;
    }

    private void scheduleWork() {
        sendMessage(obtainAsyncMessage(1));
    }

    public static SystemMessageHandler create(long j) {
        return new SystemMessageHandler(j);
    }

    private SystemMessageHandler(long j) {
        this.mMessagePumpDelegateNative = j;
        try {
            this.mMessageMethodSetAsynchronous = Class.forName("android.os.Message").getMethod("setAsynchronous", new Class[]{Boolean.TYPE});
        } catch (ClassNotFoundException | NoSuchMethodException | RuntimeException unused) {
        }
        this.mIsRunning = true;
    }

    public void handleMessage(Message message) {
        if (this.mIsRunning) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                nativeRunWork(this.mMessagePumpDelegateNative);
            }
        }
    }

    private Message obtainAsyncMessage(int i) {
        Message obtain = Message.obtain();
        obtain.what = i;
        if (this.mMessageMethodSetAsynchronous != null) {
            try {
                this.mMessageMethodSetAsynchronous.invoke(obtain, new Object[]{Boolean.valueOf(true)});
            } catch (IllegalAccessException unused) {
                this.mMessageMethodSetAsynchronous = null;
            } catch (IllegalArgumentException unused2) {
                this.mMessageMethodSetAsynchronous = null;
            } catch (InvocationTargetException unused3) {
                this.mMessageMethodSetAsynchronous = null;
            } catch (RuntimeException unused4) {
                this.mMessageMethodSetAsynchronous = null;
            }
        }
        return obtain;
    }
}
