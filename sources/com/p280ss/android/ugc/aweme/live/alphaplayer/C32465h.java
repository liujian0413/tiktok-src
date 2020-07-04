package com.p280ss.android.ugc.aweme.live.alphaplayer;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Build.VERSION;
import android.view.Surface;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p280ss.android.ugc.aweme.live.alphaplayer.C32462f.C32463a;
import com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource.ScaleType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.h */
final class C32465h implements C32462f {

    /* renamed from: a */
    private static String f84686a = "VideoRender";

    /* renamed from: r */
    private static int f84687r = 36197;

    /* renamed from: b */
    private float[] f84688b = {-1.0f, -1.0f, 0.0f, 0.5f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: c */
    private FloatBuffer f84689c;

    /* renamed from: d */
    private final String f84690d = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    /* renamed from: e */
    private final String f84691e = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  vec4 color2Map = vec4(1.0, 1.0, 1.0, 1.0);\n  if (vTextureCoord.x >= 0.5) {\n     color2Map = texture2D(sTexture, vec2(vTextureCoord.x - 0.5, vTextureCoord.y));\n     gl_FragColor = vec4(color.r, color.g, color.b, color2Map.g);\n  } else {\n     gl_FragColor = vec4(color.r, color.g, color.b, color.a);\n  }\n}\n";

