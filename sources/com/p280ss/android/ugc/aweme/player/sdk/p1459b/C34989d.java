package com.p280ss.android.ugc.aweme.player.sdk.p1459b;

import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.player.sdk.C34963a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34971a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34972b;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34974d;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34975e;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34967c;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34969e;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34970f;
import com.p280ss.android.ugc.aweme.player.sdk.p1460c.C34999b;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44863c;
import com.p280ss.android.ugc.playerkit.model.C44918b;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.model.C44923g;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import com.p280ss.android.ugc.playerkit.p1750a.C44907a;
import com.p280ss.android.ugc.playerkit.session.C44925a;
import com.p280ss.android.ugc.playerkit.session.Session;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.b.d */
public final class C34989d implements C34974d {

    /* renamed from: A */
    private String f91291A;

    /* renamed from: B */
    private SurfaceHolder f91292B;

    /* renamed from: a */
    public IPlayer f91293a;

    /* renamed from: b */
    public AtomicReference<IPlayer> f91294b;

    /* renamed from: c */
    public Type f91295c;

    /* renamed from: d */
    public C44923g f91296d;

    /* renamed from: e */
    public String f91297e;

    /* renamed from: f */
    public String f91298f;

    /* renamed from: g */
    public boolean f91299g;

    /* renamed from: h */
    public boolean f91300h;

    /* renamed from: i */
    public boolean f91301i;

    /* renamed from: j */
    public boolean f91302j;

    /* renamed from: k */
    public int f91303k;

    /* renamed from: l */
    public int f91304l;

    /* renamed from: m */
    public int f91305m;

    /* renamed from: n */
    public long f91306n;

    /* renamed from: o */
    public long f91307o = -1;

    /* renamed from: p */
    public C34967c f91308p;

    /* renamed from: q */
    public C34976f f91309q;

    /* renamed from: r */
    public C34972b f91310r;

    /* renamed from: s */
    public long f91311s;

    /* renamed from: t */
    private volatile Surface f91312t;

    /* renamed from: u */
    private boolean f91313u;

    /* renamed from: v */
    private boolean f91314v;

    /* renamed from: w */
    private boolean f91315w;

    /* renamed from: x */
    private C44907a f91316x;

    /* renamed from: y */
    private C34971a f91317y;

    /* renamed from: z */
    private C44918b f91318z;

    /* renamed from: a */
    public final void mo88619a(int i, int i2) {
    }

    /* renamed from: b */
    public final void mo88630b(int i) {
    }

    /* renamed from: m */
    public final int mo88644m() {
        return this.f91303k;
    }

    /* renamed from: o */
    public final void mo88646o() {
    }

    /* renamed from: p */
    public final void mo88647p() {
    }

    /* renamed from: r */
    public final Type mo88649r() {
        return this.f91295c;
    }

    /* renamed from: a */
    public final void mo88626a(C44923g gVar) {
        if (gVar != null) {
            this.f91318z = gVar.f115539f;
            this.f91298f = gVar.f115547n;
            this.f91304l = 0;
            mo88676a(gVar, gVar.f115537d, gVar.f115538e);
        }
    }

    /* renamed from: a */
    public final void mo88676a(C44923g gVar, String str, boolean z) {
        m112860a(gVar, str, z, 0, false);
    }

    /* renamed from: a */
    public final void mo88627a(String str) {
        if (!TextUtils.isEmpty(str) && str.equals(this.f91297e)) {
            m112864z();
        }
    }

    /* renamed from: a */
    public final void mo88624a(C34976f fVar) {
        this.f91309q = fVar;
    }

    /* renamed from: a */
    public final void mo88625a(C44907a aVar) {
        this.f91316x = aVar;
    }

    /* renamed from: a */
    public final void mo88623a(C34972b bVar) {
        this.f91310r = bVar;
    }

    /* renamed from: a */
    public final boolean mo88628a(String str, String str2) {
        return this.f91297e != null && this.f91297e.equals(str) && this.f91291A != null && this.f91291A.equals(str2);
    }

