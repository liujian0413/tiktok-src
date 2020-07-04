package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14785aq;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.internal.C14816bu;
import java.util.concurrent.Callable;

final /* synthetic */ class amq implements Callable {

    /* renamed from: a */
    private final Context f40685a;

    /* renamed from: b */
    private final anv f40686b;

    /* renamed from: c */
    private final String f40687c;

    /* renamed from: d */
    private final boolean f40688d;

    /* renamed from: e */
    private final boolean f40689e;

    /* renamed from: f */
    private final bdt f40690f;

    /* renamed from: g */
    private final zzbgz f40691g;

    /* renamed from: h */
    private final C15600ck f40692h;

    /* renamed from: i */
    private final C14785aq f40693i;

    /* renamed from: j */
    private final C14816bu f40694j;

    /* renamed from: k */
    private final bwl f40695k;

    amq(Context context, anv anv, String str, boolean z, boolean z2, bdt bdt, zzbgz zzbgz, C15600ck ckVar, C14785aq aqVar, C14816bu buVar, bwl bwl) {
        this.f40685a = context;
        this.f40686b = anv;
        this.f40687c = str;
        this.f40688d = z;
        this.f40689e = z2;
        this.f40690f = bdt;
        this.f40691g = zzbgz;
        this.f40692h = ckVar;
        this.f40693i = aqVar;
        this.f40694j = buVar;
        this.f40695k = bwl;
    }

    public final Object call() {
        Context context = this.f40685a;
        anv anv = this.f40686b;
        String str = this.f40687c;
        boolean z = this.f40688d;
        boolean z2 = this.f40689e;
        bdt bdt = this.f40690f;
        zzbgz zzbgz = this.f40691g;
        C15600ck ckVar = this.f40692h;
        C14785aq aqVar = this.f40693i;
        C14816bu buVar = this.f40694j;
        bwl bwl = this.f40695k;
        ams ams = new ams(amu.m46520a(context, anv, str, z, z2, bdt, zzbgz, ckVar, aqVar, buVar, bwl));
        ams.setWebViewClient(C14793ay.m42896b().mo39194a(ams, bwl, z2));
        ams.setWebChromeClient(new ama(ams));
        return ams;
    }
}
