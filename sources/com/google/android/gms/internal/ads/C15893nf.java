package com.google.android.gms.internal.ads;

import android.content.Context;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.nf */
public final class C15893nf {

    /* renamed from: a */
    private final Object f44685a = new Object();

    /* renamed from: b */
    private final Object f44686b = new Object();

    /* renamed from: c */
    private C15900nm f44687c;

    /* renamed from: d */
    private C15900nm f44688d;

    /* renamed from: a */
    public final C15900nm mo41768a(Context context, zzbgz zzbgz) {
        C15900nm nmVar;
        synchronized (this.f44686b) {
            if (this.f44688d == null) {
                this.f44688d = new C15900nm(m51374a(context), zzbgz, (String) bym.m50299d().mo41272a(C15585bw.f43753a));
            }
            nmVar = this.f44688d;
        }
        return nmVar;
    }

    /* renamed from: b */
    public final C15900nm mo41769b(Context context, zzbgz zzbgz) {
        C15900nm nmVar;
        synchronized (this.f44685a) {
            if (this.f44687c == null) {
                this.f44687c = new C15900nm(m51374a(context), zzbgz, (String) bym.m50299d().mo41272a(C15585bw.f43806b));
            }
            nmVar = this.f44687c;
        }
        return nmVar;
    }

    /* renamed from: a */
    private static Context m51374a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
