package com.facebook.bidding;

import android.content.Context;
import com.facebook.bidding.p674a.C13206b;
import com.facebook.bidding.p674a.p677c.C13213a;

/* renamed from: com.facebook.bidding.a */
public final class C13202a {

    /* renamed from: a */
    public Context f34986a;

    /* renamed from: b */
    public String f34987b;

    /* renamed from: c */
    public String f34988c;

    /* renamed from: d */
    public FBAdBidFormat f34989d;

    /* renamed from: e */
    public int f34990e = 1000;

    /* renamed from: f */
    public boolean f34991f;

    /* renamed from: g */
    public boolean f34992g;

    /* renamed from: h */
    public FBAdBidAuctionType f34993h = FBAdBidAuctionType.FIRST_PRICE;

    /* renamed from: i */
    public boolean f34994i;

    /* renamed from: j */
    public String f34995j;

    /* renamed from: k */
    public String f34996k = "FB Ad Impression";

    /* renamed from: l */
    private String f34997l;

    /* renamed from: com.facebook.bidding.a$a */
    public interface C13203a {
        /* renamed from: a */
        void mo7903a(C13230b bVar);
    }

    public C13202a(Context context, String str, String str2, FBAdBidFormat fBAdBidFormat) {
        this.f34986a = context;
        this.f34987b = str;
        this.f34988c = str2;
        this.f34989d = fBAdBidFormat;
        this.f34995j = C13213a.m38611a();
    }

    /* renamed from: a */
    public final C13202a mo32397a(boolean z) {
        this.f34992g = true;
        return this;
    }

    /* renamed from: a */
    public final String mo32398a() {
        return this.f34997l != null ? this.f34997l : this.f34987b;
    }

    /* renamed from: a */
    public final void mo32399a(C13203a aVar) {
        C13206b.m38602a(this, aVar);
    }
}
