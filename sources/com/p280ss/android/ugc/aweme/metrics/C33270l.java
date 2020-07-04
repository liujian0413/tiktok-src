package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.metrics.C33270l;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;

/* renamed from: com.ss.android.ugc.aweme.metrics.l */
public abstract class C33270l<E extends C33270l> extends C33259d {

    /* renamed from: v */
    protected String f86800v;

    /* renamed from: w */
    protected String f86801w;

    /* renamed from: x */
    protected String f86802x;

    /* renamed from: y */
    protected Boolean f86803y = Boolean.valueOf(false);

    /* renamed from: z */
    protected String f86804z;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo85050b() {
        String str;
        if ("homepage_country".equals(this.f86753e) && !TextUtils.isEmpty(this.f86800v)) {
            mo85248a("country_name", this.f86800v, C33260a.f86770a);
        }
        if (("others_homepage".equals(this.f86753e) || "collection_video".equals(this.f86753e) || "personal_homepage".equals(this.f86753e) || "playlist".equals(this.f86753e)) && !TextUtils.isEmpty(this.f86801w)) {
            mo85248a("tab_name", this.f86801w, C33260a.f86770a);
            mo85248a(POIService.KEY_ORDER, this.f86802x, C33260a.f86770a);
        }
        if ((TextUtils.equals(this.f86753e, "homepage_fresh") || TextUtils.equals(this.f86753e, "homepage_channel")) && C30187a.m98819b() && !(this instanceof C33248at)) {
            mo85245a("tab_name", C30187a.m98818a());
        }
        mo85248a("trending_topic", this.f86767s, C33260a.f86770a);
        if ("discovery_category".equals(this.f86753e) && !TextUtils.isEmpty(this.f86801w)) {
            mo85248a("discovery_category", this.f86801w, C33260a.f86770a);
            mo85248a(POIService.KEY_ORDER, this.f86802x, C33260a.f86770a);
        }
        mo85248a("enter_from", this.f86753e, C33260a.f86770a);
        String str2 = "is_rising_topic";
        if (this.f86803y.booleanValue()) {
            str = "1";
        } else {
            str = "0";
        }
        mo85248a(str2, str, C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86804z)) {
            mo85245a("video_tag", this.f86804z);
        }
    }

    /* renamed from: a */
    public final E mo85282a(Boolean bool) {
        this.f86803y = bool;
        return this;
    }

    /* renamed from: l */
    public final E mo85283l(String str) {
        this.f86801w = str;
        return this;
    }

    /* renamed from: m */
    public final E mo85284m(String str) {
        this.f86802x = str;
        return this;
    }

    /* renamed from: n */
    public final E mo85285n(String str) {
        this.f86804z = str;
        return this;
    }

    public C33270l(String str) {
        super(str);
    }

    /* renamed from: g */
    public E mo85071g(Aweme aweme) {
        if (!(aweme == null || aweme.getAuthor() == null)) {
            this.f86800v = aweme.getAuthor().getRegion();
        }
        mo85247a(aweme);
        mo85249b(aweme);
        return this;
    }
}
