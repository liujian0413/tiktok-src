package com.p280ss.android.ugc.aweme.livewallpaper.egl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build.VERSION;
import android.view.Surface;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.b */
public final class C32581b implements C32582c {

    /* renamed from: a */
    private EGLDisplay f84942a = EGL14.EGL_NO_DISPLAY;

    /* renamed from: b */
    private EGLContext f84943b = EGL14.EGL_NO_CONTEXT;

    /* renamed from: c */
    private EGLConfig f84944c;

    /* renamed from: b */
    public static Object m105526b() {
        return EGL14.eglGetCurrentContext();
    }

    public final void finalize() {
        if (this.f84942a != EGL14.EGL_NO_DISPLAY) {
            mo83869a();
        }
    }

    /* renamed from: a */
    public final void mo83869a() {
        if (this.f84942a != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.f84942a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f84942a, this.f84943b);
            if (VERSION.SDK_INT >= 19) {
                EGL14.eglReleaseThread();
            }
            EGL14.eglTerminate(this.f84942a);
        }
        this.f84942a = EGL14.EGL_NO_DISPLAY;
        this.f84943b = EGL14.EGL_NO_CONTEXT;
        this.f84944c = null;
    }

    /* renamed from: a */
    public final void mo83870a(Object obj) {
        EGL14.eglDestroySurface(this.f84942a, (EGLSurface) obj);
    }

    /* renamed from: d */
    public final boolean mo83874d(Object obj) {
        return EGL14.eglSwapBuffers(this.f84942a, (EGLSurface) obj);
    }

    /* renamed from: c */
    public final void mo83873c(Object obj) {
        EGLSurface eGLSurface = (EGLSurface) obj;
        if (!EGL14.eglMakeCurrent(this.f84942a, eGLSurface, eGLSurface, this.f84943b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: a */
    private static void m105524a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": EGL error: 0x");
            sb.append(Integer.toHexString(eglGetError));
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: b */
    public final Object mo83872b(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f84942a, this.f84944c, obj, new int[]{12344}, 0);
            m105524a("eglCreateWindowSurface");
            if (eglCreateWindowSurface != null) {
                return eglCreateWindowSurface;
            }
            throw new RuntimeException("surface was null");
        }
        StringBuilder sb = new StringBuilder("invalid surface: ");
        sb.append(obj);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public final int mo83867a(Object obj, int i) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f84942a, (EGLSurface) obj, i, iArr, 0);
        return iArr[0];
    }

    /* renamed from: a */
    public final void mo83871a(Object obj, long j) {
        if (VERSION.SDK_INT >= 18) {
            try {
                EGLExt.eglPresentationTimeANDROID(this.f84942a, (EGLSurface) obj, j);
            } catch (NoClassDefFoundError unused) {
            }
        }
    }

    /* renamed from: b */
    private EGLConfig m105525b(int i, int i2) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f84942a, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return null;
        }
        return eGLConfigArr[0];
    }

    /* renamed from: a */
    public final Object mo83868a(int i, int i2) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f84942a, this.f84944c, new int[]{12375, i, 12374, i2, 12344}, 0);
        m105524a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public C32581b(Object obj, int i) {
        if (this.f84942a == EGL14.EGL_NO_DISPLAY) {
            if (obj == null) {
                obj = EGL14.EGL_NO_CONTEXT;
            }
            this.f84942a = EGL14.eglGetDisplay(0);
            if (this.f84942a != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = {0, 1};
                if (!EGL14.eglInitialize(this.f84942a, iArr, 0, iArr, 1)) {
                    this.f84942a = null;
                    throw new RuntimeException("unable to initialize EGL14");
                } else if (this.f84943b == EGL14.EGL_NO_CONTEXT) {
                    EGLConfig b = m105525b(i, 2);
                    if (b != null) {
                        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f84942a, b, (EGLContext) obj, new int[]{12440, 2, 12344}, 0);
                        m105524a("eglCreateContext");
                        this.f84944c = b;
                        this.f84943b = eglCreateContext;
                        return;
                    }
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
            } else {
                throw new RuntimeException("unable to get EGL14 display");
            }
        } else {
            throw new RuntimeException("EGL already set up");
        }
    }
}
