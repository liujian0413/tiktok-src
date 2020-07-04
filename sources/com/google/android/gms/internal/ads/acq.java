package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.List;

final class acq implements C15611cv {

    /* renamed from: a */
    private final /* synthetic */ List f40015a;

    /* renamed from: b */
    private final /* synthetic */ C15610cu f40016b;

    /* renamed from: c */
    private final /* synthetic */ Context f40017c;

    acq(acl acl, List list, C15610cu cuVar, Context context) {
        this.f40015a = list;
        this.f40016b = cuVar;
        this.f40017c = context;
    }

    /* renamed from: a */
    public final void mo39186a() {
        for (String str : this.f40015a) {
            String str2 = "Pinging url: ";
            String valueOf = String.valueOf(str);
            acd.m45781d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            this.f40016b.mo41470a(Uri.parse(str), null, null);
        }
        this.f40016b.mo41469a((Activity) this.f40017c);
    }
}
