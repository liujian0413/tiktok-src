package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14793ay;

final class aec implements aft<Throwable, T> {

    /* renamed from: a */
    private final /* synthetic */ aeg f40091a;

    aec(aea aea, aeg aeg) {
        this.f40091a = aeg;
    }

    /* renamed from: a */
    public final /* synthetic */ agj mo37772a(Object obj) throws Exception {
        Throwable th = (Throwable) obj;
        acd.m45778b("Error occurred while dispatching http response in getter.", th);
        C14793ay.m42898d().mo39089a(th, "HttpGetter.deliverResponse.1");
        return afy.m45817a(this.f40091a.mo39248a());
    }
}
