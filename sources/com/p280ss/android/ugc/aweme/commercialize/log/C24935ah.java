package com.p280ss.android.ugc.aweme.commercialize.log;

import android.os.SystemClock;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24029a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28323f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.longvideo.p1374a.C32716a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32720b;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.ah */
public final class C24935ah implements C34976f {

    /* renamed from: b */
    public static long f65760b;

    /* renamed from: c */
    public static boolean f65761c;

    /* renamed from: d */
    public static final C24936a f65762d = new C24936a(null);

    /* renamed from: a */
    public final Aweme f65763a;

    /* renamed from: e */
    private long f65764e;

    /* renamed from: f */
    private boolean f65765f = true;

    /* renamed from: g */
    private boolean f65766g;

    /* renamed from: h */
    private boolean f65767h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.ah$a */
    public static final class C24936a {
        private C24936a() {
        }

        /* renamed from: a */
        public final void mo65210a() {
            if (!C6399b.m19944t()) {
                m81817a(0);
                m81818a(false);
            }
        }

        /* renamed from: a */
        private static void m81818a(boolean z) {
            C24935ah.f65761c = false;
        }

        public /* synthetic */ C24936a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static void m81817a(long j) {
            C24935ah.f65760b = 0;
        }

        /* renamed from: a */
        public static boolean m81819a(Aweme aweme) {
            if (!C6399b.m19944t() && aweme != null) {
                return aweme.isAd();
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo65211b(Aweme aweme) {
            if (!C32720b.f85295a.mo84198c(aweme) || !m81819a(aweme)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static final boolean m81791a(Aweme aweme) {
        return f65762d.mo65211b(aweme);
    }

    /* renamed from: c */
    public static final long m81792c() {
        return f65760b;
    }

    /* renamed from: d */
    public static final boolean m81793d() {
        return f65761c;
    }

    /* renamed from: e */
    public static final void m81794e() {
        f65762d.mo65210a();
    }

    /* renamed from: a */
    public final void mo65204a() {
        C42961az.m136382c(this);
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
    }

    /* renamed from: f */
    private final void m81795f() {
        C24976t.m82098aK(C6399b.m19921a(), this.f65763a);
    }

    /* renamed from: g */
    private final void m81796g() {
        C24976t.m82108aU(C6399b.m19921a(), this.f65763a);
    }

    /* renamed from: h */
    private final void m81797h() {
        C24976t.m82099aL(C6399b.m19921a(), this.f65763a);
    }

    /* renamed from: i */
    private final void m81798i() {
        C24976t.m82100aM(C6399b.m19921a(), this.f65763a);
    }

    /* renamed from: j */
    private final void m81799j() {
        C24976t.m82107aT(C6399b.m19921a(), this.f65763a);
    }

    /* renamed from: k */
    private final void m81800k() {
        C24976t.m82103aP(C6399b.m19921a(), this.f65763a);
    }

    /* renamed from: l */
    private final void m81801l() {
        C24976t.m82101aN(C6399b.m19921a(), this.f65763a);
    }

    /* renamed from: m */
    private final void m81802m() {
        C24976t.m82102aO(C6399b.m19921a(), this.f65763a);
    }

    /* renamed from: b */
    public final void mo65205b() {
        if (!this.f65767h) {
            this.f65767h = true;
            if (!this.f65766g) {
                m81797h();
            }
            C42961az.m136383d(this);
        }
    }

    public C24935ah(Aweme aweme) {
        this.f65763a = aweme;
    }

    @C7709l
    public final void onCommentEvent(C24029a aVar) {
        C7573i.m23587b(aVar, "event");
        if (aVar.f63539a == 3) {
            m81800k();
        }
    }

    @C7709l
    public final void onDestroyBreakEvent(C28323f fVar) {
        C7573i.m23587b(fVar, "event");
        mo65205b();
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        if (!this.f65765f) {
            f65760b += SystemClock.elapsedRealtime() - this.f65764e;
            this.f65765f = true;
        }
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        this.f65764e = SystemClock.elapsedRealtime();
        this.f65766g = false;
        this.f65765f = false;
        m81795f();
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        f65760b += SystemClock.elapsedRealtime() - this.f65764e;
        m81798i();
        this.f65766g = true;
        this.f65765f = true;
        f65761c = true;
    }

    @C7709l
    public final void onOperateEvent(C32716a aVar) {
        C7573i.m23587b(aVar, "event");
        if (aVar.f85292a) {
            if (!this.f65765f) {
                f65760b += SystemClock.elapsedRealtime() - this.f65764e;
            }
        } else if (aVar.f85293b) {
            if (!this.f65765f) {
                this.f65764e = SystemClock.elapsedRealtime();
            }
            m81799j();
        }
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        this.f65764e = SystemClock.elapsedRealtime();
        if (this.f65766g) {
            m81796g();
        }
        this.f65766g = false;
        this.f65765f = false;
    }

    @C7709l
    public final void onVideoEvent(C28318an anVar) {
        String str;
        C7573i.m23587b(anVar, "event");
        if (anVar.f74631a == 13 && (anVar.f74632b instanceof String)) {
            Object obj = anVar.f74632b;
            if (obj != null) {
                String str2 = (String) obj;
                Aweme aweme = this.f65763a;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                boolean z = true;
                if (!(!C7573i.m23585a((Object) str2, (Object) str))) {
                    Aweme rawAdAwemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(str2);
                    if (rawAdAwemeById != null) {
                        if (rawAdAwemeById.getUserDigg() == 0) {
                            z = false;
                        }
                        if (z) {
                            m81801l();
                            return;
                        }
                        m81802m();
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
        }
    }
}
