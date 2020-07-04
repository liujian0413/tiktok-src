package com.p280ss.android.medialib.image;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.ss.android.medialib.image.GLTextureView */
public class GLTextureView extends TextureView implements SurfaceTextureListener {

    /* renamed from: b */
    public static final C19735j f53488b = new C19735j();

    /* renamed from: a */
    SurfaceTexture f53489a;

    /* renamed from: c */
    public Renderer f53490c;

    /* renamed from: d */
    public C19730e f53491d;

    /* renamed from: e */
    public C19731f f53492e;

    /* renamed from: f */
    public C19732g f53493f;

    /* renamed from: g */
    public C19736k f53494g;

    /* renamed from: h */
    public int f53495h;

    /* renamed from: i */
    public int f53496i;

    /* renamed from: j */
    public boolean f53497j;

    /* renamed from: k */
    private final WeakReference<GLTextureView> f53498k = new WeakReference<>(this);

    /* renamed from: l */
    private C19734i f53499l;

    /* renamed from: m */
    private boolean f53500m;

    /* renamed from: com.ss.android.medialib.image.GLTextureView$a */
    abstract class C19726a implements C19730e {

        /* renamed from: a */
        protected int[] f53501a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract EGLConfig mo52455a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        /* renamed from: a */
        private int[] m65034a(int[] iArr) {
            if (GLTextureView.this.f53496i != 2) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[(length + 2)];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        public C19726a(int[] iArr) {
            this.f53501a = m65034a(iArr);
        }

        /* renamed from: a */
        public final EGLConfig mo52454a(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.f53501a, null, 0, iArr)) {
                int i = iArr[0];
                if (i > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i];
                    if (egl10.eglChooseConfig(eGLDisplay, this.f53501a, eGLConfigArr, i, iArr)) {
                        EGLConfig a = mo52455a(egl10, eGLDisplay, eGLConfigArr);
                        if (a != null) {
                            return a;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$b */
    class C19727b extends C19726a {

        /* renamed from: c */
        protected int f53503c = 8;

        /* renamed from: d */
        protected int f53504d = 8;

        /* renamed from: e */
        protected int f53505e = 8;

        /* renamed from: f */
        protected int f53506f = 0;

        /* renamed from: g */
        protected int f53507g;

        /* renamed from: h */
        protected int f53508h;

        /* renamed from: j */
        private int[] f53510j = new int[1];

        /* renamed from: a */
        public final EGLConfig mo52455a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                EGLConfig eGLConfig2 = eGLConfig;
                int a = m65037a(egl102, eGLDisplay2, eGLConfig2, 12325, 0);
                int a2 = m65037a(egl102, eGLDisplay2, eGLConfig2, 12326, 0);
                if (a >= this.f53507g && a2 >= this.f53508h) {
                    EGL10 egl103 = egl10;
                    EGLDisplay eGLDisplay3 = eGLDisplay;
                    EGLConfig eGLConfig3 = eGLConfig;
                    int a3 = m65037a(egl103, eGLDisplay3, eGLConfig3, 12324, 0);
                    int a4 = m65037a(egl103, eGLDisplay3, eGLConfig3, 12323, 0);
                    int a5 = m65037a(egl103, eGLDisplay3, eGLConfig3, 12322, 0);
                    int a6 = m65037a(egl103, eGLDisplay3, eGLConfig3, 12321, 0);
                    if (a3 == this.f53503c && a4 == this.f53504d && a5 == this.f53505e && a6 == this.f53506f) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        private int m65037a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f53510j)) {
                return this.f53510j[0];
            }
            return 0;
        }

        public C19727b(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, i5, 12326, 0, 12344});
            this.f53507g = i5;
            this.f53508h = 0;
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$c */
    class C19728c implements C19731f {

        /* renamed from: b */
        private int f53512b;

        private C19728c() {
            this.f53512b = 12440;
        }

        /* renamed from: a */
        public final void mo52457a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                C19733h.m65049a("eglDestroyContex", egl10.eglGetError());
            }
        }

