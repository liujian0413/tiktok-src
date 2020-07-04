package com.p280ss.android.ugc.aweme.livewallpaper.egl;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.j */
public final class C32589j implements OnFrameAvailableListener, Runnable {

    /* renamed from: a */
    public Object f84954a = null;

    /* renamed from: b */
    public int f84955b;

    /* renamed from: c */
    float[] f84956c;

    /* renamed from: d */
    public Pair<Float, Float> f84957d = new Pair<>(Float.valueOf(1.0f), Float.valueOf(1.0f));

    /* renamed from: e */
    private Object f84958e;

    /* renamed from: f */
    private C32583d f84959f;

    /* renamed from: g */
    private C32584e f84960g;

    /* renamed from: h */
    private Thread f84961h = new Thread(this);

    /* renamed from: i */
    private Handler f84962i;

    /* renamed from: j */
    private List<C32591k> f84963j = new ArrayList();

    /* renamed from: k */
    private List<C32591k> f84964k = new ArrayList();

    /* renamed from: l */
    private C32585f f84965l;

    /* renamed from: m */
    private C32600q f84966m;

    /* renamed from: n */
    private C32602s f84967n;

    /* renamed from: o */
    private C32602s f84968o;

    /* renamed from: p */
    private float[] f84969p;

    /* renamed from: q */
    private int f84970q;

    /* renamed from: r */
    private int f84971r;

    /* renamed from: s */
    private boolean f84972s;

    /* renamed from: t */
    private Object f84973t = new Object();

    /* renamed from: u */
    private int f84974u = 8;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.j$a */
    static class C32590a extends Handler {

        /* renamed from: a */
        private WeakReference<C32589j> f84975a;

        C32590a(C32589j jVar) {
            this.f84975a = new WeakReference<>(jVar);
        }

