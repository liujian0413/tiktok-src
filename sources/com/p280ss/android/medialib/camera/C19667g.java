package com.p280ss.android.medialib.camera;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Pair;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19629a;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19630b;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19632d;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19633e;
import com.p280ss.android.medialib.camera.p882a.C19636b;
import com.p280ss.android.medialib.camera.p882a.C19636b.C19637a;
import com.p280ss.android.medialib.camera.p882a.C19638c;
import com.p280ss.android.medialib.camera.p882a.C19641d;
import com.p280ss.android.medialib.common.C19702a.C19703a;
import com.p280ss.android.medialib.log.C19752b;
import com.p280ss.android.medialib.presenter.C19761a;
import com.p280ss.android.medialib.presenter.C19762b;
import com.p280ss.android.medialib.presenter.C19763c;
import com.p280ss.android.ttve.monitor.C20479f;
import com.p280ss.android.vesdk.C45372t;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.medialib.camera.g */
public final class C19667g {

    /* renamed from: a */
    public static LinkedList<Pair<Integer, Integer>> f53272a = null;

    /* renamed from: l */
    public static boolean f53273l = true;

    /* renamed from: y */
    private static C19667g f53274y;

    /* renamed from: A */
    private int f53275A = -1;

    /* renamed from: B */
    private C19703a f53276B = new C19703a() {
        /* renamed from: b */
        public final void mo52266b() {
            C45372t.m143405b("IESCameraManager", "onOpenGLDestroy...");
            if (C19667g.this.f53296u != null) {
                C19667g.this.f53296u.mo52266b();
            }
        }

        /* renamed from: a */
        public final void mo52265a() {
            C45372t.m143405b("IESCameraManager", "onOpenGLCreate...");
            if (C19667g.this.f53282f == null || C19667g.this.f53296u == null) {
                C45372t.m143409d("IESCameraManager", "presenter or camera provider is null!");
                return;
            }
            C19667g.this.f53296u.mo52265a();
            C19667g.this.f53296u.mo52261a((C19637a) new C19637a() {
                /* renamed from: a */
                public final void mo52264a() {
                    if (C19667g.this.f53286j != null) {
                        C19667g.this.f53286j.mo52343a();
                    }
                    C19667g.this.f53290o++;
                    if (C19667g.this.f53290o == 30) {
                        C19667g.this.f53291p = System.currentTimeMillis();
                        float f = 30000.0f / ((float) (C19667g.this.f53291p - C19667g.this.f53292q));
                        StringBuilder sb = new StringBuilder("Render FPS = ");
                        sb.append(f);
                        C45372t.m143405b("IESCameraManager", sb.toString());
                        C19667g.this.f53292q = C19667g.this.f53291p;
                        C19667g.this.f53290o = 0;
                    }
                }
            });
            C19667g.this.f53296u.mo52263d();
            C19667g.this.f53290o = 0;
            C19667g gVar = C19667g.this;
            C19667g gVar2 = C19667g.this;
            long currentTimeMillis = System.currentTimeMillis();
            gVar2.f53292q = currentTimeMillis;
            gVar.f53291p = currentTimeMillis;
        }

        /* renamed from: c */
        public final int mo52267c() {
            int i;
            if (C19667g.this.f53297v.getAndSet(false) && C19667g.this.f53287k.f53253b != null) {
                C19667g.this.mo52326b(C19667g.this.f53287k.f53253b);
            }
            if (C19667g.this.f53296u != null) {
                i = C19667g.this.f53296u.mo52267c();
            } else {
                i = 0;
            }
            if (i < 0) {
                return i;
            }
            if (C19667g.this.f53278b != null && C19667g.this.f53278b.mo52244n()) {
                return -3;
            }
            if (C19667g.this.f53295t) {
                return -4;
            }
            return 0;
        }
    };

    /* renamed from: C */
    private int[] f53277C = new int[2];

    /* renamed from: b */
    public IESCameraInterface f53278b;

    /* renamed from: c */
    public C19762b f53279c;

    /* renamed from: d */
    public C19761a f53280d;

    /* renamed from: e */
    public C19633e f53281e;

    /* renamed from: f */
    public C19763c f53282f;

    /* renamed from: g */
    public int f53283g;

    /* renamed from: h */
    public volatile boolean f53284h;

    /* renamed from: i */
    public boolean f53285i;

    /* renamed from: j */
    public C19672a f53286j;

    /* renamed from: k */
    public C19663e f53287k;

    /* renamed from: m */
    public boolean f53288m;

    /* renamed from: n */
    public int f53289n;

