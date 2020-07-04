package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d */
public final class C25344d {

    /* renamed from: a */
    public static final C25344d f66732a = new C25344d();

    /* renamed from: b */
    private static Set<String> f66733b;

    /* renamed from: c */
    private static Set<Long> f66734c;

    /* renamed from: d */
    private static long f66735d;

    private C25344d() {
    }

    /* renamed from: a */
    public static final int m83276a() {
        return f66733b.size() + 1;
    }

    /* renamed from: b */
    public static final long m83280b() {
        if (f66735d != 0) {
            return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - f66735d);
        }
        return -1;
    }

    static {
        Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        C7573i.m23582a((Object) synchronizedSet, "Collections.synchronizedSet(mutableSetOf())");
        f66733b = synchronizedSet;
        Set<Long> synchronizedSet2 = Collections.synchronizedSet(new LinkedHashSet());
        C7573i.m23582a((Object) synchronizedSet2, "Collections.synchronizedSet(mutableSetOf())");
        f66734c = synchronizedSet2;
    }

    /* renamed from: a */
    public static final void m83277a(int i) {
        if (i != 2) {
            f66733b.clear();
            f66734c.clear();
        }
    }

    /* renamed from: a */
    public static final void m83278a(Aweme aweme) {
        if (aweme != null && aweme.getAid() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && awemeRawAd.isHardAd()) {
                f66735d = System.currentTimeMillis();
            }
            f66733b.remove(aweme.getAid());
            m83282c(aweme);
        }
    }

    /* renamed from: b */
    private static void m83281b(Aweme aweme) {
        if (aweme.isAd()) {
            try {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    Long creativeId = awemeRawAd.getCreativeId();
                    if (creativeId != null) {
                        f66734c.add(Long.valueOf(creativeId.longValue()));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private static void m83282c(Aweme aweme) {
        if (aweme.isAd()) {
            try {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    Long creativeId = awemeRawAd.getCreativeId();
                    if (creativeId != null) {
                        f66734c.remove(Long.valueOf(creativeId.longValue()));
                    }
                }
            } catch (Exception unused) {
            }
            C25298bw.f66655b.mo65893a(f66734c);
        }
    }

    /* renamed from: a */
    public static final void m83279a(List<? extends Aweme> list) {
        if (list != null) {
            for (Aweme aweme : list) {
                if (!(aweme == null || aweme.getAid() == null)) {
                    Set<String> set = f66733b;
                    String aid = aweme.getAid();
                    C7573i.m23582a((Object) aid, "aweme.aid");
                    set.add(aid);
                    m83281b(aweme);
                }
            }
            C25298bw.f66655b.mo65893a(f66734c);
        }
    }
}
