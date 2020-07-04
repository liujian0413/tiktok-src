package com.p280ss.android.vesdk;

import android.content.Context;
import android.content.res.AssetManager;
import android.media.MediaCodec.BufferInfo;
import android.opengl.GLES20;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.p874g.C19555b;
import com.p280ss.android.p874g.C19559c;
import com.p280ss.android.p874g.C19560d;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import com.p280ss.android.ugc.aweme.feed.monitor.C28539a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.vesdk.VEBenchmark */
public class VEBenchmark {

    /* renamed from: b */
    private static volatile VEBenchmark f116098b;

    /* renamed from: a */
    public boolean f116099a = false;

    /* renamed from: c */
    private long f116100c;

    /* renamed from: d */
    private HashMap<String, String[]> f116101d = new HashMap<>();

    /* renamed from: e */
    private HashMap<String, String> f116102e = new HashMap<>();

    /* renamed from: f */
    private VEPerformanceUtils f116103f = new VEPerformanceUtils("VEBenchmark");

    static {
        TENativeLibsLoader.m67986c();
    }

    private native int embossProcessGPU(long j);

    private native int faceBeauty(long j);

    private native int faceDetection(long j);

    private native int gaussianBlurCPU(long j);

    private native int gaussianBlurGPU(long j);

    private native int histogramEqualization(long j);

    private native int memCopy(long j);

    private native int nativeClearCLInfo(long j);

    private native long nativeCreateHandler();

    private native int nativeDecodePNG(long j);

    private native int nativeDecodeVideo(long j, String str, String str2);

    private native int nativeDestroy(long j);

    private native int nativeEGLGetConfigAttrib(long j, int i);

    private native String nativeEGLQueryString(long j, int i);

    private native String nativeGLQueryString(long j, int i);

    private native Map<String, String> nativeGetALlCLInfo(long j);

    private native String nativeGetCLInfo(long j, int i, int i2, String str);

    private native int nativeInit(long j, AssetManager assetManager, String str);

    private native int nativeInitOpenCL(long j);

    private VEBenchmark() {
    }

    /* renamed from: a */
    public static VEBenchmark m142412a() {
        if (f116098b == null) {
            synchronized (VEBenchmark.class) {
                if (f116098b == null) {
                    f116098b = new VEBenchmark();
                }
            }
        }
        return f116098b;
    }

    /* renamed from: d */
    public final int mo107780d() {
        this.f116103f.mo108047a();
        if (!this.f116099a) {
            return -108;
        }
        int nativeInitOpenCL = nativeInitOpenCL(this.f116100c);
        this.f116103f.mo108046a("initOpenCL");
        return nativeInitOpenCL;
    }

    /* renamed from: e */
    public final int mo107782e() {
        this.f116103f.mo108047a();
        if (!this.f116099a) {
            return -108;
        }
        int nativeClearCLInfo = nativeClearCLInfo(this.f116100c);
        this.f116103f.mo108046a("clearCLInfo");
        return nativeClearCLInfo;
    }

    /* renamed from: f */
    public final Map<String, String> mo107785f() {
        this.f116103f.mo108047a();
        if (!this.f116099a) {
            return new HashMap();
        }
        Map<String, String> nativeGetALlCLInfo = nativeGetALlCLInfo(this.f116100c);
        this.f116103f.mo108046a("clearCLInfo");
        return nativeGetALlCLInfo;
    }

    /* renamed from: b */
    public final synchronized int mo107775b() {
        this.f116103f.mo108047a();
        if (!this.f116099a && this.f116100c == 0) {
            return 0;
        }
        this.f116099a = false;
        int nativeDestroy = nativeDestroy(this.f116100c);
        this.f116103f.mo108046a("destroy");
        return nativeDestroy;
    }

