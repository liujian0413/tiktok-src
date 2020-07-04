package com.p280ss.android.ugc.aweme.poi.bean;

import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.bean.e */
public final class C35073e extends C34145b {

    /* renamed from: a */
    public List<? extends AwemeRawAd> f91732a;

    /* renamed from: b */
    public String f91733b;

    /* renamed from: c */
    public boolean f91734c;

    public final int getFeedType() {
        return 65452;
    }

    public final void setFeedType(int i) {
    }

    /* renamed from: a */
    public final Integer mo88904a() {
        List<? extends AwemeRawAd> list = this.f91732a;
        if (list != null) {
            return Integer.valueOf(list.size());
        }
        return null;
    }

    /* renamed from: b */
    public final AwemeRawAd mo88905b() {
        List<? extends AwemeRawAd> list = this.f91732a;
        if (list != null) {
            return (AwemeRawAd) list.get(0);
        }
        return null;
    }

    public C35073e(List<? extends AwemeRawAd> list, String str, boolean z) {
        C7573i.m23587b(str, "title");
        this.f91732a = list;
        this.f91733b = str;
        this.f91734c = z;
    }
}
