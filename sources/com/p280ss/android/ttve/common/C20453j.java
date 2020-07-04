package com.p280ss.android.ttve.common;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.ttve.common.j */
public final class C20453j {

    /* renamed from: a */
    public static final float[] f55238a = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: b */
    protected C20449g f55239b;

    /* renamed from: c */
    private int f55240c;

    /* renamed from: d */
    private int f55241d;

    /* renamed from: e */
    private int f55242e;

    /* renamed from: f */
    private int f55243f;

    protected C20453j() {
    }

    /* renamed from: a */
    public static C20453j m67857a() {
        C20453j jVar = new C20453j();
        if (jVar.m67860a("attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nuniform int debug;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n   if (debug != 0) gl_FragColor.rg = texCoord;\n}")) {
            return jVar;
        }
        jVar.mo55059b();
        return null;
    }

    /* renamed from: b */
    public final void mo55059b() {
        this.f55239b.mo55043a();
        GLES20.glDeleteBuffers(1, new int[]{this.f55240c}, 0);
        this.f55239b = null;
        this.f55240c = 0;
    }

    /* renamed from: a */
    public final void mo55058a(int i) {
        m67858a(i, 3553);
    }

    /* renamed from: a */
    private void m67859a(boolean z) {
        this.f55239b.mo55046b();
        GLES20.glUniform1i(this.f55243f, 0);
    }

    /* renamed from: a */
    public final void mo55056a(float f) {
        float cos = (float) Math.cos(0.0d);
        float sin = (float) Math.sin(0.0d);
        float[] fArr = {cos, sin, -sin, cos};
        this.f55239b.mo55046b();
        GLES20.glUniformMatrix2fv(this.f55241d, 1, false, fArr, 0);
    }

    /* renamed from: a */
    private void m67858a(int i, int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glBindBuffer(34962, this.f55240c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        this.f55239b.mo55046b();
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* renamed from: a */
    private boolean m67860a(String str, String str2) {
        this.f55239b = new C20449g();
        if (!this.f55239b.mo55045a(str, str2)) {
            this.f55239b.mo55043a();
            this.f55239b = null;
            return false;
        }
        this.f55239b.mo55046b();
        this.f55241d = this.f55239b.mo55042a("rotation");
        this.f55242e = this.f55239b.mo55042a("flipScale");
        this.f55243f = this.f55239b.mo55042a("debug");
        this.f55239b.mo55044a("vPosition", 0);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        this.f55240c = iArr[0];
        GLES20.glBindBuffer(34962, this.f55240c);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f55238a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(f55238a).position(0);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        mo55056a(0.0f);
        mo55057a(1.0f, 1.0f);
        m67859a(false);
        return true;
    }

    /* renamed from: a */
    public final void mo55057a(float f, float f2) {
        this.f55239b.mo55046b();
        GLES20.glUniform2f(this.f55242e, 1.0f, 1.0f / f2);
    }
}
