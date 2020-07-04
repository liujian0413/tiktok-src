package com.p280ss.avframework.livestreamv2.effectcamera.render;

import android.os.Bundle;
import android.view.Surface;
import com.p280ss.avframework.livestreamv2.effectcamera.render.EffectRender.Rotation;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.render.FrameRender */
public class FrameRender {
    private GLCallback mGLCallback;
    private boolean mInited;
    private long mNativePtr;

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.render.FrameRender$GLCallback */
    public interface GLCallback {
        void onFrameAvailable(int i, long j, Bundle bundle);

        void onOpenGLCreate();

        void onOpenGLDestroy();

        int onUpdateTexImage();
    }

    private native long nativeCreate();

    private native int nativeDisableFilters(long j, boolean z);

    private native int nativeDraw(long j, int i, long j2, int i2, double d, boolean z, boolean z2);

    private native void nativeRelease(long j);

    private native int nativeReleaseSurface(long j);

    private native int nativeSetProcessHandler(long j, long j2);

    private native int nativeSetSurface(long j, Surface surface);

    private native int nativeStartProcess(long j, int i, int i2, int i3, int i4);

    private native int nativeStopProcess(long j);

    public GLCallback getGLCallback() {
        return this.mGLCallback;
    }

    public int releaseSurface() {
        return nativeReleaseSurface(this.mNativePtr);
    }

    public void onNativeCallBack_OnOpenGLCreate() {
        if (this.mGLCallback != null) {
            this.mGLCallback.onOpenGLCreate();
        }
    }

    public void onNativeCallBack_OnOpenGLDestroy() {
        if (this.mGLCallback != null) {
            this.mGLCallback.onOpenGLDestroy();
        }
    }

    public int onNativeCallBack_OnUpdateTexImage() {
        if (this.mGLCallback != null) {
            return this.mGLCallback.onUpdateTexImage();
        }
        return -1;
    }

    public int stopProcess() {
        if (!this.mInited) {
            return -1;
        }
        return nativeStopProcess(this.mNativePtr);
    }

    public int init() {
        if (this.mInited) {
            return 1;
        }
        this.mNativePtr = nativeCreate();
        if (this.mNativePtr == 0) {
            return -122;
        }
        this.mInited = true;
        return 0;
    }

    public synchronized void release() {
        long j = this.mNativePtr;
        this.mNativePtr = 0;
        if (j != 0) {
            nativeRelease(j);
        }
    }

    public void setGLCallback(GLCallback gLCallback) {
        this.mGLCallback = gLCallback;
    }

    public int setSurface(Surface surface) {
        return nativeSetSurface(this.mNativePtr, surface);
    }

    public int disableFilters(boolean z) {
        if (!this.mInited) {
            return -1;
        }
        return nativeDisableFilters(this.mNativePtr, z);
    }

    public int setProcessHandler(long j) {
        if (!this.mInited) {
            return -1;
        }
        return nativeSetProcessHandler(this.mNativePtr, j);
    }

    public int startProcess(int i, int i2, int i3, int i4) {
        if (!this.mInited) {
            return -1;
        }
        return nativeStartProcess(this.mNativePtr, i, i2, i3, i4);
    }

    public int drawFrame(int i, long j, Rotation rotation, int i2, boolean z, boolean z2) {
        if (!this.mInited) {
            return -1;
        }
        if (i <= 0) {
            return -2;
        }
        long j2 = this.mNativePtr;
        int i3 = rotation.f117080id;
        double d = (double) i2;
        Double.isNaN(d);
        return nativeDraw(j2, i, j, i3, (d * 3.141592653589793d) / 180.0d, z, z2);
    }

    public void onNativeCallBack_OnFrameAvailable(int i, long j, int i2, int i3, int i4, int i5, float f, float f2, float f3) {
        if (this.mGLCallback != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("roi_center_pos_x", i2);
            bundle.putInt("roi_center_pos_y", i3);
            bundle.putInt("roi_width", i4);
            bundle.putInt("roi_height", i5);
            bundle.putFloat("roi_yaw", f);
            bundle.putFloat("roi_pitch", f2);
            bundle.putFloat("roi_roll", f3);
            this.mGLCallback.onFrameAvailable(i, j, bundle);
        }
    }
}
