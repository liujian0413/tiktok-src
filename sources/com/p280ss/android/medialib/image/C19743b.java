package com.p280ss.android.medialib.image;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import android.text.TextUtils;
import com.bef.effectsdk.OpenGLUtils;
import com.p280ss.android.medialib.NativePort.NativeRenderWrapper;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.ss.android.medialib.image.b */
public final class C19743b implements Renderer {

    /* renamed from: a */
    public C19746b f53564a;

    /* renamed from: b */
    private NativeRenderWrapper f53565b = new NativeRenderWrapper();

    /* renamed from: c */
    private Bitmap f53566c;

    /* renamed from: d */
    private int f53567d;

    /* renamed from: e */
    private int f53568e;

    /* renamed from: f */
    private boolean f53569f;

    /* renamed from: g */
    private boolean f53570g;

    /* renamed from: h */
    private int f53571h;

    /* renamed from: i */
    private int f53572i;

    /* renamed from: j */
    private int f53573j;

    /* renamed from: k */
    private C19742a f53574k = new C19742a();

    /* renamed from: l */
    private float[] f53575l = new float[16];

    /* renamed from: m */
    private int f53576m;

    /* renamed from: n */
    private int f53577n;

    /* renamed from: o */
    private C19745a f53578o;

    /* renamed from: p */
    private C19747c f53579p = new C19747c();

    /* renamed from: com.ss.android.medialib.image.b$a */
    public interface C19745a {
        /* renamed from: a */
        void mo52499a(int i, int i2, ByteBuffer byteBuffer);
    }

    /* renamed from: com.ss.android.medialib.image.b$b */
    public interface C19746b {
        /* renamed from: a */
        void mo52515a();
    }

    /* renamed from: com.ss.android.medialib.image.b$c */
    static class C19747c {

        /* renamed from: a */
        String f53580a;

        /* renamed from: b */
        float f53581b;

        /* renamed from: c */
        float f53582c;

        /* renamed from: d */
        String f53583d;

        /* renamed from: e */
        float f53584e;

        /* renamed from: f */
        boolean f53585f;

        private C19747c() {
            this.f53580a = "";
            this.f53581b = -1.0f;
            this.f53582c = -1.0f;
            this.f53583d = "";
        }
    }

    /* renamed from: b */
    private static int m65095b() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    /* renamed from: a */
    public final void mo52504a() {
        this.f53565b.mo52167a();
        this.f53572i = 0;
        this.f53571h = 0;
        this.f53569f = true;
    }

    /* renamed from: c */
    private void m65096c() {
        ByteBuffer allocate = ByteBuffer.allocate(this.f53567d * this.f53568e * 4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.rewind();
        GLES20.glReadPixels(0, 0, this.f53567d, this.f53568e, 6408, 5121, allocate);
        this.f53578o.mo52499a(this.f53567d, this.f53568e, allocate);
    }

    /* renamed from: e */
    private int m65098e() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(3317, iArr2, 0);
        if (this.f53567d % iArr2[0] != 0) {
            GLES20.glPixelStorei(3317, 1);
        }
        GLUtils.texImage2D(3553, 0, this.f53566c, 0);
        if (this.f53567d % iArr2[0] != 0) {
            GLES20.glPixelStorei(3317, iArr2[0]);
        }
        return iArr[0];
    }

