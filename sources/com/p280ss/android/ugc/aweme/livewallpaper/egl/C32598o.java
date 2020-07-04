package com.p280ss.android.ugc.aweme.livewallpaper.egl;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.o */
public class C32598o {

    /* renamed from: a */
    protected int f84988a;

    /* renamed from: b */
    protected int f84989b;

    /* renamed from: c */
    private int f84990c;

    /* renamed from: d */
    private int f84991d;

    /* renamed from: e */
    private int f84992e;

    /* renamed from: f */
    private int f84993f;

    /* renamed from: g */
    private int f84994g;

    /* renamed from: h */
    private int f84995h;

    /* renamed from: i */
    private FloatBuffer[] f84996i;

    /* renamed from: j */
    private boolean f84997j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo83893a() {
        return 3553;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public float[] mo83926d() {
        return C32599p.f85002e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String[] mo83894b() {
        return new String[]{"attribute vec2 a_pos;\nattribute vec2 a_tex;\nvarying vec2 v_tex;\nuniform mat4 u_mvp;\nuniform mat4 u_tex_trans;\nvoid main() {\n   gl_Position = u_mvp * vec4(a_pos, 0.0, 1.0);\n   v_tex = (u_tex_trans * vec4(a_tex, 0.0, 1.0)).st;\n}\n", "precision mediump float;\nuniform sampler2D u_tex;\nuniform bool fmt_changed; \nvarying vec2 v_tex;\nvoid main() {\n   if (fmt_changed) {\n       gl_FragColor = vec4(texture2D(u_tex, v_tex).bgr, 1.0);\n   } else { \n       gl_FragColor = texture2D(u_tex, v_tex);\n   }\n}\n"};
    }

    /* renamed from: g */
    private boolean m105613g() {
        String[] b = mo83894b();
        this.f84990c = C32588i.m105567a(b[0], b[1]);
        if (this.f84990c != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo83925c() {
        if (this.f84990c != 0) {
            GLES20.glDeleteProgram(this.f84990c);
            this.f84990c = 0;
        }
        if (this.f84991d != 0) {
            GLES20.glDeleteBuffers(1, new int[]{this.f84991d}, 0);
            this.f84991d = 0;
        }
        if (this.f84992e != 0) {
            GLES20.glDeleteBuffers(1, new int[]{this.f84992e}, 0);
            this.f84992e = 0;
        }
        this.f84997j = false;
    }

    /* renamed from: e */
    private boolean m105611e() {
        m105612f();
        float[] d = mo83926d();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(d.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(d);
        asFloatBuffer.rewind();
        int[] iArr = new int[2];
        GLES20.glGenBuffers(2, iArr, 0);
        this.f84991d = iArr[0];
        this.f84992e = iArr[1];
        GLES20.glBindBuffer(34962, this.f84991d);
        GLES20.glBufferData(34962, 32, this.f84996i[0].rewind(), 35044);
        GLES20.glBindBuffer(34962, this.f84992e);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        GLES20.glBindBuffer(34962, 0);
        m105609a(0);
        GLES20.glBindBuffer(34962, 0);
        return C32588i.m105571a("TextureDrawer setup VAO, VBOs.");
    }

    /* renamed from: f */
    private void m105612f() {
        this.f84996i = new FloatBuffer[4];
        float[] fArr = C32599p.f84998a;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f84996i[0] = allocateDirect.asFloatBuffer();
        this.f84996i[0].put(fArr);
        this.f84996i[0].rewind();
        float[] fArr2 = C32599p.f84999b;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f84996i[1] = allocateDirect2.asFloatBuffer();
        this.f84996i[1].put(fArr2);
        this.f84996i[1].rewind();
        float[] fArr3 = C32599p.f85000c;
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(fArr3.length * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        this.f84996i[2] = allocateDirect3.asFloatBuffer();
        this.f84996i[2].put(fArr3);
        this.f84996i[2].rewind();
        float[] fArr4 = C32599p.f85001d;
        ByteBuffer allocateDirect4 = ByteBuffer.allocateDirect(fArr4.length * 4);
        allocateDirect4.order(ByteOrder.nativeOrder());
        this.f84996i[3] = allocateDirect4.asFloatBuffer();
        this.f84996i[3].put(fArr4);
        this.f84996i[3].rewind();
    }

    /* renamed from: a */
    private void m105609a(int i) {
        GLES20.glBindBuffer(34962, this.f84991d);
        GLES20.glBufferData(34962, 32, this.f84996i[i].rewind(), 35044);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.f84992e);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, 0);
    }

    /* renamed from: b */
    private boolean m105610b(int i) {
        GLES20.glBindAttribLocation(i, 0, "a_pos");
        GLES20.glBindAttribLocation(i, 1, "a_tex");
        this.f84993f = GLES20.glGetUniformLocation(i, "u_mvp");
        this.f84994g = GLES20.glGetUniformLocation(i, "u_tex_trans");
        this.f84995h = GLES20.glGetUniformLocation(i, "fmt_changed");
        return C32588i.m105571a("TextureDrawer glBindAttribLocation");
    }

    /* renamed from: a */
    public boolean mo83924a(int i, int i2) {
        this.f84988a = i;
        this.f84989b = i2;
        if (!m105613g() || !m105610b(this.f84990c) || !m105611e()) {
            return false;
        }
        this.f84997j = true;
        return true;
    }

    /* renamed from: a */
    public final void mo83922a(int i, boolean z, int i2, float[] fArr) {
        if (this.f84997j) {
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f84990c);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(mo83893a(), i);
            m105609a(0);
            GLES20.glUniformMatrix4fv(this.f84993f, 1, false, C32588i.f84952a, 0);
            if (fArr == null) {
                fArr = C32588i.f84952a;
            }
            GLES20.glUniformMatrix4fv(this.f84994g, 1, false, fArr, 0);
            GLES20.glUniform1i(this.f84995h, 0);
            GLES20.glViewport(0, 0, this.f84988a * 2, this.f84989b * 2);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(0);
            GLES20.glDisableVertexAttribArray(1);
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindTexture(mo83893a(), 0);
        }
    }

    /* renamed from: a */
    public final void mo83923a(int i, boolean z, int i2, float[] fArr, float[] fArr2) {
        if (this.f84997j) {
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f84990c);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(mo83893a(), i);
            m105609a(0);
            GLES20.glUniformMatrix4fv(this.f84993f, 1, false, fArr2, 0);
            if (fArr == null) {
                fArr = C32588i.f84952a;
            }
            GLES20.glUniformMatrix4fv(this.f84994g, 1, false, fArr, 0);
            GLES20.glUniform1i(this.f84995h, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(0);
            GLES20.glDisableVertexAttribArray(1);
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindTexture(mo83893a(), 0);
        }
    }
}
