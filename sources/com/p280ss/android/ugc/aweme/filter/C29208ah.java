package com.p280ss.android.ugc.aweme.filter;

import android.support.p029v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39370d;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39376h;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.ah */
public final class C29208ah {

    /* renamed from: a */
    public FrameLayout f77103a;

    /* renamed from: b */
    public FrameLayout f77104b;

    /* renamed from: c */
    public C39376h f77105c;

    /* renamed from: d */
    public C23258e f77106d;

    /* renamed from: e */
    public C29240bc f77107e;

    /* renamed from: f */
    public boolean f77108f;

    /* renamed from: g */
    public boolean f77109g;

    /* renamed from: h */
    public AVETParameter f77110h;

    /* renamed from: i */
    public boolean f77111i;

    /* renamed from: j */
    public C39370d f77112j;

    /* renamed from: k */
    public final AppCompatActivity f77113k;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f77113k, (java.lang.Object) ((com.p280ss.android.ugc.aweme.filter.C29208ah) r2).f77113k) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.filter.C29208ah
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.filter.ah r2 = (com.p280ss.android.ugc.aweme.filter.C29208ah) r2
            android.support.v7.app.AppCompatActivity r0 = r1.f77113k
            android.support.v7.app.AppCompatActivity r2 = r2.f77113k
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.filter.C29208ah.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        AppCompatActivity appCompatActivity = this.f77113k;
        if (appCompatActivity != null) {
            return appCompatActivity.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterParams(activity=");
        sb.append(this.f77113k);
        sb.append(")");
        return sb.toString();
    }

    public C29208ah(AppCompatActivity appCompatActivity) {
        C7573i.m23587b(appCompatActivity, "activity");
        this.f77113k = appCompatActivity;
    }
}
