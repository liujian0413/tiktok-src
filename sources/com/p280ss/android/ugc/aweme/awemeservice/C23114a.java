package com.p280ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a */
public final class C23114a {

    /* renamed from: a */
    public static C23114a f61031a;

    /* renamed from: b */
    private Map<String, Aweme> f61032b = new HashMap();

    /* renamed from: a */
    public static C23114a m75956a() {
        if (f61031a == null) {
            f61031a = new C23114a();
        }
        return f61031a;
    }

    /* renamed from: d */
    private AwemeStatistics m75957d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Aweme a = mo60227a(str);
        if (a == null) {
            return null;
        }
        AwemeStatistics statistics = a.getStatistics();
        if (statistics == null) {
            statistics = new AwemeStatistics();
            a.setStatistics(statistics);
        }
        return statistics;
    }

    /* renamed from: e */
    private void m75958e(String str) {
        AwemeStatistics d = m75957d(str);
        if (d != null) {
            d.setDiggCount(d.getDiggCount() + 1);
        }
    }

    /* renamed from: f */
    private void m75959f(String str) {
        AwemeStatistics d = m75957d(str);
        if (d != null) {
            d.setDiggCount(d.getDiggCount() - 1);
        }
    }

    /* renamed from: a */
    public final Aweme mo60227a(String str) {
        if (this.f61032b.containsKey(str)) {
            return (Aweme) this.f61032b.get(str);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo60231c(String str) {
        AwemeStatistics d = m75957d(str);
        if (d != null) {
            d.setCommentCount(d.getCommentCount() + 1);
        }
    }

    /* renamed from: a */
    public final Aweme mo60226a(Aweme aweme) {
        if (aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        }
        if (this.f61032b.containsKey(aweme.getAid())) {
            Aweme aweme2 = (Aweme) this.f61032b.get(aweme.getAid());
            aweme2.update(aweme);
            return aweme2;
        }
        this.f61032b.put(aweme.getAid(), aweme);
        return aweme;
    }

    /* renamed from: b */
    public final Aweme mo60229b(String str) {
        for (Aweme aweme : this.f61032b.values()) {
            if (TextUtils.equals(aweme.getAwemeRawAdIdStr(), str)) {
                return aweme;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo60230b(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            Aweme a = mo60227a(str);
            if (a != null) {
                a.setUserDigg(i);
                if (i == 0) {
                    m75959f(str);
                } else {
                    m75958e(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60228a(String str, int i) {
        AwemeStatistics d = m75957d(str);
        if (d != null) {
            d.setCommentCount(i);
        }
    }
}
