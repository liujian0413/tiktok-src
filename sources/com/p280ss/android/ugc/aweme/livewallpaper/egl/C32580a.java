package com.p280ss.android.ugc.aweme.livewallpaper.egl;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.a */
public final class C32580a implements C32582c {

    /* renamed from: a */
    private EGLDisplay f84938a = EGL10.EGL_NO_DISPLAY;

    /* renamed from: b */
    private EGLContext f84939b = EGL10.EGL_NO_CONTEXT;

    /* renamed from: c */
    private EGLConfig f84940c;

    /* renamed from: d */
    private EGL10 f84941d = ((EGL10) EGLContext.getEGL());

    /* renamed from: a */
    public final void mo83871a(Object obj, long j) {
    }

    /* renamed from: b */
    public static Object m105514b() {
        return ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
    }

    public final void finalize() {
        if (this.f84938a != EGL10.EGL_NO_DISPLAY) {
            mo83869a();
        }
    }

    /* renamed from: a */
    public final void mo83869a() {
        if (this.f84938a != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.f84941d;
            EGLDisplay eGLDisplay = this.f84938a;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f84941d.eglDestroyContext(this.f84938a, this.f84939b);
            this.f84941d.eglTerminate(this.f84938a);
        }
        this.f84938a = EGL10.EGL_NO_DISPLAY;
        this.f84939b = EGL10.EGL_NO_CONTEXT;
        this.f84940c = null;
    }

    /* renamed from: d */
    public final boolean mo83874d(Object obj) {
        return this.f84941d.eglSwapBuffers(this.f84938a, (EGLSurface) obj);
    }

    /* renamed from: a */
    public final void mo83870a(Object obj) {
        this.f84941d.eglDestroySurface(this.f84938a, (EGLSurface) obj);
    }

    /* renamed from: c */
    public final void mo83873c(Object obj) {
        EGLSurface eGLSurface = (EGLSurface) obj;
        if (!this.f84941d.eglMakeCurrent(this.f84938a, eGLSurface, eGLSurface, this.f84939b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: a */
    private void m105513a(String str) {
        int eglGetError = this.f84941d.eglGetError();
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
            EGLSurface eglCreateWindowSurface = this.f84941d.eglCreateWindowSurface(this.f84938a, this.f84940c, obj, new int[]{12344});
            m105513a("eglCreateWindowSurface");
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
        this.f84941d.eglQuerySurface(this.f84938a, (EGLSurface) obj, i, iArr);
        return iArr[0];
    }

    /* renamed from: b */
    private EGLConfig m105515b(int i, int i2) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[8] = 12610;
            iArr[9] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!this.f84941d.eglChooseConfig(this.f84938a, iArr, eGLConfigArr, 1, new int[1])) {
            return null;
        }
        return eGLConfigArr[0];
    }

    /* renamed from: a */
    public final Object mo83868a(int i, int i2) {
        EGLSurface eglCreatePbufferSurface = this.f84941d.eglCreatePbufferSurface(this.f84938a, this.f84940c, new int[]{12375, i, 12374, i2, 12344});
        m105513a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public C32580a(Object obj, int i) {
        if (this.f84938a == EGL10.EGL_NO_DISPLAY) {
            if (obj == null) {
                obj = EGL10.EGL_NO_CONTEXT;
            }
            this.f84938a = this.f84941d.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.f84938a != EGL10.EGL_NO_DISPLAY) {
                if (!this.f84941d.eglInitialize(this.f84938a, new int[2])) {
                    this.f84938a = null;
                    throw new RuntimeException("unable to initialize EGL10");
                } else if (this.f84939b == EGL10.EGL_NO_CONTEXT) {
                    EGLConfig b = m105515b(i, 2);
                    if (b != null) {
                        EGLContext eglCreateContext = this.f84941d.eglCreateContext(this.f84938a, b, (EGLContext) obj, new int[]{12440, 2, 12344});
                        m105513a("eglCreateContext");
                        this.f84940c = b;
                        this.f84939b = eglCreateContext;
                        return;
                    }
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
            } else {
                throw new RuntimeException("unable to get EGL10 display");
            }
        } else {
            throw new RuntimeException("EGL already set up");
        }
    }
}
