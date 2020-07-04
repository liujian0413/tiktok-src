package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24943am;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1878b.C47891a;
import kotlin.reflect.C7595j;
import kotlin.sequences.C7605h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bv */
public final class C25294bv {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f66648a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25294bv.class), "awemeState", "getAwemeState()Ljava/util/Map;"))};

    /* renamed from: b */
    public static final C25294bv f66649b = new C25294bv();

    /* renamed from: c */
    private static final C7541d f66650c = C7546e.m23569a(C25295a.f66651a);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bv$a */
    static final class C25295a extends Lambda implements C7561a<Map<Aweme, Integer>> {

        /* renamed from: a */
        public static final C25295a f66651a = new C25295a();

        C25295a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m83117a();
        }

        /* renamed from: a */
        private static Map<Aweme, Integer> m83117a() {
            C7213d a = C7213d.m22500a();
            C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
            if (a.mo18800bl()) {
                return Collections.synchronizedMap(new WeakHashMap());
            }
            return new WeakHashMap<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bv$b */
    static final class C25296b extends Lambda implements C7562b<Entry<? extends Aweme, ? extends Integer>, Aweme> {

        /* renamed from: a */
        public static final C25296b f66652a = new C25296b();

        C25296b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m83118a((Entry) obj);
        }

        /* renamed from: a */
        private static Aweme m83118a(Entry<? extends Aweme, Integer> entry) {
            C7573i.m23587b(entry, "it");
            return (Aweme) entry.getKey();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bv$c */
    static final class C25297c extends Lambda implements C7562b<Aweme, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f66653a;

        C25297c(String str) {
            this.f66653a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m83119a((Aweme) obj));
        }

        /* renamed from: a */
        private boolean m83119a(Aweme aweme) {
            String str;
            C7573i.m23582a((Object) aweme, "it");
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str = awemeRawAd.getCreativeIdStr();
            } else {
                str = null;
            }
            if (!C7573i.m23585a((Object) str, (Object) this.f66653a) || C25294bv.f66649b.mo65892c(aweme)) {
                return false;
            }
            return true;
        }
    }

    private C25294bv() {
    }

    /* renamed from: a */
    private final Map<Aweme, Integer> m83104a() {
        return (Map) f66650c.getValue();
    }

    /* renamed from: d */
    public static final boolean m83112d(Aweme aweme) {
        if (aweme == null || !f66649b.m83114f(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private final boolean m83114f(Aweme aweme) {
        if ((m83103a(aweme, 0) & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo65892c(Aweme aweme) {
        if ((m83103a(aweme, 0) & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m83113e(Aweme aweme) {
        if (C25352e.m83221d(aweme) && aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && awemeRawAd.useEffectivePlayAction()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private static long m83115g(Aweme aweme) {
        float f;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                Float effectivePlayTime = awemeRawAd.getEffectivePlayTime();
                if (effectivePlayTime != null) {
                    f = effectivePlayTime.floatValue();
                    return C47891a.m148823b(f * 1000.0f);
                }
            }
        }
        f = 3.0f;
        return C47891a.m148823b(f * 1000.0f);
    }

    /* renamed from: a */
    public static final void m83105a(Aweme aweme) {
        if (aweme != null && C25352e.m83221d(aweme)) {
            m83115g(aweme);
            Map a = f66649b.m83104a();
            C7573i.m23582a((Object) a, "awemeState");
            a.put(aweme, Integer.valueOf(0));
        }
    }

    /* renamed from: b */
    public static final void m83109b(Aweme aweme) {
        if (aweme != null && C25352e.m83221d(aweme)) {
            m83115g(aweme);
            if (!f66649b.mo65892c(aweme)) {
                if (m83113e(aweme)) {
                    C24976t.m82052a(C6399b.m19921a(), aweme, "play");
                } else {
                    C24943am.f65779a.mo65220d(aweme);
                }
            }
            f66649b.m83104a().remove(aweme);
        }
    }

    /* renamed from: a */
    public static final void m83108a(String str) {
        C7573i.m23587b(str, "creativeId");
        Map a = f66649b.m83104a();
        C7573i.m23582a((Object) a, "awemeState");
        for (Aweme aweme : C7605h.m23664h(C7605h.m23653a(C7605h.m23659d(C7507ae.m23404e(a), C25296b.f66652a), (C7562b<? super T, Boolean>) new C25297c<Object,Boolean>(str)))) {
            if (m83113e(aweme)) {
                C24976t.m82052a(C6399b.m19921a(), aweme, "click");
                f66649b.m83107a(aweme, true);
            }
            f66649b.m83111b(aweme, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int m83103a(Aweme aweme, int i) {
        if (aweme == null) {
            return i;
        }
        Integer num = (Integer) m83104a().get(aweme);
        if (num != null) {
            return num.intValue();
        }
        return i;
    }

    /* renamed from: b */
    private final void m83111b(Aweme aweme, boolean z) {
        Map a = m83104a();
        C7573i.m23582a((Object) a, "awemeState");
        a.put(aweme, Integer.valueOf(m83103a(aweme, 0) | 1));
    }

    /* renamed from: a */
    public static final void m83106a(Aweme aweme, long j) {
        if (aweme != null && C25352e.m83221d(aweme)) {
            if (j >= m83115g(aweme) && !f66649b.mo65892c(aweme)) {
                if (m83113e(aweme)) {
                    C24976t.m82052a(C6399b.m19921a(), aweme, "play");
                } else {
                    C24943am.f65779a.mo65220d(aweme);
                }
            }
            f66649b.m83104a().remove(aweme);
        }
    }

    /* renamed from: b */
    public static final void m83110b(Aweme aweme, long j) {
        if (aweme != null && m83113e(aweme) && j >= m83115g(aweme) && !f66649b.mo65892c(aweme)) {
            C24976t.m82052a(C6399b.m19921a(), aweme, "play");
            f66649b.m83107a(aweme, true);
        }
    }

    /* renamed from: a */
    private void m83107a(Aweme aweme, boolean z) {
        Map a = m83104a();
        C7573i.m23582a((Object) a, "awemeState");
        a.put(aweme, Integer.valueOf(2 | m83103a(aweme, 0)));
    }
}
