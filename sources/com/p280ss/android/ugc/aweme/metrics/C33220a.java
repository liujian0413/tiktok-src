package com.p280ss.android.ugc.aweme.metrics;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider.C28651a;
import com.p280ss.android.ugc.aweme.metrics.C33220a;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.metrics.a */
public abstract class C33220a<E extends C33220a<E>> extends C33270l<E> {

    /* renamed from: a */
    public String f86465a;

    /* renamed from: b */
    public boolean f86466b;

    /* renamed from: c */
    public String f86467c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo85050b() {
        super.mo85050b();
        String str = this.f86467c;
        if (TextUtils.equals("general_search", this.f86753e) && !this.f86466b && C6399b.m19944t()) {
            str = "click_search_result_video";
        }
        mo85248a("search_keyword", this.f86465a, C33260a.f86770a);
        mo85248a("enter_method", str, C33260a.f86770a);
    }

    /* renamed from: a */
    public final E mo85048a(String str) {
        this.f86467c = str;
        return this;
    }

    public C33220a(String str) {
        C7573i.m23587b(str, "event");
        super(str);
    }

    /* renamed from: a */
    public final E mo85049a(boolean z) {
        this.f86466b = true;
        return this;
    }

    /* renamed from: a */
    public final E mo85047a(Context context) {
        String str;
        String str2;
        if (context == null) {
            return this;
        }
        FeedParam a = C28651a.m94274a(context);
        String str3 = null;
        if (a != null) {
            str = a.getSearchKeyword();
        } else {
            str = null;
        }
        this.f86465a = str;
        if (a != null) {
            str2 = a.getObjectId();
        } else {
            str2 = null;
        }
        this.f86766r = str2;
        if (a != null) {
            str3 = a.getCardType();
        }
        this.f86765q = str3;
        return this;
    }
}
