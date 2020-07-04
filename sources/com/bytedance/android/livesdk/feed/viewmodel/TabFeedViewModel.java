package com.bytedance.android.livesdk.feed.viewmodel;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.C6019g;
import com.bytedance.android.livesdk.feed.C6037j;
import com.bytedance.android.livesdk.feed.C6077n;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p229d.C5971a;
import com.bytedance.common.utility.C6319n;

public class TabFeedViewModel extends FragmentFeedViewModel {

    /* renamed from: A */
    private C6077n f21095A;

    /* renamed from: y */
    protected C6037j f21096y;

    /* renamed from: z */
    private long f21097z;

    /* renamed from: i */
    public final boolean mo20495i() {
        mo20493g();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final FeedDataKey mo20494h() {
        return FeedDataKey.m18724a(mo20492f(), mo20491e(), this.f21097z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo20491e() {
        if (!C6319n.m19593a(this.f21069r) || this.f21096y.mo14689a(this.f21097z) == null) {
            return this.f21069r;
        }
        return this.f21096y.mo14689a(this.f21097z).f17754d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo20492f() {
        if (TextUtils.isEmpty(this.f21072u) && this.f21096y.mo14689a(this.f21097z) != null) {
            this.f21072u = this.f21096y.mo14689a(this.f21097z).f17758h;
        }
        if (TextUtils.isEmpty(this.f21072u)) {
            this.f21072u = "video";
        }
        return this.f21072u;
    }

    /* renamed from: c */
    public final void mo20506c(String str) {
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        sb.append(parse.getPath());
        sb.append("?");
        sb.append(parse.getQuery());
        this.f21069r = sb.toString();
    }

    public TabFeedViewModel(IFeedRepository iFeedRepository, C6019g gVar, C6037j jVar, C5971a aVar, C6077n nVar, long j) {
        super(iFeedRepository, gVar, aVar);
        this.f21096y = jVar;
        this.f21097z = j;
        this.f21095A = nVar;
    }
}
