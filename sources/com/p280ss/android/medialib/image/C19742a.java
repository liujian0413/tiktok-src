package com.p280ss.android.medialib.image;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.bef.effectsdk.OpenGLUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.medialib.image.a */
public final class C19742a {

    /* renamed from: i */
    private static final float[] f53554i = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: j */
    private static final float[] f53555j = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a */
    public float[] f53556a = new float[16];

    /* renamed from: b */
    private int f53557b;

    /* renamed from: c */
    private int f53558c;

    /* renamed from: d */
    private int f53559d;

    /* renamed from: e */
    private int f53560e;

    /* renamed from: f */
    private int f53561f;

    /* renamed from: g */
    private FloatBuffer f53562g;

    /* renamed from: h */
    private FloatBuffer f53563h;

    /* renamed from: a */
    public final void mo52501a() {
        this.f53557b = OpenGLUtils.loadProgram("attribute vec4 vPosition;\nattribute vec2 vCoordinate;\nuniform mat4 vMatrix;\nvarying vec2 aCoordinate;\n\nvoid main(){\n    gl_Position=vMatrix*vPosition;\n    aCoordinate=vCoordinate;\n}", "precision mediump float;\nvarying vec2 aCoordinate;\nuniform sampler2D s_texture;\nvoid main() {\n    gl_FragColor = texture2D(s_texture, aCoordinate);\n}");
        this.f53558c = GLES20.glGetAttribLocation(this.f53557b, "vPosition");
        this.f53559d = GLES20.glGetAttribLocation(this.f53557b, "vCoordinate");
        this.f53560e = GLES20.glGetUniformLocation(this.f53557b, "s_texture");
        this.f53561f = GLES20.glGetUniformLocation(this.f53557b, "vMatrix");
    }

    public C19742a() {
        Matrix.setIdentityM(this.f53556a, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(f53554i.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f53562g = allocateDirect.asFloatBuffer();
        this.f53562g.put(f53554i);
        this.f53562g.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(f53555j.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f53563h = allocateDirect2.asFloatBuffer();
        this.f53563h.put(f53555j);
        this.f53563h.position(0);
    }

    /* renamed from: a */
    public final void mo52502a(int i) {
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f53557b);
        GLES20.glUniformMatrix4fv(this.f53561f, 1, false, this.f53556a, 0);
        GLES20.glEnableVertexAttribArray(this.f53558c);
        GLES20.glEnableVertexAttribArray(this.f53559d);
        GLES20.glVertexAttribPointer(this.f53558c, 2, 5126, false, 0, this.f53562g);
        GLES20.glVertexAttribPointer(this.f53559d, 2, 5126, false, 0, this.f53563h);
        GLES20.glUniform1i(this.f53560e, 0);
        GLES20.glBindTexture(i, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }
}
