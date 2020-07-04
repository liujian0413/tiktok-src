package com.p280ss.android.ugc.aweme.player.sdk.p1459b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.player.sdk.C34963a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34971a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34972b;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34974d;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34969e;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34970f;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.model.C44923g;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import com.p280ss.android.ugc.playerkit.p1750a.C44907a;
import p346io.reactivex.C7499z;
import p346io.reactivex.p1865a.p1867b.C47549a;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.b.c */
public class C34982c implements C34974d {

    /* renamed from: e */
    private static final String f91273e = "c";

    /* renamed from: a */
    public C34974d f91274a;

    /* renamed from: b */
    public C34976f f91275b;

    /* renamed from: c */
    public Handler f91276c;

    /* renamed from: d */
    public boolean f91277d;

    /* renamed from: f */
    private HandlerThread f91278f;

    /* renamed from: g */
    private C34987a f91279g;

    /* renamed from: h */
    private String f91280h;

    /* renamed from: i */
    private C7499z f91281i;

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.b.c$a */
    static class C34987a extends Handler {

        /* renamed from: a */
        private C34974d f91288a;

        /* renamed from: b */
        private volatile int f91289b = C34943c.f91128x;

        /* renamed from: c */
        private C34988a f91290c;

        /* renamed from: com.ss.android.ugc.aweme.player.sdk.b.c$a$a */
        interface C34988a {
            /* renamed from: a */
            void mo88671a();
        }

        /* renamed from: a */
        public final void mo88674a(int i) {
            if (i > 0) {
                this.f91289b = i;
            }
        }

