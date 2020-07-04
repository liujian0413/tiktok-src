package com.p280ss.android.medialib.common;

import android.opengl.GLES20;
import com.p280ss.android.vesdk.C45372t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.medialib.common.e */
public final class C19709e {

    /* renamed from: a */
    public static final float[] f53449a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: b */
    protected C19707d f53450b;

    /* renamed from: c */
    private int f53451c;

    /* renamed from: d */
    private int f53452d;

    /* renamed from: e */
    private int f53453e;

    protected C19709e() {
    }

    /* renamed from: a */
    public static C19709e m64982a() {
        C19709e eVar = new C19709e();
        if (eVar.m64984a("attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n}")) {
            return eVar;
        }
        C45372t.m143409d("TextureDrawer", "TextureDrawer create failed!");
        eVar.mo52414b();
        return null;
    }

    /* renamed from: b */
    public final void mo52414b() {
        this.f53450b.mo52406a();
        GLES20.glDeleteBuffers(1, new int[]{this.f53451c}, 0);
        this.f53450b = null;
        this.f53451c = 0;
    }

    /* renamed from: a */
    public final void mo52413a(int i) {
        m64983a(i, 3553);
    }

    /* renamed from: a */
    public final void mo52411a(float f) {
        float cos = (float) Math.cos(0.0d);
        float sin = (float) Math.sin(0.0d);
        float[] fArr = {cos, sin, -sin, cos};
        this.f53450b.mo52409b();
        GLES20.glUniformMatrix2fv(this.f53452d, 1, false, fArr, 0);
    }

    /* renamed from: a */
    public final void mo52412a(float f, float f2) {
        this.f53450b.mo52409b();
        GLES20.glUniform2f(this.f53453e, 1.0f, 1.0f / f2);
    }

    /* renamed from: a */
    private void m64983a(int i, int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glBindBuffer(34962, this.f53451c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        this.f53450b.mo52409b();
        GLES20.glDrawArrays(6, 0, 4);
    }

    /* renamed from: a */
    private boolean m64984a(String str, String str2) {
        this.f53450b = new C19707d();
        if (!this.f53450b.mo52408a(str, str2)) {
            this.f53450b.mo52406a();
            this.f53450b = null;
            return false;
        }
        this.f53450b.mo52409b();
        this.f53452d = this.f53450b.mo52405a("rotation");
        this.f53453e = this.f53450b.mo52405a("flipScale");
        this.f53450b.mo52407a("vPosition", 0);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        this.f53451c = iArr[0];
        GLES20.glBindBuffer(34962, this.f53451c);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f53449a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(f53449a).position(0);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        mo52411a(0.0f);
        mo52412a(1.0f, 1.0f);
        C45372t.m143405b("TextureDrawer", "init: success.");
        return true;
    }
}
