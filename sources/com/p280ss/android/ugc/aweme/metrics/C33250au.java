package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.au */
public final class C33250au extends C33270l<C33250au> {

    /* renamed from: A */
    private String f86623A;

    /* renamed from: a */
    private String f86624a;

    /* renamed from: b */
    private String f86625b;

    /* renamed from: c */
    private Aweme f86626c;

    public C33250au() {
        super("tab_stay_time");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("duration", this.f86624a, C33260a.f86770a);
        mo85248a("enter_from", this.f86753e, C33260a.f86770a);
        mo85248a("group_id", C33230ac.m107238m(this.f86626c), C33260a.f86770a);
        mo85248a("author_id", C33230ac.m107205a(this.f86626c), C33260a.f86770a);
        mo85248a("city_info", C33230ac.m107204a(), C33260a.f86770a);
        mo85248a("enter_method", this.f86623A, C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86625b)) {
            mo85248a("page_type", this.f86625b, C33260a.f86770a);
        }
    }

    /* renamed from: a */
    public final C33250au mo85150a(String str) {
        this.f86624a = str;
        return this;
    }

    /* renamed from: b */
    public final C33250au mo85151b(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: c */
    public final C33250au mo85152c(String str) {
        this.f86625b = str;
        return this;
    }

    /* renamed from: d */
    public final C33250au mo85153d(String str) {
        this.f86623A = str;
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public C33250au mo85071g(Aweme aweme) {
        super.mo85071g(aweme);
        this.f86626c = aweme;
        return this;
    }
}