    /* renamed from: o */
    public int f53290o;

    /* renamed from: p */
    public long f53291p;

    /* renamed from: q */
    public long f53292q;

    /* renamed from: r */
    public final Object f53293r = new Object();

    /* renamed from: s */
    public long f53294s = 0;

    /* renamed from: t */
    public boolean f53295t = false;

    /* renamed from: u */
    public C19636b f53296u;

    /* renamed from: v */
    public AtomicBoolean f53297v = new AtomicBoolean(false);

    /* renamed from: w */
    public C19662d f53298w;

    /* renamed from: x */
    C19662d f53299x;

    /* renamed from: z */
    private C19632d f53300z;

    /* renamed from: com.ss.android.medialib.camera.g$a */
    public interface C19672a {
        /* renamed from: a */
        void mo52343a();
    }

    /* renamed from: a */
    public final synchronized void mo52317a(C19663e eVar) {
        if (this.f53278b != null) {
            this.f53278b.mo52233c();
        }
        if (eVar.f53266o == 4 && eVar.f53254c != 1) {
            eVar.f53266o = 1;
        }
        this.f53287k = eVar;
        if (VERSION.SDK_INT >= 23 && eVar.f53254c == 3) {
            this.f53278b = C19634a.m64670a();
        } else if (eVar.f53254c == 4 && VERSION.SDK_INT >= 23) {
            this.f53278b = new C19673h();
            eVar.f53254c = 4;
        } else if (VERSION.SDK_INT > 27 && eVar.f53254c == 5) {
            this.f53278b = new C19686i();
        } else if (eVar.f53254c != 2 || VERSION.SDK_INT < 24) {
            this.f53278b = new C19643b();
            eVar.f53254c = 1;
        } else {
            this.f53278b = new C19649c();
            eVar.f53254c = 2;
        }
        synchronized (this.f53293r) {
            this.f53278b.mo52221a(eVar);
        }
        this.f53285i = true;
    }

