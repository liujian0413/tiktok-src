package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14793ay;

@C6505uv
public final class aky extends abz {

    /* renamed from: a */
    final aik f40530a;

    /* renamed from: b */
    final alb f40531b;

    /* renamed from: c */
    private final String f40532c;

    /* renamed from: d */
    private final String[] f40533d;

    aky(aik aik, alb alb, String str, String[] strArr) {
        this.f40530a = aik;
        this.f40531b = alb;
        this.f40532c = str;
        this.f40533d = strArr;
        C14793ay.m42912r().mo39644a(this);
    }

    /* renamed from: a */
    public final void mo37835a() {
        try {
            this.f40531b.mo39657a(this.f40532c, this.f40533d);
        } finally {
            acl.f40003a.post(new akz(this));
        }
    }

    /* renamed from: u_ */
    public final void mo37836u_() {
        this.f40531b.mo39647a();
    }
}
