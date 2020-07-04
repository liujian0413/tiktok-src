package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@C6505uv
public final class aii extends Thread implements OnFrameAvailableListener, aih {

    /* renamed from: a */
    private static final float[] f40283a = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private volatile boolean f40284A;

    /* renamed from: B */
    private volatile boolean f40285B;

    /* renamed from: b */
    private final aif f40286b;

    /* renamed from: c */
    private final float[] f40287c;

    /* renamed from: d */
    private final float[] f40288d;

    /* renamed from: e */
    private final float[] f40289e;

    /* renamed from: f */
    private final float[] f40290f;

    /* renamed from: g */
    private final float[] f40291g;

    /* renamed from: h */
    private final float[] f40292h;

    /* renamed from: i */
    private final float[] f40293i;

    /* renamed from: j */
    private float f40294j;

    /* renamed from: k */
    private float f40295k;

    /* renamed from: l */
    private float f40296l;

    /* renamed from: m */
    private int f40297m;

    /* renamed from: n */
    private int f40298n;

    /* renamed from: o */
    private SurfaceTexture f40299o;

    /* renamed from: p */
    private SurfaceTexture f40300p;

    /* renamed from: q */
    private int f40301q;

    /* renamed from: r */
    private int f40302r;

    /* renamed from: s */
    private int f40303s;

    /* renamed from: t */
    private FloatBuffer f40304t = ByteBuffer.allocateDirect(f40283a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();

    /* renamed from: u */
    private final CountDownLatch f40305u;

    /* renamed from: v */
    private final Object f40306v;

    /* renamed from: w */
    private EGL10 f40307w;

    /* renamed from: x */
    private EGLDisplay f40308x;

    /* renamed from: y */
    private EGLContext f40309y;

    /* renamed from: z */
    private EGLSurface f40310z;

    public aii(Context context) {
        super("SphericalVideoProcessor");
        this.f40304t.put(f40283a).position(0);
        this.f40287c = new float[9];
        this.f40288d = new float[9];
        this.f40289e = new float[9];
        this.f40290f = new float[9];
        this.f40291g = new float[9];
        this.f40292h = new float[9];
        this.f40293i = new float[9];
        this.f40294j = Float.NaN;
        this.f40286b = new aif(context);
        this.f40286b.f40275a = this;
        this.f40305u = new CountDownLatch(1);
        this.f40306v = new Object();
    }

    /* renamed from: a */
    public final void mo39453a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f40298n = i;
        this.f40297m = i2;
        this.f40300p = surfaceTexture;
    }

