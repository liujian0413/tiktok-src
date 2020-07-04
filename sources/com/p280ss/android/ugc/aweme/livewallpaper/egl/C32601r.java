package com.p280ss.android.ugc.aweme.livewallpaper.egl;

import android.opengl.GLES20;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.r */
public class C32601r extends C32598o {

    /* renamed from: c */
    private int f85007c;

    /* renamed from: d */
    private int f85008d;

    /* renamed from: e */
    private void m105624e() {
        this.f85007c = C32588i.m105572b();
    }

    /* renamed from: c */
    public final void mo83925c() {
        super.mo83925c();
        if (this.f85007c != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.f85007c}, 0);
            this.f85007c = 0;
        }
        if (this.f85008d != 0) {
            GLES20.glDeleteTextures(1, new int[]{this.f85008d}, 0);
            this.f85008d = 0;
        }
    }

    /* renamed from: b */
    private boolean m105623b(int i, int i2) {
        this.f85008d = C32588i.m105568a(null, i, i2, 6408);
        return true;
    }

    /* renamed from: a */
    public final boolean mo83924a(int i, int i2) {
        m105624e();
        if (!super.mo83924a(i, i2)) {
            return false;
        }
        m105623b(i, i2);
        return true;
    }
}
