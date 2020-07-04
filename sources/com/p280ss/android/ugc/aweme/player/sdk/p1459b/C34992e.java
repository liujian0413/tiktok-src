package com.p280ss.android.ugc.aweme.player.sdk.p1459b;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.ugc.aweme.player.sdk.C34963a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34971a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34975e;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34965a;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34966b;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34967c;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34968d;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34969e;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34970f;
import com.p280ss.android.ugc.aweme.player.sdk.p1460c.C34997a;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.C44915a;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.C44916b;
import com.p280ss.android.ugc.playerkit.p1750a.C44907a;
import com.p280ss.ttvideoengine.C46033aa;
import com.p280ss.ttvideoengine.C46168w;
import com.p280ss.ttvideoengine.Resolution;
import com.p280ss.ttvideoengine.TTVideoEngine;
import com.p280ss.ttvideoengine.log.C46142b;
import com.p280ss.ttvideoengine.log.C46147g;
import com.p280ss.ttvideoengine.log.VideoEventManager;
import com.p280ss.ttvideoengine.p1811d.C46073b;
import com.p280ss.ttvideoengine.p1812e.C46083h;
import com.p280ss.ttvideoengine.p1816i.C46117c;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.b.e */
public final class C34992e extends C34977a {

    /* renamed from: D */
    private static C46147g f91321D = new C46147g() {
        public final void onEventV2(String str) {
        }

        public final void onEvent() {
            C44907a aVar;
            if (C34992e.f91323k != null) {
                aVar = (C44907a) C34992e.f91323k.get();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.onEvent(VideoEventManager.instance.popAllEvents());
            }
        }
    };

    /* renamed from: b */
    public static boolean f91322b = true;

    /* renamed from: k */
    public static WeakReference<C44907a> f91323k;

    /* renamed from: A */
    private long f91324A;

    /* renamed from: B */
    private C46033aa f91325B;

    /* renamed from: C */
    private C44907a f91326C;

    /* renamed from: c */
    public long f91327c;

    /* renamed from: d */
    public TTVideoEngine f91328d;

    /* renamed from: e */
    public SparseArray f91329e;

    /* renamed from: f */
    public boolean f91330f;

    /* renamed from: g */
    public volatile String f91331g;

    /* renamed from: h */
    public C34975e f91332h;

    /* renamed from: i */
    public C34967c f91333i;

    /* renamed from: j */
    public C34971a f91334j;

    /* renamed from: l */
    private Context f91335l;

    /* renamed from: m */
    private int f91336m;

    /* renamed from: n */
    private int f91337n;

    /* renamed from: o */
    private AtomicReference<TTVideoEngine> f91338o;

    /* renamed from: p */
    private boolean f91339p;

    /* renamed from: q */
    private boolean f91340q;

    /* renamed from: r */
    private int f91341r;

    /* renamed from: s */
    private SparseIntArray f91342s;

    /* renamed from: t */
    private C46142b f91343t;

    /* renamed from: u */
    private boolean f91344u;

    /* renamed from: v */
    private C34966b f91345v;

    /* renamed from: w */
    private PlayerConfig f91346w;

    /* renamed from: x */
    private boolean f91347x;

    /* renamed from: y */
    private C46073b f91348y;

    /* renamed from: z */
    private long f91349z;

    /* renamed from: h */
    public final boolean mo88595h() {
        return this.f91339p;
    }

    /* renamed from: i */
    public final boolean mo88596i() {
        return this.f91344u;
    }

    /* renamed from: n */
    public final String mo88601n() {
        return this.f91331g;
    }

    /* renamed from: a */
    public final void mo88586a(boolean z) {
        if (C34963a.f91251a) {
            new StringBuilder("reset  mPlayer = ").append(this.f91328d);
        }
        boolean z2 = true;
        if (z || ((this.f91342s == null || this.f91342s.get(34) != 1) && !this.f91347x)) {
            z2 = false;
        }
        if (!z2) {
            this.f91328d.mVideoEngineListener = null;
            this.f91328d.release();
            this.f91328d.setSurface(null);
            this.f91328d = null;
            this.f91338o.set(null);
            m112917u();
        } else {
            this.f91328d.pause();
            this.f91328d.setSurface(null);
        }
        this.f91341r = 0;
        this.f91331g = null;
    }