    /* renamed from: a */
    public final synchronized void mo52316a(C19633e eVar) {
        this.f53281e = eVar;
        if (this.f53278b != null) {
            this.f53278b.mo52220a(eVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo52319a(boolean z) {
        synchronized (this.f53293r) {
            if (this.f53278b != null) {
                this.f53278b.mo52222a(z);
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo52320a(int i) {
        boolean a;
        synchronized (this.f53293r) {
            a = this.f53278b.mo52224a(i);
        }
        return a;
    }

    /* renamed from: a */
    public final synchronized boolean mo52321a(int i, int i2, float f, float[] fArr, int i3) {
        boolean a;
        synchronized (this.f53293r) {
            a = this.f53278b.mo52225a(i, i2, f, fArr, i3);
        }
        return a;
    }

    /* renamed from: a */
    public final synchronized boolean mo52322a(final int i, C19662d dVar) {
        boolean a;
        String str = "IESCameraManager";
        StringBuilder sb = new StringBuilder("open: thread id = ");
        sb.append(Thread.currentThread().getId());
        C45372t.m143403a(str, sb.toString());
        C19752b.f53602a = System.currentTimeMillis();
        C20479f.m67948a(0, "te_record_camera_direction", (long) i);
        this.f53298w = dVar;
        this.f53299x = new C19662d() {
            /* renamed from: a */
            public final void mo52271a(int i) {
                StringBuilder sb = new StringBuilder("Open camera ");
                sb.append(i);
                sb.append(" succeed, thread id = ");
                sb.append(Thread.currentThread().getId());
                C45372t.m143403a("IESCameraManager", sb.toString());
                C19667g.this.mo52332e();
                if (C19667g.this.f53298w != null) {
                    C19667g.this.f53298w.mo52271a(i);
                } else {
                    C45372t.m143409d("IESCameraManager", "mClientListener is null!");
                }
            }

            /* renamed from: a */
            public final void mo52272a(int i, int i2, String str) {
                StringBuilder sb = new StringBuilder("Open camera ");
                sb.append(i);
                sb.append(" failed, errorCodec = ");
                sb.append(i2);
                sb.append(", info: ");
                sb.append(str);
                C45372t.m143409d("IESCameraManager", sb.toString());
                if (i == 2 && C19667g.this.f53287k.f53270s) {
                    C45372t.m143407c("IESCameraManager", "Switch to camera1 api!");
                    synchronized (C19667g.this.f53293r) {
                        if (C19667g.this.f53278b != null) {
                            C19667g.this.f53278b.mo52228b();
                        }
                        C19667g.this.f53287k.f53254c = 1;
                        C19667g.this.f53278b = new C19643b();
                        C19667g.this.f53278b.mo52221a(C19667g.this.f53287k);
                        C19667g.this.f53278b.mo52220a(C19667g.this.f53281e);
                        C19667g.this.f53278b.mo52226a(i, C19667g.this.f53299x);
                    }
                } else if (C19667g.this.f53298w != null) {
                    C19667g.this.f53298w.mo52272a(i, i2, str);
                }
            }
        };
        synchronized (this.f53293r) {
            a = this.f53278b.mo52226a(i, this.f53299x);
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo52323a(C19662d dVar) {
        return mo52322a(0, dVar);
    }

    /* renamed from: a */
    public final synchronized void mo52318a(C19763c cVar) {
        this.f53282f = cVar;
        this.f53282f.mo52881a(this.f53276B);
        if (this.f53296u != null) {
            this.f53296u.mo52262a(this.f53282f);
        } else {
            C45372t.m143409d("IESCameraManager", "attach::CameraProvider is null!");
        }
    }

    /* renamed from: c */
    public final int mo52328c() {
        return this.f53277C[0];
    }

    /* renamed from: d */
    public final int mo52330d() {
        return this.f53277C[1];
    }

    /* renamed from: j */
    public final int[] mo52337j() {
        return this.f53278b.mo52241k();
    }

    /* renamed from: a */
    public final int mo52309a() {
        if (this.f53287k != null) {
            return this.f53287k.f53254c;
        }
        return 1;
    }

    /* renamed from: n */
    public final int mo52341n() {
        if (this.f53278b == null) {
            return -1;
        }
        return this.f53278b.mo52243m();
    }

    /* renamed from: o */
    public final int mo52342o() {
        if (this.f53278b instanceof C19649c) {
            return ((C19649c) this.f53278b).f53217e;
        }
        return 0;
    }

    /* renamed from: b */
    public static C19667g m64797b() {
        if (f53274y == null) {
            synchronized (C19667g.class) {
                if (f53274y == null) {
                    f53274y = new C19667g();
                }
            }
        }
        return f53274y;
    }

    /* renamed from: f */
    public final synchronized void mo52333f() {
        synchronized (this.f53293r) {
            if (this.f53278b != null) {
                this.f53278b.mo52228b();
            }
        }
        this.f53288m = false;
        this.f53289n = 0;
        this.f53298w = null;
    }

    /* renamed from: g */
    public final synchronized float mo52334g() {
        float i;
        i = this.f53278b.mo52239i();
        C20479f.m67947a(0, "te_preview_camera_zoom", (double) i);
        return i;
    }

    /* renamed from: h */
    public final synchronized boolean mo52335h() {
        if (this.f53275A == -1 && this.f53278b != null) {
            this.f53275A = this.f53278b.mo52223a() ? 1 : 0;
        }
        if (this.f53275A == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final synchronized boolean mo52336i() {
        boolean z;
        synchronized (this.f53293r) {
            if (this.f53278b == null || !this.f53278b.mo52240j()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: k */
    public final void mo52338k() {
        C45372t.m143405b("IESCameraManager", "re-startPreview...");
        synchronized (this.f53293r) {
            if (this.f53278b != null) {
                this.f53278b.mo52234d();
            }
        }
    }

    /* renamed from: l */
    public final void mo52339l() {
        C45372t.m143405b("IESCameraManager", "stopPreview...");
        synchronized (this.f53293r) {
            this.f53278b.mo52235e();
        }
    }

    /* renamed from: m */
    public final synchronized void mo52340m() {
        mo52333f();
        if (this.f53296u != null) {
            this.f53296u.mo52262a((C19763c) null);
        }
        this.f53282f = null;
    }

    private C19667g() {
    }

    /* renamed from: e */
    public final void mo52332e() {
        if (this.f53287k.f53266o == 1) {
            this.f53296u = new C19641d(this.f53278b);
        } else {
            this.f53296u = new C19638c(this.f53278b);
        }
        this.f53296u.mo52262a(this.f53282f);
    }

    /* renamed from: b */
    public final synchronized void mo52325b(int i) {
    }

    /* renamed from: c */
    public final synchronized void mo52329c(boolean z) {
    }

    /* renamed from: a */
    public final void mo52314a(C19629a aVar) {
        this.f53278b.mo52217a(aVar);
    }

    /* renamed from: b */
    public final synchronized void mo52327b(boolean z) {
        this.f53295t = z;
    }

    /* renamed from: b */
    public final synchronized void mo52324b(float f) {
        this.f53278b.mo52229b(f);
    }

    /* renamed from: d */
    public final void mo52331d(boolean z) {
        if ((this.f53278b instanceof C19673h) || (this.f53278b instanceof C19686i)) {
            this.f53278b.mo52231b(z);
        }
    }

    /* renamed from: a */
    public final synchronized void mo52310a(float f) {
        synchronized (this.f53293r) {
            this.f53278b.mo52214a(f);
        }
    }

    /* renamed from: b */
    public final synchronized void mo52326b(Context context) {
        int b;
        int i = 0;
        switch (((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 0:
                break;
            case 1:
                i = 90;
                break;
            case 2:
                i = NormalGiftView.ALPHA_180;
                break;
            case 3:
                i = 270;
                break;
        }
        synchronized (this.f53293r) {
            b = this.f53278b.mo52227b(i);
        }
        this.f53283g = b;
        if (this.f53279c != null) {
            StringBuilder sb = new StringBuilder("摄像头偏转角度: ");
            sb.append(b);
            C45372t.m143403a("IESCameraManager", sb.toString());
            this.f53279c.mo52873i_(b);
        }
    }

    /* renamed from: a */
    public final synchronized void mo52312a(Context context) {
        C45372t.m143405b("IESCameraManager", "start: ");
        C20479f.m67948a(0, "te_record_camera_type", (long) this.f53287k.f53254c);
        mo52326b(context);
        synchronized (this.f53293r) {
            this.f53277C = this.f53278b.mo52238h();
        }
        if (f53272a == null) {
            List<int[]> l = this.f53278b.mo52242l();
            f53272a = new LinkedList<>();
            for (int[] iArr : l) {
                f53272a.add(new Pair(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1])));
            }
        }
        if (this.f53280d != null) {
            this.f53280d.mo52872b(this.f53277C[0], this.f53277C[1]);
        } else {
            C45372t.m143409d("IESCameraManager", "mCameraPreviewSizeInterface is null!");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53277C[0]);
        sb.append("*");
        sb.append(this.f53277C[1]);
        C20479f.m67949a(0, "te_preview_camera_resolution", sb.toString());
    }

    /* renamed from: a */
    public final synchronized void mo52315a(C19632d dVar) {
        this.f53300z = dVar;
        if (this.f53278b != null) {
            this.f53278b.mo52219a(dVar);
        }
    }

    /* renamed from: a */
    public static boolean m64795a(Context context, int i) {
        if (i != 3 && i == 4 && VERSION.SDK_INT >= 23 && C19673h.m64851a(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m64796a(Context context, int i, int i2) {
        if (i != 5 || VERSION.SDK_INT <= 27 || !C19686i.m64903a(context, i2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo52311a(int i, int i2, C19630b bVar) {
        this.f53278b.mo52215a(i, i2, bVar);
    }

    /* renamed from: a */
    public final synchronized void mo52313a(Context context, int i, C19662d dVar) {
        String str = "IESCameraManager";
        StringBuilder sb = new StringBuilder("changeCamera: ");
        sb.append(i);
        C45372t.m143403a(str, sb.toString());
        if (this.f53284h) {
            C45372t.m143403a("IESCameraManager", "changeCamera: return");
            return;
        }
        this.f53284h = true;
        final long currentTimeMillis = System.currentTimeMillis();
        C19752b.f53603b = currentTimeMillis;
        synchronized (this.f53293r) {
            IESCameraInterface iESCameraInterface = this.f53278b;
            final Context context2 = context;
            final C19662d dVar2 = dVar;
            C196702 r1 = new C19662d() {
                /* renamed from: a */
                public final void mo52271a(int i) {
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    C20479f.m67953a("iesve_record_switch_camera_time", 1.0f, (float) currentTimeMillis);
                    C20479f.m67948a(0, "te_record_switch_camera_time", currentTimeMillis);
                    C19667g.this.mo52312a(context2);
                    if (C19667g.this.f53296u != null) {
                        C19667g.this.f53296u.mo52263d();
                    }
                    if (dVar2 != null) {
                        dVar2.mo52271a(i);
                    }
                    C19667g.this.f53284h = false;
                    C19667g.this.f53294s = System.currentTimeMillis();
                }

                /* renamed from: a */
                public final void mo52272a(int i, int i2, String str) {
                    if (dVar2 != null) {
                        dVar2.mo52272a(i, i2, str);
                    }
                    C19667g.this.f53284h = false;
                    C19667g.this.f53294s = System.currentTimeMillis();
                }
            };
            if (!iESCameraInterface.mo52232b(i, r1)) {
                this.f53284h = false;
            }
        }
    }
}
