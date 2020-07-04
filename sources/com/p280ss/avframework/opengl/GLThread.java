package com.p280ss.avframework.opengl;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.util.AndroidRuntimeException;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.ThreadUtils;

/* renamed from: com.ss.avframework.opengl.GLThread */
public class GLThread extends HandlerThread {
    private final String TAG = "GLThread";
    private Callback mCallback;
    private Handler mHandler;

    public synchronized Handler getHandler() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(getLooper(), this.mCallback);
        }
        return this.mHandler;
    }

    public void run() {
        StringBuilder sb = new StringBuilder("gl thread(");
        sb.append(getName());
        sb.append(") is runing ...");
        AVLog.ioi("GLThread", sb.toString());
        if (GlUtil.nativeAttachThreadToOpenGl()) {
            super.run();
            StringBuilder sb2 = new StringBuilder("gl thread(");
            sb2.append(getName());
            sb2.append(") is exit ...");
            AVLog.ioi("GLThread", sb2.toString());
            GlUtil.nativeDetachThreadToOpenGl();
            StringBuilder sb3 = new StringBuilder("gl thread(");
            sb3.append(getName());
            sb3.append(") is exit done");
            AVLog.ioi("GLThread", sb3.toString());
            return;
        }
        throw new AndroidRuntimeException("OpenGl thread created failed.");
    }

    public GLThread(String str) {
        super(str);
    }

    public void PostAndWait(Runnable runnable) {
        ThreadUtils.invokeAtFrontUninterruptibly(getHandler(), runnable);
    }

    public void post(Message message) {
        getHandler().sendMessage(message);
    }

    public GLThread(Callback callback) {
        super("GlThread");
        this.mCallback = callback;
    }

    public boolean post(int i) {
        return getHandler().sendEmptyMessage(i);
    }

    public boolean post(int i, Object obj) {
        return getHandler().sendMessage(this.mHandler.obtainMessage(i, obj));
    }

    public boolean post(int i, int i2, int i3, Object obj) {
        return getHandler().sendMessage(this.mHandler.obtainMessage(i, i2, i3, obj));
    }
}