        public final void handleMessage(Message message) {
            if (this.f91288a != null) {
                switch (message.what) {
                    case 0:
                        return;
                    case 1:
                        this.f91288a.mo88626a((C44923g) message.obj);
                        return;
                    case 3:
                        this.f91288a.mo88634c();
                        return;
                    case 4:
                        this.f91288a.mo88627a((String) message.obj);
                        return;
                    case 5:
                        this.f91288a.mo88636e();
                        return;
                    case 6:
                        this.f91288a.mo88635d();
                        return;
                    case 7:
                        this.f91288a.mo88637f();
                        return;
                    case 8:
                        this.f91288a.mo88629b();
                        return;
                    case 9:
                        Pair pair = (Pair) message.obj;
                        if (pair != null) {
                            this.f91288a.mo88618a(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                            return;
                        }
                        break;
                    case 10:
                        removeMessages(12);
                        Looper looper = getLooper();
                        if (!(looper == null || looper == Looper.getMainLooper())) {
                            looper.quit();
                        }
                        if (this.f91290c != null) {
                            this.f91290c.mo88671a();
                            return;
                        }
                        break;
                    case 11:
                        this.f91288a.mo88617a(((Float) message.obj).floatValue());
                        return;
                    case 12:
                        this.f91288a.mo88648q();
                        sendEmptyMessageDelayed(12, (long) this.f91289b);
                        return;
                    case 13:
                        Pair pair2 = (Pair) message.obj;
                        if (pair2 != null) {
                            this.f91288a.mo88619a(((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
                            return;
                        }
                        break;
                    case 14:
                        this.f91288a.mo88621a((SurfaceHolder) message.obj);
                        break;
                    case 16:
                        this.f91288a.mo88616a();
                        return;
                }
            }
        }

        public C34987a(C34988a aVar, Looper looper, C34974d dVar) {
            super(looper);
            this.f91288a = dVar;
            this.f91290c = aVar;
        }
    }

    /* renamed from: q */
    public final void mo88648q() {
    }

    /* renamed from: a */
    public final void mo88626a(C44923g gVar) {
        if (gVar != null) {
            if (this.f91277d) {
                C2077a.m9161a((Throwable) new Exception(), "mIsLastPlayThreadQuiting when prepare");
                return;
            }
            if (gVar.f115550q) {
                if (this.f91279g == null) {
                    m112804w();
                }
                this.f91279g.obtainMessage(1, gVar).sendToTarget();
            }
            this.f91280h = gVar.f115537d;
            if (gVar.f115551r) {
                mo88670a(9, (Object) gVar.f115537d);
            }
        }
    }

    /* renamed from: a */
    public final void mo88627a(String str) {
        if (this.f91279g != null) {
            this.f91279g.obtainMessage(4, str).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo88625a(C44907a aVar) {
        this.f91274a.mo88625a(aVar);
    }

    /* renamed from: a */
    public final boolean mo88628a(String str, String str2) {
        return TextUtils.equals(str, this.f91280h);
    }

    /* renamed from: a */
    public final void mo88623a(C34972b bVar) {
        this.f91274a.mo88623a(bVar);
    }

    /* renamed from: a */
    public final void mo88624a(C34976f fVar) {
        this.f91275b = fVar;
        this.f91274a.mo88624a((C34976f) new C34976f() {
            /* renamed from: a */
            public final void mo63043a(C44919c cVar) {
                C34982c.this.mo88670a(2, (Object) cVar);
            }

            /* renamed from: b */
            public final void mo64946b(C44919c cVar) {
                C34982c.this.mo88670a(8, (Object) cVar);
            }

            /* renamed from: c */
            public final void mo64949c(String str) {
                C34982c.this.mo88670a(9, (Object) str);
            }

            /* renamed from: d */
            public final void mo64951d(String str) {
                C34982c.this.mo88670a(3, (Object) str);
            }

            /* renamed from: e */
            public final void mo64953e(String str) {
                C34982c.this.mo88670a(4, (Object) str);
            }

            /* renamed from: a */
            public final void mo63044a(C44920d dVar) {
                C34982c.this.mo88670a(0, (Object) dVar);
            }

            /* renamed from: b */
            public final void mo64944b(float f) {
                C34982c.this.mo88670a(10, (Object) Float.valueOf(f));
            }

            /* renamed from: e_ */
            public final void mo64954e_(boolean z) {
                C34982c.this.mo88670a(5, (Object) Boolean.valueOf(z));
            }

            /* renamed from: a */
            public final void mo63045a(C44921e eVar) {
                C34982c.this.mo88670a(7, (Object) eVar);
            }

            /* renamed from: b */
            public final void mo63047b(String str) {
                C34982c.this.mo88670a(6, (Object) str);
            }

            /* renamed from: a */
            public final void mo63046a(String str) {
                C34982c.this.mo88670a(1, (Object) str);
            }

            /* renamed from: b */
            public final void mo64947b(boolean z) {
                C34982c.this.mo88670a(11, (Object) Boolean.valueOf(z));
            }
        });
    }

    /* renamed from: g */
    public final boolean mo88638g() {
        return this.f91274a.mo88638g();
    }

    /* renamed from: h */
    public final long mo88639h() {
        return this.f91274a.mo88639h();
    }

    /* renamed from: i */
    public final long mo88640i() {
        return this.f91274a.mo88640i();
    }

    /* renamed from: j */
    public final boolean mo88641j() {
        return this.f91274a.mo88641j();
    }

    /* renamed from: k */
    public final boolean mo88642k() {
        return this.f91274a.mo88642k();
    }

    /* renamed from: l */
    public final String mo88643l() {
        return this.f91274a.mo88643l();
    }

    /* renamed from: m */
    public final int mo88644m() {
        return this.f91274a.mo88644m();
    }

    /* renamed from: n */
    public final void mo88645n() {
        this.f91274a.mo88645n();
    }

    /* renamed from: r */
    public final Type mo88649r() {
        return this.f91274a.mo88649r();
    }

    /* renamed from: s */
    public final boolean mo88650s() {
        return this.f91274a.mo88650s();
    }

    /* renamed from: a */
    public final void mo88616a() {
        if (this.f91279g != null) {
            this.f91279g.sendEmptyMessage(16);
        }
    }

    /* renamed from: b */
    public final void mo88629b() {
        if (this.f91279g != null) {
            this.f91279g.sendEmptyMessage(8);
        }
    }

    /* renamed from: c */
    public final void mo88634c() {
        if (this.f91279g != null) {
            this.f91279g.sendEmptyMessage(3);
        }
    }

    /* renamed from: d */
    public final void mo88635d() {
        if (this.f91279g != null) {
            this.f91279g.sendEmptyMessage(6);
        }
    }

    /* renamed from: e */
    public final void mo88636e() {
        if (this.f91279g != null) {
            this.f91279g.sendEmptyMessage(5);
        }
    }

    /* renamed from: p */
    public final void mo88647p() {
        if (this.f91279g != null) {
            this.f91279g.removeMessages(12);
        }
    }

    /* renamed from: t */
    public final C34970f mo88651t() {
        if (this.f91274a != null) {
            return this.f91274a.mo88651t();
        }
        return null;
    }

    /* renamed from: u */
    public final C34969e mo88652u() {
        if (this.f91274a != null) {
            return this.f91274a.mo88652u();
        }
        return null;
    }

    /* renamed from: v */
    public final String mo88653v() {
        if (this.f91274a != null) {
            return this.f91274a.mo88653v();
        }
        return null;
    }

    /* renamed from: o */
    public final void mo88646o() {
        if (this.f91279g != null) {
            this.f91279g.mo88674a(C34943c.f91128x);
            this.f91279g.sendEmptyMessage(12);
        }
    }

    /* renamed from: f */
    public final void mo88637f() {
        if (this.f91279g != null) {
            this.f91279g.removeCallbacksAndMessages(null);
            this.f91279g.sendEmptyMessage(7);
            this.f91279g.sendEmptyMessage(10);
            this.f91277d = true;
            this.f91279g = null;
            this.f91281i = null;
        }
        if (this.f91278f != null) {
            this.f91278f = null;
        }
        this.f91280h = null;
    }

    /* renamed from: w */
    private void m112804w() {
        Looper looper;
        Looper looper2;
        try {
            this.f91278f = new HandlerThread("play_thread", 0);
            this.f91278f.start();
        } catch (Exception unused) {
            this.f91278f = null;
        }
        this.f91276c = new Handler(Looper.getMainLooper());
        C349831 r1 = new C34988a() {
            /* renamed from: a */
            public final void mo88671a() {
                C34982c.this.f91276c.post(new Runnable() {
                    public final void run() {
                        C34982c.this.f91277d = false;
                    }
                });
            }
        };
        if (this.f91278f == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = this.f91278f.getLooper();
        }
        this.f91279g = new C34987a(r1, looper, this.f91274a);
        if (this.f91278f == null) {
            looper2 = Looper.getMainLooper();
        } else {
            looper2 = this.f91278f.getLooper();
        }
        this.f91281i = C47549a.m148328a(looper2);
    }

    /* renamed from: a */
    public final float mo88615a(int i) {
        return this.f91274a.mo88615a(i);
    }

    /* renamed from: b */
    public final void mo88631b(Surface surface) {
        this.f91274a.mo88631b(surface);
    }

    public C34982c(C34974d dVar) {
        this.f91274a = dVar;
        m112804w();
    }

    /* renamed from: a */
    public final void mo88617a(float f) {
        if (this.f91279g != null) {
            this.f91279g.obtainMessage(11, Float.valueOf(f)).sendToTarget();
        }
    }

    /* renamed from: b */
    public final void mo88630b(int i) {
        if (this.f91279g != null) {
            this.f91279g.mo88674a(i);
            this.f91279g.sendEmptyMessage(12);
        }
    }

    /* renamed from: b */
    public final void mo88632b(String str) {
        this.f91274a.mo88632b(str);
    }

    /* renamed from: b */
    public final boolean mo88633b(C34976f fVar) {
        if (this.f91275b == fVar) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo88620a(Surface surface) {
        if (C34963a.f91251a) {
            StringBuilder sb = new StringBuilder("setSurface(), surface = ");
            sb.append(surface);
            sb.append(", mSimplifyPlayer = ");
            sb.append(this.f91274a);
        }
        this.f91274a.mo88620a(surface);
    }

    /* renamed from: a */
    public final void mo88621a(SurfaceHolder surfaceHolder) {
        if (this.f91279g != null) {
            this.f91279g.obtainMessage(14, surfaceHolder).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo88622a(C34971a aVar) {
        this.f91274a.mo88622a(aVar);
    }

    /* renamed from: a */
    public final void mo88618a(float f, float f2) {
        if (this.f91279g != null) {
            this.f91279g.obtainMessage(9, new Pair(Float.valueOf(f), Float.valueOf(f2))).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo88619a(int i, int i2) {
        if (this.f91279g != null) {
            this.f91279g.obtainMessage(13, new Pair(Integer.valueOf(i), Integer.valueOf(i2))).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo88670a(final int i, final Object obj) {
        this.f91276c.post(new Runnable() {
            public final void run() {
                if (C34982c.this.f91275b != null) {
                    switch (i) {
                        case 0:
                            C34982c.this.f91275b.mo63044a((C44920d) obj);
                            return;
                        case 1:
                            C34982c.this.f91275b.mo63046a((String) obj);
                            return;
                        case 2:
                            C34982c.this.f91275b.mo63043a((C44919c) obj);
                            return;
                        case 3:
                            C34982c.this.f91275b.mo64951d((String) obj);
                            return;
                        case 4:
                            C34982c.this.f91275b.mo64953e((String) obj);
                            return;
                        case 5:
                            C34982c.this.f91275b.mo64954e_(((Boolean) obj).booleanValue());
                            return;
                        case 6:
                            C34982c.this.f91275b.mo63047b((String) obj);
                            return;
                        case 7:
                            C34982c.this.f91275b.mo63045a((C44921e) obj);
                            return;
                        case 8:
                            C34982c.this.f91275b.mo64946b((C44919c) obj);
                            return;
                        case 9:
                            C34982c.this.f91275b.mo64949c((String) obj);
                            return;
                        case 10:
                            C34982c.this.f91275b.mo64944b(((Float) obj).floatValue());
                            return;
                        case 11:
                            C34982c.this.f91275b.mo64947b(((Boolean) obj).booleanValue());
                            break;
                    }
                }
            }
        });
    }
}
