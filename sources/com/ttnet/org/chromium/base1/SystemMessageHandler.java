package com.ttnet.org.chromium.base1;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class SystemMessageHandler extends Handler {
    private long mDelayedScheduledTimeTicks;
    private long mMessagePumpDelegateNative;
    private long mMessagePumpNative;

    static class MessageCompat {
        static final MessageWrapperImpl IMPL;

        static class LegacyMessageWrapperImpl implements MessageWrapperImpl {
            private Method mMessageMethodSetAsynchronous;

            LegacyMessageWrapperImpl() {
                try {
                    this.mMessageMethodSetAsynchronous = Class.forName("android.os.Message").getMethod("setAsynchronous", new Class[]{Boolean.TYPE});
                } catch (ClassNotFoundException e) {
                    Log.m22891e("cr.SysMessageHandler", "Failed to find android.os.Message class", e);
                } catch (NoSuchMethodException e2) {
                    Log.m22891e("cr.SysMessageHandler", "Failed to load Message.setAsynchronous method", e2);
                } catch (RuntimeException e3) {
                    Log.m22891e("cr.SysMessageHandler", "Exception while loading Message.setAsynchronous method", e3);
                }
            }

            public void setAsynchronous(Message message, boolean z) {
                if (this.mMessageMethodSetAsynchronous != null) {
                    try {
                        this.mMessageMethodSetAsynchronous.invoke(message, new Object[]{Boolean.valueOf(z)});
                    } catch (IllegalAccessException unused) {
                        Log.m22891e("cr.SysMessageHandler", "Illegal access to async message creation, disabling.", new Object[0]);
                        this.mMessageMethodSetAsynchronous = null;
                    } catch (IllegalArgumentException unused2) {
                        Log.m22891e("cr.SysMessageHandler", "Illegal argument for async message creation, disabling.", new Object[0]);
                        this.mMessageMethodSetAsynchronous = null;
                    } catch (InvocationTargetException unused3) {
                        Log.m22891e("cr.SysMessageHandler", "Invocation exception during async message creation, disabling.", new Object[0]);
                        this.mMessageMethodSetAsynchronous = null;
                    } catch (RuntimeException unused4) {
                        Log.m22891e("cr.SysMessageHandler", "Runtime exception during async message creation, disabling.", new Object[0]);
                        this.mMessageMethodSetAsynchronous = null;
                    }
                }
            }
        }

        static class LollipopMr1MessageWrapperImpl implements MessageWrapperImpl {
            LollipopMr1MessageWrapperImpl() {
            }

            public void setAsynchronous(Message message, boolean z) {
                message.setAsynchronous(z);
            }
        }

        interface MessageWrapperImpl {
            void setAsynchronous(Message message, boolean z);
        }

        private MessageCompat() {
        }

        static {
            if (VERSION.SDK_INT >= 22) {
                IMPL = new LollipopMr1MessageWrapperImpl();
            } else {
                IMPL = new LegacyMessageWrapperImpl();
            }
        }

        public static void setAsynchronous(Message message, boolean z) {
            IMPL.setAsynchronous(message, z);
        }
    }

    private native void nativeDoRunLoopOnce(long j, long j2, long j3);

    private void removeAllPendingMessages() {
        removeMessages(1);
        removeMessages(2);
    }

    private void scheduleWork() {
        sendMessage(obtainAsyncMessage(1));
    }

    private Message obtainAsyncMessage(int i) {
        Message obtain = Message.obtain();
        obtain.what = i;
        MessageCompat.setAsynchronous(obtain, true);
        return obtain;
    }

    public void handleMessage(Message message) {
        if (message.what == 2) {
            this.mDelayedScheduledTimeTicks = 0;
        }
        nativeDoRunLoopOnce(this.mMessagePumpDelegateNative, this.mMessagePumpNative, this.mDelayedScheduledTimeTicks);
    }

    protected SystemMessageHandler(long j, long j2) {
        this.mMessagePumpDelegateNative = j;
        this.mMessagePumpNative = j2;
    }

    private static SystemMessageHandler create(long j, long j2) {
        return new SystemMessageHandler(j, j2);
    }

    private void scheduleDelayedWork(long j, long j2) {
        if (this.mDelayedScheduledTimeTicks != 0) {
            removeMessages(2);
        }
        this.mDelayedScheduledTimeTicks = j;
        sendMessageDelayed(obtainAsyncMessage(2), j2);
    }
}