    /* renamed from: c */
    public final HashMap<String, String> mo107779c() {
        this.f116103f.mo108047a();
        if (!this.f116099a) {
            return null;
        }
        if (this.f116102e.size() <= 0) {
            this.f116102e.put("GL_VENDOR", GLES20.glGetString(7936));
            this.f116102e.put("GL_VERSION", GLES20.glGetString(7938));
            this.f116102e.put("GL_RENDERER", GLES20.glGetString(7937));
            this.f116102e.put("GL_EXTENSIONS", GLES20.glGetString(7939));
            this.f116102e.put("EGL_VENDOR", nativeEGLQueryString(this.f116100c, 12371));
            String nativeEGLQueryString = nativeEGLQueryString(this.f116100c, 12372);
            this.f116102e.put("EGL_VERSION", nativeEGLQueryString);
            if (nativeEGLQueryString != null && nativeEGLQueryString.length() > 0 && nativeEGLQueryString.startsWith("EGL_VERSION : 1.4")) {
                this.f116102e.put("EGL_CLIENT", nativeEGLQueryString(this.f116100c, 12429));
            }
            this.f116102e.put("EGL_EXTENSIONS", nativeEGLQueryString(this.f116100c, 12373));
            this.f116102e.put("EGL_ALPHA_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12321)));
            this.f116102e.put("EGL_ALPHA_MASK_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12350)));
            this.f116102e.put("EGL_BUFFER_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12320)));
            this.f116102e.put("EGL_COLOR_BUFFER_TYPE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12351)));
            this.f116102e.put("EGL_DEPTH_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12325)));
            this.f116102e.put("EGL_HEIGHT", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12374)));
            this.f116102e.put("EGL_WIDTH", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12375)));
            this.f116102e.put("EGL_HORIZONTAL_RESOLUTION", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12432)));
            this.f116102e.put("EGL_VERTICAL_RESOLUTION", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12433)));
            this.f116102e.put("EGL_LARGEST_PBUFFER", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12376)));
            this.f116102e.put("EGL_LEVEL", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12329)));
            this.f116102e.put("EGL_LUMINANCE_BUFFER", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12431)));
            this.f116102e.put("EGL_LUMINANCE_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12349)));
            this.f116102e.put("EGL_MAX_PBUFFER_HEIGHT", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12330)));
            this.f116102e.put("EGL_MAX_PBUFFER_WIDTH", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12332)));
            this.f116102e.put("EGL_MAX_PBUFFER_PIXELS", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12331)));
            this.f116102e.put("EGL_NATIVE_RENDERABLE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12333)));
            this.f116102e.put("EGL_PBUFFER_BIT", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 1)));
            this.f116102e.put("EGL_PIXEL_ASPECT_RATIO", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12434)));
            this.f116102e.put("EGL_PIXMAP_BIT", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 2)));
            this.f116102e.put("EGL_RED_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12324)));
            this.f116102e.put("EGL_GREEN_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12323)));
            this.f116102e.put("EGL_BLUE_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12322)));
            this.f116102e.put("EGL_RENDERABLE_TYPE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12352)));
            this.f116102e.put("EGL_RENDER_BUFFER", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12422)));
            this.f116102e.put("EGL_RGB_BUFFER", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12430)));
            this.f116102e.put("EGL_SAMPLES", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12337)));
            this.f116102e.put("EGL_SAMPLE_BUFFERS", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12338)));
            this.f116102e.put("EGL_STENCIL_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12326)));
            this.f116102e.put("EGL_SURFACE_TYPE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12339)));
            this.f116102e.put("EGL_TRANSPARENT_TYPE", String.valueOf(nativeEGLGetConfigAttrib(this.f116100c, 12340)));
        }
        this.f116103f.mo108046a("getGPUInfo");
        return this.f116102e;
    }

    /* renamed from: a */
    public final int mo107771a(int i) {
        this.f116103f.mo108047a();
        if (!this.f116099a) {
            return -105;
        }
        if (i < 0) {
            i = 1;
        }
        StringBuilder sb = new StringBuilder("runFaceDetection: times = ");
        sb.append(i);
        C45372t.m143405b("VEBenchmark", sb.toString());
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = faceDetection(this.f116100c);
            if (i2 < 0) {
                break;
            }
        }
        this.f116103f.mo108046a("runFaceDetection");
        return i2;
    }

    /* renamed from: c */
    public final int mo107778c(int i) {
        this.f116103f.mo108047a();
        if (i < 0) {
            i = 1;
        }
        StringBuilder sb = new StringBuilder("runHistogramEqualization: times = ");
        sb.append(i);
        C45372t.m143405b("VEBenchmark", sb.toString());
        for (int i2 = 0; i2 < i; i2++) {
            histogramEqualization(this.f116100c);
        }
        this.f116103f.mo108046a("runHistogramEqualization");
        return 0;
    }

    /* renamed from: d */
    public final synchronized int mo107781d(int i) {
        int i2;
        this.f116103f.mo108047a();
        if (i < 0) {
            i = 1;
        }
        StringBuilder sb = new StringBuilder("runDecodePNG: times = ");
        sb.append(i);
        C45372t.m143405b("VEBenchmark", sb.toString());
        i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = nativeDecodePNG(this.f116100c);
            if (i2 != 0) {
                break;
            }
        }
        this.f116103f.mo108046a("runDecodePNG");
        return i2;
    }

    /* renamed from: e */
    public final int mo107783e(int i) {
        this.f116103f.mo108047a();
        if (i < 0) {
            i = 1;
        }
        StringBuilder sb = new StringBuilder("runFaceBeauty: times = ");
        sb.append(i);
        C45372t.m143405b("VEBenchmark", sb.toString());
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = faceBeauty(this.f116100c);
            if (i2 != 0) {
                break;
            }
        }
        this.f116103f.mo108046a("runFaceBeauty");
        return i2;
    }

    /* renamed from: f */
    public final int mo107784f(int i) {
        this.f116103f.mo108047a();
        if (i < 0) {
            i = 1;
        }
        StringBuilder sb = new StringBuilder("runEmbossProcessGPU: times = ");
        sb.append(i);
        C45372t.m143405b("VEBenchmark", sb.toString());
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = embossProcessGPU(this.f116100c);
            if (i2 != 0) {
                break;
            }
        }
        this.f116103f.mo108046a("runEmbossProcessGPU");
        return i2;
    }

    /* renamed from: g */
    public final int mo107786g(int i) {
        this.f116103f.mo108047a();
        if (i < 0) {
            i = 1;
        }
        StringBuilder sb = new StringBuilder("runGaussianBlurGPU: times = ");
        sb.append(i);
        C45372t.m143405b("VEBenchmark", sb.toString());
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = gaussianBlurGPU(this.f116100c);
            if (i2 != 0) {
                break;
            }
        }
        this.f116103f.mo108046a("runGaussianBlurGPU");
        return i2;
    }

    /* renamed from: h */
    public final int mo107787h(int i) {
        this.f116103f.mo108047a();
        if (i < 0) {
            i = 1;
        }
        StringBuilder sb = new StringBuilder("runFaceBeauty: times = ");
        sb.append(i);
        C45372t.m143405b("VEBenchmark", sb.toString());
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = memCopy(this.f116100c);
            if (i2 != 0) {
                break;
            }
        }
        this.f116103f.mo108046a("runMemCopy");
        return i2;
    }

    /* renamed from: b */
    public final int mo107776b(int i) {
        this.f116103f.mo108047a();
        if (i < 0) {
            i = 1;
        }
        StringBuilder sb = new StringBuilder("runGaussianBlurCPU: times = ");
        sb.append(i);
        C45372t.m143405b("VEBenchmark", sb.toString());
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = gaussianBlurCPU(this.f116100c);
            if (i2 != 0) {
                break;
            }
        }
        this.f116103f.mo108046a("runGaussianBlurCPU");
        return i2;
    }

    /* renamed from: a */
    public final synchronized int mo107772a(Context context, String str) {
        this.f116103f.mo108047a();
        if (!this.f116099a) {
            if (!TextUtils.isEmpty(str)) {
                if (context != null) {
                    if (TENativeLibsLoader.m67979a() < 0) {
                        return -108;
                    }
                    this.f116100c = nativeCreateHandler();
                    if (this.f116100c == 0) {
                        return -112;
                    }
                    int nativeInit = nativeInit(this.f116100c, context.getAssets(), str);
                    if (nativeInit != 0) {
                        return nativeInit;
                    }
                    this.f116099a = true;
                }
            }
            return -100;
        }
        this.f116103f.mo108046a("init");
        return 0;
    }

    /* renamed from: b */
    public final synchronized int mo107777b(String str, String str2) {
        this.f116103f.mo108047a();
        if (!this.f116099a) {
            return -105;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        if (!new File(str).exists()) {
            return -100;
        }
        int execFFmpegCommand = VEUtils.execFFmpegCommand(C1642a.m8035a(Locale.US, "ffmpeg -s 720X1280 -pix_fmt yuv420p -i %s -vcodec h264 %s", new Object[]{str, str2}), null);
        this.f116103f.mo108046a("runEncodeVideo");
        return execFFmpegCommand;
    }

    /* renamed from: a */
    public final synchronized int mo107774a(String str, String str2) {
        this.f116103f.mo108047a();
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        if (!new File(str).exists()) {
            return -100;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        int nativeDecodeVideo = nativeDecodeVideo(this.f116100c, str, str2);
        this.f116103f.mo108046a("runDecodeVideo");
        return nativeDecodeVideo;
    }

    /* renamed from: a */
    public final synchronized int mo107773a(String str, int i, int i2, String str2) {
        this.f116103f.mo108047a();
        if (!this.f116099a) {
            return -105;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        if (!new File(str).exists()) {
            return -100;
        }
        C19555b a = C19555b.m64430a();
        int a2 = a.mo51693a(720, 1280, 4000000, false);
        if (a2 < 0) {
            return a2;
        }
        C19560d dVar = new C19560d(str2, a);
        a.mo51696b();
        System.currentTimeMillis();
        Object obj = new Object();
        final String str3 = str;
        final C19555b bVar = a;
        C451711 r0 = new Runnable(720, 1280) {

            /* renamed from: a */
            int f116104a;

            /* renamed from: b */
            int f116105b;

            /* renamed from: c */
            int f116106c = 30;

            public final void run() {
                try {
                    FileInputStream fileInputStream = new FileInputStream(str3);
                    int i = ((720 * 1280) * 3) / 2;
                    byte[] bArr = new byte[i];
                    boolean z = true;
                    int i2 = 0;
                    while (VEBenchmark.this.f116099a) {
                        if (z) {
                            i2 = fileInputStream.read(bArr, 0, i);
                        }
                        if (i2 <= 0) {
                            break;
                        }
                        this.f116105b = (this.f116104a * C28539a.f75176k) / this.f116106c;
                        if (bVar.mo51694a(bArr, (long) this.f116105b, false) < 0) {
                            Thread.sleep(60);
                            z = false;
                        } else {
                            this.f116104a++;
                            z = true;
                        }
                    }
                    this.f116105b = (this.f116104a * C28539a.f75176k) / this.f116106c;
                    StringBuilder sb = new StringBuilder("inputFrames: ");
                    sb.append(this.f116104a);
                    C45372t.m143405b("VEBenchmark", sb.toString());
                    bVar.mo51694a(bArr, (long) this.f116105b, true);
                    fileInputStream.close();
                } catch (InterruptedException unused) {
                } catch (IOException unused2) {
                }
            }
        };
        Thread thread = new Thread(r0);
        final C19555b bVar2 = a;
        final C19560d dVar2 = dVar;
        final Object obj2 = obj;
        C451722 r02 = new Runnable(720, 1280) {

            /* renamed from: a */
            BufferInfo f116112a = new BufferInfo();

            /* renamed from: b */
            ByteBuffer f116113b = ByteBuffer.allocate(((720 * 1280) * 3) / 2);

            /* renamed from: c */
            int f116114c = -1;

            public final void run() {
                while (VEBenchmark.this.f116099a) {
                    try {
                        if (this.f116114c != -1) {
                            C19559c e = bVar2.mo51699e();
                            if (e == null) {
                                Thread.sleep(50);
                            } else {
                                this.f116112a.presentationTimeUs = e.f52922b;
                                this.f116112a.offset = 0;
                                if (e.f52924d == 1) {
                                    BufferInfo bufferInfo = this.f116112a;
                                    bufferInfo.flags = 1 | bufferInfo.flags;
                                }
                                if (e.f52925e) {
                                    this.f116112a.flags |= 4;
                                    this.f116112a.size = 0;
                                    this.f116113b.clear();
                                } else {
                                    this.f116113b.clear();
                                    this.f116113b.put(e.f52921a);
                                    this.f116113b.position(0);
                                    this.f116113b.limit(e.f52921a.length);
                                    this.f116112a.size = e.f52921a.length;
                                }
                                dVar2.mo51707a(this.f116113b, this.f116112a);
                                if (e.f52925e) {
                                    bVar2.mo51697c();
                                    dVar2.mo51708b();
                                    bVar2.mo51698d();
                                    dVar2.mo51709c();
                                    synchronized (obj2) {
                                        obj2.notifyAll();
                                    }
                                    return;
                                }
                                continue;
                            }
                        } else if (bVar2.f52900j == null) {
                            Thread.sleep(50);
                        } else {
                            this.f116114c = dVar2.mo51705a(bVar2.f52900j);
                            dVar2.mo51706a();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        };
        Thread thread2 = new Thread(r02);
        thread.start();
        thread2.start();
        try {
            synchronized (obj) {
                obj.wait();
            }
            this.f116103f.mo108046a("runHWEncodeVideo");
            return a2;
        } catch (InterruptedException e) {
            String str4 = "VEBenchmark";
            StringBuilder sb = new StringBuilder("thread wait is error: ");
            sb.append(e.getMessage());
            C45372t.m143409d(str4, sb.toString());
            return -1;
        }
    }
}