    /* renamed from: f */
    private String f84692f = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  vec4 color2Map = vec4(1.0, 1.0, 1.0, 1.0);\n  if (vTextureCoord.x >= 0.5) {\n     color2Map = texture2D(sTexture, vec2(vTextureCoord.x - 0.5, vTextureCoord.y));\n     gl_FragColor = vec4(color.r, color.g, color.b, color2Map.g);\n  } else {\n     gl_FragColor = vec4(color.r, color.g, color.b, color.a);\n  }\n}\n";

    /* renamed from: g */
    private float[] f84693g = new float[16];

    /* renamed from: h */
    private float[] f84694h = new float[16];

    /* renamed from: i */
    private int f84695i;

    /* renamed from: j */
    private int f84696j;

    /* renamed from: k */
    private int f84697k;

    /* renamed from: l */
    private int f84698l;

    /* renamed from: m */
    private int f84699m;

    /* renamed from: n */
    private int f84700n;

    /* renamed from: o */
    private SurfaceTexture f84701o;

    /* renamed from: p */
    private AtomicBoolean f84702p = new AtomicBoolean(false);

    /* renamed from: q */
    private AtomicBoolean f84703q = new AtomicBoolean(false);

    /* renamed from: s */
    private C32463a f84704s;

    /* renamed from: t */
    private GLSurfaceView f84705t;

    /* renamed from: u */
    private ScaleType f84706u = ScaleType.ScaleAspectFill;

    /* renamed from: a */
    public final void mo83711a() {
        this.f84703q.compareAndSet(false, true);
        this.f84705t.requestRender();
    }

    /* renamed from: b */
    public final void mo83716b() {
        this.f84703q.compareAndSet(true, false);
        this.f84705t.requestRender();
    }

    /* renamed from: c */
    private void m105192c() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.f84696j = iArr[0];
        GLES20.glBindTexture(f84687r, this.f84696j);
        m105190b("glBindTexture textureID");
        GLES20.glTexParameterf(f84687r, 10241, 9728.0f);
        GLES20.glTexParameterf(f84687r, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
        this.f84701o = new SurfaceTexture(this.f84696j);
        if (VERSION.SDK_INT >= 15) {
            this.f84701o.setDefaultBufferSize(this.f84705t.getMeasuredWidth(), this.f84705t.getMeasuredHeight());
        }
        this.f84701o.setOnFrameAvailableListener(this);
        Surface surface = new Surface(this.f84701o);
        if (this.f84704s != null) {
            this.f84704s.mo83672a(surface);
        }
        this.f84702p.compareAndSet(true, false);
    }

    /* renamed from: b */
    private static void m105190b(String str) {
        GLES20.glGetError();
    }

    /* renamed from: a */
    public final void mo83713a(ScaleType scaleType) {
        this.f84706u = scaleType;
    }

    /* renamed from: a */
    public final void mo83714a(C32463a aVar) {
        this.f84704s = aVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f84702p.compareAndSet(false, true);
        this.f84705t.requestRender();
    }

    /* renamed from: a */
    public final void mo83715a(String str) {
        this.f84692f = str;
    }

    C32465h(GLSurfaceView gLSurfaceView) {
        this.f84705t = gLSurfaceView;
        this.f84689c = ByteBuffer.allocateDirect(this.f84688b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f84689c.put(this.f84688b).position(0);
        Matrix.setIdentityM(this.f84694h, 0);
    }

    public final void onDrawFrame(GL10 gl10) {
        if (this.f84702p.compareAndSet(true, false)) {
            this.f84701o.updateTexImage();
            this.f84701o.getTransformMatrix(this.f84694h);
        }
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        if (!this.f84703q.get()) {
            GLES20.glFinish();
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUseProgram(this.f84695i);
        m105190b("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(f84687r, this.f84696j);
        this.f84689c.position(0);
        GLES20.glVertexAttribPointer(this.f84699m, 3, 5126, false, 20, this.f84689c);
        m105190b("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f84699m);
        m105190b("glEnableVertexAttribArray aPositionHandle");
        this.f84689c.position(3);
        GLES20.glVertexAttribPointer(this.f84700n, 3, 5126, false, 20, this.f84689c);
        m105190b("glVertexAttribPointer aTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f84700n);
        m105190b("glEnableVertexAttribArray aTextureHandle");
        Matrix.setIdentityM(this.f84693g, 0);
        GLES20.glUniformMatrix4fv(this.f84697k, 1, false, this.f84693g, 0);
        GLES20.glUniformMatrix4fv(this.f84698l, 1, false, this.f84694h, 0);
        GLES20.glDrawArrays(5, 0, 4);
        m105190b("glDrawArrays");
        GLES20.glFinish();
    }

    /* renamed from: a */
    private static int m105188a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: a */
    private int m105189a(String str, String str2) {
        int a = m105188a(35633, str);
        int i = 0;
        if (a == 0) {
            return 0;
        }
        int a2 = m105188a(35632, str2);
        if (a2 == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, a);
            m105190b("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, a2);
            m105190b("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glDeleteProgram(glCreateProgram);
                return i;
            }
        }
        i = glCreateProgram;
        return i;
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f84695i = m105189a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", this.f84692f);
        if (this.f84695i != 0) {
            this.f84699m = GLES20.glGetAttribLocation(this.f84695i, "aPosition");
            m105190b("glGetAttribLocation aPosition");
            if (this.f84699m != -1) {
                this.f84700n = GLES20.glGetAttribLocation(this.f84695i, "aTextureCoord");
                m105190b("glGetAttribLocation aTextureCoord");
                if (this.f84700n != -1) {
                    this.f84697k = GLES20.glGetUniformLocation(this.f84695i, "uMVPMatrix");
                    m105190b("glGetUniformLocation uMVPMatrix");
                    if (this.f84697k != -1) {
                        this.f84698l = GLES20.glGetUniformLocation(this.f84695i, "uSTMatrix");
                        m105190b("glGetUniformLocation uSTMatrix");
                        if (this.f84698l != -1) {
                            m105192c();
                            return;
                        }
                        throw new RuntimeException("Could not get attrib location for uSTMatrix");
                    }
                    throw new RuntimeException("Could not get attrib location for uMVPMatrix");
                }
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    /* renamed from: b */
    private static float[] m105191b(float f, float f2, float f3, float f4) {
        float f5 = (f * 2.0f) - 4.0f;
        float f6 = (f4 * 2.0f) - 4.0f;
        float f7 = 1.0f - (f3 * 2.0f);
        float f8 = 1.0f - (f2 * 2.0f);
        return new float[]{f5, f6, 0.0f, 0.5f, 0.0f, f7, f6, 0.0f, 1.0f, 0.0f, f5, f8, 0.0f, 0.5f, 1.0f, f7, f8, 0.0f, 1.0f, 1.0f};
    }

    /* renamed from: c */
    private static float[] m105193c(float f, float f2, float f3, float f4) {
        float f5 = (f / 2.0f) + 0.5f;
        float f6 = f4 + 0.0f;
        float f7 = 1.0f - (f3 / 2.0f);
        float f8 = 1.0f - f2;
        return new float[]{-1.0f, -1.0f, 0.0f, f5, f6, 1.0f, -1.0f, 0.0f, f7, f6, -1.0f, 1.0f, 0.0f, f5, f8, 1.0f, 1.0f, 0.0f, f7, f8};
    }

    /* renamed from: a */
    public final void mo83712a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8 = 0.0f;
        if (f > 0.0f && f2 > 0.0f && f3 > 0.0f && f4 > 0.0f) {
            float f9 = f / f2;
            float f10 = f3 / f4;
            if (f9 > f10) {
                f5 = (1.0f - (f2 / (f / f10))) / 2.0f;
                f6 = 0.0f;
            } else {
                f6 = (1.0f - (f / (f2 * f10))) / 2.0f;
                f5 = 0.0f;
            }
            switch (this.f84706u) {
                case ScaleToFill:
                    this.f84688b = m105193c(0.0f, 0.0f, 0.0f, 0.0f);
                    break;
                case ScaleAspectFitCenter:
                    if (f9 > f10) {
                        f7 = (1.0f - ((f2 * f10) / f)) / 2.0f;
                    } else {
                        f8 = (1.0f - ((f / f10) / f2)) / 2.0f;
                        f7 = 0.0f;
                    }
                    this.f84688b = m105191b(f7, f8, f7, f8);
                    break;
                case ScaleAspectFill:
                    this.f84688b = m105193c(f6, f5, f6, f5);
                    break;
                case TopFill:
                    this.f84688b = m105193c(f6, 0.0f, f6, f5 * 2.0f);
                    break;
                case BottomFill:
                    this.f84688b = m105193c(f6, f5 * 2.0f, f6, 0.0f);
                    break;
                case LeftFill:
                    this.f84688b = m105193c(0.0f, f5, f6 * 2.0f, f5);
                    break;
                case RightFill:
                    this.f84688b = m105193c(f6 * 2.0f, f5, 0.0f, f5);
                    break;
                case TopFit:
                    this.f84688b = m105191b(0.0f, 0.0f, 0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f);
                    break;
                case BottomFit:
                    this.f84688b = m105191b(0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f, 0.0f, 0.0f);
                    break;
                case LeftFit:
                    this.f84688b = m105191b(0.0f, 0.0f, ((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f);
                    break;
                case RightFit:
                    this.f84688b = m105191b(((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f, 0.0f, 0.0f);
                    break;
            }
            this.f84689c = ByteBuffer.allocateDirect(this.f84688b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f84689c.put(this.f84688b).position(0);
        }
    }
}
