package com.p280ss.android.medialib;

import android.opengl.GLES20;
import com.p280ss.android.medialib.common.C19707d;
import com.p280ss.android.vesdk.C45372t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.medialib.j */
public final class C19748j {

    /* renamed from: a */
    public static final float[] f53586a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: b */
    protected C19707d f53587b;

    /* renamed from: c */
    private int f53588c;

    /* renamed from: d */
    private int f53589d;

    /* renamed from: e */
    private int f53590e;

    /* renamed from: f */
    private int f53591f;

    /* renamed from: g */
    private int f53592g;

    /* renamed from: h */
    private int f53593h;

    /* renamed from: i */
    private int f53594i;

    /* renamed from: j */
    private int f53595j;

    /* renamed from: k */
    private int f53596k;

    /* renamed from: l */
    private int f53597l;

    /* renamed from: m */
    private int f53598m;

    /* renamed from: n */
    private int f53599n;

    protected C19748j() {
    }

    /* renamed from: a */
    public final void mo52516a() {
        this.f53587b.mo52406a();
        GLES20.glDeleteBuffers(1, new int[]{this.f53588c}, 0);
        this.f53587b = null;
        this.f53588c = 0;
    }

    /* renamed from: b */
    public final void mo52520b(float f) {
        this.f53587b.mo52409b();
        GLES20.glUniform1f(this.f53593h, f);
    }

    /* renamed from: a */
    public final void mo52517a(float f) {
        float cos = (float) Math.cos(0.0d);
        float sin = (float) Math.sin(0.0d);
        float[] fArr = {cos, sin, -sin, cos};
        this.f53587b.mo52409b();
        GLES20.glUniformMatrix2fv(this.f53589d, 1, false, fArr, 0);
    }

    /* renamed from: a */
    public final void mo52519a(int i, int i2) {
        m65111a(i, i2, 3553);
    }

    /* renamed from: c */
    private void m65113c(float f, float f2) {
        this.f53587b.mo52409b();
        GLES20.glUniform1f(this.f53598m, f);
        GLES20.glUniform1f(this.f53599n, f2);
    }

    /* renamed from: a */
    public static C19748j m65110a(float f, float f2) {
        C19748j jVar = new C19748j();
        if (jVar.m65112a("attribute highp vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform float xPos;\nuniform float yPos;\nuniform float bottomPos;\nuniform float rightPos;\nuniform float markAlpha;\nuniform float xAdjust;\nuniform float yAdjust;\nvec4 normalBlend(vec4 c2, vec4 c1)\n{\n   vec4 outputColor;\n   outputColor.r = c1.r * markAlpha + c2.r * c2.a * (1.0 - c1.a);\n   outputColor.g = c1.g * markAlpha + c2.g * c2.a * (1.0 - c1.a);\n   outputColor.b = c1.b * markAlpha + c2.b * c2.a * (1.0 - c1.a);\n   outputColor.a = c1.a + c2.a * (1.0 - c1.a);\n   return outputColor;\n}\nvoid main()\n{\n   highp vec2 cord;\n   cord.x = texCoord.x * xAdjust- (xAdjust - 1.0) * 0.5;\n   cord.y = texCoord.y * yAdjust- (yAdjust - 1.0) * 0.5;\n   vec4 origin;\n   if(cord.x > 0.0 && cord.x < 1.0 && cord.y > 0.0 && cord.y < 1.0)\n   {\n       origin = texture2D(inputImageTexture, cord);\n   } else {\n       origin = vec4(1.0, 1.0, 1.0, 1.0);\n   }\n   vec4 markOverlay;\n   vec2 tmpCoordinate;\n   tmpCoordinate.x = cord.x;\n   tmpCoordinate.y = 1.0 - cord.y;\n   origin.a = origin.a * markAlpha;\n   if( cord.x > xPos && cord.x < bottomPos && cord.y > yPos && cord.y < rightPos )\n   {\n       tmpCoordinate.x = (cord.x - xPos) / (bottomPos - xPos);\n       tmpCoordinate.y = 1.0 - (cord.y - yPos) / (rightPos - yPos);\n       markOverlay = texture2D(inputImageTexture2, tmpCoordinate);\n       markOverlay.a = markOverlay.a * markAlpha;\n       origin = normalBlend(origin, markOverlay);\n   }\n   gl_FragColor = vec4(origin.r, origin.g, origin.b, origin.a);\n}", f, f2)) {
            return jVar;
        }
        C45372t.m143409d("TextureDrawer", "TextureDrawer create failed!");
        jVar.mo52516a();
        return null;
    }

    /* renamed from: b */
    public final void mo52521b(float f, float f2) {
        this.f53587b.mo52409b();
        GLES20.glUniform2f(this.f53590e, 1.0f, 1.0f / f2);
    }

    /* renamed from: a */
    private void m65111a(int i, int i2, int i3) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.f53591f, 0);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, i2);
        GLES20.glUniform1i(this.f53592g, 2);
        GLES20.glBindBuffer(34962, this.f53588c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        this.f53587b.mo52409b();
        GLES20.glDrawArrays(6, 0, 4);
    }

    /* renamed from: a */
    private boolean m65112a(String str, String str2, float f, float f2) {
        this.f53587b = new C19707d();
        if (!this.f53587b.mo52408a(str, str2)) {
            this.f53587b.mo52406a();
            this.f53587b = null;
            return false;
        }
        this.f53587b.mo52409b();
        this.f53589d = this.f53587b.mo52405a("rotation");
        this.f53590e = this.f53587b.mo52405a("flipScale");
        this.f53591f = this.f53587b.mo52405a("inputImageTexture");
        this.f53592g = this.f53587b.mo52405a("inputImageTexture2");
        this.f53593h = this.f53587b.mo52405a("markAlpha");
        this.f53594i = this.f53587b.mo52405a("xPos");
        this.f53595j = this.f53587b.mo52405a("yPos");
        this.f53596k = this.f53587b.mo52405a("bottomPos");
        this.f53597l = this.f53587b.mo52405a("rightPos");
        this.f53598m = this.f53587b.mo52405a("xAdjust");
        this.f53599n = this.f53587b.mo52405a("yAdjust");
        this.f53587b.mo52407a("vPosition", 0);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        this.f53588c = iArr[0];
        GLES20.glBindBuffer(34962, this.f53588c);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f53586a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(f53586a).position(0);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        mo52517a(0.0f);
        mo52521b(1.0f, 1.0f);
        mo52520b(1.0f);
        m65113c(f, f2);
        C45372t.m143405b("TextureDrawer", "init: success.");
        return true;
    }

    /* renamed from: a */
    public final void mo52518a(float f, float f2, float f3, float f4) {
        this.f53587b.mo52409b();
        GLES20.glUniform1f(this.f53594i, f);
        GLES20.glUniform1f(this.f53595j, f2);
        GLES20.glUniform1f(this.f53596k, f3);
        GLES20.glUniform1f(this.f53597l, f4);
    }
}
