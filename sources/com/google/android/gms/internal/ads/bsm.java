package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;

final class bsm extends HandlerThread implements OnFrameAvailableListener, Callback {

    /* renamed from: a */
    private final int[] f43414a = new int[1];

    /* renamed from: b */
    private Handler f43415b;

    /* renamed from: c */
    private SurfaceTexture f43416c;

    /* renamed from: d */
    private Error f43417d;

    /* renamed from: e */
    private RuntimeException f43418e;

    /* renamed from: f */
    private zztc f43419f;

    public bsm() {
        super("dummySurface");
    }

    /* renamed from: a */
    public final zztc mo41249a(boolean z) {
        boolean z2;
        start();
        this.f43415b = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f43415b.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.f43419f == null && this.f43418e == null && this.f43417d == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (this.f43418e != null) {
            throw this.f43418e;
        } else if (this.f43417d == null) {
            return this.f43419f;
        } else {
            throw this.f43417d;
        }
    }

    /* renamed from: a */
    public final void mo41250a() {
        this.f43415b.sendEmptyMessage(3);
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f43415b.sendEmptyMessage(2);
    }

    public final boolean handleMessage(Message message) {
        int[] iArr;
        int[] iArr2;
        switch (message.what) {
            case 1:
                try {
                    boolean z = message.arg1 != 0;
                    EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    brr.m49874b(eglGetDisplay != null, "eglGetDisplay failed");
                    int[] iArr3 = new int[2];
                    brr.m49874b(EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1), "eglInitialize failed");
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr4 = new int[1];
                    brr.m49874b(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr4, 0) && iArr4[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (z) {
                        iArr = new int[]{12440, 2, 12992, 1, 12344};
                    } else {
                        iArr = new int[]{12440, 2, 12344};
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    brr.m49874b(eglCreateContext != null, "eglCreateContext failed");
                    if (z) {
                        iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                    } else {
                        iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                    }
                    EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, iArr2, 0);
                    brr.m49874b(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                    brr.m49874b(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                    GLES20.glGenTextures(1, this.f43414a, 0);
                    this.f43416c = new SurfaceTexture(this.f43414a[0]);
                    this.f43416c.setOnFrameAvailableListener(this);
                    this.f43419f = new zztc(this, this.f43416c, z);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    this.f43418e = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        this.f43417d = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            case 2:
                this.f43416c.updateTexImage();
                return true;
            case 3:
                try {
                    this.f43416c.release();
                    this.f43419f = null;
                    this.f43416c = null;
                    GLES20.glDeleteTextures(1, this.f43414a, 0);
                    quit();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                return true;
            default:
                return true;
        }
    }
}
