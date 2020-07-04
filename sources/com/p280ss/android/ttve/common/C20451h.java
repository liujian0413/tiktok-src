package com.p280ss.android.ttve.common;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import com.C1642a;

/* renamed from: com.ss.android.ttve.common.h */
public class C20451h {

    /* renamed from: d */
    private static final String f55227d = "h";

    /* renamed from: e */
    private static int f55228e = 8;

    /* renamed from: f */
    private static int f55229f = 8;

    /* renamed from: g */
    private static int f55230g = 8;

    /* renamed from: h */
    private static int f55231h = 8;

    /* renamed from: a */
    public EGLContext f55232a;

    /* renamed from: b */
    public EGLDisplay f55233b;

    /* renamed from: c */
    public EGLSurface f55234c;

    /* renamed from: i */
    private EGLConfig f55235i;

    C20451h() {
    }

    /* renamed from: c */
    public final boolean mo55052c() {
        return EGL14.eglSwapBuffers(this.f55233b, this.f55234c);
    }

    /* renamed from: b */
    public final boolean mo55051b() {
        if (EGL14.eglMakeCurrent(this.f55233b, this.f55234c, this.f55234c, this.f55232a)) {
            return true;
        }
        m67850a("eglMakeCurrent");
        return false;
    }

    /* renamed from: a */
    public final void mo55048a() {
        if (this.f55233b != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.f55233b;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f55233b, this.f55232a);
            EGL14.eglDestroySurface(this.f55233b, this.f55234c);
            EGL14.eglTerminate(this.f55233b);
        }
        this.f55233b = EGL14.EGL_NO_DISPLAY;
        this.f55234c = EGL14.EGL_NO_SURFACE;
        this.f55232a = EGL14.EGL_NO_CONTEXT;
    }

    /* renamed from: a */
    private static void m67850a(String str) {
        EGL14.eglGetError();
    }

    /* renamed from: a */
    public final void mo55049a(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f55233b, this.f55234c, j);
        m67850a("eglPresentationTimeANDROID");
    }

    /* renamed from: a */
    public final boolean mo55050a(int i, int i2, int i3, Object obj) {
        EGL14.eglDestroySurface(this.f55233b, this.f55234c);
        int[] iArr = {12375, 0, 12374, 0, 12344};
        iArr[0] = 12344;
        iArr[2] = 12344;
        this.f55234c = EGL14.eglCreateWindowSurface(this.f55233b, this.f55235i, obj, iArr, 0);
        if (this.f55234c != EGL14.EGL_NO_SURFACE) {
            return mo55051b();
        }
        m67850a("eglCreateSurface");
        return false;
    }

    /* renamed from: a */
    public static C20451h m67849a(EGLContext eGLContext, int i, int i2, int i3, Object obj) {
        C20451h hVar = new C20451h();
        if (hVar.m67851b(eGLContext, 64, 64, 12610, obj)) {
            return hVar;
        }
        hVar.mo55048a();
        return null;
    }

    /* renamed from: b */
    private boolean m67851b(EGLContext eGLContext, int i, int i2, int i3, Object obj) {
        EGLContext eGLContext2;
        String str;
        int i4 = i3;
        if (eGLContext == null) {
            eGLContext2 = EGL14.EGL_NO_CONTEXT;
        } else {
            eGLContext2 = eGLContext;
        }
        int[] iArr = {12440, 2, 12344};
        int[] iArr2 = {12352, 4, 12324, f55228e, 12323, f55229f, 12322, f55230g, 12321, f55231h, 12339, i4, 12344};
        if (i4 == 12610) {
            iArr2[10] = 12610;
            iArr2[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = {0, 1};
        int[] iArr5 = {12375, i, 12374, i2, 12344};
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f55233b = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            m67850a("eglGetDisplay");
            return false;
        }
        int[] iArr6 = new int[2];
        if (!eGLContext2.equals(EGL14.EGL_NO_CONTEXT) && EGL14.eglQueryContext(this.f55233b, eGLContext2, 12440, iArr6, 0)) {
            iArr[1] = iArr6[0];
        }
        if (!EGL14.eglInitialize(this.f55233b, iArr4, 0, iArr4, 1)) {
            m67850a("eglInitialize");
            return false;
        }
        int[] iArr7 = iArr5;
        int[] iArr8 = iArr3;
        EGLConfig[] eGLConfigArr2 = eGLConfigArr;
        if (!EGL14.eglChooseConfig(this.f55233b, iArr2, 0, eGLConfigArr, 0, 1, iArr8, 0)) {
            m67850a("eglChooseConfig");
            return false;
        }
        String str2 = "Config num: %d, has sharedContext: %s";
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(iArr8[0]);
        if (eGLContext2 == EGL14.EGL_NO_CONTEXT) {
            str = "NO";
        } else {
            str = "YES";
        }
        objArr[1] = str;
        C1642a.m8034a(str2, objArr);
        this.f55235i = eGLConfigArr2[0];
        this.f55232a = EGL14.eglCreateContext(this.f55233b, this.f55235i, eGLContext2, iArr, 0);
        if (this.f55232a == EGL14.EGL_NO_CONTEXT) {
            m67850a("eglCreateContext");
            return false;
        }
        if (i4 != 2) {
            if (i4 != 4) {
                if (i4 != 12610) {
                    this.f55234c = EGL14.eglCreatePbufferSurface(this.f55233b, this.f55235i, iArr7, 0);
                } else {
                    iArr7[0] = 12344;
                    iArr7[2] = 12344;
                }
            }
            this.f55234c = EGL14.eglCreateWindowSurface(this.f55233b, this.f55235i, obj, iArr7, 0);
        } else {
            this.f55234c = EGL14.eglCreatePixmapSurface(this.f55233b, this.f55235i, 0, iArr7, 0);
        }
        if (this.f55234c == EGL14.EGL_NO_SURFACE) {
            m67850a("eglCreateSurface");
            return false;
        } else if (!mo55051b()) {
            return false;
        } else {
            EGL14.eglQueryContext(this.f55233b, this.f55232a, 12440, new int[1], 0);
            return true;
        }
    }
}
