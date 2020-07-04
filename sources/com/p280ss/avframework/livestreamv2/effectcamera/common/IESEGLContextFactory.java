package com.p280ss.avframework.livestreamv2.effectcamera.common;

import android.opengl.GLSurfaceView.EGLContextFactory;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.common.IESEGLContextFactory */
public class IESEGLContextFactory implements EGLContextFactory {
    private int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private int mEGLContextClientVersion;
    private IESEGLContextStateListener stateListener;

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.common.IESEGLContextFactory$IESEGLContextStateListener */
    public interface IESEGLContextStateListener {
        void onEGLContextCreate(EGLContext eGLContext);

        void onEGLContextDestroy();
    }

    public IESEGLContextFactory(int i, IESEGLContextStateListener iESEGLContextStateListener) {
        this.mEGLContextClientVersion = i;
        this.stateListener = iESEGLContextStateListener;
    }

    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (this.stateListener != null) {
            this.stateListener.onEGLContextDestroy();
        }
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }

    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        int[] iArr = {this.EGL_CONTEXT_CLIENT_VERSION, this.mEGLContextClientVersion, 12344};
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        if (this.mEGLContextClientVersion == 0) {
            iArr = null;
        }
        EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        if (this.stateListener != null) {
            this.stateListener.onEGLContextCreate(eglCreateContext);
        }
        return eglCreateContext;
    }
}