    /* renamed from: a */
    public final void mo88585a(String str, Map<String, Object> map) throws IOException {
        m112913a(null, str, map);
    }

    /* renamed from: a */
    public final void mo88579a(C34967c cVar) {
        if (cVar == null) {
            cVar = new C34965a();
        }
        this.f91333i = cVar;
    }

    /* renamed from: a */
    public final void mo88584a(String str, C34971a aVar) {
        try {
            this.f91334j = aVar;
            this.f91328d.setExternLogListener(m112916t(), str);
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "setLogListener");
        }
    }

    /* renamed from: a */
    public final void mo88581a(C44907a aVar) {
        if (aVar != this.f91326C) {
            this.f91326C = aVar;
            f91323k = new WeakReference<>(this.f91326C);
            VideoEventManager.instance.setListener(f91321D);
        }
    }

    /* renamed from: a */
    public final void mo88580a(C34975e eVar) {
        this.f91332h = eVar;
        if (this.f91328d != null) {
            this.f91328d.mVideoBufferListener = new C46168w() {
                /* renamed from: a */
                public final void mo88682a(int i) {
                    if (C34992e.this.f91332h != null && i == 1) {
                        C34992e.this.f91332h.mo88654a();
                    }
                }

                /* renamed from: b */
                public final void mo88683b(int i) {
                    if (C34992e.this.f91332h != null && i == 1) {
                        C34992e.this.f91332h.mo88655b();
                    }
                }
            };
        }
    }

    /* renamed from: a */
    public final void mo88583a(String str) {
        TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f91338o.get();
        if (tTVideoEngine != null) {
            tTVideoEngine.setCustomStr(str);
        }
    }

    /* renamed from: f */
    public final void mo88593f() {
        mo88586a(false);
    }

    /* renamed from: t */
    private C46142b m112916t() {
        if (this.f91343t == null) {
            this.f91343t = new C46142b() {
                /* renamed from: a */
                public final String mo88681a(String str) {
                    if (C34992e.this.f91334j != null) {
                        return C34992e.this.f91334j.mo88611a(str);
                    }
                    return "";
                }
            };
        }
        return this.f91343t;
    }

    /* renamed from: g */
    public final boolean mo88594g() {
        if (VERSION.SDK_INT >= 26 || !this.f91339p) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private void m112915s() {
        this.f91347x = false;
        this.f91328d.mCacheControlEnabled = true;
        this.f91328d.setLooping(true);
        this.f91328d.play();
    }

    /* renamed from: v */
    private static boolean m112918v() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("sony")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo88587b() {
        m112914r();
        new StringBuilder("TTPlayer, start mPlayer = ").append(this.f91328d);
        this.f91328d.play();
    }

    /* renamed from: j */
    public final boolean mo88597j() {
        try {
            if (this.f91328d != null) {
                return this.f91328d.supportHevcPlayback();
            }
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "supportHevcPlayback");
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo88598k() {
        try {
            if (this.f91328d == null || this.f91328d.mPlaybackState != 1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "isPlaying");
        }
        return false;
    }

    /* renamed from: l */
    public final long mo88599l() {
        try {
            if (this.f91328d != null) {
                return (long) this.f91328d.getCurrentPlaybackTime();
            }
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "getCurrentPosition");
        }
        return 0;
    }

    /* renamed from: m */
    public final long mo88600m() {
        try {
            if (this.f91328d != null) {
                return (long) this.f91328d.mDuration;
            }
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "getDuration");
        }
        return 1073741823;
    }

    /* renamed from: o */
    public final String mo88602o() {
        TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f91338o.get();
        if (tTVideoEngine != null) {
            return tTVideoEngine.getStringOption(82);
        }
        return "";
    }

    /* renamed from: p */
    public final C34970f mo88603p() {
        String str;
        C34970f fVar = new C34970f();
        TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f91338o.get();
        if (tTVideoEngine != null) {
            str = tTVideoEngine.getStringOption(80);
        } else {
            str = null;
        }
        fVar.f91264a = str;
        return fVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TTPlayer{mPlayer=");
        sb.append(this.f91328d);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: r */
    private void m112914r() {
        if (this.f91342s != null && this.f91342s.indexOfKey(7) >= 0) {
            if (this.f91344u) {
                this.f91328d.setIntOption(210, 1);
                this.f91328d.setIntOption(211, this.f91342s.get(9));
                this.f91328d.setIntOption(212, this.f91342s.get(8));
                return;
            }
            this.f91328d.setIntOption(210, 0);
        }
    }

    /* renamed from: a */
    public final void mo88573a() {
        if (this.f91328d != null && this.f91346w != null && this.f91346w.mo107392b()) {
            this.f91328d.createPlayer();
            this.f91328d.setIntOption(7, 1);
            this.f91328d.setAsyncInit(true, this.f91346w.mo107393c() ? 1 : 0);
            this.f91347x = true;
        }
    }

    /* renamed from: c */
    public final void mo88589c() {
        if (C34963a.f91251a) {
            new StringBuilder("pause  mPlayer = ").append(this.f91328d);
        }
        try {
            if (this.f91328d != null) {
                this.f91328d.pause();
            }
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "pause");
        }
        this.f91330f = false;
    }

    /* renamed from: d */
    public final void mo88591d() {
        this.f91324A = SystemClock.elapsedRealtime();
        if (C34963a.f91251a) {
            new StringBuilder("stop  mPlayer = ").append(this.f91328d);
        }
        try {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f91338o.get();
            if (tTVideoEngine != null) {
                this.f91348y = tTVideoEngine.getMetrics(0);
            }
            if (this.f91328d != null) {
                this.f91328d.stop();
            }
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "stop");
        }
    }

    /* renamed from: e */
    public final void mo88592e() {
        if (C34963a.f91251a) {
            new StringBuilder("release  mPlayer = ").append(this.f91328d);
        }
        try {
            this.f91328d.mVideoEngineListener = null;
            this.f91328d.release();
            this.f91347x = false;
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "release");
        }
        if (Thread.currentThread().getId() != this.f91327c) {
            C2077a.m9161a((Throwable) new Exception(), "release thread not match");
        }
    }

    /* renamed from: q */
    public final C34969e mo88604q() {
        long j;
        C46073b bVar;
        TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f91338o.get();
        C34969e eVar = this.f91266a;
        if (tTVideoEngine != null) {
            j = tTVideoEngine.getLongOption(315);
        } else {
            j = 0;
        }
        eVar.f91262e = j;
        if (tTVideoEngine != null) {
            if (this.f91348y == null) {
                bVar = tTVideoEngine.getMetrics(0);
            } else {
                bVar = this.f91348y;
            }
            if (bVar != null) {
                C34968d dVar = new C34968d();
                dVar.f91252a = this.f91349z;
                dVar.f91253b = bVar.mo112207a("ffr_read_head_duration");
                dVar.f91254c = bVar.mo112207a("ffr_read_first_data_duration");
                dVar.f91255d = bVar.mo112207a("ffr_decode_duration");
                dVar.f91256e = bVar.mo112207a("ffr_render_duration");
                dVar.f91257f = bVar.mo112207a("ffr_playback_buffering_duration");
                this.f91266a.f91263f = dVar;
            }
        }
        return super.mo88604q();
    }

    /* renamed from: u */
    private void m112917u() {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        int i14;
        int i15;
        int i16;
        float f;
        int i17;
        float f2;
        float f3;
        float f4;
        boolean z3;
        int i18;
        if (this.f91328d == null) {
            if (this.f91342s != null) {
                if (this.f91342s.get(1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i12 = this.f91342s.get(0);
                i11 = this.f91342s.get(2);
                i7 = this.f91342s.get(3);
                i6 = this.f91342s.get(4);
                i5 = this.f91342s.get(5);
                i4 = this.f91342s.get(6);
                if (this.f91342s.get(18) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                i3 = this.f91342s.get(28);
                i2 = this.f91342s.get(23);
                i = this.f91342s.get(24);
                i9 = this.f91342s.get(25);
                i10 = this.f91342s.get(26);
                i8 = this.f91342s.get(27);
            } else {
                z2 = false;
                i12 = 0;
                i11 = 1;
                i10 = 0;
                i9 = 0;
                i8 = 0;
                i7 = 1000;
                i6 = 5000;
                i5 = 0;
                i4 = 0;
                z = false;
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            if (this.f91329e == null || this.f91329e.size() <= 0) {
                i16 = i8;
                i15 = i10;
                i14 = i9;
                i13 = i;
                f4 = 0.0f;
                f3 = 0.0f;
                f2 = 0.0f;
                i17 = 1;
                f = 0.0f;
            } else {
                i16 = i8;
                float floatValue = ((Float) this.f91329e.get(29)).floatValue();
                float floatValue2 = ((Float) this.f91329e.get(30)).floatValue();
                float floatValue3 = ((Float) this.f91329e.get(31)).floatValue();
                i15 = i10;
                i14 = i9;
                f3 = ((Float) this.f91329e.get(32)).floatValue();
                i13 = i;
                f2 = floatValue;
                f = floatValue2;
                f4 = floatValue3;
                i17 = 1;
            }
            C46123h.m144544a(i17, i4);
            if (i4 == i17) {
                z3 = true;
            } else {
                z3 = false;
            }
            f91322b = z3;
            this.f91328d = new TTVideoEngine(this.f91335l, i12);
            this.f91338o.set(this.f91328d);
            if (i12 == 1) {
                this.f91328d.setIntOption(116, 1);
            }
            if (z) {
                this.f91328d.setIntOption(216, 1);
            }
            this.f91328d.setIntOption(214, 1);
            this.f91328d.setIntOption(415, 1);
            this.f91328d.setIntOption(4, i11);
            if (m112918v()) {
                this.f91328d.setUnSupportSampleRates(new int[]{44100});
            }
            this.f91328d.mVideoEngineListener = this.f91325B;
            if (!z2) {
                if (mo88594g() && this.f91330f && this.f91341r > 0) {
                    this.f91328d.setStartTime(this.f91341r);
                }
                if (this.f91339p) {
                    this.f91328d.setIntOption(7, 1);
                }
                this.f91328d.setIntOption(10, i7);
                this.f91328d.setIntOption(202, i6);
                this.f91328d.setIntOption(206, i5);
                boolean z4 = false;
                this.f91328d.setIntOption(100, 0);
                this.f91328d.setIntOption(11, 0);
                this.f91328d.setIntOption(204, 1);
                this.f91328d.setIntOption(12, 0);
                this.f91328d.setIntOption(213, 1);
                this.f91328d.setIntOption(329, i3);
                if (i3 == 1) {
                    this.f91328d.setFloatOption(325, f2);
                    this.f91328d.setFloatOption(326, f);
                    this.f91328d.setFloatOption(327, f4);
                    this.f91328d.setFloatOption(328, f3);
                }
                this.f91328d.setIntOption(322, i2);
                this.f91328d.setIntOption(323, i13);
                this.f91328d.setIntOption(324, i14);
                TTVideoEngine tTVideoEngine = this.f91328d;
                if (i15 == 1) {
                    i18 = i16;
                    z4 = true;
                } else {
                    i18 = i16;
                }
                tTVideoEngine.setQcomVpp(z4, i18);
            }
        }
    }

    public C34992e(Context context) {
        this(context, false);
    }

    /* renamed from: a */
    public final void mo88576a(long j) {
        if (mo88594g()) {
            this.f91330f = true;
            this.f91341r = (int) j;
        }
    }

    /* renamed from: b */
    public final void mo88588b(boolean z) {
        try {
            if (this.f91328d != null) {
                this.f91328d.setLooping(true);
            }
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "setLooping");
        }
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo88572a(int r5) {
        /*
            r4 = this;
            com.ss.ttvideoengine.TTVideoEngine r0 = r4.f91328d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            switch(r5) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0032;
                case 2: goto L_0x0028;
                case 3: goto L_0x0046;
                case 4: goto L_0x0046;
                case 5: goto L_0x0046;
                case 6: goto L_0x0046;
                case 7: goto L_0x0046;
                case 8: goto L_0x001e;
                case 9: goto L_0x0014;
                case 10: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0046
        L_0x000b:
            com.ss.ttvideoengine.TTVideoEngine r5 = r4.f91328d     // Catch:{ Exception -> 0x0040 }
            r0 = 70
            float r5 = r5.getFloatOption(r0)     // Catch:{ Exception -> 0x0040 }
            goto L_0x0030
        L_0x0014:
            com.ss.ttvideoengine.TTVideoEngine r5 = r4.f91328d     // Catch:{ Exception -> 0x0040 }
            r0 = 42
            int r5 = r5.getIntOption(r0)     // Catch:{ Exception -> 0x0040 }
            float r1 = (float) r5     // Catch:{ Exception -> 0x0040 }
            goto L_0x0046
        L_0x001e:
            com.ss.ttvideoengine.TTVideoEngine r5 = r4.f91328d     // Catch:{ Exception -> 0x0040 }
            r0 = 60
            long r2 = r5.getLongOption(r0)     // Catch:{ Exception -> 0x0040 }
            float r1 = (float) r2     // Catch:{ Exception -> 0x0040 }
            goto L_0x0046
        L_0x0028:
            com.ss.ttvideoengine.TTVideoEngine r5 = r4.f91328d     // Catch:{ Exception -> 0x0040 }
            r0 = 71
            float r5 = r5.getFloatOption(r0)     // Catch:{ Exception -> 0x0040 }
        L_0x0030:
            r1 = r5
            goto L_0x0046
        L_0x0032:
            com.ss.ttvideoengine.TTVideoEngine r5 = r4.f91328d     // Catch:{ Exception -> 0x0040 }
            int r5 = r5.mDuration     // Catch:{ Exception -> 0x0040 }
            float r1 = (float) r5     // Catch:{ Exception -> 0x0040 }
            goto L_0x0046
        L_0x0038:
            com.ss.ttvideoengine.TTVideoEngine r5 = r4.f91328d     // Catch:{ Exception -> 0x0040 }
            int r5 = r5.getCurrentPlaybackTime()     // Catch:{ Exception -> 0x0040 }
            float r1 = (float) r5
            goto L_0x0046
        L_0x0040:
            r5 = move-exception
            java.lang.String r0 = "getInfo"
            com.bytedance.p066a.p067a.p070b.p072b.C2077a.m9161a(r5, r0)
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.player.sdk.p1459b.C34992e.mo88572a(int):float");
    }

    /* renamed from: c */
    public final boolean mo88590c(boolean z) {
        boolean z2;
        boolean z3;
        if (this.f91342s == null || (this.f91342s.indexOfKey(17) < 0 && this.f91342s.indexOfKey(16) < 0)) {
            return this.f91339p;
        }
        if (this.f91342s.get(17, 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f91342s.get(16, 0) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2) {
            return true;
        }
        if (z || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo88574a(float f) {
        try {
            if (this.f91328d != null) {
                TTVideoEngine tTVideoEngine = this.f91328d;
                double d = (double) f;
                Double.isNaN(d);
                double d2 = d * 0.01d;
                double d3 = (double) this.f91328d.mDuration;
                Double.isNaN(d3);
                tTVideoEngine.seekTo((int) (d2 * d3), null);
            }
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "seekTo");
        }
    }

    /* renamed from: a */
    public final void mo88577a(Surface surface) {
        try {
            if ((this.f91345v == null || !this.f91345v.mo88610a(surface)) && this.f91328d != null) {
                if (C34963a.f91251a) {
                    StringBuilder sb = new StringBuilder(", setSurface surface = ");
                    sb.append(surface);
                    sb.append(", this = ");
                    sb.append(this);
                }
                this.f91328d.setSurface(surface);
            }
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "setSurface");
        }
    }

    /* renamed from: a */
    public final void mo88578a(SurfaceHolder surfaceHolder) {
        try {
            if (this.f91328d != null) {
                this.f91328d.setSurfaceHolder(surfaceHolder);
            }
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "setDisplay");
        }
    }

    /* renamed from: a */
    public final void mo88582a(C46083h hVar, Map<String, Object> map) throws IOException {
        m112913a(hVar, null, map);
    }

    private C34992e(Context context, boolean z) {
        this(context, false, null);
    }

    /* renamed from: a */
    public final void mo88575a(float f, float f2) {
        try {
            if (this.f91328d != null) {
                this.f91328d.setVolume(f, f2);
            }
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "setVolume");
        }
    }

    private C34992e(Context context, boolean z, SparseIntArray sparseIntArray) {
        this(context, z, null, null, null);
    }

    /* renamed from: a */
    private void m112913a(C46083h hVar, String str, Map<String, Object> map) throws IOException {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        boolean z7;
        boolean z8;
        int i5;
        int i6;
        int i7;
        boolean z9;
        C46083h hVar2 = hVar;
        String str2 = str;
        Map<String, Object> map2 = map;
        this.f91349z = 0;
        if (this.f91324A != 0) {
            this.f91349z = SystemClock.elapsedRealtime() - this.f91324A;
            this.f91324A = 0;
        }
        String str3 = null;
        this.f91331g = null;
        int i8 = -1;
        if (map2 != null) {
            z4 = ((Boolean) map2.get("vr")).booleanValue();
            z3 = ((Boolean) map2.get("h265")).booleanValue();
            i3 = ((Integer) map2.get("render_type")).intValue();
            if (map2.get("decoder_type") != null) {
                i2 = ((Integer) map2.get("decoder_type")).intValue();
            } else {
                i2 = 0;
            }
            if (map2.get("bitrate") != null) {
                i = ((Integer) map2.get("bitrate")).intValue();
            } else {
                i = 0;
            }
            if (map2.get("ratio") != null) {
                i8 = ((Integer) map2.get("ratio")).intValue();
            }
            if (map2.get("async_init") == null || !(map2.get("async_init") instanceof Boolean)) {
                z2 = false;
            } else {
                z2 = ((Boolean) map2.get("async_init")).booleanValue();
            }
            if (map2.get("frames_wait") != null && (map2.get("frames_wait") instanceof Integer)) {
                this.f91328d.setIntOption(208, ((Integer) map2.get("frames_wait")).intValue());
            }
            if (map2.get("key") != null) {
                str3 = map2.get("key").toString();
            }
            if (map2.get("init_start_time_ms") != null) {
                this.f91328d.setStartTime(((Integer) map2.get("init_start_time_ms")).intValue());
            }
            if (map2.get("set_cookie_token") != null) {
                z = ((Boolean) map2.get("set_cookie_token")).booleanValue();
            } else {
                z = false;
            }
            if (map2.get("enable_alog") != null && (map2.get("enable_alog") instanceof Integer)) {
                this.f91328d.setIntOption(320, ((Integer) map2.get("enable_alog")).intValue());
            }
            if (map2.get("use_texture_render") != null) {
                this.f91328d.setIntOption(199, ((Integer) map2.get("use_texture_render")).intValue());
            }
            if (map2.get("force_software_decode") != null) {
                this.f91340q = ((Boolean) map2.get("force_software_decode")).booleanValue();
            }
            z5 = false;
        } else {
            z5 = false;
            z4 = false;
            z3 = false;
            i3 = 0;
            i2 = 0;
            i = 0;
            z2 = false;
            z = false;
        }
        this.f91344u = z5;
        if (this.f91342s == null || this.f91342s.get(7) != 1) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            int i9 = this.f91342s.get(10);
            int i10 = this.f91342s.get(11);
            z7 = z;
            if (this.f91342s.get(12) == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i11 = this.f91342s.get(13);
            i4 = i3;
            int i12 = this.f91342s.get(14);
            if (i9 > 0 && i8 >= i9 && i > 0 && i <= i10 && ((!z3 || z9) && this.f91336m > i11 && this.f91337n > i12)) {
                this.f91344u = true;
            }
        } else {
            i4 = i3;
            z7 = z;
        }
        if (this.f91342s == null || this.f91342s.get(15) != 1) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (TextUtils.isEmpty(str) || str2.startsWith(WebKitApi.SCHEME_HTTP)) {
            this.f91328d.setIntOption(203, 1);
            if (z8) {
                this.f91328d.setIntOption(160, 1);
                if (hVar2 != null) {
                    this.f91328d.configResolution(TTVideoEngine.findBestResolution(hVar2, Resolution.H_High, 1));
                    this.f91328d.setVideoModel(hVar2);
                    this.f91328d.setIntOption(33, 1);
                    this.f91328d.setIntOption(17, 1);
                } else {
                    this.f91328d.setIntOption(33, 0);
                    this.f91328d.setIntOption(17, 0);
                    this.f91328d.setDirectUrlUseDataLoader(str2, str3);
                }
            } else {
                this.f91328d.setIntOption(33, 0);
                this.f91328d.setIntOption(17, 0);
                this.f91328d.setDirectURL(str2);
            }
        } else {
            this.f91328d.setIntOption(203, 0);
            this.f91328d.setLocalURL(str2);
        }
        this.f91331g = str2;
        this.f91328d.setIntOption(6, 1);
        if (i2 == 0) {
            this.f91328d.setIntOption(9, 1);
        } else {
            this.f91328d.setIntOption(9, 2);
        }
        this.f91339p = mo88590c(z3);
        if (this.f91340q || !this.f91339p) {
            this.f91328d.setIntOption(7, 0);
        } else {
            this.f91328d.setIntOption(7, 1);
        }
        TTVideoEngine tTVideoEngine = this.f91328d;
        if (this.f91346w == null || !this.f91346w.f115504i) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        tTVideoEngine.setIntOption(332, i5);
        if (!z2 || !this.f91339p) {
            i6 = 1;
        } else {
            TTVideoEngine tTVideoEngine2 = this.f91328d;
            if (z3) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            i6 = 1;
            tTVideoEngine2.setAsyncInit(true, i7);
        }
        this.f91328d.setIntOption(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, i6);
        int i13 = 3;
        this.f91328d.setIntOption(3, i6);
        if (this.f91342s != null && this.f91342s.indexOfKey(20) >= 0) {
            this.f91328d.setIntOption(117, this.f91342s.get(20));
        }
        if (VERSION.SDK_INT >= 26) {
            TTVideoEngine tTVideoEngine3 = this.f91328d;
            if (!z4) {
                i6 = 0;
            }
            tTVideoEngine3.setIntOption(5, i6);
        } else if (i4 == 0) {
            TTVideoEngine tTVideoEngine4 = this.f91328d;
            if (!z4) {
                i6 = 0;
            }
            tTVideoEngine4.setIntOption(5, i6);
        } else {
            TTVideoEngine tTVideoEngine5 = this.f91328d;
            if (z4) {
                i13 = 1;
            }
            tTVideoEngine5.setIntOption(5, i13);
        }
        if (this.f91342s != null && this.f91342s.indexOfKey(19) >= 0) {
            this.f91328d.setIntOption(215, this.f91342s.get(19));
        }
        if (this.f91342s != null && this.f91342s.indexOfKey(22) >= 0) {
            this.f91328d.setIntOption(321, this.f91342s.get(22));
        }
        if (this.f91342s == null || this.f91342s.indexOfKey(33) < 0) {
            this.f91328d.setIntOption(0, 15);
        } else {
            this.f91328d.setIntOption(0, this.f91342s.get(33));
        }
        if (this.f91342s != null && this.f91342s.indexOfKey(35) >= 0) {
            this.f91328d.setIntOption(330, this.f91342s.get(35));
        }
        if (this.f91342s != null && this.f91342s.indexOfKey(36) >= 0) {
            this.f91328d.setIntOption(331, this.f91342s.get(36));
        }
        this.f91328d.setIntOption(183, 0);
        if (this.f91342s != null && this.f91342s.indexOfKey(39) >= 0) {
            this.f91328d.setIntOption(301, this.f91342s.get(39));
        }
        if (this.f91342s != null && this.f91342s.indexOfKey(38) >= 0) {
            this.f91328d.setIntOption(416, this.f91342s.get(38));
        }
        if (this.f91342s != null && this.f91342s.indexOfKey(37) >= 0) {
            this.f91328d.setIntOption(302, this.f91342s.get(37));
        }
        if (this.f91346w != null) {
            this.f91328d.setIntOption(333, this.f91346w.f115506k ? 1 : 0);
            C44915a aVar = this.f91346w.f115503h;
            if (aVar != null) {
                this.f91328d.setIntOption(421, aVar.f115511c);
                this.f91328d.setIntOption(422, aVar.f115512d);
                this.f91328d.setIntOption(423, aVar.f115513e);
                this.f91328d.setIntOption(204, aVar.f115514f);
                this.f91328d.setIntOption(313, aVar.f115515g);
                this.f91328d.setIntOption(424, aVar.f115516h);
                this.f91328d.setIntOption(425, aVar.f115517i);
            }
            C44916b bVar = this.f91346w.f115505j;
            if (bVar != null && z7) {
                String str4 = bVar.f115518a;
                if (!TextUtils.isEmpty(str4)) {
                    this.f91328d.setCustomHeader("cookie", str4);
                }
                Map<String, String> map3 = bVar.f115519b;
                if (map3 != null && map3.size() > 0) {
                    for (String str5 : map3.keySet()) {
                        this.f91328d.setCustomHeader(str5, (String) map3.get(str5));
                    }
                }
            }
        }
        m112915s();
    }

    public C34992e(Context context, boolean z, SparseIntArray sparseIntArray, SparseArray sparseArray, PlayerConfig playerConfig) {
        this.f91325B = new C46033aa() {
            public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
            }

            public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
            }

            public final void onPrepare(TTVideoEngine tTVideoEngine) {
            }

            public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
            }

            public final void onCompletion(TTVideoEngine tTVideoEngine) {
                C34992e.this.f91333i.mo88609c();
            }

            public final void onError(C46117c cVar) {
                if (Thread.currentThread().getId() != C34992e.this.f91327c) {
                    Exception exc = new Exception();
                    StringBuilder sb = new StringBuilder("onError thread not match, error:");
                    sb.append(cVar);
                    C2077a.m9161a((Throwable) exc, sb.toString());
                }
                C34992e.this.f91333i.mo88606a(cVar.f118004a, cVar.f118005b, cVar);
            }

            public final void onPrepared(TTVideoEngine tTVideoEngine) {
                C34992e.this.f91333i.mo88605a();
                if (TextUtils.isEmpty(C34992e.this.f91331g) && C34992e.this.f91328d != null) {
                    C34992e.this.f91331g = C34992e.this.f91328d.getCurrentPlayPath();
                }
            }

            public final void onRenderStart(TTVideoEngine tTVideoEngine) {
                if (!C34992e.this.f91330f) {
                    if (C34992e.this.f91328d != null) {
                        C34992e.this.f91266a.f91258a = C34992e.this.f91328d.getIntOption(43);
                        C34992e.this.f91266a.f91259b = C34992e.this.f91328d.getIntOption(45);
                    }
                    C34992e.this.f91333i.mo88608b();
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onVideoStatusException(int r7) {
                /*
                    r6 = this;
                    r0 = 20
                    if (r7 == r0) goto L_0x001c
                    r0 = 30
                    if (r7 == r0) goto L_0x001c
                    r0 = 40
                    if (r7 == r0) goto L_0x0019
                    r0 = 1000(0x3e8, float:1.401E-42)
                    if (r7 == r0) goto L_0x001c
                    r0 = 1002(0x3ea, float:1.404E-42)
                    if (r7 == r0) goto L_0x0019
                    switch(r7) {
                        case 3: goto L_0x001c;
                        case 4: goto L_0x001c;
                        default: goto L_0x0017;
                    }
                L_0x0017:
                    r0 = 0
                    goto L_0x001e
                L_0x0019:
                    java.lang.String r0 = "视频已删除，无法播放"
                    goto L_0x001e
                L_0x001c:
                    java.lang.String r0 = "转码中，视频暂时无法播放"
                L_0x001e:
                    java.lang.Thread r1 = java.lang.Thread.currentThread()
                    long r1 = r1.getId()
                    com.ss.android.ugc.aweme.player.sdk.b.e r3 = com.p280ss.android.ugc.aweme.player.sdk.p1459b.C34992e.this
                    long r3 = r3.f91327c
                    int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r5 == 0) goto L_0x0044
                    java.lang.Exception r1 = new java.lang.Exception
                    r1.<init>()
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "onVideoStatusException thread not match, status:"
                    r2.<init>(r3)
                    r2.append(r7)
                    java.lang.String r7 = r2.toString()
                    com.bytedance.p066a.p067a.p070b.p072b.C2077a.m9161a(r1, r7)
                L_0x0044:
                    com.ss.android.ugc.aweme.player.sdk.b.e r7 = com.p280ss.android.ugc.aweme.player.sdk.p1459b.C34992e.this
                    com.ss.android.ugc.aweme.player.sdk.api.IPlayer$c r7 = r7.f91333i
                    r1 = 0
                    r7.mo88606a(r1, r1, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.player.sdk.p1459b.C34992e.C349931.onVideoStatusException(int):void");
            }

            public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
                if (i == 2) {
                    C34992e.this.f91333i.mo88607a(true);
                    return;
                }
                if (i == 1) {
                    C34992e.this.f91333i.mo88607a(false);
                }
            }

            public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
                C34992e.this.f91266a.f91260c = i;
                C34992e.this.f91266a.f91261d = i2;
            }
        };
        this.f91333i = new C34965a();
        this.f91335l = context;
        this.f91339p = z;
        this.f91342s = sparseIntArray;
        this.f91329e = sparseArray;
        this.f91336m = C34997a.m112955a();
        this.f91337n = C34997a.m112959b();
        this.f91327c = Thread.currentThread().getId();
        this.f91338o = new AtomicReference<>(null);
        this.f91346w = playerConfig;
        m112917u();
    }
}
