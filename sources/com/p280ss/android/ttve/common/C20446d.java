package com.p280ss.android.ttve.common;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* renamed from: com.ss.android.ttve.common.d */
public final class C20446d {

    /* renamed from: a */
    public EGLContext f55207a = EGL14.EGL_NO_CONTEXT;

    /* renamed from: b */
    private EGLSurface f55208b = EGL14.EGL_NO_SURFACE;

    /* renamed from: c */
    private EGLSurface f55209c = EGL14.EGL_NO_SURFACE;

    /* renamed from: d */
    private EGLDisplay f55210d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: b */
    public final void mo55041b() {
        EGL14.eglMakeCurrent(this.f55210d, this.f55208b, this.f55209c, this.f55207a);
    }

    /* renamed from: a */
    public final void mo55040a() {
        this.f55207a = EGL14.eglGetCurrentContext();
        this.f55207a.equals(EGL14.EGL_NO_CONTEXT);
        this.f55208b = EGL14.eglGetCurrentSurface(12378);
        this.f55208b.equals(EGL14.EGL_NO_SURFACE);
        this.f55209c = EGL14.eglGetCurrentSurface(12377);
        this.f55209c.equals(EGL14.EGL_NO_SURFACE);
        this.f55210d = EGL14.eglGetCurrentDisplay();
        this.f55210d.equals(EGL14.EGL_NO_DISPLAY);
    }
}