        public final void handleMessage(Message message) {
            C32589j jVar = (C32589j) this.f84975a.get();
            if (jVar != null) {
                switch (message.what) {
                    case 1:
                        jVar.mo83906b(message.obj);
                        return;
                    case 2:
                        jVar.mo83903a(message.obj);
                        return;
                    case 3:
                        jVar.mo83901a((Message) message.obj, message.arg1, message.arg2);
                        return;
                    case 4:
                        jVar.mo83904b();
                        return;
                    case 5:
                        jVar.mo83909e();
                        return;
                    case 6:
                        jVar.mo83908d();
                        return;
                    case 7:
                        jVar.mo83907c();
                        return;
                    case 8:
                        jVar.mo83899a();
                        return;
                    case 9:
                    case 11:
                        jVar.mo83902a((Surface) message.obj);
                        return;
                    case 10:
                        jVar.mo83900a(message.arg1, message.arg2);
                        return;
                    default:
                        super.handleMessage(message);
                        break;
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo83911g() {
        this.f84962i.sendEmptyMessage(5);
    }

    /* renamed from: a */
    public final void mo83899a() {
        mo83904b();
        Looper.myLooper().quit();
        this.f84955b = 5;
    }

    /* renamed from: b */
    public final void mo83904b() {
        if (this.f84955b != 3) {
            m105579i();
            this.f84955b = 3;
        }
    }

    /* renamed from: c */
    public final void mo83907c() {
        if (this.f84955b == 2) {
            this.f84955b = 4;
        }
    }

    /* renamed from: d */
    public final void mo83908d() {
        if (this.f84955b == 4) {
            this.f84955b = 2;
        }
    }

    /* renamed from: f */
    public final void mo83910f() {
        this.f84962i.sendEmptyMessage(8);
        m105582l();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:13:0x0003, LOOP_START, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m105581k() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f84973t
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r4.f84972s     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x000f
            java.lang.Object r1 = r4.f84973t     // Catch:{ InterruptedException -> 0x0003 }
            r2 = 10
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0003 }
            goto L_0x0003
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.livewallpaper.egl.C32589j.m105581k():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:13:0x0003, LOOP_START, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m105582l() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f84973t
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r4.f84972s     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x000f
            java.lang.Object r1 = r4.f84973t     // Catch:{ InterruptedException -> 0x0003 }
            r2 = 10
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0003 }
            goto L_0x0003
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.livewallpaper.egl.C32589j.m105582l():void");
    }

    /* renamed from: m */
    private void m105583m() {
        this.f84965l = new C32585f();
        if (!this.f84965l.mo83924a(this.f84971r, this.f84970q)) {
            mo83904b();
        }
        this.f84969p = new float[16];
    }

    /* renamed from: n */
    private void m105584n() {
        this.f84966m = new C32600q();
        if (!this.f84966m.mo83924a(this.f84971r, this.f84970q)) {
            mo83904b();
        }
    }

    /* renamed from: e */
    public final void mo83909e() {
        try {
            mo83906b(this.f84954a);
            this.f84955b = 4;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    public final C32591k mo83912h() {
        C32587h c = m105578c(0, 0);
        if (c == null) {
            return null;
        }
        C32591k kVar = new C32591k(c);
        c.mo83896b();
        kVar.setOnFrameAvailableListener(this);
        return kVar;
    }

    /* renamed from: i */
    private void m105579i() {
        if (this.f84967n != null) {
            this.f84967n.mo83930c();
        }
        if (this.f84968o != null) {
            this.f84968o.mo83930c();
        }
        if (this.f84965l != null) {
            this.f84965l.mo83925c();
            this.f84965l = null;
        }
        if (this.f84966m != null) {
            this.f84966m.mo83925c();
            this.f84966m = null;
        }
        if (this.f84960g != null) {
            this.f84960g.mo83890c();
            this.f84960g = null;
        }
        if (this.f84959f != null) {
            this.f84959f.mo83878a();
            this.f84959f = null;
        }
    }

    public final void run() {
        Looper.prepare();
        this.f84962i = new C32590a(this);
        synchronized (this.f84973t) {
            this.f84972s = true;
            this.f84973t.notify();
        }
        Looper.loop();
        synchronized (this.f84973t) {
            this.f84972s = false;
            this.f84973t.notify();
        }
    }

    /* renamed from: j */
    private void m105580j() {
        if (this.f84960g != null) {
            this.f84960g.mo83890c();
        }
        if (this.f84958e == null) {
            this.f84960g = new C32592l(this.f84959f, 1, 1);
        } else if (this.f84958e instanceof Surface) {
            this.f84960g = new C32604t(this.f84959f, (Surface) this.f84958e, true);
        } else if (this.f84958e instanceof SurfaceTexture) {
            this.f84960g = new C32604t(this.f84959f, (SurfaceTexture) this.f84958e);
        } else {
            throw new AndroidRuntimeException("UnsupportedOperation");
        }
        this.f84971r = this.f84960g.mo83885a();
        this.f84970q = this.f84960g.mo83889b();
        this.f84960g.mo83891d();
        this.f84954a = C32583d.m105543b();
    }

    /* renamed from: a */
    public final void mo83902a(Surface surface) {
        this.f84958e = surface;
        if (surface != null) {
            m105580j();
        }
    }

    /* renamed from: a */
    private boolean m105576a(C32587h hVar) {
        if (this.f84955b != 4) {
            return false;
        }
        Message obtainMessage = this.f84962i.obtainMessage(2);
        obtainMessage.obj = null;
        this.f84962i.sendMessage(obtainMessage);
        return true;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f84963j) {
            this.f84963j.add((C32591k) surfaceTexture);
        }
        m105576a((C32587h) null);
    }

    /* renamed from: b */
    private void m105577b(C32587h hVar) {
        if (this.f84955b == 4) {
            if (this.f84966m == null) {
                m105584n();
            }
            if (this.f84966m != null && hVar != null && this.f84958e != null) {
                Matrix.setIdentityM(this.f84956c, 0);
                this.f84966m.mo83922a(hVar.mo83897c(), false, 0, this.f84956c);
                hVar.mo83898d();
                this.f84960g.mo83887a(System.nanoTime());
                this.f84960g.mo83892e();
            }
        }
    }

    /* JADX INFO: used method not loaded: com.ss.android.ugc.aweme.livewallpaper.egl.e.a(long):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        if (r12.f84977b != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002d, code lost:
        r2 = r12.f84976a;
        r12.getTransformMatrix(r11.f84969p);
        android.opengl.Matrix.setIdentityM(r11.f84956c, 0);
        android.opengl.Matrix.scaleM(r11.f84956c, 0, ((java.lang.Float) r11.f84957d.first).floatValue(), ((java.lang.Float) r11.f84957d.second).floatValue(), 1.0f);
        android.opengl.GLES20.glViewport(0, 0, r11.f84971r, r11.f84970q);
        r11.f84965l.mo83923a(r2.mo83897c(), false, 0, r11.f84969p, r11.f84956c);
        r2.mo83898d();
        r11.f84960g.mo83887a(r0);
        r11.f84960g.mo83892e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m105575a(com.p280ss.android.ugc.aweme.livewallpaper.egl.C32591k r12) {
        /*
            r11 = this;
            int r0 = r11.f84955b
            r1 = 4
            if (r0 == r1) goto L_0x0006
            return
        L_0x0006:
            com.ss.android.ugc.aweme.livewallpaper.egl.f r0 = r11.f84965l
            if (r0 != 0) goto L_0x000d
            r11.m105583m()
        L_0x000d:
            com.ss.android.ugc.aweme.livewallpaper.egl.f r0 = r11.f84965l
            if (r0 == 0) goto L_0x007c
            if (r12 != 0) goto L_0x0014
            goto L_0x007c
        L_0x0014:
            java.lang.Object r0 = r11.f84958e
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            monitor-enter(r12)
            boolean r0 = r12.f84978c     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0020
            monitor-exit(r12)     // Catch:{ all -> 0x0079 }
            return
        L_0x0020:
            r12.updateTexImage()     // Catch:{ all -> 0x0079 }
            long r0 = r12.getTimestamp()     // Catch:{ all -> 0x0079 }
            monitor-exit(r12)     // Catch:{ all -> 0x0079 }
            boolean r2 = r12.f84977b
            if (r2 != 0) goto L_0x002d
            return
        L_0x002d:
            com.ss.android.ugc.aweme.livewallpaper.egl.h r2 = r12.f84976a
            float[] r3 = r11.f84969p
            r12.getTransformMatrix(r3)
            float[] r12 = r11.f84956c
            r3 = 0
            android.opengl.Matrix.setIdentityM(r12, r3)
            float[] r12 = r11.f84956c
            android.util.Pair<java.lang.Float, java.lang.Float> r4 = r11.f84957d
            java.lang.Object r4 = r4.first
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            android.util.Pair<java.lang.Float, java.lang.Float> r5 = r11.f84957d
            java.lang.Object r5 = r5.second
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r6 = 1065353216(0x3f800000, float:1.0)
            android.opengl.Matrix.scaleM(r12, r3, r4, r5, r6)
            int r12 = r11.f84971r
            int r4 = r11.f84970q
            android.opengl.GLES20.glViewport(r3, r3, r12, r4)
            com.ss.android.ugc.aweme.livewallpaper.egl.f r5 = r11.f84965l
            int r6 = r2.mo83897c()
            r7 = 0
            r8 = 0
            float[] r9 = r11.f84969p
            float[] r10 = r11.f84956c
            r5.mo83923a(r6, r7, r8, r9, r10)
            r2.mo83898d()
            com.ss.android.ugc.aweme.livewallpaper.egl.e r12 = r11.f84960g
            r12.mo83887a(r0)
            com.ss.android.ugc.aweme.livewallpaper.egl.e r12 = r11.f84960g
            r12.mo83892e()
            return
        L_0x0079:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0079 }
            throw r0
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.livewallpaper.egl.C32589j.m105575a(com.ss.android.ugc.aweme.livewallpaper.egl.k):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo83906b(Object obj) {
        m105579i();
        this.f84959f = new C32583d(obj, 0);
        m105580j();
        this.f84967n = new C32602s(this.f84974u, this.f84971r, this.f84970q, false);
        this.f84967n.f85011c = "MusMediaRender.TexQueue";
        this.f84968o = new C32602s(this.f84974u, 0, 0, false);
        this.f84968o.f85011c = "MusMediaRender.OESQueue";
    }

    /* renamed from: a */
    public final void mo83903a(Object obj) {
        if (obj != null) {
            C32587h hVar = (C32587h) obj;
            m105577b(hVar);
            hVar.mo83896b();
            return;
        }
        synchronized (this.f84963j) {
            while (!this.f84963j.isEmpty()) {
                m105575a((C32591k) this.f84963j.remove(0));
            }
        }
    }

    /* renamed from: b */
    public final void mo83905b(int i, int i2) {
        Message obtainMessage = this.f84962i.obtainMessage(10);
        obtainMessage.arg1 = i;
        obtainMessage.arg2 = i2;
        this.f84962i.sendMessage(obtainMessage);
    }

    /* renamed from: c */
    private C32587h m105578c(int i, int i2) {
        Message obtainMessage = this.f84962i.obtainMessage(3);
        Message message = new Message();
        message.arg1 = 1;
        obtainMessage.arg1 = 0;
        obtainMessage.arg2 = 0;
        obtainMessage.obj = message;
        this.f84962i.sendMessage(obtainMessage);
        try {
            synchronized (message) {
                while (message.arg1 != 0) {
                    message.wait(10);
                }
            }
            return (C32587h) message.obj;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo83900a(int i, int i2) {
        this.f84971r = i;
        this.f84970q = i2;
        if (this.f84966m != null) {
            this.f84966m.mo83925c();
            this.f84966m.mo83924a(this.f84971r, this.f84970q);
        }
        if (this.f84965l != null) {
            this.f84965l.mo83925c();
            this.f84965l.mo83924a(this.f84971r, this.f84970q);
        }
    }

    public C32589j(Object obj, Object obj2) {
        this.f84958e = obj;
        this.f84972s = false;
        this.f84955b = 3;
        this.f84961h.start();
        m105581k();
        this.f84956c = new float[16];
    }

    /* renamed from: a */
    public final void mo83901a(Message message, int i, int i2) {
        C32587h hVar;
        if (i == 0 && i2 == 0 && this.f84968o != null) {
            hVar = this.f84968o.mo83928a(1000);
        } else if (this.f84967n != null) {
            hVar = this.f84967n.mo83928a(1000);
        } else {
            hVar = null;
        }
        message.obj = hVar;
        synchronized (message) {
            message.arg1 = 0;
            message.notify();
        }
    }
}
