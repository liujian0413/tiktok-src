package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14785aq;
import com.google.android.gms.ads.internal.C14816bu;
import java.util.concurrent.Callable;

final /* synthetic */ class aod implements Callable {

    /* renamed from: a */
    private final Context f40815a;

    /* renamed from: b */
    private final anv f40816b;

    /* renamed from: c */
    private final String f40817c;

    /* renamed from: d */
    private final boolean f40818d;

    /* renamed from: e */
    private final boolean f40819e;

    /* renamed from: f */
    private final bdt f40820f;

    /* renamed from: g */
    private final zzbgz f40821g;

    /* renamed from: h */
    private final C15600ck f40822h;

    /* renamed from: i */
    private final C14785aq f40823i;

    /* renamed from: j */
    private final C14816bu f40824j;

    aod(Context context, anv anv, String str, boolean z, boolean z2, bdt bdt, zzbgz zzbgz, C15600ck ckVar, C14785aq aqVar, C14816bu buVar) {
        this.f40815a = context;
        this.f40816b = anv;
        this.f40817c = str;
        this.f40818d = z;
        this.f40819e = z2;
        this.f40820f = bdt;
        this.f40821g = zzbgz;
        this.f40822h = ckVar;
        this.f40823i = aqVar;
        this.f40824j = buVar;
    }

    public final Object call() {
        Context context = this.f40815a;
        anv anv = this.f40816b;
        String str = this.f40817c;
        boolean z = this.f40818d;
        boolean z2 = this.f40819e;
        bdt bdt = this.f40820f;
        zzbgz zzbgz = this.f40821g;
        C15600ck ckVar = this.f40822h;
        C14785aq aqVar = this.f40823i;
        C14816bu buVar = this.f40824j;
        anw anw = new anw();
        aoe aoe = new aoe(new anu(context), anw, anv, str, z, z2, bdt, zzbgz, ckVar, aqVar, buVar);
        ams ams = new ams(aoe);
        aoe.setWebChromeClient(new ama(ams));
        anw.mo39854a((ami) ams, z2);
        return ams;
    }
}