    /* renamed from: a */
    public final void mo39452a(int i, int i2) {
        synchronized (this.f40306v) {
            this.f40298n = i;
            this.f40297m = i2;
            this.f40284A = true;
            this.f40306v.notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo39454b() {
        synchronized (this.f40306v) {
            this.f40285B = true;
            this.f40300p = null;
            this.f40306v.notifyAll();
        }
    }

    /* renamed from: c */
    public final SurfaceTexture mo39455c() {
        if (this.f40300p == null) {
            return null;
        }
        try {
            this.f40305u.await();
        } catch (InterruptedException unused) {
        }
        return this.f40299o;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f40303s++;
        synchronized (this.f40306v) {
            this.f40306v.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo39450a() {
        synchronized (this.f40306v) {
            this.f40306v.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d0 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            android.graphics.SurfaceTexture r0 = r14.f40300p
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.internal.ads.acd.m45779c(r0)
            java.util.concurrent.CountDownLatch r0 = r14.f40305u
            r0.countDown()
            return
        L_0x000f:
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r14.f40307w = r0
            javax.microedition.khronos.egl.EGL10 r0 = r14.f40307w
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r14.f40308x = r0
            javax.microedition.khronos.egl.EGLDisplay r0 = r14.f40308x
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != r1) goto L_0x002f
        L_0x002c:
            r0 = 0
            goto L_0x00a4
        L_0x002f:
            int[] r0 = new int[r3]
            javax.microedition.khronos.egl.EGL10 r1 = r14.f40307w
            javax.microedition.khronos.egl.EGLDisplay r7 = r14.f40308x
            boolean r0 = r1.eglInitialize(r7, r0)
            if (r0 != 0) goto L_0x003c
            goto L_0x002c
        L_0x003c:
            int[] r0 = new int[r5]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r7 = 11
            int[] r9 = new int[r7]
            r9 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r14.f40307w
            javax.microedition.khronos.egl.EGLDisplay r8 = r14.f40308x
            r11 = 1
            r10 = r1
            r12 = r0
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x005b
            r0 = r0[r6]
            if (r0 <= 0) goto L_0x005b
            r0 = r1[r6]
            goto L_0x005c
        L_0x005b:
            r0 = r4
        L_0x005c:
            if (r0 != 0) goto L_0x005f
            goto L_0x002c
        L_0x005f:
            int[] r1 = new int[r2]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r14.f40307w
            javax.microedition.khronos.egl.EGLDisplay r8 = r14.f40308x
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r7.eglCreateContext(r8, r0, r9, r1)
            r14.f40309y = r1
            javax.microedition.khronos.egl.EGLContext r1 = r14.f40309y
            if (r1 == 0) goto L_0x002c
            javax.microedition.khronos.egl.EGLContext r1 = r14.f40309y
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r7) goto L_0x007b
            goto L_0x002c
        L_0x007b:
            javax.microedition.khronos.egl.EGL10 r1 = r14.f40307w
            javax.microedition.khronos.egl.EGLDisplay r7 = r14.f40308x
            android.graphics.SurfaceTexture r8 = r14.f40300p
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r7, r0, r8, r4)
            r14.f40310z = r0
            javax.microedition.khronos.egl.EGLSurface r0 = r14.f40310z
            if (r0 == 0) goto L_0x002c
            javax.microedition.khronos.egl.EGLSurface r0 = r14.f40310z
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x0092
            goto L_0x002c
        L_0x0092:
            javax.microedition.khronos.egl.EGL10 r0 = r14.f40307w
            javax.microedition.khronos.egl.EGLDisplay r1 = r14.f40308x
            javax.microedition.khronos.egl.EGLSurface r7 = r14.f40310z
            javax.microedition.khronos.egl.EGLSurface r8 = r14.f40310z
            javax.microedition.khronos.egl.EGLContext r9 = r14.f40309y
            boolean r0 = r0.eglMakeCurrent(r1, r7, r8, r9)
            if (r0 != 0) goto L_0x00a3
            goto L_0x002c
        L_0x00a3:
            r0 = 1
        L_0x00a4:
            r1 = 35633(0x8b31, float:4.9932E-41)
            com.google.android.gms.internal.ads.bl<java.lang.String> r7 = com.google.android.gms.internal.ads.C15585bw.f43835bc
            com.google.android.gms.internal.ads.bt r8 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r8 = r8.mo41272a(r7)
            java.lang.String r8 = (java.lang.String) r8
            T r9 = r7.f42435c
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00c6
            com.google.android.gms.internal.ads.bt r8 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r7 = r8.mo41272a(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00c8
        L_0x00c6:
            java.lang.String r7 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00c8:
            int r1 = m45975a(r1, r7)
            if (r1 != 0) goto L_0x00d0
        L_0x00ce:
            r8 = 0
            goto L_0x0140
        L_0x00d0:
            r7 = 35632(0x8b30, float:4.9931E-41)
            com.google.android.gms.internal.ads.bl<java.lang.String> r8 = com.google.android.gms.internal.ads.C15585bw.f43836bd
            com.google.android.gms.internal.ads.bt r9 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r9 = r9.mo41272a(r8)
            java.lang.String r9 = (java.lang.String) r9
            T r10 = r8.f42435c
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00f2
            com.google.android.gms.internal.ads.bt r9 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r8 = r9.mo41272a(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00f4
        L_0x00f2:
            java.lang.String r8 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00f4:
            int r7 = m45975a(r7, r8)
            if (r7 != 0) goto L_0x00fb
            goto L_0x00ce
        L_0x00fb:
            int r8 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r9 = "createProgram"
            m45976a(r9)
            if (r8 == 0) goto L_0x0140
            android.opengl.GLES20.glAttachShader(r8, r1)
            java.lang.String r1 = "attachShader"
            m45976a(r1)
            android.opengl.GLES20.glAttachShader(r8, r7)
            java.lang.String r1 = "attachShader"
            m45976a(r1)
            android.opengl.GLES20.glLinkProgram(r8)
            java.lang.String r1 = "linkProgram"
            m45976a(r1)
            int[] r1 = new int[r5]
            r7 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r8, r7, r1, r6)
            java.lang.String r7 = "getProgramiv"
            m45976a(r7)
            r1 = r1[r6]
            if (r1 == r5) goto L_0x0138
            android.opengl.GLES20.glDeleteProgram(r8)
            java.lang.String r1 = "deleteProgram"
            m45976a(r1)
            goto L_0x00ce
        L_0x0138:
            android.opengl.GLES20.glValidateProgram(r8)
            java.lang.String r1 = "validateProgram"
            m45976a(r1)
        L_0x0140:
            r14.f40301q = r8
            int r1 = r14.f40301q
            android.opengl.GLES20.glUseProgram(r1)
            java.lang.String r1 = "useProgram"
            m45976a(r1)
            int r1 = r14.f40301q
            java.lang.String r7 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r7)
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r12 = 12
            java.nio.FloatBuffer r13 = r14.f40304t
            r8 = r1
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "vertexAttribPointer"
            m45976a(r7)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            m45976a(r1)
            int[] r1 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r1, r6)
            java.lang.String r7 = "genTextures"
            m45976a(r7)
            r1 = r1[r6]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r1)
            java.lang.String r8 = "bindTextures"
            m45976a(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m45976a(r8)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m45976a(r8)
            r8 = 10242(0x2802, float:1.4352E-41)
            r9 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m45976a(r8)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r7 = "texParameteri"
            m45976a(r7)
            int r7 = r14.f40301q
            java.lang.String r8 = "uVMat"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)
            r14.f40302r = r7
            r7 = 9
            float[] r7 = new float[r7]
            r7 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            int r8 = r14.f40302r
            android.opengl.GLES20.glUniformMatrix3fv(r8, r5, r6, r7, r6)
            int r7 = r14.f40301q
            if (r7 == 0) goto L_0x01cd
            r7 = 1
            goto L_0x01ce
        L_0x01cd:
            r7 = 0
        L_0x01ce:
            if (r0 == 0) goto L_0x038a
            if (r7 != 0) goto L_0x01d4
            goto L_0x038a
        L_0x01d4:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r14.f40299o = r0
            android.graphics.SurfaceTexture r0 = r14.f40299o
            r0.setOnFrameAvailableListener(r14)
            java.util.concurrent.CountDownLatch r0 = r14.f40305u
            r0.countDown()
            com.google.android.gms.internal.ads.aif r0 = r14.f40286b
            r0.mo39444a()
            r14.f40284A = r5     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
        L_0x01ec:
            boolean r0 = r14.f40285B     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            if (r0 != 0) goto L_0x0334
        L_0x01f0:
            int r0 = r14.f40303s     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            if (r0 <= 0) goto L_0x01ff
            android.graphics.SurfaceTexture r0 = r14.f40299o     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            int r0 = r14.f40303s     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            int r0 = r0 - r5
            r14.f40303s = r0     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            goto L_0x01f0
        L_0x01ff:
            com.google.android.gms.internal.ads.aif r0 = r14.f40286b     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r1 = r14.f40287c     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            boolean r0 = r0.mo39445a(r1)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r1 = 5
            r7 = 4
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            if (r0 == 0) goto L_0x027f
            float r0 = r14.f40294j     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            if (r0 == 0) goto L_0x0274
            float[] r0 = r14.f40287c     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r9 = new float[r2]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r9 = {0, 1065353216, 0} // fill-array     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r10 = new float[r2]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r11 = r0[r6]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r11 = r11 * r12
            r12 = r0[r5]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r3]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r13 = r9[r3]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r11 = r0[r2]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r11 = r11 * r12
            r12 = r0[r7]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r1]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r13 = r9[r3]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r5] = r11     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r11 = 6
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r11 = r11 * r12
            r12 = 7
            r12 = r0[r12]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = 8
            r0 = r0[r12]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r9 = r9[r3]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r0 = r0 * r9
            float r11 = r11 + r0
            r10[r3] = r11     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r0 = r10[r5]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            double r11 = (double) r0     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r0 = r10[r6]     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            double r9 = (double) r0     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r0 = (float) r9     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r0 = r0 - r8
            float r0 = -r0
            r14.f40294j = r0     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
        L_0x0274:
            float[] r0 = r14.f40292h     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r9 = r14.f40294j     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r10 = r14.f40295k     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r9 = r9 + r10
            m45979b(r0, r9)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            goto L_0x028e
        L_0x027f:
            float[] r0 = r14.f40287c     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r9 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            m45977a(r0, r9)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r0 = r14.f40292h     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r9 = r14.f40295k     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            m45979b(r0, r9)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
        L_0x028e:
            float[] r0 = r14.f40288d     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            m45977a(r0, r8)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r0 = r14.f40289e     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r8 = r14.f40292h     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r9 = r14.f40288d     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            m45978a(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r0 = r14.f40290f     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r8 = r14.f40287c     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r9 = r14.f40289e     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            m45978a(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r0 = r14.f40291g     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r8 = r14.f40296l     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            m45977a(r0, r8)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r0 = r14.f40293i     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r8 = r14.f40291g     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r9 = r14.f40290f     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            m45978a(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            int r0 = r14.f40302r     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float[] r8 = r14.f40293i     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r8, r6)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            android.opengl.GLES20.glDrawArrays(r1, r6, r7)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            java.lang.String r0 = "drawArrays"
            m45976a(r0)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            javax.microedition.khronos.egl.EGL10 r0 = r14.f40307w     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            javax.microedition.khronos.egl.EGLDisplay r1 = r14.f40308x     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            javax.microedition.khronos.egl.EGLSurface r7 = r14.f40310z     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r0.eglSwapBuffers(r1, r7)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            boolean r0 = r14.f40284A     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            if (r0 == 0) goto L_0x031a
            int r0 = r14.f40298n     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            int r1 = r14.f40297m     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            android.opengl.GLES20.glViewport(r6, r6, r0, r1)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            java.lang.String r0 = "viewport"
            m45976a(r0)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            int r0 = r14.f40301q     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            int r1 = r14.f40301q     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            java.lang.String r7 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r7)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            int r7 = r14.f40298n     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            int r8 = r14.f40297m     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r7 <= r8) goto L_0x0309
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            int r0 = r14.f40297m     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r0 = r0 * r9
            int r7 = r14.f40298n     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r0 = r0 / r7
            android.opengl.GLES20.glUniform1f(r1, r0)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            goto L_0x0318
        L_0x0309:
            int r7 = r14.f40298n     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r7 = r7 * r9
            int r8 = r14.f40297m     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            float r7 = r7 / r8
            android.opengl.GLES20.glUniform1f(r0, r7)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
        L_0x0318:
            r14.f40284A = r6     // Catch:{ IllegalStateException -> 0x0365, Throwable -> 0x0346 }
        L_0x031a:
            java.lang.Object r0 = r14.f40306v     // Catch:{ InterruptedException -> 0x01ec }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x01ec }
            boolean r1 = r14.f40285B     // Catch:{ all -> 0x0331 }
            if (r1 != 0) goto L_0x032e
            boolean r1 = r14.f40284A     // Catch:{ all -> 0x0331 }
            if (r1 != 0) goto L_0x032e
            int r1 = r14.f40303s     // Catch:{ all -> 0x0331 }
            if (r1 != 0) goto L_0x032e
            java.lang.Object r1 = r14.f40306v     // Catch:{ all -> 0x0331 }
            r1.wait()     // Catch:{ all -> 0x0331 }
        L_0x032e:
            monitor-exit(r0)     // Catch:{ all -> 0x0331 }
            goto L_0x01ec
        L_0x0331:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0331 }
            throw r1     // Catch:{ InterruptedException -> 0x01ec }
        L_0x0334:
            com.google.android.gms.internal.ads.aif r0 = r14.f40286b
            r0.mo39446b()
            android.graphics.SurfaceTexture r0 = r14.f40299o
            r0.setOnFrameAvailableListener(r4)
            r14.f40299o = r4
            r14.m45980d()
            return
        L_0x0344:
            r0 = move-exception
            goto L_0x037a
        L_0x0346:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            com.google.android.gms.internal.ads.acd.m45778b(r1, r0)     // Catch:{ all -> 0x0344 }
            com.google.android.gms.internal.ads.abp r1 = com.google.android.gms.ads.internal.C14793ay.m42898d()     // Catch:{ all -> 0x0344 }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.mo39089a(r0, r2)     // Catch:{ all -> 0x0344 }
            com.google.android.gms.internal.ads.aif r0 = r14.f40286b
            r0.mo39446b()
            android.graphics.SurfaceTexture r0 = r14.f40299o
            r0.setOnFrameAvailableListener(r4)
            r14.f40299o = r4
            r14.m45980d()
            return
        L_0x0365:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            com.google.android.gms.internal.ads.acd.m45783e(r0)     // Catch:{ all -> 0x0344 }
            com.google.android.gms.internal.ads.aif r0 = r14.f40286b
            r0.mo39446b()
            android.graphics.SurfaceTexture r0 = r14.f40299o
            r0.setOnFrameAvailableListener(r4)
            r14.f40299o = r4
            r14.m45980d()
            return
        L_0x037a:
            com.google.android.gms.internal.ads.aif r1 = r14.f40286b
            r1.mo39446b()
            android.graphics.SurfaceTexture r1 = r14.f40299o
            r1.setOnFrameAvailableListener(r4)
            r14.f40299o = r4
            r14.m45980d()
            throw r0
        L_0x038a:
            javax.microedition.khronos.egl.EGL10 r0 = r14.f40307w
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r1 = "EGL initialization failed: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x03a5
            java.lang.String r0 = r1.concat(r0)
            goto L_0x03aa
        L_0x03a5:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x03aa:
            com.google.android.gms.internal.ads.acd.m45779c(r0)
            com.google.android.gms.internal.ads.abp r1 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.mo39089a(r2, r0)
            r14.m45980d()
            java.util.concurrent.CountDownLatch r0 = r14.f40305u
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aii.run():void");
    }

    /* renamed from: a */
    public final void mo39451a(float f, float f2) {
        float f3;
        float f4;
        if (this.f40298n > this.f40297m) {
            f4 = (f * 1.7453293f) / ((float) this.f40298n);
            f3 = (f2 * 1.7453293f) / ((float) this.f40298n);
        } else {
            f4 = (f * 1.7453293f) / ((float) this.f40297m);
            f3 = (f2 * 1.7453293f) / ((float) this.f40297m);
        }
        this.f40295k -= f4;
        this.f40296l -= f3;
        if (this.f40296l < -1.5707964f) {
            this.f40296l = -1.5707964f;
        }
        if (this.f40296l > 1.5707964f) {
            this.f40296l = 1.5707964f;
        }
    }

    /* renamed from: a */
    private static void m45978a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: a */
    private static void m45977a(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* renamed from: b */
    private static void m45979b(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: a */
    private static int m45975a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m45976a("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        m45976a("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        m45976a("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        m45976a("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glDeleteShader(glCreateShader);
        m45976a("deleteShader");
        return 0;
    }

    /* renamed from: d */
    private final boolean m45980d() {
        boolean z = false;
        if (!(this.f40310z == null || this.f40310z == EGL10.EGL_NO_SURFACE)) {
            EGL10 egl10 = this.f40307w;
            EGLDisplay eGLDisplay = this.f40308x;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            z = this.f40307w.eglDestroySurface(this.f40308x, this.f40310z) | egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT) | false;
            this.f40310z = null;
        }
        if (this.f40309y != null) {
            z |= this.f40307w.eglDestroyContext(this.f40308x, this.f40309y);
            this.f40309y = null;
        }
        if (this.f40308x == null) {
            return z;
        }
        boolean eglTerminate = z | this.f40307w.eglTerminate(this.f40308x);
        this.f40308x = null;
        return eglTerminate;
    }

    /* renamed from: a */
    private static void m45976a(String str) {
        GLES20.glGetError();
    }
}