    /* renamed from: d */
    private void m65097d() {
        float f = ((float) this.f53567d) / ((float) this.f53568e);
        float f2 = ((float) this.f53576m) / ((float) this.f53577n);
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        if (this.f53576m > this.f53577n) {
            if (f > f2) {
                Matrix.orthoM(fArr, 0, -1.0f, 1.0f, (-f2) * f, f2 * f, 3.0f, 5.0f);
            } else {
                Matrix.orthoM(fArr, 0, (-f2) / f, f2 / f, -1.0f, 1.0f, 3.0f, 5.0f);
            }
        } else if (f > f2) {
            Matrix.orthoM(fArr, 0, -1.0f, 1.0f, (-1.0f / f2) * f, (1.0f / f2) * f, 3.0f, 5.0f);
        } else {
            Matrix.orthoM(fArr, 0, (-f2) / f, f2 / f, -1.0f, 1.0f, 3.0f, 5.0f);
        }
        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f53575l, 0, fArr, 0, fArr2, 0);
        this.f53574k.f53556a = this.f53575l;
    }

    /* renamed from: a */
    public final void mo52507a(C19745a aVar) {
        this.f53570g = true;
        this.f53578o = aVar;
    }

    /* renamed from: a */
    public final float mo52503a(String str) {
        if (this.f53565b.mo52173b()) {
            return this.f53565b.mo52166a(str);
        }
        return -1.0f;
    }

    /* renamed from: a */
    public final void mo52505a(float f) {
        if (this.f53565b.mo52173b()) {
            this.f53565b.mo52171a(this.f53579p.f53580a, this.f53579p.f53583d, this.f53579p.f53584e, f);
        }
        this.f53579p.f53581b = f;
        this.f53579p.f53582c = f;
    }

    /* renamed from: a */
    public final void mo52506a(Bitmap bitmap) {
        this.f53566c = bitmap;
        this.f53567d = this.f53566c.getWidth();
        this.f53568e = this.f53566c.getHeight();
        if (this.f53576m > 0 && this.f53577n > 0) {
            m65097d();
        }
        this.f53569f = true;
    }

    public final void onDrawFrame(GL10 gl10) {
        if (this.f53566c != null && !this.f53566c.isRecycled()) {
            if (this.f53569f) {
                this.f53574k.mo52501a();
                int[] iArr = new int[1];
                if (this.f53571h == 0) {
                    this.f53571h = m65095b();
                }
                this.f53573j = OpenGLUtils.initEffectTexture(this.f53567d, this.f53568e, iArr, 3553);
                GLES20.glBindFramebuffer(36160, this.f53571h);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f53573j, 0);
                GLES20.glBindFramebuffer(36160, 0);
                this.f53572i = m65098e();
                this.f53565b.mo52169a(this.f53567d, this.f53568e, Build.DEVICE);
                this.f53569f = false;
                if (this.f53579p.f53585f) {
                    if (TextUtils.isEmpty(this.f53579p.f53583d)) {
                        this.f53565b.mo52170a(this.f53579p.f53580a, this.f53579p.f53581b);
                    } else {
                        this.f53565b.mo52172a(this.f53579p.f53580a, this.f53579p.f53583d, this.f53579p.f53584e, this.f53579p.f53581b, this.f53579p.f53582c);
                    }
                } else if (TextUtils.isEmpty(this.f53579p.f53583d)) {
                    this.f53565b.mo52171a(this.f53579p.f53580a, this.f53579p.f53580a, this.f53579p.f53584e, this.f53579p.f53581b);
                } else {
                    this.f53565b.mo52171a(this.f53579p.f53580a, this.f53579p.f53583d, this.f53579p.f53584e, this.f53579p.f53581b);
                }
            }
            if (this.f53572i > 0) {
                GLES20.glViewport(0, 0, this.f53567d, this.f53568e);
                this.f53565b.mo52168a(this.f53572i, this.f53573j);
                GLES20.glBindFramebuffer(36160, this.f53571h);
                if (this.f53570g) {
                    m65096c();
                    this.f53570g = false;
                }
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, this.f53576m, this.f53577n);
                this.f53574k.mo52502a(this.f53573j);
                if (this.f53564a != null) {
                    this.f53564a.mo52515a();
                }
            }
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glEnable(3553);
        GLES20.glDisable(2929);
        this.f53569f = true;
    }

    /* renamed from: b */
    public final void mo52511b(String str, float f) {
        if (this.f53565b.mo52173b()) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f53565b.mo52170a(str, f);
        }
        this.f53579p.f53580a = str;
        this.f53579p.f53583d = "";
        this.f53579p.f53581b = f;
        this.f53579p.f53582c = f;
        this.f53579p.f53584e = 1.0f;
        this.f53579p.f53585f = true;
    }

    /* renamed from: a */
    public final void mo52508a(String str, float f) {
        if (this.f53565b.mo52173b()) {
            this.f53565b.mo52171a(str, str, 1.0f, f);
        }
        this.f53579p.f53580a = str;
        this.f53579p.f53583d = "";
        this.f53579p.f53581b = f;
        this.f53579p.f53582c = f;
        this.f53579p.f53584e = 1.0f;
        this.f53579p.f53585f = false;
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f53576m = i;
        this.f53577n = i2;
        m65097d();
    }

    /* renamed from: a */
    public final void mo52509a(String str, String str2, float f) {
        if (this.f53565b.mo52173b()) {
            this.f53565b.mo52171a(str, str2, f, this.f53579p.f53581b);
        }
        this.f53579p.f53580a = str;
        this.f53579p.f53583d = str2;
        this.f53579p.f53581b = -1.0f;
        this.f53579p.f53582c = -1.0f;
        this.f53579p.f53584e = f;
        this.f53579p.f53585f = false;
    }

    /* renamed from: a */
    public final void mo52510a(String str, String str2, float f, float f2, float f3) {
        if (this.f53565b.mo52173b() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f53565b.mo52172a(str, str2, f, f2, f3);
        }
        this.f53579p.f53580a = str;
        this.f53579p.f53583d = str2;
        this.f53579p.f53581b = f2;
        this.f53579p.f53582c = f3;
        this.f53579p.f53584e = f;
        this.f53579p.f53585f = true;
    }
}
