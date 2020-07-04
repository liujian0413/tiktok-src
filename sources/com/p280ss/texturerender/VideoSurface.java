package com.p280ss.texturerender;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.p280ss.texturerender.VideoSurfaceTexture.TextureDrawCallback;

/* renamed from: com.ss.texturerender.VideoSurface */
public class VideoSurface extends Surface implements Callback, TextureDrawCallback {
    private OnDrawFrameListener mDrawFrameListener;
    private Object mHandlerObject;
    private Bundle mMsgObjectBundle;
    private Handler mNotifyHandler;
    private VideoSurfaceTexture mSurfaceTexture;

    /* renamed from: com.ss.texturerender.VideoSurface$OnDrawFrameListener */
    public interface OnDrawFrameListener {
        void onDraw(long j);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        releaseTexture();
        super.finalize();
    }

    private synchronized void releaseTexture() {
        if (this.mSurfaceTexture != null) {
            this.mSurfaceTexture.releaseOffScreenSurface();
            this.mSurfaceTexture = null;
        }
    }

    public void release() {
        super.release();
        releaseTexture();
        synchronized (this.mHandlerObject) {
            this.mDrawFrameListener = null;
            this.mNotifyHandler = null;
        }
    }

    public void setOnDrawFrameListener(OnDrawFrameListener onDrawFrameListener) {
        this.mDrawFrameListener = onDrawFrameListener;
    }

    public void pause(boolean z) {
        if (this.mSurfaceTexture != null) {
            this.mSurfaceTexture.pause(z, true);
        }
    }

    public void updateRenderSurface(Surface surface) {
        if (this.mSurfaceTexture != null) {
            this.mSurfaceTexture.updateSurface(surface);
        }
    }

    public VideoSurface(VideoSurfaceTexture videoSurfaceTexture) {
        super(videoSurfaceTexture);
        this.mSurfaceTexture = videoSurfaceTexture;
        if (Looper.myLooper() != null) {
            this.mNotifyHandler = new Handler(this);
        } else {
            this.mNotifyHandler = new Handler(Looper.getMainLooper(), this);
        }
        this.mHandlerObject = new Object();
        this.mMsgObjectBundle = new Bundle();
    }

    public boolean handleMessage(Message message) {
        if (message.what == 4096 && this.mDrawFrameListener != null && this.mSurfaceTexture != null && message.arg1 == this.mSurfaceTexture.getSerial()) {
            this.mDrawFrameListener.onDraw(message.getData().getLong("timeStamp"));
        }
        return true;
    }

    public void setDefaultSize(int i, int i2) {
        if (this.mSurfaceTexture != null) {
            this.mSurfaceTexture.setDefaultBufferSize(i, i2);
        }
    }

    public void onTextureUpdate(int i, long j) {
        synchronized (this.mHandlerObject) {
            if (this.mDrawFrameListener != null) {
                Message obtainMessage = this.mNotifyHandler.obtainMessage(4096);
                this.mMsgObjectBundle.putLong("timeStamp", j);
                obtainMessage.arg1 = i;
                obtainMessage.setData(this.mMsgObjectBundle);
                obtainMessage.sendToTarget();
            }
        }
    }
}
