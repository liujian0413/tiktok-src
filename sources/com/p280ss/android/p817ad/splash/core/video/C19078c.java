package com.p280ss.android.p817ad.splash.core.video;

import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.SurfaceHolder;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.p817ad.splash.core.video.p832a.C19066b;
import com.p280ss.android.p817ad.splash.core.video.p832a.C19068c;
import com.p280ss.android.p817ad.splash.core.video.p832a.C19068c.C19069a;
import com.p280ss.android.p817ad.splash.core.video.p832a.C19068c.C19070b;
import com.p280ss.android.p817ad.splash.core.video.p832a.C19068c.C19071c;
import com.p280ss.android.p817ad.splash.core.video.p832a.C19068c.C19072d;
import com.p280ss.android.p817ad.splash.core.video.p832a.C19068c.C19073e;
import com.p280ss.android.p817ad.splash.core.video.p832a.C19068c.C19074f;
import com.p280ss.android.p817ad.splash.p836g.C19139p;
import com.p280ss.android.p817ad.splash.p836g.C19139p.C19140a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ad.splash.core.video.c */
public final class C19078c implements C19069a, C19070b, C19071c, C19072d, C19073e, C19074f, C19140a {

    /* renamed from: m */
    private static boolean f51537m;

    /* renamed from: n */
    private static Map<Integer, Integer> f51538n = new HashMap();

    /* renamed from: a */
    public C19068c f51539a;

    /* renamed from: b */
    public int f51540b;

    /* renamed from: c */
    public Handler f51541c;

    /* renamed from: d */
    public boolean f51542d;

    /* renamed from: e */
    private boolean f51543e;

    /* renamed from: f */
    private boolean f51544f;

    /* renamed from: g */
    private boolean f51545g;

    /* renamed from: h */
    private long f51546h;

    /* renamed from: i */
    private Handler f51547i;

    /* renamed from: j */
    private ArrayList<Runnable> f51548j;

    /* renamed from: k */
    private int f51549k;

    /* renamed from: l */
    private int f51550l;

    /* renamed from: o */
    private final Set<SurfaceTexture> f51551o;

    /* renamed from: p */
    private final Object f51552p;

    /* renamed from: q */
    private StringBuilder f51553q;

    /* renamed from: a */
    public final void mo50705a(boolean z, long j, boolean z2) {
        this.f51542d = false;
        if (this.f51539a != null) {
            m62498b(true);
        }
        m62499e();
        this.f51546h = 0;
    }

    /* renamed from: a */
    public final void mo50704a(boolean z) {
        if (this.f51539a != null) {
            float f = z ? 0.0f : 1.0f;
            this.f51539a.mo50673a(f, f);
        }
    }

