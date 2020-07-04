package com.ttnet.org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public class WeakHandler extends Handler {
    WeakReference<IHandler> mRef;

    public interface IHandler {
        void handleMsg(Message message);
    }

    public void handleMessage(Message message) {
        IHandler iHandler = (IHandler) this.mRef.get();
        if (iHandler != null && message != null) {
            iHandler.handleMsg(message);
        }
    }

    public WeakHandler(IHandler iHandler) {
        this.mRef = new WeakReference<>(iHandler);
    }

    public WeakHandler(Looper looper, IHandler iHandler) {
        super(looper);
        this.mRef = new WeakReference<>(iHandler);
    }
}