    /* renamed from: n */
    public final void mo88645n() {
        this.f91297e = "";
    }

    /* renamed from: x */
    private void m112862x() {
        this.f91299g = false;
        this.f91313u = false;
        this.f91301i = false;
        this.f91302j = false;
        this.f91303k = 0;
        this.f91314v = false;
        this.f91315w = false;
    }

    /* renamed from: g */
    public final boolean mo88638g() {
        if (this.f91293a != null) {
            return this.f91293a.mo88597j();
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo88641j() {
        if (this.f91293a != null) {
            return this.f91293a.mo88598k();
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo88642k() {
        if (this.f91293a == null || !this.f91293a.mo88595h()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final String mo88643l() {
        if (this.f91293a != null) {
            return this.f91293a.mo88601n();
        }
        return null;
    }

    /* renamed from: s */
    public final boolean mo88650s() {
        if (this.f91293a != null) {
            return this.f91293a.mo88596i();
        }
        return false;
    }

    /* renamed from: h */
    public final long mo88639h() {
        if (this.f91315w || this.f91293a == null) {
            return -1;
        }
        return this.f91293a.mo88599l();
    }

    /* renamed from: i */
    public final long mo88640i() {
        if (this.f91315w || this.f91293a == null) {
            return -1;
        }
        return this.f91293a.mo88600m();
    }

    /* renamed from: t */
    public final C34970f mo88651t() {
        IPlayer iPlayer = (IPlayer) this.f91294b.get();
        if (iPlayer != null) {
            return iPlayer.mo88603p();
        }
        return null;
    }

    /* renamed from: u */
    public final C34969e mo88652u() {
        IPlayer iPlayer = (IPlayer) this.f91294b.get();
        if (iPlayer != null) {
            return iPlayer.mo88604q();
        }
        return null;
    }

    /* renamed from: v */
    public final String mo88653v() {
        IPlayer iPlayer = (IPlayer) this.f91294b.get();
        if (iPlayer != null) {
            return iPlayer.mo88602o();
        }
        return null;
    }

    /* renamed from: y */
    private void m112863y() {
        if (this.f91310r != null) {
            this.f91293a = this.f91310r.mo88612a(this.f91295c);
            this.f91294b.set(this.f91293a);
        }
        this.f91293a.mo88581a(this.f91316x);
        this.f91293a.mo88580a((C34975e) new C34975e() {
            /* renamed from: a */
            public final void mo88654a() {
                if (C34989d.this.f91309q != null) {
                    C34989d.this.f91309q.mo64947b(true);
                }
            }

            /* renamed from: b */
            public final void mo88655b() {
                if (C34989d.this.f91309q != null) {
                    C34989d.this.f91309q.mo64947b(false);
                }
            }
        });
        this.f91308p = new C34967c() {
            /* renamed from: a */
            public final void mo88605a() {
                if (C34989d.this.f91305m == 1) {
                    C34989d.this.f91305m = 2;
                    C34989d.this.f91302j = true;
                    if (C34989d.this.f91301i) {
                        C34989d.this.f91307o = System.currentTimeMillis();
                        C34989d.this.mo88634c();
                    }
                } else if (C34989d.this.f91305m == 5) {
                    C34989d.this.mo88636e();
                }
            }

            /* renamed from: c */
            public final void mo88609c() {
                if (C34989d.this.f91309q != null) {
                    if (C34989d.this.f91303k == 0) {
                        C34989d.this.f91309q.mo64953e(C34989d.this.f91297e);
                    }
                    C34989d.this.f91303k++;
                    C34989d.this.f91309q.mo63047b(C34989d.this.f91297e);
                }
            }

            /* renamed from: b */
            public final void mo88608b() {
                if (C34989d.this.f91309q != null) {
                    C34999b.m112962a().mo88685a(C34989d.this.f91298f, "player_on_render");
                    long j = -1;
                    if (C34989d.this.f91293a != null) {
                        j = C34989d.this.f91293a.mo88600m();
                    }
                    C44925a.m141730a().mo107404a(C34989d.this.f91298f);
                    C34989d.this.f91309q.mo63044a(new C44920d(C34989d.this.f91297e, C34989d.this.f91299g, j));
                    if (C34989d.this.f91295c != Type.EXO) {
                        C34989d.this.f91309q.mo63045a(new C44921e(C34989d.this.f91297e, C34989d.this.f91299g));
                    }
                }
                C34989d.this.mo88677w();
                C34989d.this.f91302j = false;
            }

            /* renamed from: a */
            public final void mo88607a(boolean z) {
                if (!z) {
                    C34989d.this.f91302j = false;
                    if (C34989d.this.f91309q != null) {
                        C34989d.this.f91309q.mo64954e_(false);
                    }
                } else if (C34989d.this.f91309q != null && (!(C34989d.this.f91293a == null || C34989d.this.f91293a.mo88599l() == 0) || C34989d.this.f91302j)) {
                    C34989d.this.f91309q.mo64954e_(true);
                }
            }

            /* renamed from: a */
            public final void mo88606a(int i, int i2, Object obj) {
                boolean z;
                if ((C34989d.this.f91295c == Type.Ijk || C34989d.this.mo88642k()) && i == -10000 && (i2 == -1000 || i2 == -2000)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C34999b.m112962a().mo88685a(C34989d.this.f91298f, "player_on_failed");
                    C44919c cVar = new C44919c(C34989d.this.f91297e, C34989d.this.f91299g, i, i2, obj);
                    cVar.f115524c = C34989d.this.f91300h;
                    C34989d.this.f91309q.mo63043a(cVar);
                }
                if (Thread.currentThread().getId() != C34989d.this.f91311s) {
                    C2077a.m9161a((Throwable) new Exception(), "onError thread not match");
                }
                if (C34989d.this.f91293a != null) {
                    C34989d.this.f91293a.mo88577a((Surface) null);
                    C34989d.this.f91293a.mo88592e();
                    C34989d.this.f91293a = null;
                    C34989d.this.f91294b.set(null);
                    C34989d.this.f91305m = 0;
                }
                C34989d.this.f91306n = -1;
                C34989d.this.f91307o = -1;
                if (z && C34989d.this.f91304l < 10) {
                    C34989d.this.f91304l++;
                    C34999b.m112962a().mo88685a(C34989d.this.f91298f, "player_try_play");
                    C34989d.this.f91295c = Type.Ijk;
                    C34989d.this.mo88676a(C34989d.this.f91296d, C34989d.this.f91297e, C34989d.this.f91301i);
                    if (C34989d.this.f91309q != null) {
                        C44919c cVar2 = new C44919c(C34989d.this.f91297e, C34989d.this.f91299g, i, i2, obj);
                        cVar2.f115524c = C34989d.this.f91300h;
                        C34989d.this.f91309q.mo64946b(cVar2);
                    }
                }
            }
        };
        this.f91293a.mo88579a(this.f91308p);
    }

    /* renamed from: d */
    public final void mo88635d() {
        if (C34963a.f91251a) {
            StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, stop(), surface = ");
            sb.append(this.f91312t);
            sb.append(", mPlayer = ");
            sb.append(this.f91293a);
            sb.append(" mStatus = ");
            sb.append(this.f91305m);
        }
        if (!(this.f91305m == 6 || this.f91293a == null)) {
            mo88636e();
            this.f91293a.mo88591d();
            this.f91305m = 6;
        }
    }

    /* renamed from: q */
    public final void mo88648q() {
        float f;
        long h = mo88639h();
        if (mo88640i() == 0) {
            f = 0.0f;
        } else {
            f = (((float) h) * 100.0f) / ((float) mo88640i());
        }
        if (this.f91309q != null) {
            this.f91309q.mo64944b(f);
        }
    }

    /* renamed from: z */
    private void m112864z() {
        if (C34963a.f91251a) {
            StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, resume(), surface = ");
            sb.append(this.f91312t);
            sb.append(", mPlayer = ");
            sb.append(this.f91293a);
            sb.append(" mStatus = ");
            sb.append(this.f91305m);
            sb.append(" ,isPrepare2Pause =");
            sb.append(this.f91313u);
        }
        if (this.f91305m < 2 || this.f91305m > 5 || this.f91313u) {
            mo88676a(this.f91296d, this.f91297e, true);
            this.f91313u = false;
        } else if (!this.f91314v || this.f91293a == null || !this.f91293a.mo88594g()) {
            this.f91305m = 2;
            mo88634c();
        } else {
            m112860a(this.f91296d, this.f91297e, true, this.f91293a.mo88599l(), true);
        }
        if (this.f91309q != null) {
            this.f91309q.mo63046a(this.f91297e);
        }
    }

    /* renamed from: a */
    public final void mo88616a() {
        if (this.f91293a == null) {
            m112863y();
            if (this.f91293a != null) {
                this.f91293a.mo88573a();
            }
        }
    }

    /* renamed from: b */
    public final void mo88629b() {
        if (C34963a.f91251a) {
            StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, render(), surface = ");
            sb.append(this.f91312t);
            sb.append(", mPlayer = ");
            sb.append(this.f91293a);
            sb.append(" mStatus = ");
            sb.append(this.f91305m);
        }
        this.f91301i = true;
        if (this.f91305m == 1 || this.f91305m == 2 || this.f91305m == 5 || this.f91305m == 6 || this.f91305m == 3) {
            if (this.f91305m == 2) {
                mo88634c();
            }
            return;
        }
        mo88676a(this.f91296d, this.f91297e, true);
    }

    /* renamed from: c */
    public final void mo88634c() {
        if (C34963a.f91251a) {
            StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, start(), surface = ");
            sb.append(this.f91312t);
            sb.append(", mPlayer = ");
            sb.append(this.f91293a);
            sb.append(" mStatus = ");
            sb.append(this.f91305m);
        }
        if (this.f91293a != null && this.f91305m == 2 && this.f91312t != null && this.f91312t.isValid()) {
            if (C34963a.f91251a) {
                StringBuilder sb2 = new StringBuilder("SimplifyPlayerImpl, start surface = ");
                sb2.append(this.f91312t);
                sb2.append(", mSimplifyPlayer = ");
                sb2.append(this.f91293a);
            }
            this.f91293a.mo88577a(this.f91312t);
            this.f91293a.mo88587b();
            this.f91305m = 3;
        }
    }

    /* renamed from: e */
    public final void mo88636e() {
        if (C34963a.f91251a) {
            StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, pause(), surface = ");
            sb.append(this.f91312t);
            sb.append(", mPlayer = ");
            sb.append(this.f91293a);
            sb.append(" mStatus = ");
            sb.append(this.f91305m);
        }
        if (this.f91293a != null && this.f91305m <= 5) {
            if (!(this.f91295c == Type.Ijk || this.f91295c == Type.IjkHardware) || this.f91293a.mo88598k()) {
                this.f91293a.mo88589c();
                if (this.f91309q != null && this.f91305m <= 5) {
                    this.f91309q.mo64951d(this.f91297e);
                }
            }
            if (this.f91305m == 1) {
                this.f91313u = true;
            }
            this.f91305m = 5;
        }
    }

    /* renamed from: f */
    public final void mo88637f() {
        if (C34963a.f91251a) {
            StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, release(), surface = ");
            sb.append(this.f91312t);
            sb.append(", mPlayer = ");
            sb.append(this.f91293a);
            sb.append(" mStatus = ");
            sb.append(this.f91305m);
        }
        if (Thread.currentThread().getId() != this.f91311s) {
            C2077a.m9161a((Throwable) new Exception(), "release thread not match");
        }
        mo88635d();
        if (this.f91293a != null) {
            this.f91315w = true;
            this.f91293a.mo88592e();
            this.f91315w = false;
            this.f91293a = null;
            this.f91294b.set(null);
            this.f91305m = 7;
        }
    }

    /* renamed from: w */
    public final void mo88677w() {
        if (this.f91310r != null) {
            if (this.f91306n != -1) {
                long currentTimeMillis = System.currentTimeMillis() - this.f91306n;
                if (currentTimeMillis > 0) {
                    this.f91310r.mo88613a(this.f91318z.getPrepareKey(), currentTimeMillis, this.f91295c, this.f91296d.mo107398b(), this.f91299g);
                }
                this.f91306n = -1;
            }
            if (this.f91307o != -1) {
                long currentTimeMillis2 = System.currentTimeMillis() - this.f91307o;
                if (currentTimeMillis2 > 0) {
                    this.f91310r.mo88614b(this.f91318z.getFirstFrameKey(), currentTimeMillis2, this.f91295c, this.f91296d.mo107398b(), this.f91299g);
                }
                this.f91307o = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo88622a(C34971a aVar) {
        this.f91317y = aVar;
    }

    /* renamed from: b */
    public final boolean mo88633b(C34976f fVar) {
        if (this.f91309q == fVar) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo88617a(float f) {
        if (this.f91293a != null) {
            this.f91293a.mo88574a(f);
        }
    }

    /* renamed from: b */
    public final void mo88631b(Surface surface) {
        if (this.f91293a != null) {
            this.f91293a.mo88577a(surface);
        }
    }

    public C34989d(Type type) {
        this.f91295c = type;
        this.f91294b = new AtomicReference<>(null);
    }

    /* renamed from: a */
    private void m112861a(boolean z) {
        this.f91315w = true;
        if (this.f91293a != null) {
            this.f91293a.mo88586a(z);
        }
        this.f91315w = false;
        this.f91305m = 0;
    }

    /* renamed from: b */
    public final void mo88632b(String str) {
        IPlayer iPlayer = (IPlayer) this.f91294b.get();
        if (iPlayer != null) {
            iPlayer.mo88583a(str);
        }
    }

    /* renamed from: a */
    public final float mo88615a(int i) {
        IPlayer iPlayer = (IPlayer) this.f91294b.get();
        if (this.f91315w || iPlayer == null) {
            return -1.0f;
        }
        return iPlayer.mo88572a(i);
    }

    /* renamed from: a */
    public final void mo88620a(Surface surface) {
        boolean z;
        if (this.f91312t != surface) {
            z = true;
        } else {
            z = false;
        }
        this.f91314v = z;
        this.f91312t = surface;
        if (this.f91312t != null && this.f91312t.isValid() && this.f91305m == 2 && this.f91301i) {
            mo88634c();
        }
        if (C34963a.f91251a) {
            StringBuilder sb = new StringBuilder("SimplifyPlayerImpl, setSurface(), surface = ");
            sb.append(this.f91312t);
            sb.append(", mPlayer = ");
            sb.append(this.f91293a);
            sb.append(" mStatus = ");
            sb.append(this.f91305m);
        }
    }

    /* renamed from: a */
    public final void mo88621a(SurfaceHolder surfaceHolder) {
        if (this.f91293a != null) {
            this.f91293a.mo88578a(surfaceHolder);
        } else {
            this.f91292B = surfaceHolder;
        }
    }

    /* renamed from: a */
    public final void mo88618a(float f, float f2) {
        if (this.f91293a != null) {
            this.f91293a.mo88575a(f, f2);
        }
    }

    /* renamed from: a */
    private void m112860a(C44923g gVar, String str, boolean z, long j, boolean z2) {
        String str2;
        boolean z3;
        if (gVar != null && ((gVar.f115556w != null && gVar.f115556w.f117858d != null) || (gVar.mo107397a() != null && gVar.mo107397a().f115559a != null))) {
            if (gVar.f115556w == null || gVar.f115556w.f117858d == null) {
                C44863c cVar = gVar.mo107397a().f115562d;
                if (cVar == null || TextUtils.isEmpty(cVar.getUrlKey())) {
                    str2 = this.f91298f;
                } else {
                    str2 = cVar.getUrlKey();
                }
            } else {
                str2 = gVar.f115556w.f117858d.f117888f;
            }
            if (this.f91305m != 1 || !mo88628a(str, str2)) {
                this.f91311s = Thread.currentThread().getId();
                m112862x();
                this.f91296d = gVar;
                this.f91291A = str2;
                this.f91306n = System.currentTimeMillis();
                this.f91297e = str;
                this.f91299g = gVar.f115541h;
                int i = 0;
                if (gVar.f115556w == null || gVar.f115556w.f117858d == null) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                this.f91300h = z3;
                if (this.f91293a == null) {
                    m112863y();
                } else if (gVar.f115557x) {
                    this.f91293a.mo88589c();
                    this.f91293a.mo88591d();
                    this.f91293a.mo88592e();
                    this.f91293a = null;
                    this.f91294b.set(null);
                    m112863y();
                } else {
                    if (z2) {
                        this.f91293a.mo88576a(j);
                    }
                    m112861a(gVar.f115558y);
                }
                this.f91301i = z;
                this.f91302j = false;
                this.f91303k = 0;
                this.f91314v = false;
                if (this.f91318z.isLoop()) {
                    this.f91293a.mo88588b(true);
                }
                try {
                    if (this.f91312t != null && this.f91312t.isValid()) {
                        this.f91293a.mo88577a(this.f91312t);
                    }
                    C34999b.m112962a().mo88685a(this.f91298f, "player_prepare_play");
                    HashMap hashMap = new HashMap();
                    hashMap.put("context", gVar.f115536c);
                    hashMap.put("vr", Boolean.valueOf(gVar.f115540g));
                    hashMap.put("h265", Boolean.valueOf(gVar.f115541h));
                    hashMap.put("render_type", Integer.valueOf(gVar.f115542i));
                    hashMap.put("async_init", Boolean.valueOf(gVar.f115553t));
                    hashMap.put("enable_alog", Integer.valueOf(gVar.f115544k));
                    if (gVar.f115555v && this.f91293a.mo88590c(gVar.f115541h) && (this.f91293a instanceof C34992e)) {
                        i = 1;
                    }
                    hashMap.put("use_texture_render", Integer.valueOf(i));
                    if (gVar.f115554u > 0) {
                        hashMap.put("init_start_time_ms", Integer.valueOf(gVar.f115554u));
                    }
                    hashMap.put("frames_wait", Integer.valueOf(gVar.f115545l));
                    hashMap.put("key", str2);
                    hashMap.put("decoder_type", Integer.valueOf(gVar.f115543j));
                    hashMap.put("set_cookie_token", Boolean.valueOf(gVar.f115557x));
                    this.f91293a.mo88584a(gVar.f115547n, this.f91317y);
                    if (gVar.f115556w != null) {
                        this.f91293a.mo88582a(gVar.f115556w, (Map<String, Object>) hashMap);
                    } else {
                        if (gVar.mo107397a().f115562d != null) {
                            hashMap.put("bitrate", Integer.valueOf(gVar.mo107397a().f115562d.getBitRate()));
                            hashMap.put("ratio", Integer.valueOf(gVar.mo107397a().f115562d.getQualityType() / 10));
                        }
                        C44925a.m141730a().mo107406a(str2, gVar.mo107397a().f115564f);
                        String str3 = (String) gVar.mo107397a().f115559a;
                        hashMap.put("force_software_decode", Boolean.valueOf(gVar.mo107397a().f115565g));
                        this.f91293a.mo88585a(str3, (Map<String, Object>) hashMap);
                    }
                    this.f91305m = 1;
                    Session b = C44925a.m141730a().mo107408b(gVar.f115547n);
                    if (b != null) {
                        b.h265 = gVar.f115541h;
                    }
                } catch (IOException e) {
                    if (this.f91309q != null) {
                        String str4 = this.f91297e;
                        boolean z4 = this.f91299g;
                        StringBuilder sb = new StringBuilder("prepare exception:");
                        sb.append(e.toString());
                        C44919c cVar2 = new C44919c(str4, z4, -123, -123, sb.toString());
                        cVar2.f115524c = this.f91300h;
                        this.f91309q.mo63043a(cVar2);
                    }
                    this.f91306n = -1;
                }
            }
        }
    }
}
