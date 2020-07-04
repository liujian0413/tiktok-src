package com.p280ss.android.ugc.aweme.forward.p1271e;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.video.C43222g;

/* renamed from: com.ss.android.ugc.aweme.forward.e.c */
public final class C29902c {

    /* renamed from: a */
    public String f78542a;

    /* renamed from: b */
    public Aweme f78543b;

    /* renamed from: c */
    public C43222g f78544c;

    public final int hashCode() {
        return this.f78542a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForwardShareInfo{mShareId='");
        sb.append(this.f78542a);
        sb.append('\'');
        sb.append(", mAweme=");
        sb.append(this.f78543b);
        sb.append(", mPlayerManager=");
        sb.append(this.f78544c);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj || ((obj instanceof C29902c) && TextUtils.equals(this.f78542a, ((C29902c) obj).f78542a))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m97929a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    public C29902c(String str, Aweme aweme, C43222g gVar) {
        this.f78542a = str;
        this.f78543b = aweme;
        this.f78544c = gVar;
    }
}