    /* renamed from: a */
    public final void mo50703a(final String str) {
        m62496b((Runnable) new Runnable() {
            public final void run() {
                C19078c.this.mo50701a();
                if (C19078c.this.f51541c != null) {
                    C19078c.this.f51541c.obtainMessage(107, str).sendToTarget();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo50695a(C19068c cVar, int i) {
        if (this.f51539a == cVar && this.f51547i != null) {
            this.f51547i.obtainMessage(301, Integer.valueOf(i)).sendToTarget();
        }
    }

    /* renamed from: a */
    public final boolean mo50697a(C19068c cVar, int i, int i2) {
        this.f51540b = C34943c.f91127w;
        m62500f();
        if (this.f51547i != null) {
            this.f51547i.obtainMessage(303, i, i2).sendToTarget();
        }
        return false;
    }

    /* renamed from: e */
    private void m62499e() {
        m62496b((Runnable) new Runnable() {
            public final void run() {
                if (C19078c.this.f51541c != null) {
                    C19078c.this.f51541c.sendEmptyMessage(104);
                }
            }
        });
    }

    /* renamed from: h */
    private void m62502h() {
        if (f51537m) {
            m62493a(this.f51550l, false);
            f51537m = false;
        }
    }

    /* renamed from: d */
    public final void mo50708d() {
        if (this.f51541c != null) {
            this.f51541c.obtainMessage(108).sendToTarget();
        }
    }

    /* renamed from: g */
    private void m62501g() {
        if (this.f51548j != null && !this.f51548j.isEmpty()) {
            this.f51548j.clear();
        }
    }

    /* renamed from: f */
    private void m62500f() {
        Integer num = (Integer) f51538n.get(Integer.valueOf(this.f51549k));
        if (num == null) {
            f51538n.put(Integer.valueOf(this.f51549k), Integer.valueOf(1));
        } else {
            f51538n.put(Integer.valueOf(this.f51549k), Integer.valueOf(num.intValue() + 1));
        }
    }

    /* renamed from: c */
    public final void mo50707c() {
        this.f51540b = 203;
        if (this.f51539a != null) {
            m62501g();
            if (this.f51541c != null) {
                try {
                    m62497b("release");
                    this.f51541c.removeCallbacksAndMessages(null);
                    this.f51545g = true;
                    this.f51541c.sendEmptyMessage(103);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo50706b() {
        this.f51541c.removeMessages(100);
        this.f51542d = true;
        this.f51541c.sendEmptyMessage(BaseNotice.HASHTAG);
    }

    /* renamed from: a */
    public final void mo50701a() {
        if (this.f51539a == null) {
            this.f51539a = new C19066b();
            this.f51539a.mo50666a((C19073e) this);
            this.f51539a.mo50663a((C19070b) this);
            this.f51539a.mo50664a((C19071c) this);
            this.f51539a.mo50662a((C19069a) this);
            this.f51539a.mo50667a((C19074f) this);
            this.f51539a.mo50665a((C19072d) this);
            this.f51539a.mo50680b(this.f51543e);
            this.f51544f = false;
        }
    }

    public C19078c(Handler handler) {
        this(handler, -1);
    }

    /* renamed from: a */
    private boolean m62495a(SurfaceTexture surfaceTexture) {
        boolean contains;
        synchronized (this.f51551o) {
            contains = this.f51551o.contains(surfaceTexture);
        }
        return contains;
    }

    /* renamed from: b */
    private void m62496b(Runnable runnable) {
        if (!this.f51545g) {
            runnable.run();
        } else {
            m62494a(runnable);
        }
    }

    /* renamed from: c */
    public final void mo50700c(C19068c cVar) {
        if (this.f51547i != null) {
            this.f51547i.sendEmptyMessage(306);
        }
    }

    /* renamed from: b */
    private void m62497b(String str) {
        if (this.f51541c != null) {
            this.f51541c.removeMessages(201);
        }
        synchronized (this.f51552p) {
            if (this.f51553q != null) {
                this.f51553q = null;
            }
        }
    }

    /* renamed from: b */
    private void m62498b(boolean z) {
        if (z) {
            try {
                this.f51539a.mo50673a(0.0f, 0.0f);
            } catch (Throwable unused) {
            }
        } else {
            this.f51539a.mo50673a(1.0f, 1.0f);
        }
    }

    /* renamed from: a */
    private void m62494a(Runnable runnable) {
        if (this.f51548j == null) {
            this.f51548j = new ArrayList<>();
        }
        this.f51548j.add(runnable);
    }

    /* renamed from: b */
    public final void mo50699b(C19068c cVar) {
        this.f51540b = 205;
        if (this.f51542d) {
            this.f51541c.post(new Runnable() {
                public final void run() {
                    try {
                        C19078c.this.f51539a.mo50683g();
                        C19078c.this.f51540b = 207;
                        C19078c.this.f51542d = false;
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            this.f51541c.sendMessage(this.f51541c.obtainMessage(100, -1, -1));
        }
        f51538n.remove(Integer.valueOf(this.f51549k));
        if (this.f51547i != null) {
            this.f51547i.sendEmptyMessage(305);
        }
    }

    /* renamed from: a */
    public final void mo50702a(final SurfaceHolder surfaceHolder) {
        m62496b((Runnable) new Runnable() {
            public final void run() {
                C19078c.this.mo50701a();
                if (C19078c.this.f51541c != null) {
                    C19078c.this.f51541c.obtainMessage(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01dd, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0170, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0171, code lost:
        r18 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50406a(android.os.Message r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            int r2 = r0.what
            java.lang.String r3 = ""
            com.ss.android.ad.splash.core.video.a.c r4 = r1.f51539a
            r7 = 1
            if (r4 == 0) goto L_0x0232
            int r4 = r0.what
            r8 = 10
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 203(0xcb, float:2.84E-43)
            r11 = 201(0xc9, float:2.82E-43)
            r12 = 202(0xca, float:2.83E-43)
            r13 = 208(0xd0, float:2.91E-43)
            r14 = 205(0xcd, float:2.87E-43)
            r15 = 209(0xd1, float:2.93E-43)
            r5 = 207(0xcf, float:2.9E-43)
            r6 = 206(0xce, float:2.89E-43)
            switch(r4) {
                case 100: goto L_0x01f9;
                case 101: goto L_0x01cf;
                case 102: goto L_0x01b8;
                case 103: goto L_0x018f;
                case 104: goto L_0x0167;
                case 105: goto L_0x013d;
                case 106: goto L_0x0115;
                case 107: goto L_0x00e9;
                case 108: goto L_0x00bb;
                case 109: goto L_0x008d;
                case 110: goto L_0x0061;
                case 111: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0232
        L_0x0028:
            java.lang.Object r0 = r0.obj     // Catch:{ Exception -> 0x0053 }
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0     // Catch:{ Exception -> 0x0053 }
            java.util.Set<android.graphics.SurfaceTexture> r4 = r1.f51551o     // Catch:{ Exception -> 0x0053 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x0053 }
            boolean r5 = r1.m62495a(r0)     // Catch:{ all -> 0x0050 }
            if (r5 != 0) goto L_0x003f
            com.ss.android.ad.splash.core.video.a.c r5 = r1.f51539a     // Catch:{ all -> 0x0050 }
            android.view.Surface r6 = new android.view.Surface     // Catch:{ all -> 0x0050 }
            r6.<init>(r0)     // Catch:{ all -> 0x0050 }
            r5.mo50676a(r6)     // Catch:{ all -> 0x0050 }
        L_0x003f:
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51539a     // Catch:{ Exception -> 0x0053 }
            r0.mo50679a(r7)     // Catch:{ Exception -> 0x0053 }
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51539a     // Catch:{ Exception -> 0x0053 }
            android.content.Context r4 = com.p280ss.android.p817ad.splash.core.C19025f.m62096J()     // Catch:{ Exception -> 0x0053 }
            r0.mo50675a(r4, r8)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0232
        L_0x0050:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ Exception -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.String r3 = r0.getMessage()
            r0.getMessage()
            goto L_0x0235
        L_0x0061:
            java.lang.Object r0 = r0.obj     // Catch:{ Exception -> 0x007f }
            android.view.SurfaceHolder r0 = (android.view.SurfaceHolder) r0     // Catch:{ Exception -> 0x007f }
            com.ss.android.ad.splash.core.video.a.c r4 = r1.f51539a     // Catch:{ Exception -> 0x007f }
            r4.mo50677a(r0)     // Catch:{ Exception -> 0x007f }
            int r0 = r1.f51549k     // Catch:{ Exception -> 0x007f }
            r4 = 2
            if (r0 != r4) goto L_0x0078
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51539a     // Catch:{ Exception -> 0x007f }
            android.content.Context r4 = com.p280ss.android.p817ad.splash.core.C19025f.m62096J()     // Catch:{ Exception -> 0x007f }
            r0.mo50675a(r4, r8)     // Catch:{ Exception -> 0x007f }
        L_0x0078:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51539a     // Catch:{ Exception -> 0x007f }
            r0.mo50679a(r7)     // Catch:{ Exception -> 0x007f }
            goto L_0x0232
        L_0x007f:
            r0 = move-exception
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.String r3 = r0.getMessage()
            r0.getMessage()
            goto L_0x0235
        L_0x008d:
            int r0 = r1.f51540b
            if (r0 == r6) goto L_0x009a
            int r0 = r1.f51540b
            if (r0 != r5) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            r5 = 0
        L_0x0097:
            r16 = 0
            goto L_0x00b0
        L_0x009a:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51539a     // Catch:{ Exception -> 0x00a4 }
            long r14 = r0.mo50684h()     // Catch:{ Exception -> 0x00a4 }
            r16 = r14
            r5 = 0
            goto L_0x00b0
        L_0x00a4:
            r0 = move-exception
            r3 = 1011(0x3f3, float:1.417E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0097
        L_0x00b0:
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r1.m62492a(r0, r4)
            goto L_0x0235
        L_0x00bb:
            int r0 = r1.f51540b
            if (r0 == r6) goto L_0x00c8
            int r0 = r1.f51540b
            if (r0 != r5) goto L_0x00c4
            goto L_0x00c8
        L_0x00c4:
            r5 = 0
        L_0x00c5:
            r16 = 0
            goto L_0x00de
        L_0x00c8:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51539a     // Catch:{ Exception -> 0x00d2 }
            long r14 = r0.mo50685i()     // Catch:{ Exception -> 0x00d2 }
            r16 = r14
            r5 = 0
            goto L_0x00de
        L_0x00d2:
            r0 = move-exception
            r3 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x00c5
        L_0x00de:
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r1.m62492a(r0, r4)
            goto L_0x0235
        L_0x00e9:
            int r4 = r1.f51540b
            if (r4 == r11) goto L_0x00f1
            int r4 = r1.f51540b
            if (r4 != r10) goto L_0x0170
        L_0x00f1:
            java.lang.Object r0 = r0.obj     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0108 }
            if (r0 == 0) goto L_0x0104
            java.lang.String r4 = "/"
            boolean r4 = r0.startsWith(r4)     // Catch:{ Exception -> 0x0108 }
            if (r4 == 0) goto L_0x0104
            com.ss.android.ad.splash.core.video.a.c r4 = r1.f51539a     // Catch:{ Exception -> 0x0108 }
            r4.mo50678a(r0)     // Catch:{ Exception -> 0x0108 }
        L_0x0104:
            r1.f51540b = r12     // Catch:{ Exception -> 0x0108 }
            goto L_0x0232
        L_0x0108:
            r0 = move-exception
            r3 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x0115:
            int r4 = r1.f51540b
            if (r4 == r6) goto L_0x0121
            int r4 = r1.f51540b
            if (r4 == r5) goto L_0x0121
            int r4 = r1.f51540b
            if (r4 != r15) goto L_0x0170
        L_0x0121:
            com.ss.android.ad.splash.core.video.a.c r4 = r1.f51539a     // Catch:{ Exception -> 0x0130 }
            java.lang.Object r0 = r0.obj     // Catch:{ Exception -> 0x0130 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0130 }
            long r5 = r0.longValue()     // Catch:{ Exception -> 0x0130 }
            r4.mo50674a(r5)     // Catch:{ Exception -> 0x0130 }
            goto L_0x0232
        L_0x0130:
            r0 = move-exception
            r3 = 1007(0x3ef, float:1.411E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x013d:
            int r0 = r1.f51540b
            if (r0 == r14) goto L_0x0151
            int r0 = r1.f51540b
            if (r0 == r6) goto L_0x0151
            int r0 = r1.f51540b
            if (r0 == r13) goto L_0x0151
            int r0 = r1.f51540b
            if (r0 == r5) goto L_0x0151
            int r0 = r1.f51540b
            if (r0 != r15) goto L_0x0170
        L_0x0151:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51539a     // Catch:{ Exception -> 0x015a }
            r0.mo50682f()     // Catch:{ Exception -> 0x015a }
            r1.f51540b = r13     // Catch:{ Exception -> 0x015a }
            goto L_0x0232
        L_0x015a:
            r0 = move-exception
            r3 = 1008(0x3f0, float:1.413E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x0167:
            int r0 = r1.f51540b
            if (r0 == r12) goto L_0x0175
            int r0 = r1.f51540b
            if (r0 != r13) goto L_0x0170
            goto L_0x0175
        L_0x0170:
            r5 = 0
        L_0x0171:
            r18 = 1
            goto L_0x0237
        L_0x0175:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51539a     // Catch:{ Exception -> 0x0182 }
            com.ss.android.ad.splash.core.video.a.b r0 = (com.p280ss.android.p817ad.splash.core.video.p832a.C19066b) r0     // Catch:{ Exception -> 0x0182 }
            android.media.MediaPlayer r0 = r0.f51530a     // Catch:{ Exception -> 0x0182 }
            r0.prepare()     // Catch:{ Exception -> 0x0182 }
            r1.f51540b = r14     // Catch:{ Exception -> 0x0182 }
            goto L_0x0232
        L_0x0182:
            r0 = move-exception
            r3 = 1003(0x3eb, float:1.406E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x018f:
            java.util.Set<android.graphics.SurfaceTexture> r4 = r1.f51551o     // Catch:{ Exception -> 0x019e }
            monitor-enter(r4)     // Catch:{ Exception -> 0x019e }
            monitor-exit(r4)     // Catch:{ all -> 0x019b }
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51539a     // Catch:{ Exception -> 0x019e }
            r0.mo50686j()     // Catch:{ Exception -> 0x019e }
            r4 = 0
            r5 = 0
            goto L_0x01aa
        L_0x019b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x019b }
            throw r0     // Catch:{ Exception -> 0x019e }
        L_0x019e:
            r0 = move-exception
            r3 = 1009(0x3f1, float:1.414E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            r4 = 0
        L_0x01aa:
            r1.f51545g = r4
            r0 = 309(0x135, float:4.33E-43)
            r4 = 0
            r1.m62492a(r0, r4)
            r1.f51540b = r10
            r1.f51539a = r4
            goto L_0x0235
        L_0x01b8:
            r4 = 0
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51539a     // Catch:{ Exception -> 0x01c2 }
            r0.mo50687k()     // Catch:{ Exception -> 0x01c2 }
            r1.f51540b = r11     // Catch:{ Exception -> 0x01c2 }
            goto L_0x0233
        L_0x01c2:
            r0 = move-exception
            r3 = 1006(0x3ee, float:1.41E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x01cf:
            r4 = 0
            int r0 = r1.f51540b
            if (r0 == r6) goto L_0x01df
            int r0 = r1.f51540b
            if (r0 == r5) goto L_0x01df
            int r0 = r1.f51540b
            if (r0 != r15) goto L_0x01dd
            goto L_0x01df
        L_0x01dd:
            r5 = r4
            goto L_0x0171
        L_0x01df:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51539a     // Catch:{ Exception -> 0x01ec }
            r0.mo50683g()     // Catch:{ Exception -> 0x01ec }
            r1.f51540b = r5     // Catch:{ Exception -> 0x01ec }
            r8 = 0
            r1.f51542d = r8     // Catch:{ Exception -> 0x01ea }
            goto L_0x0234
        L_0x01ea:
            r0 = move-exception
            goto L_0x01ee
        L_0x01ec:
            r0 = move-exception
            r8 = 0
        L_0x01ee:
            r3 = 1005(0x3ed, float:1.408E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x01f9:
            r4 = 0
            r8 = 0
            int r0 = r1.f51540b
            if (r0 == r14) goto L_0x020b
            int r0 = r1.f51540b
            if (r0 == r6) goto L_0x020b
            int r0 = r1.f51540b
            if (r0 == r5) goto L_0x020b
            int r0 = r1.f51540b
            if (r0 != r15) goto L_0x01dd
        L_0x020b:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51539a     // Catch:{ Exception -> 0x0226 }
            r0.mo50681e()     // Catch:{ Exception -> 0x0226 }
            r1.f51540b = r6     // Catch:{ Exception -> 0x0226 }
            long r5 = r1.f51546h     // Catch:{ Exception -> 0x0226 }
            r9 = 0
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0234
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51539a     // Catch:{ Exception -> 0x0226 }
            long r5 = r1.f51546h     // Catch:{ Exception -> 0x0226 }
            r0.mo50674a(r5)     // Catch:{ Exception -> 0x0226 }
            r5 = -1
            r1.f51546h = r5     // Catch:{ Exception -> 0x0226 }
            goto L_0x0234
        L_0x0226:
            r0 = move-exception
            r3 = 1004(0x3ec, float:1.407E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x0232:
            r4 = 0
        L_0x0233:
            r8 = 0
        L_0x0234:
            r5 = r4
        L_0x0235:
            r18 = 0
        L_0x0237:
            if (r5 == 0) goto L_0x0244
            r0 = 310(0x136, float:4.34E-43)
            r1.m62492a(r0, r5)
            com.p280ss.android.p817ad.splash.p824b.C18956b.m61883a()
            com.p280ss.android.p817ad.splash.p824b.C18956b.m61885a(r5, r3)
        L_0x0244:
            if (r18 == 0) goto L_0x0259
            r0 = 200(0xc8, float:2.8E-43)
            r1.f51540b = r0
            boolean r0 = r1.f51544f
            if (r0 != 0) goto L_0x0259
            r0 = 308(0x134, float:4.32E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.m62492a(r0, r2)
            r1.f51544f = r7
        L_0x0259:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p817ad.splash.core.video.C19078c.mo50406a(android.os.Message):void");
    }

    /* renamed from: a */
    public final void mo50696a(C19068c cVar) {
        int i;
        if (!this.f51543e) {
            i = 209;
        } else {
            i = 206;
        }
        this.f51540b = i;
        f51538n.remove(Integer.valueOf(this.f51549k));
        if (this.f51547i != null) {
            this.f51547i.obtainMessage(302).sendToTarget();
        }
        m62497b("completion");
    }

    /* renamed from: a */
    private void m62492a(int i, Object obj) {
        if (i == 309) {
            m62502h();
        }
        if (this.f51547i != null) {
            this.f51547i.obtainMessage(i, obj).sendToTarget();
        }
    }

    private C19078c(Handler handler, int i) {
        this.f51540b = 201;
        this.f51546h = -1;
        this.f51551o = new HashSet();
        this.f51552p = new Object();
        this.f51553q = null;
        this.f51549k = 0;
        this.f51547i = handler;
        HandlerThread handlerThread = new HandlerThread("VideoManager");
        handlerThread.start();
        this.f51541c = new C19139p(handlerThread.getLooper(), this);
        mo50701a();
    }

    /* renamed from: a */
    private void m62493a(int i, boolean z) {
        AudioManager audioManager = (AudioManager) C19025f.m62096J().getSystemService("audio");
        if (audioManager != null) {
            audioManager.setStreamVolume(3, i, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo50698b(C19068c cVar, int i, int i2) {
        if (this.f51539a == cVar && this.f51547i != null) {
            this.f51547i.obtainMessage(304, i, i2).sendToTarget();
        }
        return false;
    }
}
