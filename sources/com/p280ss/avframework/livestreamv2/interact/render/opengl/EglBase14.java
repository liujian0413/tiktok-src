package com.p280ss.avframework.livestreamv2.interact.render.opengl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build.VERSION;
import android.view.Surface;
import com.p280ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.livestreamv2.interact.render.opengl.EglBase14 */
class EglBase14 implements EglBase {
    public static final int CURRENT_SDK_VERSION = VERSION.SDK_INT;
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay = getEglDisplay();
    private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;

    /* renamed from: com.ss.avframework.livestreamv2.interact.render.opengl.EglBase14$Context */
    public static class Context implements com.p280ss.avframework.livestreamv2.interact.render.opengl.EglBase.Context {
        public final EGLContext egl14Context;

        public long getNativeEglContext() {
            if (EglBase14.CURRENT_SDK_VERSION >= 21) {
                return this.egl14Context.getNativeHandle();
            }
            return (long) this.egl14Context.getHandle();
        }

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }
    }

    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    public Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    public boolean hasSurface() {
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            return true;
        }
        return false;
    }

    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL14.EGL_NO_DISPLAY || this.eglContext == EGL14.EGL_NO_CONTEXT || this.eglConfig == null) {
            throw new RuntimeException("This object has been released");
        }
    }

    public void releaseSurface() {
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, this.eglSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    public static boolean isEGL14Supported() {
        boolean z;
        String str = "EglBase14";
        StringBuilder sb = new StringBuilder("SDK version: ");
        sb.append(CURRENT_SDK_VERSION);
        sb.append(". isEGL14Supported: ");
        if (CURRENT_SDK_VERSION >= 18) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        AVLog.iod(str, sb.toString());
        if (CURRENT_SDK_VERSION >= 18) {
            return true;
        }
        return false;
    }

    public void detachCurrent() {
        synchronized (EglBase.lock) {
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                StringBuilder sb = new StringBuilder("eglDetachCurrent failed: 0x");
                sb.append(Integer.toHexString(EGL14.eglGetError()));
                throw new RuntimeException(sb.toString());
            }
        }
    }

    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(this.eglDisplay);
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    private static EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            StringBuilder sb = new StringBuilder("Unable to initialize EGL14: 0x");
            sb.append(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Unable to get EGL14 display: 0x");
        sb2.append(Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException(sb2.toString());
    }

    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                if (!EGL14.eglMakeCurrent(this.eglDisplay, this.eglSurface, this.eglSurface, this.eglContext)) {
                    StringBuilder sb = new StringBuilder("eglMakeCurrent failed: 0x");
                    sb.append(Integer.toHexString(EGL14.eglGetError()));
                    throw new RuntimeException(sb.toString());
                }
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    public void swapBuffers(long j) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j);
                EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    private void createSurfaceInternal(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            checkIsNotReleased();
            if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
                this.eglSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344}, 0);
                if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
                    StringBuilder sb = new StringBuilder("Failed to create window surface: 0x");
                    sb.append(Integer.toHexString(EGL14.eglGetError()));
                    throw new RuntimeException(sb.toString());
                }
                return;
            }
            throw new RuntimeException("Already has an EGLSurface");
        }
        throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
    }

    public EglBase14(Context context, int[] iArr) {
        this.eglConfig = getEglConfig(this.eglDisplay, iArr);
        this.eglContext = createEglContext(context, this.eglDisplay, this.eglConfig);
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            StringBuilder sb = new StringBuilder("eglChooseConfig failed: 0x");
            sb.append(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(sb.toString());
        } else if (iArr2[0] > 0) {
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new RuntimeException("eglChooseConfig returned null");
        } else {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
    }

    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            this.eglSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
            if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
                StringBuilder sb = new StringBuilder("Failed to create pixel buffer surface with size ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append(": 0x");
                sb.append(Integer.toHexString(EGL14.eglGetError()));
                throw new RuntimeException(sb.toString());
            }
            return;
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    private static EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContext;
        EGLContext eglCreateContext;
        if (context == null || context.egl14Context != EGL14.EGL_NO_CONTEXT) {
            int[] iArr = {12440, 2, 12344};
            if (context == null) {
                eGLContext = EGL14.EGL_NO_CONTEXT;
            } else {
                eGLContext = context.egl14Context;
            }
            synchronized (EglBase.lock) {
                eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
            }
            if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                return eglCreateContext;
            }
            StringBuilder sb = new StringBuilder("Failed to create EGL context: 0x");
            sb.append(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(sb.toString());
        }
        throw new RuntimeException("Invalid sharedContext");
    }
}