        /* renamed from: a */
        public final EGLContext mo52456a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f53512b, GLTextureView.this.f53496i, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (GLTextureView.this.f53496i == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$d */
    static class C19729d implements C19732g {
        private C19729d() {
        }

        /* renamed from: a */
        public final void mo52459a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        /* renamed from: a */
        public final EGLSurface mo52458a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$e */
    public interface C19730e {
        /* renamed from: a */
        EGLConfig mo52454a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$f */
    public interface C19731f {
        /* renamed from: a */
        EGLContext mo52456a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        /* renamed from: a */
        void mo52457a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$g */
    public interface C19732g {
        /* renamed from: a */
        EGLSurface mo52458a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        /* renamed from: a */
        void mo52459a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$h */
    static class C19733h {

        /* renamed from: a */
        EGL10 f53513a;

        /* renamed from: b */
        EGLDisplay f53514b;

        /* renamed from: c */
        EGLSurface f53515c;

        /* renamed from: d */
        EGLConfig f53516d;

        /* renamed from: e */
        EGLContext f53517e;

        /* renamed from: f */
        private WeakReference<GLTextureView> f53518f;

        /* renamed from: e */
        public final void mo52464e() {
            m65051g();
        }

        /* renamed from: d */
        public final int mo52463d() {
            if (!this.f53513a.eglSwapBuffers(this.f53514b, this.f53515c)) {
                return this.f53513a.eglGetError();
            }
            return 12288;
        }

        /* renamed from: g */
        private void m65051g() {
            if (this.f53515c != null && this.f53515c != EGL10.EGL_NO_SURFACE) {
                EGL10 egl10 = this.f53513a;
                EGLDisplay eGLDisplay = this.f53514b;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                GLTextureView gLTextureView = (GLTextureView) this.f53518f.get();
                if (gLTextureView != null) {
                    gLTextureView.f53493f.mo52459a(this.f53513a, this.f53514b, this.f53515c);
                }
                this.f53515c = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final GL mo52462c() {
            GL gl = this.f53517e.getGL();
            GLTextureView gLTextureView = (GLTextureView) this.f53518f.get();
            if (gLTextureView == null) {
                return gl;
            }
            if (gLTextureView.f53494g != null) {
                gl = gLTextureView.f53494g.mo52484a(gl);
            }
            if ((gLTextureView.f53495h & 3) == 0) {
                return gl;
            }
            int i = 0;
            C19737l lVar = null;
            if ((gLTextureView.f53495h & 1) != 0) {
                i = 1;
            }
            if ((gLTextureView.f53495h & 2) != 0) {
                lVar = new C19737l();
            }
            return GLDebugHelper.wrap(gl, i, lVar);
        }

        /* renamed from: f */
        public final void mo52465f() {
            if (this.f53517e != null) {
                GLTextureView gLTextureView = (GLTextureView) this.f53518f.get();
                if (gLTextureView != null) {
                    gLTextureView.f53492e.mo52457a(this.f53513a, this.f53514b, this.f53517e);
                }
                this.f53517e = null;
            }
            if (this.f53514b != null) {
                this.f53513a.eglTerminate(this.f53514b);
                this.f53514b = null;
            }
        }

        /* renamed from: a */
        public final void mo52460a() {
            this.f53513a = (EGL10) EGLContext.getEGL();
            this.f53514b = this.f53513a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.f53514b != EGL10.EGL_NO_DISPLAY) {
                if (this.f53513a.eglInitialize(this.f53514b, new int[2])) {
                    GLTextureView gLTextureView = (GLTextureView) this.f53518f.get();
                    if (gLTextureView == null) {
                        this.f53516d = null;
                        this.f53517e = null;
                    } else {
                        this.f53516d = gLTextureView.f53491d.mo52454a(this.f53513a, this.f53514b);
                        this.f53517e = gLTextureView.f53492e.mo52456a(this.f53513a, this.f53514b, this.f53516d);
                    }
                    if (this.f53517e == null || this.f53517e == EGL10.EGL_NO_CONTEXT) {
                        this.f53517e = null;
                        m65048a("createContext");
                    }
                    this.f53515c = null;
                    return;
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }

        /* renamed from: b */
        public final boolean mo52461b() {
            if (this.f53513a == null) {
                throw new RuntimeException("egl not initialized");
            } else if (this.f53514b == null) {
                throw new RuntimeException("eglDisplay not initialized");
            } else if (this.f53516d != null) {
                m65051g();
                GLTextureView gLTextureView = (GLTextureView) this.f53518f.get();
                if (gLTextureView != null) {
                    this.f53515c = gLTextureView.f53493f.mo52458a(this.f53513a, this.f53514b, this.f53516d, gLTextureView.getSurfaceTexture());
                } else {
                    this.f53515c = null;
                }
                if (this.f53515c == null || this.f53515c == EGL10.EGL_NO_SURFACE) {
                    this.f53513a.eglGetError();
                    return false;
                } else if (this.f53513a.eglMakeCurrent(this.f53514b, this.f53515c, this.f53515c, this.f53517e)) {
                    return true;
                } else {
                    this.f53513a.eglGetError();
                    return false;
                }
            } else {
                throw new RuntimeException("mEglConfig not initialized");
            }
        }

        public C19733h(WeakReference<GLTextureView> weakReference) {
            this.f53518f = weakReference;
        }

        /* renamed from: a */
        private void m65048a(String str) {
            m65049a(str, this.f53513a.eglGetError());
        }

        /* renamed from: a */
        public static void m65049a(String str, int i) {
            throw new RuntimeException(m65050b(str, i));
        }

        /* renamed from: b */
        private static String m65050b(String str, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" failed");
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$i */
    static class C19734i extends Thread {

        /* renamed from: a */
        public boolean f53519a;

        /* renamed from: b */
        private boolean f53520b;

        /* renamed from: c */
        private boolean f53521c;

        /* renamed from: d */
        private boolean f53522d;

        /* renamed from: e */
        private boolean f53523e;

        /* renamed from: f */
        private boolean f53524f;

        /* renamed from: g */
        private boolean f53525g;

        /* renamed from: h */
        private boolean f53526h;

        /* renamed from: i */
        private boolean f53527i;

        /* renamed from: j */
        private boolean f53528j;

        /* renamed from: k */
        private boolean f53529k;

        /* renamed from: l */
        private int f53530l = 0;

        /* renamed from: m */
        private int f53531m = 0;

        /* renamed from: n */
        private int f53532n = 1;

        /* renamed from: o */
        private boolean f53533o = true;

        /* renamed from: p */
        private boolean f53534p;

        /* renamed from: q */
        private ArrayList<Runnable> f53535q = new ArrayList<>();

        /* renamed from: r */
        private boolean f53536r = true;

        /* renamed from: s */
        private C19733h f53537s;

        /* renamed from: t */
        private WeakReference<GLTextureView> f53538t;

        /* renamed from: i */
        private void m65058i() {
            if (this.f53527i) {
                this.f53527i = false;
                this.f53537s.mo52464e();
            }
        }

        /* renamed from: a */
        public final int mo52466a() {
            int i;
            synchronized (GLTextureView.f53488b) {
                i = this.f53532n;
            }
            return i;
        }

        /* renamed from: b */
        public final void mo52470b() {
            synchronized (GLTextureView.f53488b) {
                this.f53533o = true;
                GLTextureView.f53488b.notifyAll();
            }
        }

        /* renamed from: h */
        public final void mo52476h() {
            this.f53529k = true;
            GLTextureView.f53488b.notifyAll();
        }

        /* renamed from: j */
        private void m65059j() {
            if (this.f53526h) {
                this.f53537s.mo52465f();
                this.f53526h = false;
                GLTextureView.f53488b.mo52483c(this);
            }
        }

        /* renamed from: l */
        private boolean m65061l() {
            if (!this.f53526h || !this.f53527i || !m65062m()) {
                return false;
            }
            return true;
        }

        /* renamed from: m */
        private boolean m65062m() {
            if (this.f53522d || !this.f53523e || this.f53524f || this.f53530l <= 0 || this.f53531m <= 0 || (!this.f53533o && this.f53532n != 1)) {
                return false;
            }
            return true;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|25|20|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x000e, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0020 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo52471c() {
            /*
                r2 = this;
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b
                monitor-enter(r0)
                r1 = 1
                r2.f53523e = r1     // Catch:{ all -> 0x002a }
                r1 = 0
                r2.f53528j = r1     // Catch:{ all -> 0x002a }
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x002a }
                r1.notifyAll()     // Catch:{ all -> 0x002a }
            L_0x000e:
                boolean r1 = r2.f53525g     // Catch:{ all -> 0x002a }
                if (r1 == 0) goto L_0x0028
                boolean r1 = r2.f53528j     // Catch:{ all -> 0x002a }
                if (r1 != 0) goto L_0x0028
                boolean r1 = r2.f53519a     // Catch:{ all -> 0x002a }
                if (r1 != 0) goto L_0x0028
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ InterruptedException -> 0x0020 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0020 }
                goto L_0x000e
            L_0x0020:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002a }
                r1.interrupt()     // Catch:{ all -> 0x002a }
                goto L_0x000e
            L_0x0028:
                monitor-exit(r0)     // Catch:{ all -> 0x002a }
                return
            L_0x002a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.image.GLTextureView.C19734i.mo52471c():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|22|18|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x000b, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0019 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo52472d() {
            /*
                r2 = this;
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b
                monitor-enter(r0)
                r1 = 0
                r2.f53523e = r1     // Catch:{ all -> 0x0023 }
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x0023 }
                r1.notifyAll()     // Catch:{ all -> 0x0023 }
            L_0x000b:
                boolean r1 = r2.f53525g     // Catch:{ all -> 0x0023 }
                if (r1 != 0) goto L_0x0021
                boolean r1 = r2.f53519a     // Catch:{ all -> 0x0023 }
                if (r1 != 0) goto L_0x0021
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ InterruptedException -> 0x0019 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0019 }
                goto L_0x000b
            L_0x0019:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0023 }
                r1.interrupt()     // Catch:{ all -> 0x0023 }
                goto L_0x000b
            L_0x0021:
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                return
            L_0x0023:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.image.GLTextureView.C19734i.mo52472d():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|22|18|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x000b, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0019 */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo52473e() {
            /*
                r2 = this;
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b
                monitor-enter(r0)
                r1 = 1
                r2.f53521c = r1     // Catch:{ all -> 0x0023 }
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x0023 }
                r1.notifyAll()     // Catch:{ all -> 0x0023 }
            L_0x000b:
                boolean r1 = r2.f53519a     // Catch:{ all -> 0x0023 }
                if (r1 != 0) goto L_0x0021
                boolean r1 = r2.f53522d     // Catch:{ all -> 0x0023 }
                if (r1 != 0) goto L_0x0021
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ InterruptedException -> 0x0019 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0019 }
                goto L_0x000b
            L_0x0019:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0023 }
                r1.interrupt()     // Catch:{ all -> 0x0023 }
                goto L_0x000b
            L_0x0021:
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                return
            L_0x0023:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.image.GLTextureView.C19734i.mo52473e():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|25|20|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0010, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0022 */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo52474f() {
            /*
                r3 = this;
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b
                monitor-enter(r0)
                r1 = 0
                r3.f53521c = r1     // Catch:{ all -> 0x002c }
                r2 = 1
                r3.f53533o = r2     // Catch:{ all -> 0x002c }
                r3.f53534p = r1     // Catch:{ all -> 0x002c }
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x002c }
                r1.notifyAll()     // Catch:{ all -> 0x002c }
            L_0x0010:
                boolean r1 = r3.f53519a     // Catch:{ all -> 0x002c }
                if (r1 != 0) goto L_0x002a
                boolean r1 = r3.f53522d     // Catch:{ all -> 0x002c }
                if (r1 == 0) goto L_0x002a
                boolean r1 = r3.f53534p     // Catch:{ all -> 0x002c }
                if (r1 != 0) goto L_0x002a
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ InterruptedException -> 0x0022 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0022 }
                goto L_0x0010
            L_0x0022:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002c }
                r1.interrupt()     // Catch:{ all -> 0x002c }
                goto L_0x0010
            L_0x002a:
                monitor-exit(r0)     // Catch:{ all -> 0x002c }
                return
            L_0x002c:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002c }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.image.GLTextureView.C19734i.mo52474f():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|19|16|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x000b, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0015 */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo52475g() {
            /*
                r2 = this;
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b
                monitor-enter(r0)
                r1 = 1
                r2.f53520b = r1     // Catch:{ all -> 0x001f }
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x001f }
                r1.notifyAll()     // Catch:{ all -> 0x001f }
            L_0x000b:
                boolean r1 = r2.f53519a     // Catch:{ all -> 0x001f }
                if (r1 != 0) goto L_0x001d
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ InterruptedException -> 0x0015 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0015 }
                goto L_0x000b
            L_0x0015:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x001f }
                r1.interrupt()     // Catch:{ all -> 0x001f }
                goto L_0x000b
            L_0x001d:
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                return
            L_0x001f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.image.GLTextureView.C19734i.mo52475g():void");
        }

        public final void run() {
            StringBuilder sb = new StringBuilder("GLThread ");
            sb.append(getId());
            setName(sb.toString());
            try {
                m65060k();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                GLTextureView.f53488b.mo52478a(this);
                throw th;
            }
            GLTextureView.f53488b.mo52478a(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x014c, code lost:
            r11 = com.p280ss.android.medialib.image.GLTextureView.f53488b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x014e, code lost:
            monitor-enter(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
            r1.f53528j = true;
            com.p280ss.android.medialib.image.GLTextureView.f53488b.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0157, code lost:
            monitor-exit(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0158, code lost:
            r11 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x015d, code lost:
            r15 = com.p280ss.android.medialib.image.GLTextureView.f53488b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x015f, code lost:
            monitor-enter(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
            r1.f53528j = true;
            r1.f53524f = true;
            com.p280ss.android.medialib.image.GLTextureView.f53488b.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x016a, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x0171, code lost:
            if (r12 == false) goto L_0x0182;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x0173, code lost:
            r0 = (javax.microedition.khronos.opengles.GL10) r1.f53537s.mo52462c();
            com.p280ss.android.medialib.image.GLTextureView.f53488b.mo52479a(r0);
            r6 = r0;
            r12 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0182, code lost:
            if (r10 == false) goto L_0x0198;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x0184, code lost:
            r0 = (com.p280ss.android.medialib.image.GLTextureView) r1.f53538t.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x018c, code lost:
            if (r0 == null) goto L_0x0197;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x018e, code lost:
            r0.f53490c.onSurfaceCreated(r6, r1.f53537s.f53516d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x0197, code lost:
            r10 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x0198, code lost:
            if (r13 == false) goto L_0x01aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x019a, code lost:
            r0 = (com.p280ss.android.medialib.image.GLTextureView) r1.f53538t.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x01a2, code lost:
            if (r0 == null) goto L_0x01a9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x01a4, code lost:
            r0.f53490c.onSurfaceChanged(r6, r7, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x01a9, code lost:
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x01aa, code lost:
            r0 = (com.p280ss.android.medialib.image.GLTextureView) r1.f53538t.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x01b2, code lost:
            if (r0 == null) goto L_0x01b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x01b4, code lost:
            r0.f53490c.onDrawFrame(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x01b9, code lost:
            r0 = r1.f53537s.mo52463d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x01c1, code lost:
            if (r0 == 12288) goto L_0x01da;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x01c5, code lost:
            if (r0 == 12302) goto L_0x01d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x01c7, code lost:
            r15 = com.p280ss.android.medialib.image.GLTextureView.f53488b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x01c9, code lost:
            monitor-enter(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
            r1.f53524f = true;
            com.p280ss.android.medialib.image.GLTextureView.f53488b.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x01d2, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x01d7, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x01db, code lost:
            if (r14 == false) goto L_0x016b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x01dd, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0139, code lost:
            if (r9 == null) goto L_0x0142;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
            r9.run();
            r9 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0142, code lost:
            if (r11 == false) goto L_0x0171;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x014a, code lost:
            if (r1.f53537s.mo52461b() == false) goto L_0x015d;
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m65060k() throws java.lang.InterruptedException {
            /*
                r17 = this;
                r1 = r17
                com.ss.android.medialib.image.GLTextureView$h r0 = new com.ss.android.medialib.image.GLTextureView$h
                java.lang.ref.WeakReference<com.ss.android.medialib.image.GLTextureView> r2 = r1.f53538t
                r0.<init>(r2)
                r1.f53537s = r0
                r0 = 0
                r1.f53526h = r0
                r1.f53527i = r0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
            L_0x001c:
                com.ss.android.medialib.image.GLTextureView$j r15 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01ee }
                monitor-enter(r15)     // Catch:{ all -> 0x01ee }
            L_0x001f:
                boolean r2 = r1.f53520b     // Catch:{ all -> 0x01eb }
                if (r2 == 0) goto L_0x0032
                monitor-exit(r15)     // Catch:{ all -> 0x01eb }
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p280ss.android.medialib.image.GLTextureView.f53488b
                monitor-enter(r2)
                r17.m65058i()     // Catch:{ all -> 0x002f }
                r17.m65059j()     // Catch:{ all -> 0x002f }
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                return
            L_0x002f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                throw r0
            L_0x0032:
                java.util.ArrayList<java.lang.Runnable> r2 = r1.f53535q     // Catch:{ all -> 0x01eb }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x01eb }
                if (r2 != 0) goto L_0x0047
                java.util.ArrayList<java.lang.Runnable> r2 = r1.f53535q     // Catch:{ all -> 0x01eb }
                r9 = 0
                java.lang.Object r2 = r2.remove(r9)     // Catch:{ all -> 0x01eb }
                java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ all -> 0x01eb }
                r9 = r2
                r2 = 0
                goto L_0x0138
            L_0x0047:
                boolean r2 = r1.f53522d     // Catch:{ all -> 0x01eb }
                boolean r0 = r1.f53521c     // Catch:{ all -> 0x01eb }
                if (r2 == r0) goto L_0x0059
                boolean r0 = r1.f53521c     // Catch:{ all -> 0x01eb }
                boolean r2 = r1.f53521c     // Catch:{ all -> 0x01eb }
                r1.f53522d = r2     // Catch:{ all -> 0x01eb }
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01eb }
                r2.notifyAll()     // Catch:{ all -> 0x01eb }
                goto L_0x005a
            L_0x0059:
                r0 = 0
            L_0x005a:
                boolean r2 = r1.f53529k     // Catch:{ all -> 0x01eb }
                if (r2 == 0) goto L_0x0068
                r17.m65058i()     // Catch:{ all -> 0x01eb }
                r17.m65059j()     // Catch:{ all -> 0x01eb }
                r2 = 0
                r1.f53529k = r2     // Catch:{ all -> 0x01eb }
                r4 = 1
            L_0x0068:
                if (r5 == 0) goto L_0x0071
                r17.m65058i()     // Catch:{ all -> 0x01eb }
                r17.m65059j()     // Catch:{ all -> 0x01eb }
                r5 = 0
            L_0x0071:
                if (r0 == 0) goto L_0x007a
                boolean r2 = r1.f53527i     // Catch:{ all -> 0x01eb }
                if (r2 == 0) goto L_0x007a
                r17.m65058i()     // Catch:{ all -> 0x01eb }
            L_0x007a:
                if (r0 == 0) goto L_0x009b
                boolean r2 = r1.f53526h     // Catch:{ all -> 0x01eb }
                if (r2 == 0) goto L_0x009b
                java.lang.ref.WeakReference<com.ss.android.medialib.image.GLTextureView> r2 = r1.f53538t     // Catch:{ all -> 0x01eb }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x01eb }
                com.ss.android.medialib.image.GLTextureView r2 = (com.p280ss.android.medialib.image.GLTextureView) r2     // Catch:{ all -> 0x01eb }
                if (r2 != 0) goto L_0x008c
                r2 = 0
                goto L_0x008e
            L_0x008c:
                boolean r2 = r2.f53497j     // Catch:{ all -> 0x01eb }
            L_0x008e:
                if (r2 == 0) goto L_0x0098
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01eb }
                boolean r2 = r2.mo52480a()     // Catch:{ all -> 0x01eb }
                if (r2 == 0) goto L_0x009b
            L_0x0098:
                r17.m65059j()     // Catch:{ all -> 0x01eb }
            L_0x009b:
                if (r0 == 0) goto L_0x00aa
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01eb }
                boolean r0 = r0.mo52481b()     // Catch:{ all -> 0x01eb }
                if (r0 == 0) goto L_0x00aa
                com.ss.android.medialib.image.GLTextureView$h r0 = r1.f53537s     // Catch:{ all -> 0x01eb }
                r0.mo52465f()     // Catch:{ all -> 0x01eb }
            L_0x00aa:
                boolean r0 = r1.f53523e     // Catch:{ all -> 0x01eb }
                if (r0 != 0) goto L_0x00c4
                boolean r0 = r1.f53525g     // Catch:{ all -> 0x01eb }
                if (r0 != 0) goto L_0x00c4
                boolean r0 = r1.f53527i     // Catch:{ all -> 0x01eb }
                if (r0 == 0) goto L_0x00b9
                r17.m65058i()     // Catch:{ all -> 0x01eb }
            L_0x00b9:
                r0 = 1
                r1.f53525g = r0     // Catch:{ all -> 0x01eb }
                r0 = 0
                r1.f53524f = r0     // Catch:{ all -> 0x01eb }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01eb }
                r0.notifyAll()     // Catch:{ all -> 0x01eb }
            L_0x00c4:
                boolean r0 = r1.f53523e     // Catch:{ all -> 0x01eb }
                if (r0 == 0) goto L_0x00d4
                boolean r0 = r1.f53525g     // Catch:{ all -> 0x01eb }
                if (r0 == 0) goto L_0x00d4
                r0 = 0
                r1.f53525g = r0     // Catch:{ all -> 0x01eb }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01eb }
                r0.notifyAll()     // Catch:{ all -> 0x01eb }
            L_0x00d4:
                if (r3 == 0) goto L_0x00e0
                r0 = 1
                r1.f53534p = r0     // Catch:{ all -> 0x01eb }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01eb }
                r0.notifyAll()     // Catch:{ all -> 0x01eb }
                r3 = 0
                r14 = 0
            L_0x00e0:
                boolean r0 = r17.m65062m()     // Catch:{ all -> 0x01eb }
                if (r0 == 0) goto L_0x01e2
                boolean r0 = r1.f53526h     // Catch:{ all -> 0x01eb }
                if (r0 != 0) goto L_0x010c
                if (r4 == 0) goto L_0x00ee
                r4 = 0
                goto L_0x010c
            L_0x00ee:
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01eb }
                boolean r0 = r0.mo52482b(r1)     // Catch:{ all -> 0x01eb }
                if (r0 == 0) goto L_0x010c
                com.ss.android.medialib.image.GLTextureView$h r0 = r1.f53537s     // Catch:{ RuntimeException -> 0x0105 }
                r0.mo52460a()     // Catch:{ RuntimeException -> 0x0105 }
                r0 = 1
                r1.f53526h = r0     // Catch:{ all -> 0x01eb }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01eb }
                r0.notifyAll()     // Catch:{ all -> 0x01eb }
                r10 = 1
                goto L_0x010c
            L_0x0105:
                r0 = move-exception
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01eb }
                r2.mo52483c(r1)     // Catch:{ all -> 0x01eb }
                throw r0     // Catch:{ all -> 0x01eb }
            L_0x010c:
                boolean r0 = r1.f53526h     // Catch:{ all -> 0x01eb }
                if (r0 == 0) goto L_0x011b
                boolean r0 = r1.f53527i     // Catch:{ all -> 0x01eb }
                if (r0 != 0) goto L_0x011b
                r0 = 1
                r1.f53527i = r0     // Catch:{ all -> 0x01eb }
                r0 = 1
                r12 = 1
                r13 = 1
                goto L_0x011c
            L_0x011b:
                r0 = r11
            L_0x011c:
                boolean r2 = r1.f53527i     // Catch:{ all -> 0x01eb }
                if (r2 == 0) goto L_0x01df
                boolean r2 = r1.f53536r     // Catch:{ all -> 0x01eb }
                if (r2 == 0) goto L_0x012f
                int r7 = r1.f53530l     // Catch:{ all -> 0x01eb }
                int r8 = r1.f53531m     // Catch:{ all -> 0x01eb }
                r2 = 0
                r1.f53536r = r2     // Catch:{ all -> 0x01eb }
                r0 = 1
                r13 = 1
                r14 = 1
                goto L_0x0130
            L_0x012f:
                r2 = 0
            L_0x0130:
                r1.f53533o = r2     // Catch:{ all -> 0x01eb }
                com.ss.android.medialib.image.GLTextureView$j r11 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01eb }
                r11.notifyAll()     // Catch:{ all -> 0x01eb }
                r11 = r0
            L_0x0138:
                monitor-exit(r15)     // Catch:{ all -> 0x01eb }
                if (r9 == 0) goto L_0x0142
                r9.run()     // Catch:{ all -> 0x01ee }
                r0 = 0
                r9 = 0
                goto L_0x001c
            L_0x0142:
                if (r11 == 0) goto L_0x0171
                com.ss.android.medialib.image.GLTextureView$h r0 = r1.f53537s     // Catch:{ all -> 0x01ee }
                boolean r0 = r0.mo52461b()     // Catch:{ all -> 0x01ee }
                if (r0 == 0) goto L_0x015d
                com.ss.android.medialib.image.GLTextureView$j r11 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01ee }
                monitor-enter(r11)     // Catch:{ all -> 0x01ee }
                r0 = 1
                r1.f53528j = r0     // Catch:{ all -> 0x015a }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x015a }
                r0.notifyAll()     // Catch:{ all -> 0x015a }
                monitor-exit(r11)     // Catch:{ all -> 0x015a }
                r11 = 0
                goto L_0x0171
            L_0x015a:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x015a }
                throw r0     // Catch:{ all -> 0x01ee }
            L_0x015d:
                com.ss.android.medialib.image.GLTextureView$j r15 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01ee }
                monitor-enter(r15)     // Catch:{ all -> 0x01ee }
                r0 = 1
                r1.f53528j = r0     // Catch:{ all -> 0x016e }
                r1.f53524f = r0     // Catch:{ all -> 0x016e }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x016e }
                r0.notifyAll()     // Catch:{ all -> 0x016e }
                monitor-exit(r15)     // Catch:{ all -> 0x016e }
            L_0x016b:
                r0 = 0
                goto L_0x001c
            L_0x016e:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x016e }
                throw r0     // Catch:{ all -> 0x01ee }
            L_0x0171:
                if (r12 == 0) goto L_0x0182
                com.ss.android.medialib.image.GLTextureView$h r0 = r1.f53537s     // Catch:{ all -> 0x01ee }
                javax.microedition.khronos.opengles.GL r0 = r0.mo52462c()     // Catch:{ all -> 0x01ee }
                javax.microedition.khronos.opengles.GL10 r0 = (javax.microedition.khronos.opengles.GL10) r0     // Catch:{ all -> 0x01ee }
                com.ss.android.medialib.image.GLTextureView$j r6 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01ee }
                r6.mo52479a(r0)     // Catch:{ all -> 0x01ee }
                r6 = r0
                r12 = 0
            L_0x0182:
                if (r10 == 0) goto L_0x0198
                java.lang.ref.WeakReference<com.ss.android.medialib.image.GLTextureView> r0 = r1.f53538t     // Catch:{ all -> 0x01ee }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01ee }
                com.ss.android.medialib.image.GLTextureView r0 = (com.p280ss.android.medialib.image.GLTextureView) r0     // Catch:{ all -> 0x01ee }
                if (r0 == 0) goto L_0x0197
                android.opengl.GLSurfaceView$Renderer r0 = r0.f53490c     // Catch:{ all -> 0x01ee }
                com.ss.android.medialib.image.GLTextureView$h r10 = r1.f53537s     // Catch:{ all -> 0x01ee }
                javax.microedition.khronos.egl.EGLConfig r10 = r10.f53516d     // Catch:{ all -> 0x01ee }
                r0.onSurfaceCreated(r6, r10)     // Catch:{ all -> 0x01ee }
            L_0x0197:
                r10 = 0
            L_0x0198:
                if (r13 == 0) goto L_0x01aa
                java.lang.ref.WeakReference<com.ss.android.medialib.image.GLTextureView> r0 = r1.f53538t     // Catch:{ all -> 0x01ee }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01ee }
                com.ss.android.medialib.image.GLTextureView r0 = (com.p280ss.android.medialib.image.GLTextureView) r0     // Catch:{ all -> 0x01ee }
                if (r0 == 0) goto L_0x01a9
                android.opengl.GLSurfaceView$Renderer r0 = r0.f53490c     // Catch:{ all -> 0x01ee }
                r0.onSurfaceChanged(r6, r7, r8)     // Catch:{ all -> 0x01ee }
            L_0x01a9:
                r13 = 0
            L_0x01aa:
                java.lang.ref.WeakReference<com.ss.android.medialib.image.GLTextureView> r0 = r1.f53538t     // Catch:{ all -> 0x01ee }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01ee }
                com.ss.android.medialib.image.GLTextureView r0 = (com.p280ss.android.medialib.image.GLTextureView) r0     // Catch:{ all -> 0x01ee }
                if (r0 == 0) goto L_0x01b9
                android.opengl.GLSurfaceView$Renderer r0 = r0.f53490c     // Catch:{ all -> 0x01ee }
                r0.onDrawFrame(r6)     // Catch:{ all -> 0x01ee }
            L_0x01b9:
                com.ss.android.medialib.image.GLTextureView$h r0 = r1.f53537s     // Catch:{ all -> 0x01ee }
                int r0 = r0.mo52463d()     // Catch:{ all -> 0x01ee }
                r15 = 12288(0x3000, float:1.7219E-41)
                if (r0 == r15) goto L_0x01da
                r15 = 12302(0x300e, float:1.7239E-41)
                if (r0 == r15) goto L_0x01d7
                com.ss.android.medialib.image.GLTextureView$j r15 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01ee }
                monitor-enter(r15)     // Catch:{ all -> 0x01ee }
                r0 = 1
                r1.f53524f = r0     // Catch:{ all -> 0x01d4 }
                com.ss.android.medialib.image.GLTextureView$j r16 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01d4 }
                r16.notifyAll()     // Catch:{ all -> 0x01d4 }
                monitor-exit(r15)     // Catch:{ all -> 0x01d4 }
                goto L_0x01db
            L_0x01d4:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x01d4 }
                throw r0     // Catch:{ all -> 0x01ee }
            L_0x01d7:
                r0 = 1
                r5 = 1
                goto L_0x01db
            L_0x01da:
                r0 = 1
            L_0x01db:
                if (r14 == 0) goto L_0x016b
                r3 = 1
                goto L_0x016b
            L_0x01df:
                r2 = 0
                r11 = r0
                goto L_0x01e3
            L_0x01e2:
                r2 = 0
            L_0x01e3:
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x01eb }
                r0.wait()     // Catch:{ all -> 0x01eb }
                r0 = 0
                goto L_0x001f
            L_0x01eb:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x01eb }
                throw r0     // Catch:{ all -> 0x01ee }
            L_0x01ee:
                r0 = move-exception
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p280ss.android.medialib.image.GLTextureView.f53488b
                monitor-enter(r2)
                r17.m65058i()     // Catch:{ all -> 0x01fa }
                r17.m65059j()     // Catch:{ all -> 0x01fa }
                monitor-exit(r2)     // Catch:{ all -> 0x01fa }
                throw r0
            L_0x01fa:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x01fa }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.image.GLTextureView.C19734i.m65060k():void");
        }

        C19734i(WeakReference<GLTextureView> weakReference) {
            this.f53538t = weakReference;
        }

        /* renamed from: a */
        public final void mo52467a(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (GLTextureView.f53488b) {
                this.f53532n = i;
                GLTextureView.f53488b.notifyAll();
            }
        }

        /* renamed from: a */
        public final void mo52469a(Runnable runnable) {
            if (runnable != null) {
                synchronized (GLTextureView.f53488b) {
                    this.f53535q.add(runnable);
                    GLTextureView.f53488b.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|27|21|4) */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0014, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo52468a(int r2, int r3) {
            /*
                r1 = this;
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p280ss.android.medialib.image.GLTextureView.f53488b
                monitor-enter(r0)
                r1.f53530l = r2     // Catch:{ all -> 0x0036 }
                r1.f53531m = r3     // Catch:{ all -> 0x0036 }
                r2 = 1
                r1.f53536r = r2     // Catch:{ all -> 0x0036 }
                r1.f53533o = r2     // Catch:{ all -> 0x0036 }
                r2 = 0
                r1.f53534p = r2     // Catch:{ all -> 0x0036 }
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ all -> 0x0036 }
                r2.notifyAll()     // Catch:{ all -> 0x0036 }
            L_0x0014:
                boolean r2 = r1.f53519a     // Catch:{ all -> 0x0036 }
                if (r2 != 0) goto L_0x0034
                boolean r2 = r1.f53522d     // Catch:{ all -> 0x0036 }
                if (r2 != 0) goto L_0x0034
                boolean r2 = r1.f53534p     // Catch:{ all -> 0x0036 }
                if (r2 != 0) goto L_0x0034
                boolean r2 = r1.m65061l()     // Catch:{ all -> 0x0036 }
                if (r2 == 0) goto L_0x0034
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p280ss.android.medialib.image.GLTextureView.f53488b     // Catch:{ InterruptedException -> 0x002c }
                r2.wait()     // Catch:{ InterruptedException -> 0x002c }
                goto L_0x0014
            L_0x002c:
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0036 }
                r2.interrupt()     // Catch:{ all -> 0x0036 }
                goto L_0x0014
            L_0x0034:
                monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                return
            L_0x0036:
                r2 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.image.GLTextureView.C19734i.mo52468a(int, int):void");
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$j */
    static class C19735j {

        /* renamed from: a */
        private static String f53539a = "GLThreadManager";

        /* renamed from: b */
        private boolean f53540b;

        /* renamed from: c */
        private int f53541c;

        /* renamed from: d */
        private boolean f53542d;

        /* renamed from: e */
        private boolean f53543e;

        /* renamed from: f */
        private boolean f53544f;

        /* renamed from: g */
        private C19734i f53545g;

        private C19735j() {
        }

        /* renamed from: a */
        public final synchronized boolean mo52480a() {
            return this.f53544f;
        }

        /* renamed from: c */
        private void m65074c() {
            if (!this.f53540b) {
                this.f53543e = true;
                this.f53540b = true;
            }
        }

        /* renamed from: b */
        public final synchronized boolean mo52481b() {
            boolean z;
            m65074c();
            if (!this.f53543e) {
                z = true;
            } else {
                z = false;
            }
            return z;
        }

        /* renamed from: a */
        public final synchronized void mo52478a(C19734i iVar) {
            iVar.f53519a = true;
            if (this.f53545g == iVar) {
                this.f53545g = null;
            }
            notifyAll();
        }

        /* renamed from: c */
        public final void mo52483c(C19734i iVar) {
            if (this.f53545g == iVar) {
                this.f53545g = null;
            }
            notifyAll();
        }

        /* renamed from: a */
        public final synchronized void mo52479a(GL10 gl10) {
            if (!this.f53542d) {
                m65074c();
                String glGetString = gl10.glGetString(7937);
                if (this.f53541c < 131072) {
                    this.f53543e = !glGetString.startsWith("Q3Dimension MSM7500 ");
                    notifyAll();
                }
                this.f53544f = !this.f53543e;
                this.f53542d = true;
            }
        }

        /* renamed from: b */
        public final boolean mo52482b(C19734i iVar) {
            if (this.f53545g == iVar || this.f53545g == null) {
                this.f53545g = iVar;
                notifyAll();
                return true;
            }
            m65074c();
            if (this.f53543e) {
                return true;
            }
            if (this.f53545g != null) {
                this.f53545g.mo52476h();
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$k */
    public interface C19736k {
        /* renamed from: a */
        GL mo52484a(GL gl);
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$l */
    static class C19737l extends Writer {

        /* renamed from: a */
        private StringBuilder f53546a = new StringBuilder();

        public final void close() {
            m65082a();
        }

        public final void flush() {
            m65082a();
        }

        C19737l() {
        }

        /* renamed from: a */
        private void m65082a() {
            if (this.f53546a.length() > 0) {
                this.f53546a.delete(0, this.f53546a.length());
            }
        }

        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == 10) {
                    m65082a();
                } else {
                    this.f53546a.append(c);
                }
            }
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$m */
    class C19738m extends C19727b {
        public C19738m(boolean z) {
            int i;
            if (z) {
                i = 16;
            } else {
                i = 0;
            }
            super(8, 8, 8, 0, i, 0);
        }
    }

    /* renamed from: d */
    private void m65028d() {
        setSurfaceTextureListener(this);
    }

    public int getDebugFlags() {
        return this.f53495h;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f53497j;
    }

    /* renamed from: a */
    public final void mo52429a() {
        this.f53499l.mo52470b();
    }

    /* renamed from: b */
    public void mo52431b() {
        this.f53499l.mo52473e();
    }

    public int getRenderMode() {
        return this.f53499l.mo52466a();
    }

    /* renamed from: e */
    private void m65029e() {
        if (this.f53499l != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.f53499l != null) {
            this.f53499l.mo52475g();
        }
        this.f53500m = true;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            if (this.f53499l != null) {
                this.f53499l.mo52475g();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: c */
    public final void mo52432c() {
        if (!(this.f53489a == null || getSurfaceTexture() == this.f53489a || VERSION.SDK_INT < 16)) {
            setSurfaceTexture(this.f53489a);
            this.f53499l.mo52471c();
        }
        this.f53499l.mo52474f();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (this.f53500m && this.f53490c != null) {
            if (this.f53499l != null) {
                i = this.f53499l.mo52466a();
            } else {
                i = 1;
            }
            this.f53499l = new C19734i(this.f53498k);
            if (i != 1) {
                this.f53499l.mo52467a(i);
            }
            this.f53499l.start();
        }
        this.f53500m = false;
    }

    public void setDebugFlags(int i) {
        this.f53495h = i;
    }

    public void setGLWrapper(C19736k kVar) {
        this.f53494g = kVar;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f53497j = z;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f53499l.mo52472d();
        return false;
    }

    public void setEGLConfigChooser(C19730e eVar) {
        m65029e();
        this.f53491d = eVar;
    }

    public void setEGLContextClientVersion(int i) {
        m65029e();
        this.f53496i = i;
    }

    public void setEGLContextFactory(C19731f fVar) {
        m65029e();
        this.f53492e = fVar;
    }

    public void setEGLWindowSurfaceFactory(C19732g gVar) {
        m65029e();
        this.f53493f = gVar;
    }

    public void setRenderMode(int i) {
        this.f53499l.mo52467a(i);
    }

    public GLTextureView(Context context) {
        super(context);
        m65028d();
    }

    /* renamed from: a */
    public final void mo52430a(Runnable runnable) {
        this.f53499l.mo52469a(runnable);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (getRenderMode() != 0) {
            mo52429a();
        }
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser((C19730e) new C19738m(z));
    }

    public void setRenderer(Renderer renderer) {
        m65029e();
        if (this.f53491d == null) {
            this.f53491d = new C19738m(true);
        }
        if (this.f53492e == null) {
            this.f53492e = new C19728c();
        }
        if (this.f53493f == null) {
            this.f53493f = new C19729d();
        }
        this.f53490c = renderer;
        this.f53499l = new C19734i(this.f53498k);
        this.f53499l.start();
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65028d();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f53489a = surfaceTexture;
        this.f53499l.mo52471c();
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f53499l.mo52468a(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f53499l.mo52468a(i, i2);
    }
}
