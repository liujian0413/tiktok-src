package com.p280ss.android.ttve.nativePort;

import com.p280ss.android.ttve.common.C20445c;
import com.p280ss.android.ttve.nativePort.C20494b.C20495a;
import com.p280ss.android.ttve.nativePort.C20494b.C20496b;
import com.p280ss.android.ttve.nativePort.C20494b.C20498d;

/* renamed from: com.ss.android.ttve.nativePort.TENativeServiceBase */
public class TENativeServiceBase {
    protected C20495a mEncoderDataCallback;
    protected C20496b mGetImageCallback;
    protected C20445c mOnErrorListener;
    protected C20445c mOnInfoListener;
    protected C20498d mOpenGLCallback;

    public C20495a getEncoderDataListener() {
        return this.mEncoderDataCallback;
    }

    public C20445c getErrorListener() {
        return this.mOnErrorListener;
    }

    public C20445c getInfoListener() {
        return this.mOnInfoListener;
    }

    public C20498d getOpenGLListeners() {
        return this.mOpenGLCallback;
    }

    public void nativeCallback_onOpenGLDrawBefore(int i, double d) {
    }

    public void nativeCallback_onPreviewSurface(int i) {
    }

    public void setEncoderDataListener(C20495a aVar) {
        this.mEncoderDataCallback = aVar;
    }

    public void setErrorListener(C20445c cVar) {
        this.mOnErrorListener = cVar;
    }

    public void setGetImageCallback(C20496b bVar) {
        this.mGetImageCallback = bVar;
    }

    public void setInfoListener(C20445c cVar) {
        this.mOnInfoListener = cVar;
    }

    public void setOpenGLListeners(C20498d dVar) {
        this.mOpenGLCallback = dVar;
    }

    public void nativeCallback_onOpenGLCreate(int i) {
        if (this.mOpenGLCallback != null) {
            this.mOpenGLCallback.mo55472a(i);
        }
    }

    public void nativeCallback_onOpenGLDestroy(int i) {
        if (this.mOpenGLCallback != null) {
            this.mOpenGLCallback.mo55474b(i);
        }
    }

    public void nativeCallback_onOpenGLDrawAfter(int i, double d) {
        if (this.mOpenGLCallback != null) {
            this.mOpenGLCallback.mo55473a(i, d);
        }
    }

    public void nativeCallback_onInfoListener(int i, int i2, float f) {
        if (this.mOnInfoListener != null) {
            this.mOnInfoListener.mo55039a(i, i2, f, null);
        }
    }

    public void nativeCallback_onCompressBuffer(byte[] bArr, int i, int i2, boolean z) {
        if (this.mEncoderDataCallback != null) {
            this.mEncoderDataCallback.mo55470a(bArr, i, i2, z);
        }
    }

    public void nativeCallback_onErrorListener(int i, int i2, float f, String str) {
        if (this.mOnErrorListener != null) {
            this.mOnErrorListener.mo55039a(i, i2, f, str);
        }
    }

    public int nativeCallback_onImageData(byte[] bArr, int i, int i2, int i3, float f) {
        if (this.mGetImageCallback != null) {
            return this.mGetImageCallback.mo55471a(bArr, i, i2, i3, f);
        }
        return 0;
    }
}
